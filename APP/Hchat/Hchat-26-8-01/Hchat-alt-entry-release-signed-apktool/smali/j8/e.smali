.class public abstract Lj8/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj8/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/Object;)J
    .locals 10

    .line 1
    const-string v0, "getMsgID"

    .line 2
    .line 3
    const-string v1, "getId"

    .line 4
    .line 5
    const-string v2, "getMsgId"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    const/4 v3, 0x0

    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    const/4 v7, 0x3

    .line 18
    if-lt v2, v7, :cond_4

    .line 19
    .line 20
    const-string v0, "msgID"

    .line 21
    .line 22
    const-string v2, "id"

    .line 23
    .line 24
    const-string v7, "field_msgId"

    .line 25
    .line 26
    const-string v8, "msgId"

    .line 27
    .line 28
    filled-new-array {v7, v8, v0, v2}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    move v0, v1

    .line 33
    :goto_1
    const/4 v2, 0x4

    .line 34
    if-lt v0, v2, :cond_0

    .line 35
    .line 36
    return-wide v4

    .line 37
    :cond_0
    aget-object v2, v7, v0

    .line 38
    .line 39
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2}, Lj8/e;->c(Ljava/lang/Object;)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v8

    .line 53
    cmp-long v8, v8, v4

    .line 54
    .line 55
    if-lez v8, :cond_1

    .line 56
    .line 57
    move v8, v6

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    move v8, v1

    .line 60
    :goto_2
    if-eqz v8, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    move-object v2, v3

    .line 64
    :goto_3
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    return-wide v0

    .line 71
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    aget-object v7, v0, v2

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    new-array v9, v1, [Ljava/lang/Class;

    .line 81
    .line 82
    invoke-static {v8, v7, v9}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    new-array v8, v1, [Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {v7, p0, v8}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-static {v7}, Lj8/e;->c(Ljava/lang/Object;)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    if-eqz v7, :cond_7

    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v8

    .line 102
    cmp-long v4, v8, v4

    .line 103
    .line 104
    if-lez v4, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move v6, v1

    .line 108
    :goto_4
    if-eqz v6, :cond_6

    .line 109
    .line 110
    move-object v3, v7

    .line 111
    :cond_6
    if-eqz v3, :cond_7

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    return-wide v0

    .line 118
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 119
    .line 120
    goto :goto_0
.end method

.method public static b(Ljava/lang/Long;)Ljava/lang/Integer;
    .locals 4

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long p0, v0, v2

    .line 10
    .line 11
    if-gtz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v2, 0x1

    .line 15
    .line 16
    cmp-long p0, v2, v0

    .line 17
    .line 18
    if-gtz p0, :cond_1

    .line 19
    .line 20
    const-wide/16 v2, 0x259

    .line 21
    .line 22
    cmp-long p0, v0, v2

    .line 23
    .line 24
    if-gez p0, :cond_1

    .line 25
    .line 26
    const-wide/16 v2, 0x3e8

    .line 27
    .line 28
    mul-long/2addr v0, v2

    .line 29
    :cond_1
    const-wide/32 v2, 0x7fffffff

    .line 30
    .line 31
    .line 32
    cmp-long p0, v0, v2

    .line 33
    .line 34
    if-lez p0, :cond_2

    .line 35
    .line 36
    move-wide v0, v2

    .line 37
    :cond_2
    long-to-int p0, v0

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/String;JLjava/util/List;I)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const-string v5, "msg:"

    .line 18
    .line 19
    const-string v6, "file:"

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    sget-object v10, Lj8/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v10, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/Integer;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    cmp-long v4, v2, v7

    .line 49
    .line 50
    if-lez v4, :cond_1

    .line 51
    .line 52
    new-instance v4, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v10, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const/4 v4, 0x0

    .line 82
    :goto_0
    if-eqz v4, :cond_2

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    return v0

    .line 89
    :cond_2
    const/4 v4, 0x0

    .line 90
    if-eqz v0, :cond_f

    .line 91
    .line 92
    new-instance v11, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    cmp-long v13, v2, v7

    .line 105
    .line 106
    if-lez v13, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    const/4 v12, 0x0

    .line 110
    :goto_1
    if-eqz v12, :cond_4

    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    invoke-static {v0}, Lj8/e;->a(Ljava/lang/Object;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v12

    .line 121
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    :goto_3
    if-eqz v14, :cond_e

    .line 126
    .line 127
    const-class v15, Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    if-nez v15, :cond_e

    .line 134
    .line 135
    invoke-static {v14}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v15

    .line 139
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v15

    .line 143
    :goto_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v16

    .line 147
    if-eqz v16, :cond_d

    .line 148
    .line 149
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v16

    .line 153
    move-wide/from16 v17, v7

    .line 154
    .line 155
    move-object/from16 v7, v16

    .line 156
    .line 157
    check-cast v7, Ljava/lang/reflect/Field;

    .line 158
    .line 159
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 164
    .line 165
    .line 166
    move-result v16

    .line 167
    if-nez v16, :cond_6

    .line 168
    .line 169
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    .line 170
    .line 171
    .line 172
    move-result v16

    .line 173
    if-nez v16, :cond_6

    .line 174
    .line 175
    const-class v9, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    if-eqz v9, :cond_5

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_5
    const-class v9, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-eqz v8, :cond_7

    .line 191
    .line 192
    :cond_6
    :goto_5
    move-wide/from16 v7, v17

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_7
    invoke-static {v7, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    if-eqz v7, :cond_6

    .line 200
    .line 201
    if-eq v7, v0, :cond_6

    .line 202
    .line 203
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-eqz v8, :cond_8

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_8
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    if-eqz v9, :cond_a

    .line 219
    .line 220
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    if-ne v9, v7, :cond_9

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_a
    :goto_6
    const-string v8, "com.tencent.mm.storage."

    .line 228
    .line 229
    invoke-static {v8, v7, v4}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    if-nez v8, :cond_b

    .line 234
    .line 235
    cmp-long v8, v12, v17

    .line 236
    .line 237
    if-gtz v8, :cond_b

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_b
    cmp-long v8, v12, v17

    .line 241
    .line 242
    if-lez v8, :cond_c

    .line 243
    .line 244
    invoke-static {v7}, Lj8/e;->a(Ljava/lang/Object;)J

    .line 245
    .line 246
    .line 247
    move-result-wide v8

    .line 248
    cmp-long v8, v8, v12

    .line 249
    .line 250
    if-eqz v8, :cond_c

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_c
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_d
    move-wide/from16 v17, v7

    .line 258
    .line 259
    invoke-virtual {v14}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v14

    .line 263
    goto/16 :goto_3

    .line 264
    .line 265
    :cond_e
    move-wide/from16 v17, v7

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_f
    move-wide/from16 v17, v7

    .line 269
    .line 270
    sget-object v11, Ltf/t;->g:Ltf/t;

    .line 271
    .line 272
    :goto_7
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    const-string v8, "VoiceLength"

    .line 281
    .line 282
    if-eqz v7, :cond_16

    .line 283
    .line 284
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    const-string v9, "getVoiceLen"

    .line 289
    .line 290
    const-string v12, "getDuration"

    .line 291
    .line 292
    const-string v13, "getVoiceLength"

    .line 293
    .line 294
    filled-new-array {v13, v9, v12}, [Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    move v12, v4

    .line 299
    :goto_8
    const/4 v13, 0x3

    .line 300
    if-lt v12, v13, :cond_13

    .line 301
    .line 302
    const-string v9, "duration"

    .line 303
    .line 304
    const-string v12, "field_duration"

    .line 305
    .line 306
    const-string v13, "field_voiceLength"

    .line 307
    .line 308
    const-string v14, "voiceLength"

    .line 309
    .line 310
    filled-new-array {v13, v14, v8, v9, v12}, [Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v13

    .line 314
    move v9, v4

    .line 315
    :goto_9
    const/4 v12, 0x5

    .line 316
    if-lt v9, v12, :cond_11

    .line 317
    .line 318
    const/4 v7, 0x0

    .line 319
    goto :goto_b

    .line 320
    :cond_11
    aget-object v12, v13, v9

    .line 321
    .line 322
    invoke-static {v7, v12}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    invoke-static {v12}, Lj8/e;->c(Ljava/lang/Object;)Ljava/lang/Long;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    invoke-static {v12}, Lj8/e;->b(Ljava/lang/Long;)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    if-eqz v12, :cond_12

    .line 335
    .line 336
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 337
    .line 338
    .line 339
    move-result v7

    .line 340
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    goto :goto_b

    .line 345
    :cond_12
    add-int/lit8 v9, v9, 0x1

    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_13
    aget-object v13, v9, v12

    .line 349
    .line 350
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    new-array v15, v4, [Ljava/lang/Class;

    .line 355
    .line 356
    invoke-static {v14, v13, v15}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 357
    .line 358
    .line 359
    move-result-object v13

    .line 360
    if-eqz v13, :cond_15

    .line 361
    .line 362
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object v14

    .line 366
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    array-length v14, v14

    .line 370
    if-nez v14, :cond_14

    .line 371
    .line 372
    goto :goto_a

    .line 373
    :cond_14
    const/4 v13, 0x0

    .line 374
    :goto_a
    if-eqz v13, :cond_15

    .line 375
    .line 376
    new-array v14, v4, [Ljava/lang/Object;

    .line 377
    .line 378
    invoke-static {v13, v7, v14}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v13

    .line 382
    invoke-static {v13}, Lj8/e;->c(Ljava/lang/Object;)Ljava/lang/Long;

    .line 383
    .line 384
    .line 385
    move-result-object v13

    .line 386
    invoke-static {v13}, Lj8/e;->b(Ljava/lang/Long;)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object v13

    .line 390
    if-eqz v13, :cond_15

    .line 391
    .line 392
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    :goto_b
    if-eqz v7, :cond_10

    .line 401
    .line 402
    goto :goto_c

    .line 403
    :cond_15
    add-int/lit8 v12, v12, 0x1

    .line 404
    .line 405
    goto :goto_8

    .line 406
    :cond_16
    const/4 v7, 0x0

    .line 407
    :goto_c
    if-eqz v7, :cond_17

    .line 408
    .line 409
    :goto_d
    move-object v9, v7

    .line 410
    goto/16 :goto_14

    .line 411
    .line 412
    :cond_17
    invoke-interface/range {p4 .. p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-eqz v7, :cond_19

    .line 421
    .line 422
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    check-cast v7, Ljava/lang/String;

    .line 427
    .line 428
    invoke-static {v7, v1}, Lj8/e;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    if-eqz v7, :cond_18

    .line 433
    .line 434
    goto :goto_e

    .line 435
    :cond_19
    const/4 v7, 0x0

    .line 436
    :goto_e
    if-eqz v7, :cond_1a

    .line 437
    .line 438
    goto :goto_d

    .line 439
    :cond_1a
    new-instance v0, Ldg/n;

    .line 440
    .line 441
    const/4 v7, 0x6

    .line 442
    invoke-direct {v0, v11, v7}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 443
    .line 444
    .line 445
    new-instance v7, Li2/z;

    .line 446
    .line 447
    const/16 v9, 0x9

    .line 448
    .line 449
    invoke-direct {v7, v9}, Li2/z;-><init>(I)V

    .line 450
    .line 451
    .line 452
    new-instance v9, Ldg/j;

    .line 453
    .line 454
    sget-object v11, Lng/q;->n:Lng/q;

    .line 455
    .line 456
    invoke-direct {v9, v0, v7, v11}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 457
    .line 458
    .line 459
    new-instance v0, Lng/h;

    .line 460
    .line 461
    invoke-direct {v0, v9}, Lng/h;-><init>(Ldg/j;)V

    .line 462
    .line 463
    .line 464
    :cond_1b
    invoke-virtual {v0}, Lng/h;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v7

    .line 468
    if-eqz v7, :cond_1c

    .line 469
    .line 470
    invoke-virtual {v0}, Lng/h;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    check-cast v7, Ljava/lang/String;

    .line 475
    .line 476
    invoke-static {v7, v1}, Lj8/e;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object v7

    .line 480
    if-eqz v7, :cond_1b

    .line 481
    .line 482
    goto :goto_f

    .line 483
    :cond_1c
    const/4 v7, 0x0

    .line 484
    :goto_f
    if-eqz v7, :cond_1d

    .line 485
    .line 486
    goto :goto_d

    .line 487
    :cond_1d
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    if-eqz v0, :cond_25

    .line 492
    .line 493
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 494
    .line 495
    if-eqz v0, :cond_25

    .line 496
    .line 497
    iget-object v7, v0, Lj8/y;->a:Lh/Hchat/dexkit/DexFinder;

    .line 498
    .line 499
    iget-object v7, v7, Lh/Hchat/dexkit/DexFinder;->voiceInfoQueryMethod:Ljava/lang/reflect/Method;

    .line 500
    .line 501
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 502
    .line 503
    .line 504
    move-result v9

    .line 505
    if-nez v9, :cond_23

    .line 506
    .line 507
    if-eqz v7, :cond_23

    .line 508
    .line 509
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    if-nez v9, :cond_1e

    .line 514
    .line 515
    goto :goto_12

    .line 516
    :cond_1e
    :try_start_0
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 520
    const/4 v11, 0x0

    .line 521
    :try_start_1
    invoke-static {v7, v11, v9}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v7

    .line 525
    if-nez v7, :cond_20

    .line 526
    .line 527
    :catchall_0
    :cond_1f
    :goto_10
    move v0, v4

    .line 528
    goto :goto_13

    .line 529
    :cond_20
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object v9

    .line 533
    invoke-virtual {v0, v9}, Lj8/y;->w(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    new-array v9, v4, [Ljava/lang/Object;

    .line 538
    .line 539
    invoke-static {v0, v7, v9}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    check-cast v0, Landroid/content/ContentValues;

    .line 544
    .line 545
    if-nez v0, :cond_21

    .line 546
    .line 547
    goto :goto_10

    .line 548
    :cond_21
    invoke-virtual {v0, v8}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    instance-of v7, v0, Ljava/lang/Number;

    .line 553
    .line 554
    if-eqz v7, :cond_22

    .line 555
    .line 556
    check-cast v0, Ljava/lang/Number;

    .line 557
    .line 558
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 559
    .line 560
    .line 561
    move-result-wide v7

    .line 562
    goto :goto_11

    .line 563
    :cond_22
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 568
    .line 569
    .line 570
    move-result-wide v7

    .line 571
    :goto_11
    cmp-long v0, v7, v17

    .line 572
    .line 573
    if-lez v0, :cond_1f

    .line 574
    .line 575
    const-wide/32 v12, 0x7fffffff

    .line 576
    .line 577
    .line 578
    invoke-static {v12, v13, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 579
    .line 580
    .line 581
    move-result-wide v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 582
    long-to-int v0, v7

    .line 583
    goto :goto_13

    .line 584
    :catchall_1
    :cond_23
    :goto_12
    const/4 v11, 0x0

    .line 585
    goto :goto_10

    .line 586
    :goto_13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    if-lez v0, :cond_24

    .line 591
    .line 592
    const/4 v4, 0x1

    .line 593
    :cond_24
    if-eqz v4, :cond_26

    .line 594
    .line 595
    goto/16 :goto_d

    .line 596
    .line 597
    :cond_25
    const/4 v11, 0x0

    .line 598
    :cond_26
    move-object v9, v11

    .line 599
    :goto_14
    if-eqz v9, :cond_2b

    .line 600
    .line 601
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-gtz v0, :cond_27

    .line 606
    .line 607
    goto :goto_15

    .line 608
    :cond_27
    invoke-virtual {v10}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    const/16 v7, 0x800

    .line 613
    .line 614
    if-le v4, v7, :cond_28

    .line 615
    .line 616
    invoke-virtual {v10}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 617
    .line 618
    .line 619
    :cond_28
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 620
    .line 621
    .line 622
    move-result v4

    .line 623
    if-nez v4, :cond_29

    .line 624
    .line 625
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    invoke-virtual {v10, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    :cond_29
    cmp-long v1, v2, v17

    .line 637
    .line 638
    if-lez v1, :cond_2a

    .line 639
    .line 640
    invoke-static {v2, v3, v5}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-virtual {v10, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    :cond_2a
    :goto_15
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    goto :goto_16

    .line 656
    :cond_2b
    move/from16 v0, p5

    .line 657
    .line 658
    :goto_16
    return v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_7

    .line 17
    .line 18
    const/16 v0, 0x3c

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x6

    .line 22
    invoke-static {p0, v0, v2, v3}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ltz v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    new-array v4, v0, [C

    .line 32
    .line 33
    const/16 v5, 0x3a

    .line 34
    .line 35
    aput-char v5, v4, v2

    .line 36
    .line 37
    invoke-static {p0, v4, v3}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, 0x3

    .line 46
    if-ge v3, v4, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v0, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Ljava/lang/String;

    .line 68
    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    move-object p0, v1

    .line 87
    :goto_0
    invoke-static {p0}, Lj8/e;->b(Ljava/lang/Long;)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_7

    .line 92
    .line 93
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_6

    .line 98
    .line 99
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-nez v4, :cond_6

    .line 111
    .line 112
    invoke-static {p1, v3, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_6

    .line 117
    .line 118
    invoke-static {v3, p1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    const/16 p1, 0x2f

    .line 126
    .line 127
    invoke-static {v3, p1}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_5

    .line 132
    .line 133
    const/16 p1, 0x5c

    .line 134
    .line 135
    invoke-static {v3, p1}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_5

    .line 140
    .line 141
    move v2, v0

    .line 142
    :cond_5
    if-eqz v2, :cond_7

    .line 143
    .line 144
    :cond_6
    :goto_1
    return-object p0

    .line 145
    :cond_7
    :goto_2
    return-object v1

    .line 146
    nop

    .line 147
    :array_0
    .array-data 2
        0xas
        0xds
    .end array-data
.end method
