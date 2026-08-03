.class public final Ly4/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


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
    sput-object v0, Ly4/c;->f:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ly4/c;->g:Ljava/util/HashMap;

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
    sput-object v17, Ly4/c;->h:Ljava/util/HashMap;

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
    invoke-static/range {v18 .. v18}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

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
    invoke-static/range {v17 .. v17}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

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
    filled-new-array {v0}, [Lg4/j;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v2, v2, v4, v6}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    sget-object v4, Ly4/c;->h:Ljava/util/HashMap;

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
    invoke-static/range {v16 .. v16}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    sget-object v4, Lg4/j;->d:Lg4/j;

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
    new-array v10, v8, [Lg4/j;

    .line 181
    .line 182
    invoke-virtual {v2, v4, v6, v10}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    invoke-static/range {v17 .. v17}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    sget-object v2, Lg4/j;->i:Lg4/j;

    .line 194
    .line 195
    const-string v4, "intValue"

    .line 196
    .line 197
    new-array v6, v8, [Lg4/j;

    .line 198
    .line 199
    invoke-virtual {v1, v2, v4, v6}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    invoke-static/range {v20 .. v20}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    sget-object v2, Lg4/j;->e:Lg4/j;

    .line 211
    .line 212
    const-string v3, "byteValue"

    .line 213
    .line 214
    new-array v4, v8, [Lg4/j;

    .line 215
    .line 216
    invoke-virtual {v1, v2, v3, v4}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    invoke-static/range {v16 .. v16}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    sget-object v2, Lg4/j;->j:Lg4/j;

    .line 228
    .line 229
    const-string v3, "longValue"

    .line 230
    .line 231
    new-array v4, v8, [Lg4/j;

    .line 232
    .line 233
    invoke-virtual {v1, v2, v3, v4}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v0, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    invoke-static/range {v19 .. v19}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    sget-object v2, Lg4/j;->k:Lg4/j;

    .line 245
    .line 246
    const-string v3, "shortValue"

    .line 247
    .line 248
    new-array v4, v8, [Lg4/j;

    .line 249
    .line 250
    invoke-virtual {v1, v2, v3, v4}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v0, v9, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    invoke-static {v12}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    sget-object v2, Lg4/j;->h:Lg4/j;

    .line 262
    .line 263
    const-string v3, "floatValue"

    .line 264
    .line 265
    new-array v4, v8, [Lg4/j;

    .line 266
    .line 267
    invoke-virtual {v1, v2, v3, v4}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v0, v11, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    invoke-static {v14}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    sget-object v2, Lg4/j;->g:Lg4/j;

    .line 279
    .line 280
    const-string v3, "doubleValue"

    .line 281
    .line 282
    new-array v4, v8, [Lg4/j;

    .line 283
    .line 284
    invoke-virtual {v1, v2, v3, v4}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v0, v13, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    invoke-static/range {v18 .. v18}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    sget-object v2, Lg4/j;->f:Lg4/j;

    .line 296
    .line 297
    const-string v3, "charValue"

    .line 298
    .line 299
    new-array v4, v8, [Lg4/j;

    .line 300
    .line 301
    invoke-virtual {v1, v2, v3, v4}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v0, v15, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    sput-object v0, Ly4/c;->i:Ljava/util/HashMap;

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
    const-class v0, Ly4/c;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Ly4/c;->b:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    iput-object v0, p0, Ly4/c;->d:[Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ly4/c;->e:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput-object p1, p0, Ly4/c;->a:Ljava/lang/Class;

    .line 25
    .line 26
    return-void
.end method

.method public static varargs b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Ly4/c;->e(Ljava/lang/reflect/Method;)Ljava/lang/String;

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

.method public static c(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V
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
    new-instance v5, Ly4/a;

    .line 21
    .line 22
    invoke-direct {v5, v4}, Ly4/a;-><init>(Ljava/lang/reflect/Method;)V

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
    new-instance v5, Ly4/a;

    .line 83
    .line 84
    invoke-direct {v5, v4}, Ly4/a;-><init>(Ljava/lang/reflect/Method;)V

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
    invoke-static {p0, p1, v1}, Ly4/c;->c(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V

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

.method public static d(Ljava/lang/Object;Lq8/b;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "$__handler"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p0

    .line 20
    invoke-static {p0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_1
    move-exception p0

    .line 25
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    const-string v0, "Not a valid proxy instance"

    .line 28
    .line 29
    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public static e(Ljava/lang/reflect/Method;)Ljava/lang/String;
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

.method public static f(Lg4/b;Ljava/lang/reflect/Method;Lg4/h;Lg4/h;)V
    .locals 12

    .line 1
    const-class v1, Ljava/lang/AbstractMethodError;

    .line 2
    .line 3
    invoke-static {v1}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lg4/j;->n:Lg4/j;

    .line 8
    .line 9
    filled-new-array {v2}, [Lg4/j;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v3, Lg4/i;

    .line 17
    .line 18
    sget-object v5, Lg4/j;->l:Lg4/j;

    .line 19
    .line 20
    new-instance v6, Lg4/k;

    .line 21
    .line 22
    invoke-direct {v6, v2}, Lg4/k;-><init>([Lg4/j;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "<init>"

    .line 26
    .line 27
    invoke-direct {v3, v1, v5, v2, v6}, Lg4/i;-><init>(Lg4/j;Lg4/j;Ljava/lang/String;Lg4/k;)V

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
    invoke-virtual {p0, p2, v2}, Lg4/b;->i(Lg4/h;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {p2}, [Lg4/h;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-eqz p3, :cond_0

    .line 57
    .line 58
    new-instance v6, Lu4/v;

    .line 59
    .line 60
    sget-object v7, Lu4/s;->Y1:Lu4/r;

    .line 61
    .line 62
    iget-object v8, p0, Lg4/b;->h:Lu4/t;

    .line 63
    .line 64
    sget-object v9, Lu4/p;->i:Lu4/p;

    .line 65
    .line 66
    iget-object v10, p0, Lg4/b;->j:Lw4/b;

    .line 67
    .line 68
    iget-object v11, v1, Lg4/j;->c:Lv4/d0;

    .line 69
    .line 70
    invoke-direct/range {v6 .. v11}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 71
    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    invoke-virtual {p0, v6, v7}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 75
    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-virtual {p0, p3, v1}, Lg4/b;->j(Lg4/h;Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v1}, Lg4/i;->a(Z)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lw4/a;->d(Ljava/lang/String;)Lw4/a;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v2, v1

    .line 90
    new-instance v1, Lu4/r;

    .line 91
    .line 92
    invoke-virtual {v2}, Lw4/a;->c()Lw4/b;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget-object v6, Lw4/b;->p:Lw4/b;

    .line 97
    .line 98
    const/16 v8, 0x34

    .line 99
    .line 100
    invoke-direct {v1, v8, v2, v6}, Lu4/r;-><init>(ILw4/b;Lw4/e;)V

    .line 101
    .line 102
    .line 103
    move-object v2, v3

    .line 104
    const/4 v3, 0x0

    .line 105
    move-object v0, p0

    .line 106
    move-object v4, p3

    .line 107
    invoke-virtual/range {v0 .. v5}, Lg4/b;->g(Lu4/r;Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 108
    .line 109
    .line 110
    new-instance v1, Lu4/u;

    .line 111
    .line 112
    sget-object v2, Lu4/s;->D1:Lu4/r;

    .line 113
    .line 114
    iget-object v3, p0, Lg4/b;->h:Lu4/t;

    .line 115
    .line 116
    invoke-virtual {p3}, Lg4/h;->a()Lu4/o;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {v4}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iget-object v5, p0, Lg4/b;->j:Lw4/b;

    .line 125
    .line 126
    invoke-direct {v1, v2, v3, v4, v5}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1, v7}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_0
    invoke-static {}, Lj8/o;->o()V

    .line 134
    .line 135
    .line 136
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 75

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ly4/c;->b:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    new-instance v2, Ly4/b;

    .line 6
    .line 7
    iget-object v3, v1, Ly4/c;->a:Ljava/lang/Class;

    .line 8
    .line 9
    iget-object v4, v1, Ly4/c;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v2, v3, v4, v0}, Ly4/b;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Ljava/lang/ClassLoader;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Ly4/c;->f:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Ljava/lang/Class;

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    return-object v5

    .line 25
    :cond_0
    new-instance v5, Lb/e;

    .line 26
    .line 27
    const/4 v6, 0x7

    .line 28
    invoke-direct {v5, v6}, Lb/e;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/util/ArrayList;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    const-string v9, "."

    .line 49
    .line 50
    const-string v10, "/"

    .line 51
    .line 52
    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v8, "_"

    .line 60
    .line 61
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v8, "_Proxy"

    .line 65
    .line 66
    invoke-static {v7, v6, v8}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const-string v7, "L"

    .line 71
    .line 72
    const-string v8, ";"

    .line 73
    .line 74
    invoke-static {v7, v6, v8}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    new-instance v8, Lg4/j;

    .line 79
    .line 80
    invoke-static {v7}, Lw4/c;->o(Ljava/lang/String;)Lw4/c;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-direct {v8, v7, v9}, Lg4/j;-><init>(Ljava/lang/String;Lw4/c;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v3}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    const-class v9, Ljava/lang/reflect/InvocationHandler;

    .line 92
    .line 93
    invoke-static {v9}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    const-class v11, [Ljava/lang/reflect/Method;

    .line 98
    .line 99
    invoke-static {v11}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    new-instance v13, Lg4/f;

    .line 104
    .line 105
    const-string v14, "$__handler"

    .line 106
    .line 107
    invoke-direct {v13, v8, v10, v14}, Lg4/f;-><init>(Lg4/j;Lg4/j;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 v10, 0x2

    .line 111
    invoke-virtual {v5, v13, v10}, Lb/e;->p(Lg4/f;I)V

    .line 112
    .line 113
    .line 114
    new-instance v13, Lg4/f;

    .line 115
    .line 116
    const-string v15, "$__methodArray"

    .line 117
    .line 118
    invoke-direct {v13, v8, v12, v15}, Lg4/f;-><init>(Lg4/j;Lg4/j;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/16 v12, 0xa

    .line 122
    .line 123
    invoke-virtual {v5, v13, v12}, Lb/e;->p(Lg4/f;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    array-length v13, v12

    .line 131
    const/4 v10, 0x0

    .line 132
    :goto_0
    const-string v18, "static methods cannot access \'this\'"

    .line 133
    .line 134
    move-object/from16 v19, v4

    .line 135
    .line 136
    const/16 v20, 0x0

    .line 137
    .line 138
    if-ge v10, v13, :cond_5

    .line 139
    .line 140
    aget-object v21, v12, v10

    .line 141
    .line 142
    invoke-virtual/range {v21 .. v21}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    move-object/from16 v22, v9

    .line 147
    .line 148
    const/16 v9, 0x10

    .line 149
    .line 150
    if-ne v4, v9, :cond_1

    .line 151
    .line 152
    move/from16 v21, v10

    .line 153
    .line 154
    move-object/from16 v23, v11

    .line 155
    .line 156
    move-object/from16 v24, v12

    .line 157
    .line 158
    move/from16 v25, v13

    .line 159
    .line 160
    goto/16 :goto_3

    .line 161
    .line 162
    :cond_1
    invoke-virtual/range {v21 .. v21}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    array-length v9, v4

    .line 167
    move/from16 v21, v10

    .line 168
    .line 169
    new-array v10, v9, [Lg4/j;

    .line 170
    .line 171
    move-object/from16 v23, v11

    .line 172
    .line 173
    move-object/from16 v24, v12

    .line 174
    .line 175
    const/4 v11, 0x0

    .line 176
    :goto_1
    array-length v12, v4

    .line 177
    if-ge v11, v12, :cond_2

    .line 178
    .line 179
    aget-object v12, v4, v11

    .line 180
    .line 181
    invoke-static {v12}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    aput-object v12, v10, v11

    .line 186
    .line 187
    add-int/lit8 v11, v11, 0x1

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_2
    new-instance v4, Lg4/i;

    .line 191
    .line 192
    sget-object v11, Lg4/j;->l:Lg4/j;

    .line 193
    .line 194
    new-instance v12, Lg4/k;

    .line 195
    .line 196
    invoke-direct {v12, v10}, Lg4/k;-><init>([Lg4/j;)V

    .line 197
    .line 198
    .line 199
    move/from16 v25, v13

    .line 200
    .line 201
    const-string v13, "<init>"

    .line 202
    .line 203
    invoke-direct {v4, v8, v11, v13, v12}, Lg4/i;-><init>(Lg4/j;Lg4/j;Ljava/lang/String;Lg4/k;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5, v4}, Lb/e;->o(Lg4/i;)Lg4/b;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    iget-object v11, v4, Lg4/b;->e:Lg4/h;

    .line 211
    .line 212
    if-eqz v11, :cond_4

    .line 213
    .line 214
    invoke-static {v11, v8}, Lg4/b;->d(Lg4/h;Lg4/j;)V

    .line 215
    .line 216
    .line 217
    new-array v12, v9, [Lg4/h;

    .line 218
    .line 219
    move-object/from16 v30, v11

    .line 220
    .line 221
    const/4 v11, 0x0

    .line 222
    :goto_2
    if-ge v11, v9, :cond_3

    .line 223
    .line 224
    move/from16 v26, v9

    .line 225
    .line 226
    aget-object v9, v10, v11

    .line 227
    .line 228
    invoke-virtual {v4, v11, v9}, Lg4/b;->e(ILg4/j;)Lg4/h;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    aput-object v9, v12, v11

    .line 233
    .line 234
    add-int/lit8 v11, v11, 0x1

    .line 235
    .line 236
    move/from16 v9, v26

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    new-instance v9, Lg4/i;

    .line 243
    .line 244
    sget-object v11, Lg4/j;->l:Lg4/j;

    .line 245
    .line 246
    move-object/from16 v26, v4

    .line 247
    .line 248
    new-instance v4, Lg4/k;

    .line 249
    .line 250
    invoke-direct {v4, v10}, Lg4/k;-><init>([Lg4/j;)V

    .line 251
    .line 252
    .line 253
    invoke-direct {v9, v7, v11, v13, v4}, Lg4/i;-><init>(Lg4/j;Lg4/j;Ljava/lang/String;Lg4/k;)V

    .line 254
    .line 255
    .line 256
    const/4 v4, 0x1

    .line 257
    invoke-virtual {v9, v4}, Lg4/i;->a(Z)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-static {v4}, Lw4/a;->d(Ljava/lang/String;)Lw4/a;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    sget-object v10, Lu4/s;->a:Lu4/r;

    .line 266
    .line 267
    new-instance v10, Lu4/r;

    .line 268
    .line 269
    invoke-virtual {v4}, Lw4/a;->c()Lw4/b;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    sget-object v11, Lw4/b;->p:Lw4/b;

    .line 274
    .line 275
    const/16 v13, 0x34

    .line 276
    .line 277
    invoke-direct {v10, v13, v4, v11}, Lu4/r;-><init>(ILw4/b;Lw4/e;)V

    .line 278
    .line 279
    .line 280
    const/16 v29, 0x0

    .line 281
    .line 282
    move-object/from16 v28, v9

    .line 283
    .line 284
    move-object/from16 v27, v10

    .line 285
    .line 286
    move-object/from16 v31, v12

    .line 287
    .line 288
    invoke-virtual/range {v26 .. v31}, Lg4/b;->g(Lu4/r;Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v26 .. v26}, Lg4/b;->m()V

    .line 292
    .line 293
    .line 294
    :goto_3
    add-int/lit8 v10, v21, 0x1

    .line 295
    .line 296
    move-object/from16 v4, v19

    .line 297
    .line 298
    move-object/from16 v9, v22

    .line 299
    .line 300
    move-object/from16 v11, v23

    .line 301
    .line 302
    move-object/from16 v12, v24

    .line 303
    .line 304
    move/from16 v13, v25

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_4
    invoke-static/range {v18 .. v18}, Lj8/o;->A(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    return-object v20

    .line 312
    :cond_5
    move-object/from16 v22, v9

    .line 313
    .line 314
    move-object/from16 v23, v11

    .line 315
    .line 316
    new-instance v4, Ljava/util/HashSet;

    .line 317
    .line 318
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 319
    .line 320
    .line 321
    new-instance v9, Ljava/util/HashSet;

    .line 322
    .line 323
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 324
    .line 325
    .line 326
    move-object v10, v3

    .line 327
    :goto_4
    if-eqz v10, :cond_6

    .line 328
    .line 329
    invoke-static {v4, v9, v10}, Ly4/c;->c(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v10}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    goto :goto_4

    .line 337
    :cond_6
    move-object v10, v3

    .line 338
    :goto_5
    if-eqz v10, :cond_8

    .line 339
    .line 340
    invoke-virtual {v10}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    array-length v12, v11

    .line 345
    const/4 v13, 0x0

    .line 346
    :goto_6
    if-ge v13, v12, :cond_7

    .line 347
    .line 348
    move-object/from16 v21, v10

    .line 349
    .line 350
    aget-object v10, v11, v13

    .line 351
    .line 352
    invoke-static {v4, v9, v10}, Ly4/c;->c(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V

    .line 353
    .line 354
    .line 355
    add-int/lit8 v13, v13, 0x1

    .line 356
    .line 357
    move-object/from16 v10, v21

    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_7
    move-object/from16 v21, v10

    .line 361
    .line 362
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    goto :goto_5

    .line 367
    :cond_8
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v11

    .line 375
    if-eqz v11, :cond_9

    .line 376
    .line 377
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v11

    .line 381
    check-cast v11, Ljava/lang/Class;

    .line 382
    .line 383
    invoke-static {v4, v9, v11}, Ly4/c;->c(Ljava/util/HashSet;Ljava/util/HashSet;Ljava/lang/Class;)V

    .line 384
    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_9
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    .line 388
    .line 389
    .line 390
    move-result v9

    .line 391
    new-array v10, v9, [Ljava/lang/reflect/Method;

    .line 392
    .line 393
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    const/4 v11, 0x0

    .line 398
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    if-eqz v12, :cond_a

    .line 403
    .line 404
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    check-cast v12, Ly4/a;

    .line 409
    .line 410
    add-int/lit8 v13, v11, 0x1

    .line 411
    .line 412
    iget-object v12, v12, Ly4/a;->d:Ljava/lang/reflect/Method;

    .line 413
    .line 414
    aput-object v12, v10, v11

    .line 415
    .line 416
    move v11, v13

    .line 417
    goto :goto_8

    .line 418
    :cond_a
    new-instance v4, Lr4/m;

    .line 419
    .line 420
    const/4 v11, 0x4

    .line 421
    invoke-direct {v4, v11}, Lr4/m;-><init>(I)V

    .line 422
    .line 423
    .line 424
    invoke-static {v10, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 425
    .line 426
    .line 427
    invoke-static/range {v22 .. v22}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    invoke-static/range {v23 .. v23}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 432
    .line 433
    .line 434
    move-result-object v12

    .line 435
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    new-instance v13, Lv4/z;

    .line 439
    .line 440
    new-instance v11, Lv4/c0;

    .line 441
    .line 442
    invoke-direct {v11, v14}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    new-instance v14, Lv4/c0;

    .line 446
    .line 447
    move-object/from16 v22, v3

    .line 448
    .line 449
    iget-object v3, v4, Lg4/j;->a:Ljava/lang/String;

    .line 450
    .line 451
    invoke-direct {v14, v3}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-direct {v13, v11, v14}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 455
    .line 456
    .line 457
    new-instance v3, Lv4/m;

    .line 458
    .line 459
    iget-object v11, v8, Lg4/j;->c:Lv4/d0;

    .line 460
    .line 461
    invoke-direct {v3, v11, v13}, Lv4/w;-><init>(Lv4/d0;Lv4/z;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    new-instance v13, Lv4/z;

    .line 468
    .line 469
    new-instance v14, Lv4/c0;

    .line 470
    .line 471
    invoke-direct {v14, v15}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    move-object/from16 v28, v3

    .line 475
    .line 476
    new-instance v3, Lv4/c0;

    .line 477
    .line 478
    move-object/from16 v29, v0

    .line 479
    .line 480
    iget-object v0, v12, Lg4/j;->a:Ljava/lang/String;

    .line 481
    .line 482
    invoke-direct {v3, v0}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-direct {v13, v14, v3}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 486
    .line 487
    .line 488
    new-instance v0, Lv4/m;

    .line 489
    .line 490
    invoke-direct {v0, v11, v13}, Lv4/w;-><init>(Lv4/d0;Lv4/z;)V

    .line 491
    .line 492
    .line 493
    const-class v3, Ljava/lang/reflect/Method;

    .line 494
    .line 495
    invoke-static {v3}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    const-class v11, [Ljava/lang/Object;

    .line 500
    .line 501
    invoke-static {v11}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 502
    .line 503
    .line 504
    move-result-object v11

    .line 505
    sget-object v13, Lg4/j;->m:Lg4/j;

    .line 506
    .line 507
    const-string v14, "invoke"

    .line 508
    .line 509
    move-object/from16 v35, v0

    .line 510
    .line 511
    filled-new-array {v13, v3, v11}, [Lg4/j;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v4, v13, v14, v0}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    const/4 v13, 0x0

    .line 520
    :goto_9
    if-ge v13, v9, :cond_1c

    .line 521
    .line 522
    aget-object v14, v10, v13

    .line 523
    .line 524
    move/from16 v42, v9

    .line 525
    .line 526
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v9

    .line 530
    move/from16 v43, v13

    .line 531
    .line 532
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    move-result-object v13

    .line 536
    move-object/from16 v44, v2

    .line 537
    .line 538
    array-length v2, v13

    .line 539
    move-object/from16 v45, v10

    .line 540
    .line 541
    new-array v10, v2, [Lg4/j;

    .line 542
    .line 543
    move-object/from16 v46, v15

    .line 544
    .line 545
    const/4 v15, 0x0

    .line 546
    :goto_a
    if-ge v15, v2, :cond_b

    .line 547
    .line 548
    aget-object v23, v13, v15

    .line 549
    .line 550
    invoke-static/range {v23 .. v23}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 551
    .line 552
    .line 553
    move-result-object v23

    .line 554
    aput-object v23, v10, v15

    .line 555
    .line 556
    add-int/lit8 v15, v15, 0x1

    .line 557
    .line 558
    goto :goto_a

    .line 559
    :cond_b
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    move-result-object v15

    .line 563
    invoke-static {v15}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    move-object/from16 v47, v6

    .line 568
    .line 569
    invoke-virtual {v8, v1, v9, v10}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 570
    .line 571
    .line 572
    move-result-object v6

    .line 573
    const-class v23, Ljava/lang/AbstractMethodError;

    .line 574
    .line 575
    move-object/from16 v48, v14

    .line 576
    .line 577
    invoke-static/range {v23 .. v23}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 578
    .line 579
    .line 580
    move-result-object v14

    .line 581
    invoke-virtual {v5, v6}, Lb/e;->o(Lg4/i;)Lg4/b;

    .line 582
    .line 583
    .line 584
    move-result-object v6

    .line 585
    move-object/from16 v49, v5

    .line 586
    .line 587
    iget-object v5, v6, Lg4/b;->e:Lg4/h;

    .line 588
    .line 589
    if-eqz v5, :cond_1b

    .line 590
    .line 591
    invoke-static {v5, v8}, Lg4/b;->d(Lg4/h;Lg4/j;)V

    .line 592
    .line 593
    .line 594
    move-object/from16 v50, v8

    .line 595
    .line 596
    iget-object v8, v6, Lg4/b;->j:Lw4/b;

    .line 597
    .line 598
    move-object/from16 v51, v0

    .line 599
    .line 600
    iget-object v0, v6, Lg4/b;->h:Lu4/t;

    .line 601
    .line 602
    move-object/from16 v52, v5

    .line 603
    .line 604
    invoke-virtual {v6, v4}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    move/from16 v53, v2

    .line 609
    .line 610
    iget-object v2, v5, Lg4/h;->b:Lg4/j;

    .line 611
    .line 612
    move-object/from16 v54, v5

    .line 613
    .line 614
    sget-object v5, Lg4/j;->m:Lg4/j;

    .line 615
    .line 616
    invoke-virtual {v6, v5}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 617
    .line 618
    .line 619
    move-result-object v55

    .line 620
    move-object/from16 v36, v2

    .line 621
    .line 622
    sget-object v2, Lg4/j;->i:Lg4/j;

    .line 623
    .line 624
    move-object/from16 v56, v0

    .line 625
    .line 626
    invoke-virtual {v6, v2}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    move-object/from16 v57, v0

    .line 631
    .line 632
    invoke-virtual {v6, v11}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    move-object/from16 v58, v11

    .line 637
    .line 638
    iget-object v11, v0, Lg4/h;->b:Lg4/j;

    .line 639
    .line 640
    move-object/from16 v59, v0

    .line 641
    .line 642
    invoke-virtual {v6, v2}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-virtual {v6, v5}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 647
    .line 648
    .line 649
    move-result-object v39

    .line 650
    invoke-virtual {v6, v1}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 651
    .line 652
    .line 653
    move-result-object v5

    .line 654
    move-object/from16 v60, v5

    .line 655
    .line 656
    invoke-virtual {v6, v12}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    move-object/from16 v61, v12

    .line 661
    .line 662
    invoke-virtual {v6, v3}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 663
    .line 664
    .line 665
    move-result-object v12

    .line 666
    invoke-virtual {v6, v2}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    move-object/from16 v62, v3

    .line 671
    .line 672
    sget-object v3, Ly4/c;->g:Ljava/util/HashMap;

    .line 673
    .line 674
    invoke-virtual {v3, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    check-cast v3, Ljava/lang/Class;

    .line 679
    .line 680
    if-eqz v3, :cond_c

    .line 681
    .line 682
    invoke-static {v3}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    invoke-virtual {v6, v3}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 687
    .line 688
    .line 689
    move-result-object v3

    .line 690
    move-object/from16 v63, v3

    .line 691
    .line 692
    goto :goto_b

    .line 693
    :cond_c
    move-object/from16 v63, v20

    .line 694
    .line 695
    :goto_b
    invoke-virtual {v6, v4}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 696
    .line 697
    .line 698
    move-result-object v3

    .line 699
    move-object/from16 v64, v4

    .line 700
    .line 701
    invoke-virtual/range {v48 .. v48}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 702
    .line 703
    .line 704
    move-result v4

    .line 705
    and-int/lit16 v4, v4, 0x400

    .line 706
    .line 707
    if-nez v4, :cond_d

    .line 708
    .line 709
    array-length v4, v13

    .line 710
    new-array v4, v4, [Lg4/h;

    .line 711
    .line 712
    invoke-virtual {v6, v1}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 713
    .line 714
    .line 715
    move-result-object v23

    .line 716
    invoke-virtual {v7, v1, v9, v10}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 717
    .line 718
    .line 719
    move-result-object v9

    .line 720
    move-object/from16 v65, v7

    .line 721
    .line 722
    move-object/from16 v67, v13

    .line 723
    .line 724
    move-object/from16 v66, v14

    .line 725
    .line 726
    move-object/from16 v13, v23

    .line 727
    .line 728
    move-object v7, v4

    .line 729
    move-object v14, v9

    .line 730
    move-object/from16 v4, v20

    .line 731
    .line 732
    move-object v9, v4

    .line 733
    :goto_c
    move-object/from16 v68, v1

    .line 734
    .line 735
    goto :goto_d

    .line 736
    :cond_d
    sget-object v4, Lg4/j;->n:Lg4/j;

    .line 737
    .line 738
    invoke-virtual {v6, v4}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 739
    .line 740
    .line 741
    move-result-object v4

    .line 742
    invoke-virtual {v6, v14}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 743
    .line 744
    .line 745
    move-result-object v9

    .line 746
    move-object/from16 v65, v7

    .line 747
    .line 748
    move-object/from16 v67, v13

    .line 749
    .line 750
    move-object/from16 v66, v14

    .line 751
    .line 752
    move-object/from16 v7, v20

    .line 753
    .line 754
    move-object v13, v7

    .line 755
    move-object v14, v13

    .line 756
    goto :goto_c

    .line 757
    :goto_d
    invoke-static/range {v43 .. v43}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-virtual {v6, v2, v1}, Lg4/b;->i(Lg4/h;Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    new-instance v30, Lu4/v;

    .line 765
    .line 766
    iget-object v1, v5, Lg4/h;->b:Lg4/j;

    .line 767
    .line 768
    iget-object v1, v1, Lg4/j;->b:Lw4/c;

    .line 769
    .line 770
    invoke-static {v1}, Lu4/s;->f(Lw4/d;)Lu4/r;

    .line 771
    .line 772
    .line 773
    move-result-object v31

    .line 774
    iget-object v1, v6, Lg4/b;->h:Lu4/t;

    .line 775
    .line 776
    sget-object v33, Lu4/p;->i:Lu4/p;

    .line 777
    .line 778
    move-object/from16 v32, v1

    .line 779
    .line 780
    iget-object v1, v6, Lg4/b;->j:Lw4/b;

    .line 781
    .line 782
    move-object/from16 v34, v1

    .line 783
    .line 784
    invoke-direct/range {v30 .. v35}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 785
    .line 786
    .line 787
    move-object/from16 v1, v20

    .line 788
    .line 789
    move-object/from16 v20, v2

    .line 790
    .line 791
    move-object v2, v1

    .line 792
    move-object/from16 v1, v30

    .line 793
    .line 794
    invoke-virtual {v6, v1, v2}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 795
    .line 796
    .line 797
    const/4 v1, 0x1

    .line 798
    invoke-virtual {v6, v5, v1}, Lg4/b;->j(Lg4/h;Z)V

    .line 799
    .line 800
    .line 801
    new-instance v1, Lu4/u;

    .line 802
    .line 803
    iget-object v2, v12, Lg4/h;->b:Lg4/j;

    .line 804
    .line 805
    iget-object v2, v2, Lg4/j;->b:Lw4/c;

    .line 806
    .line 807
    invoke-static {v2}, Lu4/s;->a(Lw4/d;)Lu4/r;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v5}, Lg4/h;->a()Lu4/o;

    .line 812
    .line 813
    .line 814
    move-result-object v5

    .line 815
    move-object/from16 v30, v10

    .line 816
    .line 817
    invoke-virtual/range {v20 .. v20}, Lg4/h;->a()Lu4/o;

    .line 818
    .line 819
    .line 820
    move-result-object v10

    .line 821
    invoke-static {v5, v10}, Lu4/p;->q(Lu4/o;Lu4/o;)Lu4/p;

    .line 822
    .line 823
    .line 824
    move-result-object v5

    .line 825
    move-object/from16 v10, v56

    .line 826
    .line 827
    invoke-direct {v1, v2, v10, v5, v8}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 828
    .line 829
    .line 830
    const/4 v2, 0x0

    .line 831
    invoke-virtual {v6, v1, v2}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 832
    .line 833
    .line 834
    const/4 v1, 0x1

    .line 835
    invoke-virtual {v6, v12, v1}, Lg4/b;->j(Lg4/h;Z)V

    .line 836
    .line 837
    .line 838
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    invoke-virtual {v6, v0, v1}, Lg4/b;->i(Lg4/h;Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    new-instance v69, Lu4/v;

    .line 846
    .line 847
    iget-object v1, v11, Lg4/j;->b:Lw4/c;

    .line 848
    .line 849
    invoke-static {v1}, Lu4/s;->k(Lw4/d;)Lu4/r;

    .line 850
    .line 851
    .line 852
    move-result-object v70

    .line 853
    iget-object v1, v6, Lg4/b;->h:Lu4/t;

    .line 854
    .line 855
    invoke-virtual {v0}, Lg4/h;->a()Lu4/o;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-static {v0}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 860
    .line 861
    .line 862
    move-result-object v72

    .line 863
    iget-object v0, v6, Lg4/b;->j:Lw4/b;

    .line 864
    .line 865
    iget-object v2, v11, Lg4/j;->c:Lv4/d0;

    .line 866
    .line 867
    move-object/from16 v73, v0

    .line 868
    .line 869
    move-object/from16 v71, v1

    .line 870
    .line 871
    move-object/from16 v74, v2

    .line 872
    .line 873
    invoke-direct/range {v69 .. v74}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 874
    .line 875
    .line 876
    move-object/from16 v0, v69

    .line 877
    .line 878
    const/4 v2, 0x0

    .line 879
    invoke-virtual {v6, v0, v2}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 880
    .line 881
    .line 882
    move-object/from16 v0, v59

    .line 883
    .line 884
    const/4 v1, 0x1

    .line 885
    invoke-virtual {v6, v0, v1}, Lg4/b;->j(Lg4/h;Z)V

    .line 886
    .line 887
    .line 888
    new-instance v23, Lu4/v;

    .line 889
    .line 890
    move-object/from16 v5, v36

    .line 891
    .line 892
    iget-object v11, v5, Lg4/j;->b:Lw4/c;

    .line 893
    .line 894
    invoke-static {v11}, Lu4/s;->e(Lw4/d;)Lu4/r;

    .line 895
    .line 896
    .line 897
    move-result-object v24

    .line 898
    iget-object v11, v6, Lg4/b;->h:Lu4/t;

    .line 899
    .line 900
    invoke-virtual/range {v52 .. v52}, Lg4/h;->a()Lu4/o;

    .line 901
    .line 902
    .line 903
    move-result-object v20

    .line 904
    invoke-static/range {v20 .. v20}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 905
    .line 906
    .line 907
    move-result-object v26

    .line 908
    iget-object v1, v6, Lg4/b;->j:Lw4/b;

    .line 909
    .line 910
    move-object/from16 v27, v1

    .line 911
    .line 912
    move-object/from16 v25, v11

    .line 913
    .line 914
    invoke-direct/range {v23 .. v28}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 915
    .line 916
    .line 917
    move-object/from16 v1, v23

    .line 918
    .line 919
    invoke-virtual {v6, v1, v2}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 920
    .line 921
    .line 922
    move-object/from16 v1, v54

    .line 923
    .line 924
    const/4 v11, 0x1

    .line 925
    invoke-virtual {v6, v1, v11}, Lg4/b;->j(Lg4/h;Z)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v6, v3, v2}, Lg4/b;->i(Lg4/h;Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    new-instance v2, Lg4/g;

    .line 932
    .line 933
    invoke-direct {v2}, Lg4/g;-><init>()V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v6, v2}, Lg4/b;->b(Lg4/g;)V

    .line 937
    .line 938
    .line 939
    iget-object v11, v3, Lg4/h;->b:Lg4/j;

    .line 940
    .line 941
    iget-object v11, v11, Lg4/j;->b:Lw4/c;

    .line 942
    .line 943
    iget-object v5, v5, Lg4/j;->b:Lw4/c;

    .line 944
    .line 945
    invoke-static {v11, v5}, Lw4/b;->q(Lw4/c;Lw4/c;)Lw4/b;

    .line 946
    .line 947
    .line 948
    move-result-object v5

    .line 949
    sget-object v11, Lu4/s;->t:Lu4/r;

    .line 950
    .line 951
    sget-object v1, Lu4/s;->z:Lu4/r;

    .line 952
    .line 953
    move-object/from16 v23, v3

    .line 954
    .line 955
    sget-object v3, Lu4/s;->B:Lu4/r;

    .line 956
    .line 957
    move-object/from16 v24, v4

    .line 958
    .line 959
    sget-object v4, Lu4/s;->H:Lu4/r;

    .line 960
    .line 961
    invoke-static {v5, v11, v1, v3, v4}, Lu4/s;->n(Lw4/e;Lu4/r;Lu4/r;Lu4/r;Lu4/r;)Lu4/r;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    new-instance v3, Lu4/m;

    .line 966
    .line 967
    invoke-virtual/range {v23 .. v23}, Lg4/h;->a()Lu4/o;

    .line 968
    .line 969
    .line 970
    move-result-object v4

    .line 971
    invoke-virtual/range {v54 .. v54}, Lg4/h;->a()Lu4/o;

    .line 972
    .line 973
    .line 974
    move-result-object v5

    .line 975
    invoke-static {v4, v5}, Lu4/p;->q(Lu4/o;Lu4/o;)Lu4/p;

    .line 976
    .line 977
    .line 978
    move-result-object v4

    .line 979
    const/4 v5, 0x0

    .line 980
    invoke-direct {v3, v1, v10, v5, v4}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v6, v3, v2}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 984
    .line 985
    .line 986
    const/4 v1, 0x0

    .line 987
    :goto_e
    move/from16 v3, v53

    .line 988
    .line 989
    if-ge v1, v3, :cond_f

    .line 990
    .line 991
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 992
    .line 993
    .line 994
    move-result-object v4

    .line 995
    move-object/from16 v5, v57

    .line 996
    .line 997
    invoke-virtual {v6, v5, v4}, Lg4/b;->i(Lg4/h;Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    aget-object v4, v30, v1

    .line 1001
    .line 1002
    invoke-virtual {v6, v1, v4}, Lg4/b;->e(ILg4/j;)Lg4/h;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v4

    .line 1006
    sget-object v11, Ly4/c;->h:Ljava/util/HashMap;

    .line 1007
    .line 1008
    move/from16 v23, v1

    .line 1009
    .line 1010
    iget-object v1, v4, Lg4/h;->b:Lg4/j;

    .line 1011
    .line 1012
    invoke-virtual {v11, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    check-cast v1, Lg4/i;

    .line 1017
    .line 1018
    if-nez v1, :cond_e

    .line 1019
    .line 1020
    move/from16 v53, v3

    .line 1021
    .line 1022
    move-object v1, v6

    .line 1023
    goto :goto_f

    .line 1024
    :cond_e
    filled-new-array {v4}, [Lg4/h;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v41

    .line 1028
    const/4 v4, 0x1

    .line 1029
    invoke-virtual {v1, v4}, Lg4/i;->a(Z)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v11

    .line 1033
    invoke-static {v11}, Lw4/a;->d(Ljava/lang/String;)Lw4/a;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v4

    .line 1037
    new-instance v11, Lu4/r;

    .line 1038
    .line 1039
    invoke-virtual {v4}, Lw4/a;->c()Lw4/b;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v4

    .line 1043
    move-object/from16 v38, v1

    .line 1044
    .line 1045
    sget-object v1, Lw4/b;->p:Lw4/b;

    .line 1046
    .line 1047
    move/from16 v53, v3

    .line 1048
    .line 1049
    const/16 v3, 0x31

    .line 1050
    .line 1051
    invoke-direct {v11, v3, v4, v1}, Lu4/r;-><init>(ILw4/b;Lw4/e;)V

    .line 1052
    .line 1053
    .line 1054
    const/16 v40, 0x0

    .line 1055
    .line 1056
    move-object/from16 v36, v6

    .line 1057
    .line 1058
    move-object/from16 v37, v11

    .line 1059
    .line 1060
    invoke-virtual/range {v36 .. v41}, Lg4/b;->g(Lu4/r;Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 1061
    .line 1062
    .line 1063
    move-object/from16 v1, v36

    .line 1064
    .line 1065
    move-object/from16 v4, v39

    .line 1066
    .line 1067
    :goto_f
    new-instance v3, Lu4/u;

    .line 1068
    .line 1069
    iget-object v6, v4, Lg4/h;->b:Lg4/j;

    .line 1070
    .line 1071
    iget-object v6, v6, Lg4/j;->b:Lw4/c;

    .line 1072
    .line 1073
    invoke-static {v6}, Lu4/s;->b(Lw4/d;)Lu4/r;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v6

    .line 1077
    invoke-virtual {v4}, Lg4/h;->a()Lu4/o;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v4

    .line 1081
    invoke-virtual {v0}, Lg4/h;->a()Lu4/o;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v11

    .line 1085
    move-object/from16 v57, v5

    .line 1086
    .line 1087
    invoke-virtual/range {v57 .. v57}, Lg4/h;->a()Lu4/o;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v5

    .line 1091
    move-object/from16 v25, v9

    .line 1092
    .line 1093
    new-instance v9, Lu4/p;

    .line 1094
    .line 1095
    move-object/from16 v26, v13

    .line 1096
    .line 1097
    const/4 v13, 0x3

    .line 1098
    invoke-direct {v9, v13}, Lz4/e;-><init>(I)V

    .line 1099
    .line 1100
    .line 1101
    const/4 v13, 0x0

    .line 1102
    invoke-virtual {v9, v13, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1103
    .line 1104
    .line 1105
    const/4 v4, 0x1

    .line 1106
    invoke-virtual {v9, v4, v11}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1107
    .line 1108
    .line 1109
    const/4 v11, 0x2

    .line 1110
    invoke-virtual {v9, v11, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1111
    .line 1112
    .line 1113
    invoke-direct {v3, v6, v10, v9, v8}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 1114
    .line 1115
    .line 1116
    const/4 v5, 0x0

    .line 1117
    invoke-virtual {v1, v3, v5}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 1118
    .line 1119
    .line 1120
    add-int/lit8 v3, v23, 0x1

    .line 1121
    .line 1122
    move-object v6, v1

    .line 1123
    move v1, v3

    .line 1124
    move-object/from16 v9, v25

    .line 1125
    .line 1126
    move-object/from16 v13, v26

    .line 1127
    .line 1128
    goto/16 :goto_e

    .line 1129
    .line 1130
    :cond_f
    move-object v1, v6

    .line 1131
    move-object/from16 v25, v9

    .line 1132
    .line 1133
    move-object/from16 v26, v13

    .line 1134
    .line 1135
    move-object/from16 v3, v52

    .line 1136
    .line 1137
    const/4 v4, 0x1

    .line 1138
    const/4 v11, 0x2

    .line 1139
    filled-new-array {v3, v12, v0}, [Lg4/h;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v41

    .line 1143
    move-object/from16 v0, v51

    .line 1144
    .line 1145
    invoke-virtual {v0, v4}, Lg4/i;->a(Z)Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v5

    .line 1149
    invoke-static {v5}, Lw4/a;->d(Ljava/lang/String;)Lw4/a;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v4

    .line 1153
    new-instance v5, Lu4/r;

    .line 1154
    .line 1155
    invoke-virtual {v4}, Lw4/a;->c()Lw4/b;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v4

    .line 1159
    sget-object v6, Lw4/b;->p:Lw4/b;

    .line 1160
    .line 1161
    const/16 v8, 0x35

    .line 1162
    .line 1163
    invoke-direct {v5, v8, v4, v6}, Lu4/r;-><init>(ILw4/b;Lw4/e;)V

    .line 1164
    .line 1165
    .line 1166
    move-object/from16 v38, v0

    .line 1167
    .line 1168
    move-object/from16 v36, v1

    .line 1169
    .line 1170
    move-object/from16 v37, v5

    .line 1171
    .line 1172
    move-object/from16 v40, v54

    .line 1173
    .line 1174
    move-object/from16 v39, v55

    .line 1175
    .line 1176
    invoke-virtual/range {v36 .. v41}, Lg4/b;->g(Lu4/r;Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 1177
    .line 1178
    .line 1179
    move-object/from16 v4, v39

    .line 1180
    .line 1181
    sget-object v5, Ly4/c;->i:Ljava/util/HashMap;

    .line 1182
    .line 1183
    invoke-virtual {v5, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v8

    .line 1187
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 1188
    .line 1189
    if-eqz v8, :cond_10

    .line 1190
    .line 1191
    move-object/from16 v8, v63

    .line 1192
    .line 1193
    invoke-virtual {v1, v8, v4}, Lg4/b;->c(Lg4/h;Lg4/h;)V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v5, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v4

    .line 1200
    check-cast v4, Lg4/i;

    .line 1201
    .line 1202
    const/4 v13, 0x0

    .line 1203
    new-array v5, v13, [Lg4/h;

    .line 1204
    .line 1205
    const/4 v12, 0x1

    .line 1206
    invoke-virtual {v4, v12}, Lg4/i;->a(Z)Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v13

    .line 1210
    invoke-static {v13}, Lw4/a;->d(Ljava/lang/String;)Lw4/a;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v12

    .line 1214
    new-instance v13, Lu4/r;

    .line 1215
    .line 1216
    const/16 v11, 0x32

    .line 1217
    .line 1218
    invoke-virtual {v12}, Lw4/a;->c()Lw4/b;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v12

    .line 1222
    invoke-direct {v13, v11, v12, v6}, Lu4/r;-><init>(ILw4/b;Lw4/e;)V

    .line 1223
    .line 1224
    .line 1225
    move-object/from16 v36, v1

    .line 1226
    .line 1227
    move-object/from16 v38, v4

    .line 1228
    .line 1229
    move-object/from16 v41, v5

    .line 1230
    .line 1231
    move-object/from16 v40, v8

    .line 1232
    .line 1233
    move-object/from16 v37, v13

    .line 1234
    .line 1235
    move-object/from16 v39, v60

    .line 1236
    .line 1237
    invoke-virtual/range {v36 .. v41}, Lg4/b;->g(Lu4/r;Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 1238
    .line 1239
    .line 1240
    move-object/from16 v5, v39

    .line 1241
    .line 1242
    invoke-virtual {v1, v5}, Lg4/b;->l(Lg4/h;)V

    .line 1243
    .line 1244
    .line 1245
    goto :goto_10

    .line 1246
    :cond_10
    move-object/from16 v5, v60

    .line 1247
    .line 1248
    invoke-virtual {v9, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v6

    .line 1252
    if-eqz v6, :cond_11

    .line 1253
    .line 1254
    invoke-virtual {v1}, Lg4/b;->m()V

    .line 1255
    .line 1256
    .line 1257
    goto :goto_10

    .line 1258
    :cond_11
    invoke-virtual {v1, v5, v4}, Lg4/b;->c(Lg4/h;Lg4/h;)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v1, v5}, Lg4/b;->l(Lg4/h;)V

    .line 1262
    .line 1263
    .line 1264
    :goto_10
    invoke-virtual {v1, v2}, Lg4/b;->b(Lg4/g;)V

    .line 1265
    .line 1266
    .line 1267
    iget-boolean v4, v2, Lg4/g;->c:Z

    .line 1268
    .line 1269
    if-nez v4, :cond_1a

    .line 1270
    .line 1271
    const/4 v4, 0x1

    .line 1272
    iput-boolean v4, v2, Lg4/g;->c:Z

    .line 1273
    .line 1274
    iget-object v4, v1, Lg4/b;->c:Lg4/g;

    .line 1275
    .line 1276
    if-eqz v4, :cond_12

    .line 1277
    .line 1278
    invoke-virtual {v1, v2}, Lg4/b;->b(Lg4/g;)V

    .line 1279
    .line 1280
    .line 1281
    new-instance v4, Lu4/m;

    .line 1282
    .line 1283
    sget-object v5, Lu4/s;->s:Lu4/r;

    .line 1284
    .line 1285
    sget-object v6, Lu4/p;->i:Lu4/p;

    .line 1286
    .line 1287
    const/4 v8, 0x0

    .line 1288
    invoke-direct {v4, v5, v10, v8, v6}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v1, v4, v2}, Lg4/b;->a(Lu4/i;Lg4/g;)V

    .line 1292
    .line 1293
    .line 1294
    :cond_12
    iput-object v2, v1, Lg4/b;->c:Lg4/g;

    .line 1295
    .line 1296
    invoke-virtual/range {v48 .. v48}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1297
    .line 1298
    .line 1299
    move-result v2

    .line 1300
    and-int/lit16 v2, v2, 0x400

    .line 1301
    .line 1302
    if-nez v2, :cond_15

    .line 1303
    .line 1304
    const/4 v2, 0x0

    .line 1305
    :goto_11
    array-length v4, v7

    .line 1306
    if-ge v2, v4, :cond_13

    .line 1307
    .line 1308
    aget-object v4, v30, v2

    .line 1309
    .line 1310
    invoke-virtual {v1, v2, v4}, Lg4/b;->e(ILg4/j;)Lg4/h;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v4

    .line 1314
    aput-object v4, v7, v2

    .line 1315
    .line 1316
    add-int/lit8 v2, v2, 0x1

    .line 1317
    .line 1318
    goto :goto_11

    .line 1319
    :cond_13
    invoke-virtual {v9, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1320
    .line 1321
    .line 1322
    move-result v2

    .line 1323
    if-eqz v2, :cond_14

    .line 1324
    .line 1325
    const/4 v2, 0x0

    .line 1326
    invoke-virtual {v1, v14, v2, v3, v7}, Lg4/b;->h(Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v1}, Lg4/b;->m()V

    .line 1330
    .line 1331
    .line 1332
    :goto_12
    move-object/from16 v2, v48

    .line 1333
    .line 1334
    goto :goto_13

    .line 1335
    :cond_14
    move-object/from16 v2, v26

    .line 1336
    .line 1337
    invoke-virtual {v1, v14, v2, v3, v7}, Lg4/b;->h(Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v1, v2}, Lg4/b;->l(Lg4/h;)V

    .line 1341
    .line 1342
    .line 1343
    goto :goto_12

    .line 1344
    :cond_15
    move-object/from16 v4, v24

    .line 1345
    .line 1346
    move-object/from16 v3, v25

    .line 1347
    .line 1348
    move-object/from16 v2, v48

    .line 1349
    .line 1350
    invoke-static {v1, v2, v4, v3}, Ly4/c;->f(Lg4/b;Ljava/lang/reflect/Method;Lg4/h;Lg4/h;)V

    .line 1351
    .line 1352
    .line 1353
    :goto_13
    invoke-static {v2}, Ly4/c;->e(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v1

    .line 1357
    move-object/from16 v4, v30

    .line 1358
    .line 1359
    move-object/from16 v3, v50

    .line 1360
    .line 1361
    move-object/from16 v5, v68

    .line 1362
    .line 1363
    invoke-virtual {v3, v5, v1, v4}, Lg4/j;->b(Lg4/j;Ljava/lang/String;[Lg4/j;)Lg4/i;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v1

    .line 1367
    move-object/from16 v6, v49

    .line 1368
    .line 1369
    invoke-virtual {v6, v1}, Lb/e;->o(Lg4/i;)Lg4/b;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v1

    .line 1373
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1374
    .line 1375
    .line 1376
    move-result v7

    .line 1377
    and-int/lit16 v7, v7, 0x400

    .line 1378
    .line 1379
    if-nez v7, :cond_19

    .line 1380
    .line 1381
    iget-object v2, v1, Lg4/b;->e:Lg4/h;

    .line 1382
    .line 1383
    if-eqz v2, :cond_18

    .line 1384
    .line 1385
    invoke-static {v2, v3}, Lg4/b;->d(Lg4/h;Lg4/j;)V

    .line 1386
    .line 1387
    .line 1388
    move-object/from16 v7, v67

    .line 1389
    .line 1390
    array-length v7, v7

    .line 1391
    new-array v8, v7, [Lg4/h;

    .line 1392
    .line 1393
    const/4 v10, 0x0

    .line 1394
    :goto_14
    if-ge v10, v7, :cond_16

    .line 1395
    .line 1396
    aget-object v11, v4, v10

    .line 1397
    .line 1398
    invoke-virtual {v1, v10, v11}, Lg4/b;->e(ILg4/j;)Lg4/h;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v11

    .line 1402
    aput-object v11, v8, v10

    .line 1403
    .line 1404
    add-int/lit8 v10, v10, 0x1

    .line 1405
    .line 1406
    goto :goto_14

    .line 1407
    :cond_16
    invoke-virtual {v9, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1408
    .line 1409
    .line 1410
    move-result v4

    .line 1411
    if-eqz v4, :cond_17

    .line 1412
    .line 1413
    const/4 v4, 0x0

    .line 1414
    invoke-virtual {v1, v14, v4, v2, v8}, Lg4/b;->h(Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v1}, Lg4/b;->m()V

    .line 1418
    .line 1419
    .line 1420
    goto :goto_15

    .line 1421
    :cond_17
    const/4 v4, 0x0

    .line 1422
    invoke-virtual {v1, v5}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v5

    .line 1426
    invoke-virtual {v1, v14, v5, v2, v8}, Lg4/b;->h(Lg4/i;Lg4/h;Lg4/h;[Lg4/h;)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v1, v5}, Lg4/b;->l(Lg4/h;)V

    .line 1430
    .line 1431
    .line 1432
    goto :goto_15

    .line 1433
    :cond_18
    const/4 v4, 0x0

    .line 1434
    invoke-static/range {v18 .. v18}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1435
    .line 1436
    .line 1437
    return-object v4

    .line 1438
    :cond_19
    const/4 v4, 0x0

    .line 1439
    sget-object v5, Lg4/j;->n:Lg4/j;

    .line 1440
    .line 1441
    invoke-virtual {v1, v5}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v5

    .line 1445
    move-object/from16 v7, v66

    .line 1446
    .line 1447
    invoke-virtual {v1, v7}, Lg4/b;->k(Lg4/j;)Lg4/h;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v7

    .line 1451
    invoke-static {v1, v2, v5, v7}, Ly4/c;->f(Lg4/b;Ljava/lang/reflect/Method;Lg4/h;Lg4/h;)V

    .line 1452
    .line 1453
    .line 1454
    :goto_15
    add-int/lit8 v13, v43, 0x1

    .line 1455
    .line 1456
    move-object/from16 v1, p0

    .line 1457
    .line 1458
    move-object v8, v3

    .line 1459
    move-object/from16 v20, v4

    .line 1460
    .line 1461
    move-object v5, v6

    .line 1462
    move/from16 v9, v42

    .line 1463
    .line 1464
    move-object/from16 v2, v44

    .line 1465
    .line 1466
    move-object/from16 v10, v45

    .line 1467
    .line 1468
    move-object/from16 v15, v46

    .line 1469
    .line 1470
    move-object/from16 v6, v47

    .line 1471
    .line 1472
    move-object/from16 v11, v58

    .line 1473
    .line 1474
    move-object/from16 v12, v61

    .line 1475
    .line 1476
    move-object/from16 v3, v62

    .line 1477
    .line 1478
    move-object/from16 v4, v64

    .line 1479
    .line 1480
    move-object/from16 v7, v65

    .line 1481
    .line 1482
    goto/16 :goto_9

    .line 1483
    .line 1484
    :cond_1a
    const/4 v4, 0x0

    .line 1485
    const-string v0, "already marked"

    .line 1486
    .line 1487
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1488
    .line 1489
    .line 1490
    return-object v4

    .line 1491
    :cond_1b
    move-object/from16 v4, v20

    .line 1492
    .line 1493
    invoke-static/range {v18 .. v18}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1494
    .line 1495
    .line 1496
    return-object v4

    .line 1497
    :cond_1c
    move-object/from16 v44, v2

    .line 1498
    .line 1499
    move-object/from16 v47, v6

    .line 1500
    .line 1501
    move-object/from16 v65, v7

    .line 1502
    .line 1503
    move-object v3, v8

    .line 1504
    move-object/from16 v45, v10

    .line 1505
    .line 1506
    move-object/from16 v46, v15

    .line 1507
    .line 1508
    move-object v6, v5

    .line 1509
    const-string v0, ".generated"

    .line 1510
    .line 1511
    move-object/from16 v1, v47

    .line 1512
    .line 1513
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v0

    .line 1517
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    .line 1518
    .line 1519
    .line 1520
    move-result v2

    .line 1521
    new-array v2, v2, [Lg4/j;

    .line 1522
    .line 1523
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v4

    .line 1527
    const/4 v5, 0x0

    .line 1528
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1529
    .line 1530
    .line 1531
    move-result v7

    .line 1532
    if-eqz v7, :cond_1d

    .line 1533
    .line 1534
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v7

    .line 1538
    check-cast v7, Ljava/lang/Class;

    .line 1539
    .line 1540
    add-int/lit8 v8, v5, 0x1

    .line 1541
    .line 1542
    invoke-static {v7}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v7

    .line 1546
    aput-object v7, v2, v5

    .line 1547
    .line 1548
    move v5, v8

    .line 1549
    goto :goto_16

    .line 1550
    :cond_1d
    invoke-virtual {v6, v3}, Lb/e;->u(Lg4/j;)Lg4/e;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v4

    .line 1554
    iget-boolean v5, v4, Lg4/e;->b:Z

    .line 1555
    .line 1556
    if-nez v5, :cond_3e

    .line 1557
    .line 1558
    const/4 v11, 0x1

    .line 1559
    iput-boolean v11, v4, Lg4/e;->b:Z

    .line 1560
    .line 1561
    iput v11, v4, Lg4/e;->c:I

    .line 1562
    .line 1563
    move-object/from16 v3, v65

    .line 1564
    .line 1565
    iput-object v3, v4, Lg4/e;->d:Lg4/j;

    .line 1566
    .line 1567
    iput-object v0, v4, Lg4/e;->e:Ljava/lang/String;

    .line 1568
    .line 1569
    new-instance v0, Lg4/k;

    .line 1570
    .line 1571
    invoke-direct {v0, v2}, Lg4/k;-><init>([Lg4/j;)V

    .line 1572
    .line 1573
    .line 1574
    iput-object v0, v4, Lg4/e;->f:Lg4/k;

    .line 1575
    .line 1576
    move-object/from16 v2, p0

    .line 1577
    .line 1578
    iget-object v0, v2, Ly4/c;->b:Ljava/lang/ClassLoader;

    .line 1579
    .line 1580
    iget-object v3, v2, Ly4/c;->c:Ljava/io/File;

    .line 1581
    .line 1582
    iget-object v4, v6, Lb/e;->h:Ljava/lang/Object;

    .line 1583
    .line 1584
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 1585
    .line 1586
    if-nez v3, :cond_21

    .line 1587
    .line 1588
    const-string v3, "dexmaker.dexcache"

    .line 1589
    .line 1590
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v3

    .line 1594
    if-eqz v3, :cond_1e

    .line 1595
    .line 1596
    new-instance v5, Ljava/io/File;

    .line 1597
    .line 1598
    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1599
    .line 1600
    .line 1601
    move-object v3, v5

    .line 1602
    goto :goto_18

    .line 1603
    :cond_1e
    :try_start_0
    const-class v3, Lg4/a;

    .line 1604
    .line 1605
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v3

    .line 1609
    const-string v5, "dalvik.system.PathClassLoader"

    .line 1610
    .line 1611
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v5

    .line 1615
    invoke-virtual {v5, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    invoke-static {v3, v5}, Lg4/a;->u(Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/String;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v3

    .line 1622
    invoke-static {v3}, Lg4/a;->v(Ljava/lang/String;)[Ljava/io/File;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v3

    .line 1626
    array-length v5, v3

    .line 1627
    if-lez v5, :cond_1f

    .line 1628
    .line 1629
    const/16 v17, 0x0

    .line 1630
    .line 1631
    aget-object v3, v3, v17
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1632
    .line 1633
    goto :goto_17

    .line 1634
    :catch_0
    :cond_1f
    const/4 v3, 0x0

    .line 1635
    :goto_17
    if-eqz v3, :cond_20

    .line 1636
    .line 1637
    goto :goto_18

    .line 1638
    :cond_20
    const-string v0, "dexcache == null (and no default could be found; consider setting the \'dexmaker.dexcache\' system property)"

    .line 1639
    .line 1640
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1641
    .line 1642
    .line 1643
    const/16 v20, 0x0

    .line 1644
    .line 1645
    return-object v20

    .line 1646
    :cond_21
    :goto_18
    new-instance v5, Ljava/io/File;

    .line 1647
    .line 1648
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v7

    .line 1652
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v8

    .line 1656
    invoke-interface {v7}, Ljava/util/Set;->size()I

    .line 1657
    .line 1658
    .line 1659
    move-result v7

    .line 1660
    new-array v9, v7, [I

    .line 1661
    .line 1662
    const/4 v10, 0x0

    .line 1663
    :cond_22
    :goto_19
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1664
    .line 1665
    .line 1666
    move-result v11

    .line 1667
    if-eqz v11, :cond_23

    .line 1668
    .line 1669
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v11

    .line 1673
    check-cast v11, Lg4/j;

    .line 1674
    .line 1675
    invoke-virtual {v6, v11}, Lb/e;->u(Lg4/j;)Lg4/e;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v11

    .line 1679
    iget-object v12, v11, Lg4/e;->i:Ljava/util/LinkedHashMap;

    .line 1680
    .line 1681
    invoke-virtual {v12}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v12

    .line 1685
    iget-object v13, v11, Lg4/e;->d:Lg4/j;

    .line 1686
    .line 1687
    if-eqz v13, :cond_22

    .line 1688
    .line 1689
    iget-object v13, v13, Lg4/j;->a:Ljava/lang/String;

    .line 1690
    .line 1691
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 1692
    .line 1693
    .line 1694
    move-result v13

    .line 1695
    mul-int/lit8 v13, v13, 0x1f

    .line 1696
    .line 1697
    iget-object v11, v11, Lg4/e;->f:Lg4/k;

    .line 1698
    .line 1699
    iget-object v11, v11, Lg4/k;->a:[Lg4/j;

    .line 1700
    .line 1701
    invoke-static {v11}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 1702
    .line 1703
    .line 1704
    move-result v11

    .line 1705
    add-int/2addr v11, v13

    .line 1706
    add-int/lit8 v13, v10, 0x1

    .line 1707
    .line 1708
    mul-int/lit8 v11, v11, 0x1f

    .line 1709
    .line 1710
    invoke-interface {v12}, Ljava/util/Set;->hashCode()I

    .line 1711
    .line 1712
    .line 1713
    move-result v12

    .line 1714
    add-int/2addr v12, v11

    .line 1715
    aput v12, v9, v10

    .line 1716
    .line 1717
    move v10, v13

    .line 1718
    goto :goto_19

    .line 1719
    :cond_23
    invoke-static {v9}, Ljava/util/Arrays;->sort([I)V

    .line 1720
    .line 1721
    .line 1722
    const/4 v8, 0x0

    .line 1723
    const/4 v10, 0x1

    .line 1724
    :goto_1a
    if-ge v8, v7, :cond_24

    .line 1725
    .line 1726
    aget v11, v9, v8

    .line 1727
    .line 1728
    mul-int/lit8 v10, v10, 0x1f

    .line 1729
    .line 1730
    add-int/2addr v10, v11

    .line 1731
    add-int/lit8 v8, v8, 0x1

    .line 1732
    .line 1733
    goto :goto_1a

    .line 1734
    :cond_24
    const-string v7, "Generated_"

    .line 1735
    .line 1736
    const-string v8, ".jar"

    .line 1737
    .line 1738
    invoke-static {v10, v7, v8}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v7

    .line 1742
    invoke-direct {v5, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 1746
    .line 1747
    .line 1748
    move-result v7

    .line 1749
    if-eqz v7, :cond_26

    .line 1750
    .line 1751
    invoke-virtual {v5}, Ljava/io/File;->canWrite()Z

    .line 1752
    .line 1753
    .line 1754
    move-result v7

    .line 1755
    if-nez v7, :cond_25

    .line 1756
    .line 1757
    invoke-virtual {v6, v5, v3, v0}, Lb/e;->t(Ljava/io/File;Ljava/io/File;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v0

    .line 1761
    goto/16 :goto_2c

    .line 1762
    .line 1763
    :cond_25
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 1764
    .line 1765
    .line 1766
    :cond_26
    iget-object v7, v6, Lb/e;->i:Ljava/lang/Object;

    .line 1767
    .line 1768
    check-cast v7, Lr4/p;

    .line 1769
    .line 1770
    if-nez v7, :cond_27

    .line 1771
    .line 1772
    new-instance v7, Ln4/a;

    .line 1773
    .line 1774
    invoke-direct {v7}, Ln4/a;-><init>()V

    .line 1775
    .line 1776
    .line 1777
    new-instance v8, Lr4/p;

    .line 1778
    .line 1779
    invoke-direct {v8, v7}, Lr4/p;-><init>(Ln4/a;)V

    .line 1780
    .line 1781
    .line 1782
    iput-object v8, v6, Lb/e;->i:Ljava/lang/Object;

    .line 1783
    .line 1784
    :cond_27
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v4

    .line 1788
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v4

    .line 1792
    :goto_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1793
    .line 1794
    .line 1795
    move-result v7

    .line 1796
    if-eqz v7, :cond_3d

    .line 1797
    .line 1798
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v7

    .line 1802
    check-cast v7, Lg4/e;

    .line 1803
    .line 1804
    iget-object v8, v6, Lb/e;->i:Ljava/lang/Object;

    .line 1805
    .line 1806
    check-cast v8, Lr4/p;

    .line 1807
    .line 1808
    iget-object v9, v7, Lg4/e;->i:Ljava/util/LinkedHashMap;

    .line 1809
    .line 1810
    iget-object v10, v7, Lg4/e;->h:Ljava/util/LinkedHashMap;

    .line 1811
    .line 1812
    iget-object v11, v7, Lg4/e;->a:Lg4/j;

    .line 1813
    .line 1814
    iget-boolean v12, v7, Lg4/e;->b:Z

    .line 1815
    .line 1816
    if-eqz v12, :cond_3c

    .line 1817
    .line 1818
    new-instance v12, Ln4/a;

    .line 1819
    .line 1820
    invoke-direct {v12}, Ln4/a;-><init>()V

    .line 1821
    .line 1822
    .line 1823
    iget-object v11, v11, Lg4/j;->c:Lv4/d0;

    .line 1824
    .line 1825
    iget-object v13, v7, Lg4/e;->g:Lr4/k;

    .line 1826
    .line 1827
    if-nez v13, :cond_3a

    .line 1828
    .line 1829
    new-instance v23, Lr4/k;

    .line 1830
    .line 1831
    iget v13, v7, Lg4/e;->c:I

    .line 1832
    .line 1833
    iget-object v14, v7, Lg4/e;->d:Lg4/j;

    .line 1834
    .line 1835
    iget-object v14, v14, Lg4/j;->c:Lv4/d0;

    .line 1836
    .line 1837
    iget-object v15, v7, Lg4/e;->f:Lg4/k;

    .line 1838
    .line 1839
    iget-object v15, v15, Lg4/k;->b:Lw4/b;

    .line 1840
    .line 1841
    new-instance v2, Lv4/c0;

    .line 1842
    .line 1843
    move-object/from16 v16, v4

    .line 1844
    .line 1845
    iget-object v4, v7, Lg4/e;->e:Ljava/lang/String;

    .line 1846
    .line 1847
    invoke-direct {v2, v4}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 1848
    .line 1849
    .line 1850
    move-object/from16 v28, v2

    .line 1851
    .line 1852
    move-object/from16 v24, v11

    .line 1853
    .line 1854
    move/from16 v25, v13

    .line 1855
    .line 1856
    move-object/from16 v26, v14

    .line 1857
    .line 1858
    move-object/from16 v27, v15

    .line 1859
    .line 1860
    invoke-direct/range {v23 .. v28}, Lr4/k;-><init>(Lv4/d0;ILv4/d0;Lw4/e;Lv4/c0;)V

    .line 1861
    .line 1862
    .line 1863
    move-object/from16 v2, v23

    .line 1864
    .line 1865
    iput-object v2, v7, Lg4/e;->g:Lr4/k;

    .line 1866
    .line 1867
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v2

    .line 1871
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v2

    .line 1875
    :goto_1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1876
    .line 1877
    .line 1878
    move-result v4

    .line 1879
    if-eqz v4, :cond_38

    .line 1880
    .line 1881
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v4

    .line 1885
    check-cast v4, Lg4/d;

    .line 1886
    .line 1887
    iget-object v9, v4, Lg4/d;->a:Lg4/i;

    .line 1888
    .line 1889
    iget-object v9, v9, Lg4/i;->e:Lv4/y;

    .line 1890
    .line 1891
    iget v11, v4, Lg4/d;->b:I

    .line 1892
    .line 1893
    iget-object v4, v4, Lg4/d;->c:Lg4/b;

    .line 1894
    .line 1895
    and-int/lit16 v13, v11, 0x400

    .line 1896
    .line 1897
    if-nez v13, :cond_28

    .line 1898
    .line 1899
    and-int/lit16 v13, v11, 0x100

    .line 1900
    .line 1901
    if-eqz v13, :cond_29

    .line 1902
    .line 1903
    :cond_28
    move-object/from16 v25, v0

    .line 1904
    .line 1905
    move-object/from16 v47, v1

    .line 1906
    .line 1907
    move-object/from16 v18, v2

    .line 1908
    .line 1909
    move-object/from16 v24, v3

    .line 1910
    .line 1911
    move-object/from16 v23, v10

    .line 1912
    .line 1913
    goto/16 :goto_28

    .line 1914
    .line 1915
    :cond_29
    new-instance v13, Lf1/h;

    .line 1916
    .line 1917
    iget-object v14, v4, Lg4/b;->b:Ljava/util/ArrayList;

    .line 1918
    .line 1919
    iget-boolean v15, v4, Lg4/b;->d:Z

    .line 1920
    .line 1921
    if-nez v15, :cond_2a

    .line 1922
    .line 1923
    invoke-virtual {v4}, Lg4/b;->f()V

    .line 1924
    .line 1925
    .line 1926
    :cond_2a
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v15

    .line 1930
    move-object/from16 v18, v2

    .line 1931
    .line 1932
    const/4 v2, 0x0

    .line 1933
    :goto_1d
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 1934
    .line 1935
    .line 1936
    move-result v19

    .line 1937
    if-eqz v19, :cond_30

    .line 1938
    .line 1939
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v19

    .line 1943
    move-object/from16 v23, v10

    .line 1944
    .line 1945
    move-object/from16 v10, v19

    .line 1946
    .line 1947
    check-cast v10, Lg4/g;

    .line 1948
    .line 1949
    move-object/from16 v19, v15

    .line 1950
    .line 1951
    iget-object v15, v10, Lg4/g;->a:Ljava/util/ArrayList;

    .line 1952
    .line 1953
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1954
    .line 1955
    .line 1956
    move-result v15

    .line 1957
    if-eqz v15, :cond_2b

    .line 1958
    .line 1959
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->remove()V

    .line 1960
    .line 1961
    .line 1962
    move-object/from16 v25, v0

    .line 1963
    .line 1964
    move-object/from16 v47, v1

    .line 1965
    .line 1966
    goto :goto_22

    .line 1967
    :cond_2b
    move-object/from16 v47, v1

    .line 1968
    .line 1969
    const/4 v15, 0x0

    .line 1970
    :goto_1e
    iget-object v1, v10, Lg4/g;->d:Ljava/util/List;

    .line 1971
    .line 1972
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1973
    .line 1974
    .line 1975
    move-result v1

    .line 1976
    if-ge v15, v1, :cond_2d

    .line 1977
    .line 1978
    :goto_1f
    iget-object v1, v10, Lg4/g;->d:Ljava/util/List;

    .line 1979
    .line 1980
    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v1

    .line 1984
    check-cast v1, Lg4/g;

    .line 1985
    .line 1986
    iget-object v1, v1, Lg4/g;->a:Ljava/util/ArrayList;

    .line 1987
    .line 1988
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1989
    .line 1990
    .line 1991
    move-result v1

    .line 1992
    if-eqz v1, :cond_2c

    .line 1993
    .line 1994
    iget-object v1, v10, Lg4/g;->d:Ljava/util/List;

    .line 1995
    .line 1996
    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v24

    .line 2000
    move-object/from16 v25, v0

    .line 2001
    .line 2002
    move-object/from16 v0, v24

    .line 2003
    .line 2004
    check-cast v0, Lg4/g;

    .line 2005
    .line 2006
    iget-object v0, v0, Lg4/g;->e:Lg4/g;

    .line 2007
    .line 2008
    invoke-interface {v1, v15, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2009
    .line 2010
    .line 2011
    move-object/from16 v0, v25

    .line 2012
    .line 2013
    goto :goto_1f

    .line 2014
    :cond_2c
    move-object/from16 v25, v0

    .line 2015
    .line 2016
    add-int/lit8 v15, v15, 0x1

    .line 2017
    .line 2018
    goto :goto_1e

    .line 2019
    :cond_2d
    move-object/from16 v25, v0

    .line 2020
    .line 2021
    :goto_20
    iget-object v0, v10, Lg4/g;->e:Lg4/g;

    .line 2022
    .line 2023
    if-eqz v0, :cond_2e

    .line 2024
    .line 2025
    iget-object v0, v0, Lg4/g;->a:Ljava/util/ArrayList;

    .line 2026
    .line 2027
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2028
    .line 2029
    .line 2030
    move-result v0

    .line 2031
    if-eqz v0, :cond_2e

    .line 2032
    .line 2033
    iget-object v0, v10, Lg4/g;->e:Lg4/g;

    .line 2034
    .line 2035
    iget-object v0, v0, Lg4/g;->e:Lg4/g;

    .line 2036
    .line 2037
    iput-object v0, v10, Lg4/g;->e:Lg4/g;

    .line 2038
    .line 2039
    goto :goto_20

    .line 2040
    :cond_2e
    :goto_21
    iget-object v0, v10, Lg4/g;->f:Lg4/g;

    .line 2041
    .line 2042
    if-eqz v0, :cond_2f

    .line 2043
    .line 2044
    iget-object v0, v0, Lg4/g;->a:Ljava/util/ArrayList;

    .line 2045
    .line 2046
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2047
    .line 2048
    .line 2049
    move-result v0

    .line 2050
    if-eqz v0, :cond_2f

    .line 2051
    .line 2052
    iget-object v0, v10, Lg4/g;->f:Lg4/g;

    .line 2053
    .line 2054
    iget-object v0, v0, Lg4/g;->e:Lg4/g;

    .line 2055
    .line 2056
    iput-object v0, v10, Lg4/g;->f:Lg4/g;

    .line 2057
    .line 2058
    goto :goto_21

    .line 2059
    :cond_2f
    add-int/lit8 v0, v2, 0x1

    .line 2060
    .line 2061
    iput v2, v10, Lg4/g;->g:I

    .line 2062
    .line 2063
    move v2, v0

    .line 2064
    :goto_22
    move-object/from16 v15, v19

    .line 2065
    .line 2066
    move-object/from16 v10, v23

    .line 2067
    .line 2068
    move-object/from16 v0, v25

    .line 2069
    .line 2070
    move-object/from16 v1, v47

    .line 2071
    .line 2072
    goto/16 :goto_1d

    .line 2073
    .line 2074
    :cond_30
    move-object/from16 v25, v0

    .line 2075
    .line 2076
    move-object/from16 v47, v1

    .line 2077
    .line 2078
    move-object/from16 v23, v10

    .line 2079
    .line 2080
    new-instance v0, Lu4/c;

    .line 2081
    .line 2082
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2083
    .line 2084
    .line 2085
    move-result v1

    .line 2086
    invoke-direct {v0, v1}, Lu4/c;-><init>(I)V

    .line 2087
    .line 2088
    .line 2089
    const/4 v1, 0x0

    .line 2090
    :goto_23
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2091
    .line 2092
    .line 2093
    move-result v2

    .line 2094
    if-ge v1, v2, :cond_35

    .line 2095
    .line 2096
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v2

    .line 2100
    check-cast v2, Lg4/g;

    .line 2101
    .line 2102
    new-instance v10, Lh4/u;

    .line 2103
    .line 2104
    iget-object v15, v2, Lg4/g;->a:Ljava/util/ArrayList;

    .line 2105
    .line 2106
    move-object/from16 v19, v14

    .line 2107
    .line 2108
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 2109
    .line 2110
    .line 2111
    move-result v14

    .line 2112
    invoke-direct {v10, v14}, Lz4/e;-><init>(I)V

    .line 2113
    .line 2114
    .line 2115
    move-object/from16 v24, v3

    .line 2116
    .line 2117
    const/4 v14, 0x0

    .line 2118
    :goto_24
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 2119
    .line 2120
    .line 2121
    move-result v3

    .line 2122
    if-ge v14, v3, :cond_31

    .line 2123
    .line 2124
    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v3

    .line 2128
    check-cast v3, Lu4/i;

    .line 2129
    .line 2130
    invoke-virtual {v10, v14, v3}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 2131
    .line 2132
    .line 2133
    add-int/lit8 v14, v14, 0x1

    .line 2134
    .line 2135
    goto :goto_24

    .line 2136
    :cond_31
    const/4 v3, 0x0

    .line 2137
    iput-boolean v3, v10, Lz4/j;->g:Z

    .line 2138
    .line 2139
    new-instance v3, Lz4/g;

    .line 2140
    .line 2141
    const/4 v14, 0x4

    .line 2142
    invoke-direct {v3, v14}, Lz4/g;-><init>(I)V

    .line 2143
    .line 2144
    .line 2145
    iget-object v15, v2, Lg4/g;->d:Ljava/util/List;

    .line 2146
    .line 2147
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v15

    .line 2151
    :goto_25
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 2152
    .line 2153
    .line 2154
    move-result v21

    .line 2155
    if-eqz v21, :cond_32

    .line 2156
    .line 2157
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v21

    .line 2161
    move-object/from16 v14, v21

    .line 2162
    .line 2163
    check-cast v14, Lg4/g;

    .line 2164
    .line 2165
    iget v14, v14, Lg4/g;->g:I

    .line 2166
    .line 2167
    invoke-virtual {v3, v14}, Lz4/g;->l(I)V

    .line 2168
    .line 2169
    .line 2170
    const/4 v14, 0x4

    .line 2171
    goto :goto_25

    .line 2172
    :cond_32
    iget-object v14, v2, Lg4/g;->e:Lg4/g;

    .line 2173
    .line 2174
    if-eqz v14, :cond_33

    .line 2175
    .line 2176
    iget v14, v14, Lg4/g;->g:I

    .line 2177
    .line 2178
    invoke-virtual {v3, v14}, Lz4/g;->l(I)V

    .line 2179
    .line 2180
    .line 2181
    goto :goto_26

    .line 2182
    :cond_33
    const/4 v14, -0x1

    .line 2183
    :goto_26
    iget-object v15, v2, Lg4/g;->f:Lg4/g;

    .line 2184
    .line 2185
    if-eqz v15, :cond_34

    .line 2186
    .line 2187
    iget v15, v15, Lg4/g;->g:I

    .line 2188
    .line 2189
    invoke-virtual {v3, v15}, Lz4/g;->l(I)V

    .line 2190
    .line 2191
    .line 2192
    :cond_34
    const/4 v15, 0x0

    .line 2193
    iput-boolean v15, v3, Lz4/j;->g:Z

    .line 2194
    .line 2195
    new-instance v15, Lu4/b;

    .line 2196
    .line 2197
    iget v2, v2, Lg4/g;->g:I

    .line 2198
    .line 2199
    invoke-direct {v15, v2, v10, v3, v14}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 2200
    .line 2201
    .line 2202
    invoke-virtual {v0, v1, v15}, Lz4/i;->q(ILz4/h;)V

    .line 2203
    .line 2204
    .line 2205
    const/4 v2, -0x1

    .line 2206
    iput v2, v0, Lu4/c;->j:I

    .line 2207
    .line 2208
    add-int/lit8 v1, v1, 0x1

    .line 2209
    .line 2210
    move-object/from16 v14, v19

    .line 2211
    .line 2212
    move-object/from16 v3, v24

    .line 2213
    .line 2214
    goto :goto_23

    .line 2215
    :cond_35
    move-object/from16 v24, v3

    .line 2216
    .line 2217
    const/4 v15, 0x0

    .line 2218
    invoke-direct {v13, v0, v15}, Lf1/h;-><init>(Lu4/c;I)V

    .line 2219
    .line 2220
    .line 2221
    iget-object v0, v4, Lg4/b;->f:Ljava/util/ArrayList;

    .line 2222
    .line 2223
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v0

    .line 2227
    const/4 v1, 0x0

    .line 2228
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2229
    .line 2230
    .line 2231
    move-result v2

    .line 2232
    if-eqz v2, :cond_36

    .line 2233
    .line 2234
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v2

    .line 2238
    check-cast v2, Lg4/h;

    .line 2239
    .line 2240
    iget-object v2, v2, Lg4/h;->b:Lg4/j;

    .line 2241
    .line 2242
    iget-object v2, v2, Lg4/j;->b:Lw4/c;

    .line 2243
    .line 2244
    invoke-virtual {v2}, Lw4/c;->i()I

    .line 2245
    .line 2246
    .line 2247
    move-result v2

    .line 2248
    add-int/2addr v1, v2

    .line 2249
    goto :goto_27

    .line 2250
    :cond_36
    const/4 v4, 0x1

    .line 2251
    invoke-static {v13, v4, v1, v12}, Lp4/y;->b(Lf1/h;IILn4/a;)Li4/a;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v0

    .line 2255
    new-instance v1, Lr4/t;

    .line 2256
    .line 2257
    sget-object v2, Lw4/b;->i:Lw4/b;

    .line 2258
    .line 2259
    invoke-direct {v1, v9, v11, v0, v2}, Lr4/t;-><init>(Lv4/y;ILi4/a;Lw4/e;)V

    .line 2260
    .line 2261
    .line 2262
    goto :goto_29

    .line 2263
    :goto_28
    new-instance v1, Lr4/t;

    .line 2264
    .line 2265
    sget-object v0, Lw4/b;->i:Lw4/b;

    .line 2266
    .line 2267
    const/4 v2, 0x0

    .line 2268
    invoke-direct {v1, v9, v11, v2, v0}, Lr4/t;-><init>(Lv4/y;ILi4/a;Lw4/e;)V

    .line 2269
    .line 2270
    .line 2271
    :goto_29
    const v0, 0x1000a

    .line 2272
    .line 2273
    .line 2274
    and-int/2addr v0, v11

    .line 2275
    iget-object v2, v7, Lg4/e;->g:Lr4/k;

    .line 2276
    .line 2277
    if-eqz v0, :cond_37

    .line 2278
    .line 2279
    iget-object v0, v2, Lr4/k;->m:Lr4/j;

    .line 2280
    .line 2281
    iget-object v0, v0, Lr4/j;->o:Ljava/util/ArrayList;

    .line 2282
    .line 2283
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2284
    .line 2285
    .line 2286
    goto :goto_2a

    .line 2287
    :cond_37
    iget-object v0, v2, Lr4/k;->m:Lr4/j;

    .line 2288
    .line 2289
    iget-object v0, v0, Lr4/j;->p:Ljava/util/ArrayList;

    .line 2290
    .line 2291
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2292
    .line 2293
    .line 2294
    :goto_2a
    move-object/from16 v2, v18

    .line 2295
    .line 2296
    move-object/from16 v10, v23

    .line 2297
    .line 2298
    move-object/from16 v3, v24

    .line 2299
    .line 2300
    move-object/from16 v0, v25

    .line 2301
    .line 2302
    move-object/from16 v1, v47

    .line 2303
    .line 2304
    goto/16 :goto_1c

    .line 2305
    .line 2306
    :cond_38
    move-object/from16 v25, v0

    .line 2307
    .line 2308
    move-object/from16 v47, v1

    .line 2309
    .line 2310
    move-object/from16 v24, v3

    .line 2311
    .line 2312
    move-object/from16 v23, v10

    .line 2313
    .line 2314
    invoke-virtual/range {v23 .. v23}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v0

    .line 2318
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v0

    .line 2322
    :goto_2b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2323
    .line 2324
    .line 2325
    move-result v1

    .line 2326
    if-eqz v1, :cond_3b

    .line 2327
    .line 2328
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v1

    .line 2332
    check-cast v1, Lg4/c;

    .line 2333
    .line 2334
    new-instance v2, Lr4/r;

    .line 2335
    .line 2336
    iget-object v3, v1, Lg4/c;->a:Lg4/f;

    .line 2337
    .line 2338
    iget v1, v1, Lg4/c;->b:I

    .line 2339
    .line 2340
    iget-object v3, v3, Lg4/f;->c:Lv4/m;

    .line 2341
    .line 2342
    invoke-direct {v2, v3, v1}, Lr4/r;-><init>(Lv4/m;I)V

    .line 2343
    .line 2344
    .line 2345
    and-int/lit8 v1, v1, 0x8

    .line 2346
    .line 2347
    iget-object v3, v7, Lg4/e;->g:Lr4/k;

    .line 2348
    .line 2349
    if-eqz v1, :cond_39

    .line 2350
    .line 2351
    sget-object v1, Lv4/r;->g:Lv4/r;

    .line 2352
    .line 2353
    invoke-virtual {v3, v2, v1}, Lr4/k;->i(Lr4/r;Lv4/a;)V

    .line 2354
    .line 2355
    .line 2356
    goto :goto_2b

    .line 2357
    :cond_39
    iget-object v1, v3, Lr4/k;->m:Lr4/j;

    .line 2358
    .line 2359
    iget-object v1, v1, Lr4/j;->n:Ljava/util/ArrayList;

    .line 2360
    .line 2361
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2362
    .line 2363
    .line 2364
    goto :goto_2b

    .line 2365
    :cond_3a
    move-object/from16 v25, v0

    .line 2366
    .line 2367
    move-object/from16 v47, v1

    .line 2368
    .line 2369
    move-object/from16 v24, v3

    .line 2370
    .line 2371
    move-object/from16 v16, v4

    .line 2372
    .line 2373
    :cond_3b
    iget-object v0, v7, Lg4/e;->g:Lr4/k;

    .line 2374
    .line 2375
    invoke-virtual {v8, v0}, Lr4/p;->a(Lr4/k;)V

    .line 2376
    .line 2377
    .line 2378
    move-object/from16 v2, p0

    .line 2379
    .line 2380
    move-object/from16 v4, v16

    .line 2381
    .line 2382
    move-object/from16 v3, v24

    .line 2383
    .line 2384
    move-object/from16 v0, v25

    .line 2385
    .line 2386
    move-object/from16 v1, v47

    .line 2387
    .line 2388
    goto/16 :goto_1b

    .line 2389
    .line 2390
    :cond_3c
    move-object/from16 v23, v10

    .line 2391
    .line 2392
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2393
    .line 2394
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2395
    .line 2396
    const-string v2, "Undeclared type "

    .line 2397
    .line 2398
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2399
    .line 2400
    .line 2401
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2402
    .line 2403
    .line 2404
    const-string v2, " declares members: "

    .line 2405
    .line 2406
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2407
    .line 2408
    .line 2409
    invoke-virtual/range {v23 .. v23}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v2

    .line 2413
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2414
    .line 2415
    .line 2416
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 2417
    .line 2418
    .line 2419
    move-result-object v2

    .line 2420
    const-string v3, " "

    .line 2421
    .line 2422
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2423
    .line 2424
    .line 2425
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2426
    .line 2427
    .line 2428
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v1

    .line 2432
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2433
    .line 2434
    .line 2435
    throw v0

    .line 2436
    :cond_3d
    move-object/from16 v25, v0

    .line 2437
    .line 2438
    move-object/from16 v47, v1

    .line 2439
    .line 2440
    move-object/from16 v24, v3

    .line 2441
    .line 2442
    :try_start_1
    iget-object v0, v6, Lb/e;->i:Ljava/lang/Object;

    .line 2443
    .line 2444
    check-cast v0, Lr4/p;

    .line 2445
    .line 2446
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2447
    .line 2448
    .line 2449
    const/4 v15, 0x0

    .line 2450
    invoke-virtual {v0, v15, v15}, Lr4/p;->c(ZZ)Lz4/d;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v0

    .line 2454
    iget-object v0, v0, Lz4/d;->b:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5

    .line 2455
    .line 2456
    new-instance v1, Ljava/util/jar/JarOutputStream;

    .line 2457
    .line 2458
    new-instance v2, Ljava/io/BufferedOutputStream;

    .line 2459
    .line 2460
    new-instance v3, Ljava/io/FileOutputStream;

    .line 2461
    .line 2462
    invoke-direct {v3, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 2463
    .line 2464
    .line 2465
    invoke-direct {v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 2466
    .line 2467
    .line 2468
    invoke-direct {v1, v2}, Ljava/util/jar/JarOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 2469
    .line 2470
    .line 2471
    invoke-virtual {v5}, Ljava/io/File;->setReadOnly()Z

    .line 2472
    .line 2473
    .line 2474
    :try_start_2
    new-instance v2, Ljava/util/jar/JarEntry;

    .line 2475
    .line 2476
    const-string v3, "classes.dex"

    .line 2477
    .line 2478
    invoke-direct {v2, v3}, Ljava/util/jar/JarEntry;-><init>(Ljava/lang/String;)V

    .line 2479
    .line 2480
    .line 2481
    array-length v3, v0

    .line 2482
    int-to-long v3, v3

    .line 2483
    invoke-virtual {v2, v3, v4}, Ljava/util/zip/ZipEntry;->setSize(J)V

    .line 2484
    .line 2485
    .line 2486
    invoke-virtual {v1, v2}, Ljava/util/jar/JarOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2487
    .line 2488
    .line 2489
    :try_start_3
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2490
    .line 2491
    .line 2492
    :try_start_4
    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 2493
    .line 2494
    .line 2495
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 2496
    .line 2497
    .line 2498
    move-object/from16 v3, v24

    .line 2499
    .line 2500
    move-object/from16 v0, v25

    .line 2501
    .line 2502
    invoke-virtual {v6, v5, v3, v0}, Lb/e;->t(Ljava/io/File;Ljava/io/File;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    .line 2503
    .line 2504
    .line 2505
    move-result-object v0

    .line 2506
    move-object/from16 v1, v47

    .line 2507
    .line 2508
    :goto_2c
    :try_start_5
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalAccessError; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_3

    .line 2512
    move-object/from16 v1, v46

    .line 2513
    .line 2514
    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v1

    .line 2518
    const/4 v4, 0x1

    .line 2519
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2520
    .line 2521
    .line 2522
    move-object/from16 v2, v45

    .line 2523
    .line 2524
    const/4 v5, 0x0

    .line 2525
    invoke-virtual {v1, v5, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_1

    .line 2526
    .line 2527
    .line 2528
    move-object/from16 v2, v29

    .line 2529
    .line 2530
    move-object/from16 v1, v44

    .line 2531
    .line 2532
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2533
    .line 2534
    .line 2535
    return-object v0

    .line 2536
    :catch_1
    move-exception v0

    .line 2537
    goto :goto_2d

    .line 2538
    :catch_2
    move-exception v0

    .line 2539
    const/16 v20, 0x0

    .line 2540
    .line 2541
    goto :goto_2e

    .line 2542
    :goto_2d
    invoke-static {v0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 2543
    .line 2544
    .line 2545
    const/16 v20, 0x0

    .line 2546
    .line 2547
    return-object v20

    .line 2548
    :goto_2e
    invoke-static {v0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 2549
    .line 2550
    .line 2551
    return-object v20

    .line 2552
    :catch_3
    move-exception v0

    .line 2553
    const/16 v20, 0x0

    .line 2554
    .line 2555
    invoke-static {v0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 2556
    .line 2557
    .line 2558
    return-object v20

    .line 2559
    :catch_4
    move-exception v0

    .line 2560
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 2561
    .line 2562
    const-string v2, "cannot proxy inaccessible class "

    .line 2563
    .line 2564
    move-object/from16 v3, v22

    .line 2565
    .line 2566
    invoke-static {v3, v2}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 2567
    .line 2568
    .line 2569
    move-result-object v2

    .line 2570
    invoke-direct {v1, v2, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2571
    .line 2572
    .line 2573
    throw v1

    .line 2574
    :catchall_0
    move-exception v0

    .line 2575
    goto :goto_2f

    .line 2576
    :catchall_1
    move-exception v0

    .line 2577
    :try_start_7
    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 2578
    .line 2579
    .line 2580
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 2581
    :goto_2f
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 2582
    .line 2583
    .line 2584
    throw v0

    .line 2585
    :catch_5
    move-exception v0

    .line 2586
    new-instance v1, Ljava/lang/RuntimeException;

    .line 2587
    .line 2588
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 2589
    .line 2590
    .line 2591
    throw v1

    .line 2592
    :cond_3e
    const-string v0, "already declared: "

    .line 2593
    .line 2594
    invoke-static {v3, v0}, Lg1/d;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2595
    .line 2596
    .line 2597
    const/16 v20, 0x0

    .line 2598
    .line 2599
    return-object v20
.end method
