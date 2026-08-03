.class Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# instance fields
.field final builder:Ljava/util/function/Function;

.field final defaultConstructor:Ljava/lang/reflect/Constructor;

.field final features:J

.field final instanceType:Ljava/lang/Class;

.field keyObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final keyType:Ljava/lang/reflect/Type;

.field final mapType:Ljava/lang/Class;

.field final valueClass:Ljava/lang/Class;

.field valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final valueType:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-ne p3, v0, :cond_0

    .line 8
    .line 9
    move-object p3, v1

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->mapType:Ljava/lang/Class;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->instanceType:Ljava/lang/Class;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 15
    .line 16
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 17
    .line 18
    invoke-static {p4}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueClass:Ljava/lang/Class;

    .line 23
    .line 24
    iput-wide p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->features:J

    .line 25
    .line 26
    iput-object p7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->builder:Ljava/util/function/Function;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    array-length p2, p1

    .line 33
    const/4 p3, 0x0

    .line 34
    :goto_0
    if-ge p3, p2, :cond_2

    .line 35
    .line 36
    aget-object p4, p1, p3

    .line 37
    .line 38
    invoke-virtual {p4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p5

    .line 42
    array-length p5, p5

    .line 43
    if-nez p5, :cond_1

    .line 44
    .line 45
    invoke-virtual {p4}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 46
    .line 47
    .line 48
    move-result p5

    .line 49
    invoke-static {p5}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 50
    .line 51
    .line 52
    move-result p5

    .line 53
    if-nez p5, :cond_1

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    invoke-virtual {p4, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 57
    .line 58
    .line 59
    move-object v1, p4

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    add-int/lit8 p3, p3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->defaultConstructor:Ljava/lang/reflect/Constructor;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public createInstance(J)Ljava/lang/Object;
    .locals 0

    .line 263
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->instanceType:Ljava/lang/Class;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-nez p1, :cond_1

    .line 264
    :try_start_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->defaultConstructor:Ljava/lang/reflect/Constructor;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 265
    invoke-virtual {p1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    .line 266
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->instanceType:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 267
    :goto_0
    const-string p2, "create map error"

    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1

    .line 268
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method public createInstance(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->instanceType:Ljava/lang/Class;

    .line 4
    .line 5
    const-class v2, Ljava/util/Map;

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    const-class v2, Ljava/util/HashMap;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->createInstance(J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/util/Map;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    new-instance v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_12

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    const-class v5, Ljava/lang/String;

    .line 59
    .line 60
    if-ne v4, v5, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    goto :goto_4

    .line 68
    :cond_3
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    :goto_4
    if-eqz v2, :cond_11

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 79
    .line 80
    const-class v6, Ljava/lang/Object;

    .line 81
    .line 82
    if-ne v5, v6, :cond_4

    .line 83
    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_4
    const-class v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 87
    .line 88
    if-eq v4, v5, :cond_f

    .line 89
    .line 90
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-ne v4, v5, :cond_5

    .line 95
    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_5
    const-class v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 99
    .line 100
    if-eq v4, v5, :cond_6

    .line 101
    .line 102
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONArray1x()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-ne v4, v5, :cond_8

    .line 107
    .line 108
    :cond_6
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueClass:Ljava/lang/Class;

    .line 109
    .line 110
    const-class v6, Ljava/util/List;

    .line 111
    .line 112
    if-ne v5, v6, :cond_8

    .line 113
    .line 114
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 115
    .line 116
    if-nez v4, :cond_7

    .line 117
    .line 118
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 119
    .line 120
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 125
    .line 126
    :cond_7
    :try_start_0
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 127
    .line 128
    move-object v5, v2

    .line 129
    check-cast v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 130
    .line 131
    invoke-interface {v4, v5, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_8
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 138
    .line 139
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    if-eqz v5, :cond_9

    .line 144
    .line 145
    invoke-interface {v5, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    goto :goto_6

    .line 150
    :cond_9
    instance-of v5, v2, Ljava/util/Map;

    .line 151
    .line 152
    if-eqz v5, :cond_b

    .line 153
    .line 154
    move-object v4, v2

    .line 155
    check-cast v4, Ljava/util/Map;

    .line 156
    .line 157
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 158
    .line 159
    if-nez v5, :cond_a

    .line 160
    .line 161
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 162
    .line 163
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    iput-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 168
    .line 169
    :cond_a
    :try_start_1
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 170
    .line 171
    invoke-interface {v5, v4, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 175
    goto :goto_6

    .line 176
    :cond_b
    instance-of v5, v2, Ljava/util/Collection;

    .line 177
    .line 178
    if-eqz v5, :cond_d

    .line 179
    .line 180
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 181
    .line 182
    if-nez v4, :cond_c

    .line 183
    .line 184
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 185
    .line 186
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 191
    .line 192
    :cond_c
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 193
    .line 194
    check-cast v2, Ljava/util/Collection;

    .line 195
    .line 196
    invoke-interface {v4, v2, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    goto :goto_6

    .line 201
    :cond_d
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-eqz v5, :cond_e

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string p2, "can not convert from "

    .line 211
    .line 212
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string p2, " to "

    .line 219
    .line 220
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 221
    .line 222
    invoke-static {p1, p2, p3}, Lah/a;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    const/4 p1, 0x0

    .line 226
    return-object p1

    .line 227
    :cond_f
    :goto_5
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 228
    .line 229
    if-nez v4, :cond_10

    .line 230
    .line 231
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 232
    .line 233
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 238
    .line 239
    :cond_10
    :try_start_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 240
    .line 241
    move-object v5, v2

    .line 242
    check-cast v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 243
    .line 244
    invoke-interface {v4, v5, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 248
    :catch_0
    :cond_11
    :goto_6
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    goto/16 :goto_2

    .line 252
    .line 253
    :cond_12
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->builder:Ljava/util/function/Function;

    .line 254
    .line 255
    if-eqz p1, :cond_13

    .line 256
    .line 257
    invoke-interface {p1, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    return-object p1

    .line 262
    :cond_13
    return-object v1
.end method

.method public getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->mapType:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v7, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->builder:Ljava/util/function/Function;

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, -0x6e

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->mapType:Ljava/lang/Class;

    .line 15
    .line 16
    iget-wide v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->features:J

    .line 17
    .line 18
    or-long v5, v3, p4

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    if-eq v2, v0, :cond_0

    .line 31
    .line 32
    invoke-interface {v2}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getBuildFunction()Ljava/util/function/Function;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    instance-of v1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    instance-of v1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    move-object/from16 v3, p2

    .line 45
    .line 46
    move-object/from16 v4, p3

    .line 47
    .line 48
    move-wide/from16 v5, p4

    .line 49
    .line 50
    move-object v1, v2

    .line 51
    move-object/from16 v2, p1

    .line 52
    .line 53
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    return-object v1

    .line 58
    :cond_0
    move-object v1, v2

    .line 59
    move-object/from16 v2, p1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object/from16 v2, p1

    .line 63
    .line 64
    move-object v1, v8

    .line 65
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/16 v4, -0x51

    .line 70
    .line 71
    if-ne v3, v4, :cond_2

    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 74
    .line 75
    .line 76
    return-object v8

    .line 77
    :cond_2
    const/16 v4, -0x5a

    .line 78
    .line 79
    if-ne v3, v4, :cond_3

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 82
    .line 83
    .line 84
    :cond_3
    iget-object v9, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 85
    .line 86
    iget-wide v3, v9, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 87
    .line 88
    or-long v10, p4, v3

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-interface {v1, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/util/Map;

    .line 97
    .line 98
    :goto_1
    move-object v12, v1

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->instanceType:Ljava/lang/Class;

    .line 101
    .line 102
    const-class v3, Ljava/util/HashMap;

    .line 103
    .line 104
    if-ne v1, v3, :cond_5

    .line 105
    .line 106
    new-instance v1, Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Ljava/util/Map;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :goto_2
    const/4 v13, 0x0

    .line 120
    move v14, v13

    .line 121
    :goto_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    const/16 v3, -0x5b

    .line 126
    .line 127
    if-ne v1, v3, :cond_8

    .line 128
    .line 129
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 130
    .line 131
    .line 132
    if-eqz v7, :cond_7

    .line 133
    .line 134
    sget-object v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->ENUM_MAP_BUILDER:Ljava/util/function/Function;

    .line 135
    .line 136
    if-ne v7, v1, :cond_6

    .line 137
    .line 138
    invoke-interface {v12}, Ljava/util/Map;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    new-instance v1, Ljava/util/EnumMap;

    .line 145
    .line 146
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 147
    .line 148
    check-cast v2, Ljava/lang/Class;

    .line 149
    .line 150
    invoke-direct {v1, v2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 151
    .line 152
    .line 153
    return-object v1

    .line 154
    :cond_6
    invoke-interface {v7, v12}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    return-object v1

    .line 159
    :cond_7
    return-object v12

    .line 160
    :cond_8
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 161
    .line 162
    const-class v3, Ljava/lang/String;

    .line 163
    .line 164
    if-eq v1, v3, :cond_d

    .line 165
    .line 166
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_9
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_a

    .line 178
    .line 179
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    new-instance v3, Lcom/alibaba/fastjson2/util/ReferenceKey;

    .line 184
    .line 185
    invoke-direct {v3, v14}, Lcom/alibaba/fastjson2/util/ReferenceKey;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v2, v12, v3, v1}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 193
    .line 194
    .line 195
    :goto_4
    move-object v15, v3

    .line 196
    goto :goto_6

    .line 197
    :cond_a
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 198
    .line 199
    if-nez v1, :cond_b

    .line 200
    .line 201
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 202
    .line 203
    if-eqz v1, :cond_b

    .line 204
    .line 205
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 210
    .line 211
    :cond_b
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 212
    .line 213
    if-nez v1, :cond_c

    .line 214
    .line 215
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    goto :goto_4

    .line 220
    :cond_c
    const/4 v3, 0x0

    .line 221
    const/4 v4, 0x0

    .line 222
    move-wide/from16 v5, p4

    .line 223
    .line 224
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    goto :goto_4

    .line 229
    :cond_d
    :goto_5
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    goto :goto_4

    .line 234
    :goto_6
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_f

    .line 239
    .line 240
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    const-string v3, ".."

    .line 245
    .line 246
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_e

    .line 251
    .line 252
    invoke-interface {v12, v15, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    goto/16 :goto_9

    .line 256
    .line 257
    :cond_e
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v2, v12, v15, v1}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 262
    .line 263
    .line 264
    instance-of v1, v12, Ljava/util/concurrent/ConcurrentMap;

    .line 265
    .line 266
    if-nez v1, :cond_16

    .line 267
    .line 268
    invoke-interface {v12, v15, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    goto/16 :goto_9

    .line 272
    .line 273
    :cond_f
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_10

    .line 278
    .line 279
    invoke-interface {v12, v15, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    goto/16 :goto_9

    .line 283
    .line 284
    :cond_10
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 285
    .line 286
    const-class v3, Ljava/lang/Object;

    .line 287
    .line 288
    const-wide/16 v16, 0x0

    .line 289
    .line 290
    if-ne v1, v3, :cond_11

    .line 291
    .line 292
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    move-object v4, v15

    .line 297
    goto :goto_8

    .line 298
    :cond_11
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueClass:Ljava/lang/Class;

    .line 299
    .line 300
    const-wide/16 v3, 0x0

    .line 301
    .line 302
    move-object/from16 v1, p1

    .line 303
    .line 304
    move-wide/from16 v5, p4

    .line 305
    .line 306
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    if-eqz v2, :cond_12

    .line 311
    .line 312
    if-eq v2, v0, :cond_12

    .line 313
    .line 314
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 315
    .line 316
    move-wide/from16 v5, p4

    .line 317
    .line 318
    move-object v1, v2

    .line 319
    move-object v4, v15

    .line 320
    move-object/from16 v2, p1

    .line 321
    .line 322
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    goto :goto_8

    .line 327
    :cond_12
    move-object v4, v15

    .line 328
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 329
    .line 330
    if-nez v1, :cond_14

    .line 331
    .line 332
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 333
    .line 334
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 335
    .line 336
    and-long/2addr v1, v10

    .line 337
    cmp-long v1, v1, v16

    .line 338
    .line 339
    if-eqz v1, :cond_13

    .line 340
    .line 341
    const/4 v1, 0x1

    .line 342
    goto :goto_7

    .line 343
    :cond_13
    move v1, v13

    .line 344
    :goto_7
    iget-object v2, v9, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 345
    .line 346
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 347
    .line 348
    invoke-virtual {v2, v3, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 353
    .line 354
    :cond_14
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 355
    .line 356
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 357
    .line 358
    move-object/from16 v2, p1

    .line 359
    .line 360
    move-wide/from16 v5, p4

    .line 361
    .line 362
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    :goto_8
    if-nez v1, :cond_15

    .line 367
    .line 368
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 369
    .line 370
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 371
    .line 372
    and-long/2addr v2, v10

    .line 373
    cmp-long v2, v2, v16

    .line 374
    .line 375
    if-eqz v2, :cond_15

    .line 376
    .line 377
    goto :goto_9

    .line 378
    :cond_15
    invoke-interface {v12, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    :cond_16
    :goto_9
    add-int/lit8 v14, v14, 0x1

    .line 382
    .line 383
    move-object/from16 v2, p1

    .line 384
    .line 385
    goto/16 :goto_3
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v9, 0x0

    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isTypeRedirect()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v9}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    return-object v7

    .line 31
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v3, "expect \'{\', but \'"

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v3, "\'"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    const/4 v1, 0x0

    .line 62
    return-object v1

    .line 63
    :cond_2
    move v2, v9

    .line 64
    :goto_1
    iget-object v10, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 65
    .line 66
    iget-wide v3, v10, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 67
    .line 68
    or-long v11, v3, p4

    .line 69
    .line 70
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->instanceType:Ljava/lang/Class;

    .line 71
    .line 72
    const-class v4, Ljava/util/HashMap;

    .line 73
    .line 74
    if-ne v3, v4, :cond_4

    .line 75
    .line 76
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectSupplier()Ljava/util/function/Supplier;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->mapType:Ljava/lang/Class;

    .line 81
    .line 82
    const-class v5, Ljava/util/Map;

    .line 83
    .line 84
    if-ne v4, v5, :cond_3

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    invoke-interface {v3}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/util/Map;

    .line 93
    .line 94
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/TypeUtils;->getInnerMap(Ljava/util/Map;)Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    new-instance v3, Ljava/util/HashMap;

    .line 100
    .line 101
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    move-object v4, v7

    .line 105
    :goto_2
    move v13, v2

    .line 106
    move-object v14, v3

    .line 107
    move-object v15, v4

    .line 108
    goto :goto_4

    .line 109
    :cond_4
    const-class v4, Ljava/util/EnumMap;

    .line 110
    .line 111
    if-ne v3, v4, :cond_5

    .line 112
    .line 113
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 114
    .line 115
    instance-of v3, v3, Ljava/lang/Class;

    .line 116
    .line 117
    if-eqz v3, :cond_5

    .line 118
    .line 119
    new-instance v3, Ljava/util/EnumMap;

    .line 120
    .line 121
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 122
    .line 123
    check-cast v4, Ljava/lang/Class;

    .line 124
    .line 125
    invoke-direct {v3, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 126
    .line 127
    .line 128
    :goto_3
    move v13, v2

    .line 129
    move-object v14, v3

    .line 130
    move-object v15, v7

    .line 131
    goto :goto_4

    .line 132
    :cond_5
    invoke-virtual {v0, v11, v12}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->createInstance(J)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, Ljava/util/Map;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-nez v2, :cond_1b

    .line 144
    .line 145
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_6

    .line 150
    .line 151
    goto/16 :goto_d

    .line 152
    .line 153
    :cond_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    const-string v3, "illegal json"

    .line 158
    .line 159
    const/16 v4, 0x3a

    .line 160
    .line 161
    const-wide/16 v16, 0x0

    .line 162
    .line 163
    if-eqz v2, :cond_8

    .line 164
    .line 165
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_7

    .line 170
    .line 171
    move-wide/from16 v4, p4

    .line 172
    .line 173
    move-object v3, v1

    .line 174
    goto/16 :goto_9

    .line 175
    .line 176
    :cond_7
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_8
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 185
    .line 186
    const-class v5, Ljava/lang/String;

    .line 187
    .line 188
    if-ne v2, v5, :cond_c

    .line 189
    .line 190
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    if-nez v13, :cond_9

    .line 195
    .line 196
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 197
    .line 198
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 199
    .line 200
    and-long/2addr v5, v11

    .line 201
    cmp-long v5, v5, v16

    .line 202
    .line 203
    if-eqz v5, :cond_9

    .line 204
    .line 205
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getTypeKey()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_9

    .line 214
    .line 215
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 216
    .line 217
    .line 218
    move-result-wide v2

    .line 219
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->mapType:Ljava/lang/Class;

    .line 220
    .line 221
    move-wide/from16 v5, p4

    .line 222
    .line 223
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReaderAutoType(JLjava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    if-eqz v2, :cond_1a

    .line 228
    .line 229
    instance-of v3, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 230
    .line 231
    if-eqz v3, :cond_1a

    .line 232
    .line 233
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    move-object v4, v2

    .line 238
    check-cast v4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 239
    .line 240
    iget-object v4, v4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 241
    .line 242
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-nez v3, :cond_1a

    .line 247
    .line 248
    invoke-interface {v2, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Ljava/util/Map;

    .line 253
    .line 254
    move-object v14, v2

    .line 255
    goto/16 :goto_c

    .line 256
    .line 257
    :cond_9
    move-wide/from16 v5, p4

    .line 258
    .line 259
    if-nez v2, :cond_a

    .line 260
    .line 261
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eqz v4, :cond_b

    .line 270
    .line 271
    :cond_a
    move-object v3, v1

    .line 272
    move-object v7, v2

    .line 273
    move-wide v4, v5

    .line 274
    goto/16 :goto_9

    .line 275
    .line 276
    :cond_b
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_c
    move-wide/from16 v5, p4

    .line 286
    .line 287
    const-class v2, Ljava/lang/Enum;

    .line 288
    .line 289
    if-nez v13, :cond_11

    .line 290
    .line 291
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 292
    .line 293
    iget-wide v4, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 294
    .line 295
    and-long v3, v11, v4

    .line 296
    .line 297
    cmp-long v3, v3, v16

    .line 298
    .line 299
    if-nez v3, :cond_e

    .line 300
    .line 301
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONReader$Context;->getContextAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    if-eqz v3, :cond_d

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_d
    move-wide/from16 v3, p4

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_e
    :goto_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    const/16 v4, 0x22

    .line 316
    .line 317
    if-ne v3, v4, :cond_d

    .line 318
    .line 319
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 320
    .line 321
    instance-of v4, v3, Ljava/lang/Class;

    .line 322
    .line 323
    if-eqz v4, :cond_f

    .line 324
    .line 325
    check-cast v3, Ljava/lang/Class;

    .line 326
    .line 327
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-nez v3, :cond_d

    .line 332
    .line 333
    :cond_f
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getTypeKey()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-eqz v3, :cond_10

    .line 346
    .line 347
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 348
    .line 349
    .line 350
    move-result-wide v2

    .line 351
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->mapType:Ljava/lang/Class;

    .line 352
    .line 353
    move-wide/from16 v5, p4

    .line 354
    .line 355
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReaderAutoType(JLjava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    move-wide v3, v5

    .line 360
    if-eqz v2, :cond_1a

    .line 361
    .line 362
    instance-of v1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 363
    .line 364
    if-eqz v1, :cond_1a

    .line 365
    .line 366
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    move-object v5, v2

    .line 371
    check-cast v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 372
    .line 373
    iget-object v5, v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 374
    .line 375
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-nez v1, :cond_1a

    .line 380
    .line 381
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, Ljava/util/Map;

    .line 386
    .line 387
    :goto_6
    move-object v14, v1

    .line 388
    goto/16 :goto_c

    .line 389
    .line 390
    :cond_10
    move-wide/from16 v3, p4

    .line 391
    .line 392
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 393
    .line 394
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    move-object v7, v2

    .line 399
    move-wide v4, v3

    .line 400
    move-object/from16 v3, p1

    .line 401
    .line 402
    goto/16 :goto_9

    .line 403
    .line 404
    :cond_11
    move-wide v3, v5

    .line 405
    :goto_7
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 406
    .line 407
    if-eqz v1, :cond_12

    .line 408
    .line 409
    const/4 v4, 0x0

    .line 410
    const-wide/16 v5, 0x0

    .line 411
    .line 412
    const/4 v3, 0x0

    .line 413
    move-object v7, v2

    .line 414
    const/16 v8, 0x3a

    .line 415
    .line 416
    move-object/from16 v2, p1

    .line 417
    .line 418
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    goto :goto_8

    .line 423
    :cond_12
    move-object v7, v2

    .line 424
    const/16 v8, 0x3a

    .line 425
    .line 426
    move-object/from16 v2, p1

    .line 427
    .line 428
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 429
    .line 430
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    :goto_8
    if-nez v1, :cond_13

    .line 435
    .line 436
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 437
    .line 438
    check-cast v3, Ljava/lang/Class;

    .line 439
    .line 440
    invoke-virtual {v7, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-eqz v3, :cond_13

    .line 445
    .line 446
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 451
    .line 452
    .line 453
    :cond_13
    if-nez v13, :cond_14

    .line 454
    .line 455
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 456
    .line 457
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 458
    .line 459
    and-long/2addr v3, v11

    .line 460
    cmp-long v3, v3, v16

    .line 461
    .line 462
    if-eqz v3, :cond_14

    .line 463
    .line 464
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getTypeKey()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    if-eqz v3, :cond_14

    .line 473
    .line 474
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 475
    .line 476
    .line 477
    move-result-wide v2

    .line 478
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->mapType:Ljava/lang/Class;

    .line 479
    .line 480
    move-object/from16 v1, p1

    .line 481
    .line 482
    move-wide/from16 v5, p4

    .line 483
    .line 484
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReaderAutoType(JLjava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    move-object v3, v1

    .line 489
    move-wide v4, v5

    .line 490
    if-eqz v2, :cond_1a

    .line 491
    .line 492
    instance-of v1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 493
    .line 494
    if-eqz v1, :cond_1a

    .line 495
    .line 496
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    move-object v6, v2

    .line 501
    check-cast v6, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 502
    .line 503
    iget-object v6, v6, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 504
    .line 505
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-nez v1, :cond_1a

    .line 510
    .line 511
    invoke-interface {v2, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    check-cast v1, Ljava/util/Map;

    .line 516
    .line 517
    goto/16 :goto_6

    .line 518
    .line 519
    :cond_14
    move-wide/from16 v4, p4

    .line 520
    .line 521
    move-object v3, v2

    .line 522
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 523
    .line 524
    .line 525
    move-object v7, v1

    .line 526
    :goto_9
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 527
    .line 528
    if-nez v1, :cond_16

    .line 529
    .line 530
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 531
    .line 532
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 533
    .line 534
    and-long/2addr v1, v11

    .line 535
    cmp-long v1, v1, v16

    .line 536
    .line 537
    if-eqz v1, :cond_15

    .line 538
    .line 539
    const/4 v1, 0x1

    .line 540
    goto :goto_a

    .line 541
    :cond_15
    move v1, v9

    .line 542
    :goto_a
    iget-object v2, v10, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 543
    .line 544
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 545
    .line 546
    invoke-virtual {v2, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 551
    .line 552
    :cond_16
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 553
    .line 554
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueType:Ljava/lang/reflect/Type;

    .line 555
    .line 556
    const-wide/16 v5, 0x0

    .line 557
    .line 558
    move-object/from16 v2, p1

    .line 559
    .line 560
    move-object/from16 v4, p3

    .line 561
    .line 562
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    if-nez v1, :cond_17

    .line 567
    .line 568
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 569
    .line 570
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 571
    .line 572
    and-long/2addr v2, v11

    .line 573
    cmp-long v2, v2, v16

    .line 574
    .line 575
    if-eqz v2, :cond_17

    .line 576
    .line 577
    goto :goto_c

    .line 578
    :cond_17
    if-eqz v15, :cond_18

    .line 579
    .line 580
    invoke-interface {v15, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    goto :goto_b

    .line 585
    :cond_18
    invoke-interface {v14, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    :goto_b
    if-eqz v2, :cond_1a

    .line 590
    .line 591
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 592
    .line 593
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 594
    .line 595
    and-long/2addr v3, v11

    .line 596
    cmp-long v3, v3, v16

    .line 597
    .line 598
    if-eqz v3, :cond_1a

    .line 599
    .line 600
    instance-of v3, v2, Ljava/util/Collection;

    .line 601
    .line 602
    if-eqz v3, :cond_19

    .line 603
    .line 604
    move-object v3, v2

    .line 605
    check-cast v3, Ljava/util/Collection;

    .line 606
    .line 607
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    invoke-interface {v14, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    goto :goto_c

    .line 614
    :cond_19
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-interface {v14, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    :cond_1a
    :goto_c
    add-int/lit8 v13, v13, 0x1

    .line 622
    .line 623
    move-object/from16 v1, p1

    .line 624
    .line 625
    const/4 v7, 0x0

    .line 626
    goto/16 :goto_4

    .line 627
    .line 628
    :cond_1b
    :goto_d
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 629
    .line 630
    .line 631
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->builder:Ljava/util/function/Function;

    .line 632
    .line 633
    if-eqz v1, :cond_1c

    .line 634
    .line 635
    invoke-interface {v1, v14}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    return-object v1

    .line 640
    :cond_1c
    return-object v14
.end method
