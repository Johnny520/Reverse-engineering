.class public abstract Lk8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;


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
    sput-object v0, Lk8/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lk8/b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Ljava/lang/Object;)Ljava/util/List;
    .locals 12

    .line 1
    instance-of v0, p0, Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Ljava/util/List;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p0, v1

    .line 10
    :goto_0
    if-eqz p0, :cond_14

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto/16 :goto_c

    .line 19
    .line 20
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_13

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const-string v4, "com.tencent.mm.storage."

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static {v4, v3, v5}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const-string v6, "getMsgID"

    .line 72
    .line 73
    const-string v7, "getMsgId"

    .line 74
    .line 75
    if-eqz v4, :cond_5

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    if-eqz v4, :cond_6

    .line 87
    .line 88
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_6

    .line 93
    .line 94
    goto/16 :goto_b

    .line 95
    .line 96
    :cond_6
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_12

    .line 105
    .line 106
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Ljava/lang/reflect/Method;

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    array-length v9, v9

    .line 120
    if-nez v9, :cond_7

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-static {v9, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-nez v9, :cond_8

    .line 131
    .line 132
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-static {v9, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-eqz v9, :cond_7

    .line 141
    .line 142
    :cond_8
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 147
    .line 148
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-nez v9, :cond_9

    .line 153
    .line 154
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    const-class v9, Ljava/lang/Long;

    .line 159
    .line 160
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    if-eqz v8, :cond_7

    .line 165
    .line 166
    :cond_9
    :goto_3
    const-string v4, "getId"

    .line 167
    .line 168
    filled-new-array {v7, v6, v4}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    move v4, v5

    .line 173
    :goto_4
    const-wide/16 v6, 0x0

    .line 174
    .line 175
    const/4 v9, 0x3

    .line 176
    if-lt v4, v9, :cond_e

    .line 177
    .line 178
    const-string v4, "msgID"

    .line 179
    .line 180
    const-string v8, "id"

    .line 181
    .line 182
    const-string v9, "field_msgId"

    .line 183
    .line 184
    const-string v10, "msgId"

    .line 185
    .line 186
    filled-new-array {v9, v10, v4, v8}, [Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    move v4, v5

    .line 191
    :goto_5
    const/4 v8, 0x4

    .line 192
    if-lt v4, v8, :cond_a

    .line 193
    .line 194
    move-wide v8, v6

    .line 195
    goto :goto_a

    .line 196
    :cond_a
    aget-object v8, v9, v4

    .line 197
    .line 198
    invoke-static {v3, v8}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    instance-of v10, v8, Ljava/lang/Number;

    .line 203
    .line 204
    if-eqz v10, :cond_b

    .line 205
    .line 206
    check-cast v8, Ljava/lang/Number;

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_b
    move-object v8, v1

    .line 210
    :goto_6
    if-eqz v8, :cond_d

    .line 211
    .line 212
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 213
    .line 214
    .line 215
    move-result-wide v10

    .line 216
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    cmp-long v10, v10, v6

    .line 221
    .line 222
    if-lez v10, :cond_c

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_c
    move-object v8, v1

    .line 226
    :goto_7
    if-eqz v8, :cond_d

    .line 227
    .line 228
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide v8

    .line 232
    goto :goto_a

    .line 233
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_e
    aget-object v9, v8, v4

    .line 237
    .line 238
    new-array v10, v5, [Ljava/lang/Object;

    .line 239
    .line 240
    invoke-static {v3, v9, v10}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    instance-of v10, v9, Ljava/lang/Number;

    .line 245
    .line 246
    if-eqz v10, :cond_f

    .line 247
    .line 248
    check-cast v9, Ljava/lang/Number;

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_f
    move-object v9, v1

    .line 252
    :goto_8
    if-eqz v9, :cond_11

    .line 253
    .line 254
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 255
    .line 256
    .line 257
    move-result-wide v9

    .line 258
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    cmp-long v9, v9, v6

    .line 263
    .line 264
    if-lez v9, :cond_10

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_10
    move-object v11, v1

    .line 268
    :goto_9
    if-eqz v11, :cond_11

    .line 269
    .line 270
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 271
    .line 272
    .line 273
    move-result-wide v8

    .line 274
    :goto_a
    cmp-long v4, v8, v6

    .line 275
    .line 276
    if-lez v4, :cond_12

    .line 277
    .line 278
    const/4 v5, 0x1

    .line 279
    goto :goto_b

    .line 280
    :cond_11
    add-int/lit8 v4, v4, 0x1

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_12
    :goto_b
    if-eqz v5, :cond_4

    .line 284
    .line 285
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    goto/16 :goto_2

    .line 289
    .line 290
    :cond_13
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    if-ne v0, p0, :cond_14

    .line 299
    .line 300
    return-object v2

    .line 301
    :cond_14
    :goto_c
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 302
    .line 303
    return-object p0
.end method

.method public static final b(Ljava/lang/Object;)Ljava/util/List;
    .locals 14

    .line 1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_d

    .line 6
    .line 7
    :cond_0
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v3, Lk8/a;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v3, p0, v4}, Lk8/a;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_18

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lk8/a;

    .line 44
    .line 45
    iget-object v3, p0, Lk8/a;->a:Ljava/lang/Object;

    .line 46
    .line 47
    iget p0, p0, Lk8/a;->b:I

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    sget-object v6, Lk8/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ljava/lang/reflect/Field;

    .line 60
    .line 61
    const-class v7, Ljava/util/List;

    .line 62
    .line 63
    const-class v8, Ljava/lang/Object;

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    invoke-static {v5, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-static {v5}, Lk8/b;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-nez v10, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v5, v9

    .line 84
    :goto_1
    if-eqz v5, :cond_3

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :goto_2
    if-eqz v5, :cond_7

    .line 92
    .line 93
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-nez v10, :cond_7

    .line 98
    .line 99
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    :cond_4
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    if-eqz v11, :cond_6

    .line 112
    .line 113
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    check-cast v11, Ljava/lang/reflect/Field;

    .line 118
    .line 119
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    if-nez v12, :cond_4

    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-virtual {v7, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-nez v12, :cond_5

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    invoke-static {v11, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    invoke-static {v12}, Lk8/b;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-nez v13, :cond_4

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v6, v5, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-object v5, v12

    .line 162
    goto :goto_4

    .line 163
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    goto :goto_2

    .line 168
    :cond_7
    move-object v5, v0

    .line 169
    :goto_4
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-nez v6, :cond_8

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_8
    move-object v5, v9

    .line 177
    :goto_5
    if-eqz v5, :cond_9

    .line 178
    .line 179
    return-object v5

    .line 180
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    sget-object v6, Lk8/b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 185
    .line 186
    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    check-cast v5, Ljava/lang/reflect/Method;

    .line 191
    .line 192
    if-eqz v5, :cond_b

    .line 193
    .line 194
    new-array v10, v4, [Ljava/lang/Object;

    .line 195
    .line 196
    invoke-static {v5, v3, v10}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-static {v5}, Lk8/b;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    if-nez v10, :cond_a

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_a
    move-object v5, v9

    .line 212
    :goto_6
    if-eqz v5, :cond_b

    .line 213
    .line 214
    goto :goto_9

    .line 215
    :cond_b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    :goto_7
    if-eqz v5, :cond_f

    .line 220
    .line 221
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-nez v10, :cond_f

    .line 226
    .line 227
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    :cond_c
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    if-eqz v11, :cond_e

    .line 240
    .line 241
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    check-cast v11, Ljava/lang/reflect/Method;

    .line 246
    .line 247
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 248
    .line 249
    .line 250
    move-result v12

    .line 251
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    if-nez v12, :cond_c

    .line 256
    .line 257
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v12

    .line 261
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    array-length v12, v12

    .line 265
    if-nez v12, :cond_c

    .line 266
    .line 267
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    invoke-virtual {v7, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 272
    .line 273
    .line 274
    move-result v12

    .line 275
    if-nez v12, :cond_d

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_d
    new-array v12, v4, [Ljava/lang/Object;

    .line 279
    .line 280
    invoke-static {v11, v3, v12}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    invoke-static {v12}, Lk8/b;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    if-nez v13, :cond_c

    .line 293
    .line 294
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-virtual {v6, v5, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-object v5, v12

    .line 302
    goto :goto_9

    .line 303
    :cond_e
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    goto :goto_7

    .line 308
    :cond_f
    move-object v5, v0

    .line 309
    :goto_9
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    if-nez v6, :cond_10

    .line 314
    .line 315
    move-object v9, v5

    .line 316
    :cond_10
    if-eqz v9, :cond_11

    .line 317
    .line 318
    return-object v9

    .line 319
    :cond_11
    const/4 v5, 0x4

    .line 320
    if-lt p0, v5, :cond_12

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :cond_12
    new-instance v5, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    :goto_a
    if-eqz v6, :cond_16

    .line 334
    .line 335
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    if-nez v7, :cond_16

    .line 340
    .line 341
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    :cond_13
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    if-eqz v9, :cond_15

    .line 354
    .line 355
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    check-cast v9, Ljava/lang/reflect/Field;

    .line 360
    .line 361
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    if-nez v10, :cond_13

    .line 370
    .line 371
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    if-nez v10, :cond_13

    .line 380
    .line 381
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object v10

    .line 385
    invoke-virtual {v10}, Ljava/lang/Class;->isArray()Z

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    if-eqz v10, :cond_14

    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_14
    invoke-static {v9, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    if-eqz v9, :cond_13

    .line 397
    .line 398
    const-string v10, "com.tencent.mm.ui.chatting.component."

    .line 399
    .line 400
    invoke-static {v10, v9, v4}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 401
    .line 402
    .line 403
    move-result v10

    .line 404
    if-eqz v10, :cond_13

    .line 405
    .line 406
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_b

    .line 410
    :cond_15
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    goto :goto_a

    .line 415
    :cond_16
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    :cond_17
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    if-eqz v5, :cond_1

    .line 424
    .line 425
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    if-eqz v6, :cond_17

    .line 434
    .line 435
    new-instance v6, Lk8/a;

    .line 436
    .line 437
    add-int/lit8 v7, p0, 0x1

    .line 438
    .line 439
    invoke-direct {v6, v5, v7}, Lk8/a;-><init>(Ljava/lang/Object;I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v6}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_c

    .line 446
    :cond_18
    :goto_d
    return-object v0
.end method
