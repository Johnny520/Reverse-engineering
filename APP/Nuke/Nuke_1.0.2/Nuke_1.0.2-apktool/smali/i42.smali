.class public final Li42;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final f:Ljava/util/Map;

.field public static final g:Ljava/util/HashMap;

.field public static final h:Ljava/util/HashMap;

.field public static final i:Ljava/util/HashMap;


# instance fields
.field public final a:Ljava/lang/Class;

.field public b:Ljava/lang/ClassLoader;

.field public c:Ljava/io/File;

.field public final d:[Ljava/lang/Object;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Li42;->f:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Li42;->g:Ljava/util/HashMap;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    const-class v2, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    const-class v4, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object v5, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-class v6, Ljava/lang/Byte;

    .line 36
    .line 37
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    const-class v8, Ljava/lang/Long;

    .line 43
    .line 44
    invoke-virtual {v0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v9, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    const-class v10, Ljava/lang/Short;

    .line 50
    .line 51
    invoke-virtual {v0, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    const-class v12, Ljava/lang/Float;

    .line 57
    .line 58
    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    sget-object v13, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    const-class v14, Ljava/lang/Double;

    .line 64
    .line 65
    invoke-virtual {v0, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    sget-object v15, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    move-object/from16 v16, v2

    .line 71
    .line 72
    const-class v2, Ljava/lang/Character;

    .line 73
    .line 74
    invoke-virtual {v0, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    new-instance v17, Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-direct/range {v17 .. v17}, Ljava/util/HashMap;-><init>()V

    .line 80
    .line 81
    .line 82
    sput-object v17, Li42;->h:Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v17

    .line 96
    if-eqz v17, :cond_0

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v17

    .line 102
    check-cast v17, Ljava/util/Map$Entry;

    .line 103
    .line 104
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v18

    .line 108
    check-cast v18, Ljava/lang/Class;

    .line 109
    .line 110
    move-object/from16 v19, v0

    .line 111
    .line 112
    invoke-static/range {v18 .. v18}, La63;->a(Ljava/lang/Class;)La63;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v17

    .line 120
    check-cast v17, Ljava/lang/Class;

    .line 121
    .line 122
    move-object/from16 v18, v2

    .line 123
    .line 124
    invoke-static/range {v17 .. v17}, La63;->a(Ljava/lang/Class;)La63;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    move-object/from16 v17, v4

    .line 129
    .line 130
    const-string v4, "valueOf"

    .line 131
    .line 132
    move-object/from16 v20, v6

    .line 133
    .line 134
    filled-new-array {v0}, [La63;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v2, v2, v4, v6}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    sget-object v4, Li42;->h:Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-virtual {v4, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-object/from16 v4, v17

    .line 148
    .line 149
    move-object/from16 v2, v18

    .line 150
    .line 151
    move-object/from16 v0, v19

    .line 152
    .line 153
    move-object/from16 v6, v20

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_0
    move-object/from16 v18, v2

    .line 157
    .line 158
    move-object/from16 v17, v4

    .line 159
    .line 160
    move-object/from16 v20, v6

    .line 161
    .line 162
    new-instance v0, Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-static/range {v16 .. v16}, La63;->a(Ljava/lang/Class;)La63;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    sget-object v4, La63;->d:La63;

    .line 172
    .line 173
    const-string v6, "booleanValue"

    .line 174
    .line 175
    move-object/from16 v16, v8

    .line 176
    .line 177
    const/4 v8, 0x0

    .line 178
    move-object/from16 v19, v10

    .line 179
    .line 180
    new-array v10, v8, [La63;

    .line 181
    .line 182
    invoke-virtual {v2, v4, v6, v10}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    invoke-static/range {v17 .. v17}, La63;->a(Ljava/lang/Class;)La63;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    sget-object v2, La63;->i:La63;

    .line 194
    .line 195
    const-string v4, "intValue"

    .line 196
    .line 197
    new-array v6, v8, [La63;

    .line 198
    .line 199
    invoke-virtual {v1, v2, v4, v6}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    invoke-static/range {v20 .. v20}, La63;->a(Ljava/lang/Class;)La63;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    sget-object v2, La63;->e:La63;

    .line 211
    .line 212
    const-string v3, "byteValue"

    .line 213
    .line 214
    new-array v4, v8, [La63;

    .line 215
    .line 216
    invoke-virtual {v1, v2, v3, v4}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    invoke-static/range {v16 .. v16}, La63;->a(Ljava/lang/Class;)La63;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    sget-object v2, La63;->j:La63;

    .line 228
    .line 229
    const-string v3, "longValue"

    .line 230
    .line 231
    new-array v4, v8, [La63;

    .line 232
    .line 233
    invoke-virtual {v1, v2, v3, v4}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v0, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    invoke-static/range {v19 .. v19}, La63;->a(Ljava/lang/Class;)La63;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    sget-object v2, La63;->k:La63;

    .line 245
    .line 246
    const-string v3, "shortValue"

    .line 247
    .line 248
    new-array v4, v8, [La63;

    .line 249
    .line 250
    invoke-virtual {v1, v2, v3, v4}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v0, v9, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    invoke-static {v12}, La63;->a(Ljava/lang/Class;)La63;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    sget-object v2, La63;->h:La63;

    .line 262
    .line 263
    const-string v3, "floatValue"

    .line 264
    .line 265
    new-array v4, v8, [La63;

    .line 266
    .line 267
    invoke-virtual {v1, v2, v3, v4}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v0, v11, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    invoke-static {v14}, La63;->a(Ljava/lang/Class;)La63;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    sget-object v2, La63;->g:La63;

    .line 279
    .line 280
    const-string v3, "doubleValue"

    .line 281
    .line 282
    new-array v4, v8, [La63;

    .line 283
    .line 284
    invoke-virtual {v1, v2, v3, v4}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v0, v13, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    invoke-static/range {v18 .. v18}, La63;->a(Ljava/lang/Class;)La63;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    sget-object v2, La63;->f:La63;

    .line 296
    .line 297
    const-string v3, "charValue"

    .line 298
    .line 299
    new-array v4, v8, [La63;

    .line 300
    .line 301
    invoke-virtual {v1, v2, v3, v4}, La63;->b(La63;Ljava/lang/String;[La63;)Lvg1;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v0, v15, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    sput-object v0, Li42;->i:Ljava/util/HashMap;

    .line 309
    .line 310
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Li42;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Li42;->b:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    iput-object v0, p0, Li42;->d:[Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Li42;->e:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput-object p1, p0, Li42;->a:Ljava/lang/Class;

    .line 25
    .line 26
    return-void
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Li42;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, v1, p1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    throw p0
.end method

.method public static b(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_5

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    and-int/lit8 v5, v5, 0x10

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    new-instance v5, Lg42;

    .line 21
    .line 22
    invoke-direct {v5, v4}, Lg42;-><init>(Ljava/lang/reflect/Method;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v5}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    and-int/lit8 v5, v5, 0x8

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-nez v5, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-nez v5, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const-string v6, "finalize"

    .line 67
    .line 68
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    array-length v5, v5

    .line 79
    if-nez v5, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    new-instance v5, Lg42;

    .line 83
    .line 84
    invoke-direct {v5, v4}, Lg42;-><init>(Ljava/lang/reflect/Method;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-virtual {p0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    array-length v0, p2

    .line 111
    :goto_2
    if-ge v2, v0, :cond_6

    .line 112
    .line 113
    aget-object v1, p2, v2

    .line 114
    .line 115
    invoke-static {p0, p1, v1}, Li42;->b(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 v2, v2, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    return-void
.end method

.method public static c(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

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
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "super$"

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "$"

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 p0, 0x2e

    .line 29
    .line 30
    const/16 v2, 0x5f

    .line 31
    .line 32
    invoke-virtual {v0, p0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/16 v0, 0x5b

    .line 37
    .line 38
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/16 v0, 0x3b

    .line 43
    .line 44
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static d(Lwt;Ljava/lang/reflect/Method;Lyb1;Lyb1;)V
    .locals 12

    .line 1
    const-class v1, Ljava/lang/AbstractMethodError;

    .line 2
    .line 3
    invoke-static {v1}, La63;->a(Ljava/lang/Class;)La63;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, La63;->n:La63;

    .line 8
    .line 9
    filled-new-array {v2}, [La63;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v3, Lvg1;

    .line 17
    .line 18
    sget-object v5, La63;->l:La63;

    .line 19
    .line 20
    new-instance v6, Le63;

    .line 21
    .line 22
    invoke-direct {v6, v2}, Le63;-><init>([La63;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "<init>"

    .line 26
    .line 27
    invoke-direct {v3, v1, v5, v2, v6}, Lvg1;-><init>(La63;La63;Ljava/lang/String;Le63;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v5, "\'"

    .line 33
    .line 34
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v5, "\' cannot be called"

    .line 41
    .line 42
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p0, p2, v2}, Lwt;->i(Lyb1;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {p2}, [Lyb1;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-eqz p3, :cond_2

    .line 57
    .line 58
    new-instance v6, Lj23;

    .line 59
    .line 60
    sget-object v7, Lcb2;->C1:Lza2;

    .line 61
    .line 62
    iget-object v8, p0, Lwt;->h:Lkt2;

    .line 63
    .line 64
    sget-object v9, Ls72;->j:Ls72;

    .line 65
    .line 66
    iget-object v10, p0, Lwt;->j:Lwu2;

    .line 67
    .line 68
    iget-object v11, v1, La63;->c:Lr30;

    .line 69
    .line 70
    invoke-direct/range {v6 .. v11}, Lj23;-><init>(Lza2;Lkt2;Ls72;Ld63;Ldz;)V

    .line 71
    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    invoke-virtual {p0, v6, v7}, Lwt;->a(Li01;Lv51;)V

    .line 75
    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-virtual {p0, p3, v1}, Lwt;->j(Lyb1;Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v1}, Lvg1;->a(Z)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v2, Ld42;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Ld42;

    .line 92
    .line 93
    if-eqz v6, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-static {v1}, Ld42;->b(Ljava/lang/String;)Ld42;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    iget-object v1, v6, Ld42;->h:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v2, v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Ld42;

    .line 107
    .line 108
    if-eqz v1, :cond_1

    .line 109
    .line 110
    move-object v6, v1

    .line 111
    :cond_1
    :goto_0
    new-instance v1, Lza2;

    .line 112
    .line 113
    invoke-virtual {v6}, Ld42;->c()Lwu2;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget-object v6, Lwu2;->q:Lwu2;

    .line 118
    .line 119
    const/16 v8, 0x34

    .line 120
    .line 121
    invoke-direct {v1, v8, v2, v6}, Lza2;-><init>(ILwu2;Ld63;)V

    .line 122
    .line 123
    .line 124
    move-object v2, v3

    .line 125
    const/4 v3, 0x0

    .line 126
    move-object v0, p0

    .line 127
    move-object v4, p3

    .line 128
    invoke-virtual/range {v0 .. v5}, Lwt;->g(Lza2;Lvg1;Lyb1;Lyb1;[Lyb1;)V

    .line 129
    .line 130
    .line 131
    new-instance v1, Lk23;

    .line 132
    .line 133
    sget-object v2, Lcb2;->h1:Lza2;

    .line 134
    .line 135
    iget-object v3, p0, Lwt;->h:Lkt2;

    .line 136
    .line 137
    invoke-virtual {p3}, Lyb1;->a()Lr72;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v4}, Ls72;->h(Lr72;)Ls72;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    iget-object v5, p0, Lwt;->j:Lwu2;

    .line 146
    .line 147
    invoke-direct {v1, v2, v3, v4, v5}, Lk23;-><init>(Lza2;Lkt2;Ls72;Ld63;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v1, v7}, Lwt;->a(Li01;Lv51;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 155
    .line 156
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 157
    .line 158
    .line 159
    throw v0
.end method
