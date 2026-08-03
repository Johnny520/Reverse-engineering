.class public Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# instance fields
.field final builder:Ljava/util/function/Function;

.field final instanceType:Ljava/lang/Class;

.field final mapType:Ljava/lang/Class;

.field final multiValueType:Lcom/alibaba/fastjson2/util/MapMultiValueType;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/util/MapMultiValueType;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->multiValueType:Lcom/alibaba/fastjson2/util/MapMultiValueType;

    .line 5
    .line 6
    iget-object p1, p1, Lcom/alibaba/fastjson2/util/MapMultiValueType;->mapType:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->mapType:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-class v1, Ljava/util/Map;

    .line 15
    .line 16
    if-eq p1, v1, :cond_4

    .line 17
    .line 18
    const-class v1, Ljava/util/AbstractMap;

    .line 19
    .line 20
    if-eq p1, v1, :cond_4

    .line 21
    .line 22
    const-string v1, "java.util.Collections$SingletonMap"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "java.util.Collections$UnmodifiableMap"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const-class p1, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-class v0, Ljava/util/SortedMap;

    .line 43
    .line 44
    if-ne p1, v0, :cond_2

    .line 45
    .line 46
    const-class p1, Ljava/util/TreeMap;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const-class v0, Ljava/util/concurrent/ConcurrentMap;

    .line 50
    .line 51
    if-ne p1, v0, :cond_3

    .line 52
    .line 53
    const-class p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const-class v0, Ljava/util/concurrent/ConcurrentNavigableMap;

    .line 57
    .line 58
    if-ne p1, v0, :cond_5

    .line 59
    .line 60
    const-class p1, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    :goto_0
    const-class p1, Ljava/util/HashMap;

    .line 64
    .line 65
    :cond_5
    :goto_1
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->instanceType:Ljava/lang/Class;

    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->builder:Ljava/util/function/Function;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public createInstance(J)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->instanceType:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    :try_start_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->instanceType:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-object p1

    .line 18
    :catch_0
    move-exception p1

    .line 19
    const-string p2, "create map error"

    .line 20
    .line 21
    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "expect \'{\', but \'"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "\'"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 52
    .line 53
    or-long v2, v2, p4

    .line 54
    .line 55
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->instanceType:Ljava/lang/Class;

    .line 56
    .line 57
    const-class v5, Ljava/util/HashMap;

    .line 58
    .line 59
    if-ne v4, v5, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectSupplier()Ljava/util/function/Supplier;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->mapType:Ljava/lang/Class;

    .line 66
    .line 67
    const-class v5, Ljava/util/Map;

    .line 68
    .line 69
    if-ne v4, v5, :cond_2

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Ljava/util/Map;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getInnerMap(Ljava/util/Map;)Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    const-class v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 91
    .line 92
    if-ne v4, v0, :cond_4

    .line 93
    .line 94
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 95
    .line 96
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 97
    .line 98
    .line 99
    :goto_1
    move-object v4, v1

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->createInstance(J)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Ljava/util/Map;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :goto_2
    move-object v5, v1

    .line 109
    :goto_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-nez v6, :cond_d

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    goto/16 :goto_8

    .line 122
    .line 123
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_7

    .line 128
    .line 129
    const/16 v6, 0x3a

    .line 130
    .line 131
    invoke-virtual {p1, v6}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_6

    .line 136
    .line 137
    move-object v9, v5

    .line 138
    move-object v5, v1

    .line 139
    goto :goto_4

    .line 140
    :cond_6
    const-string v0, "illegal json"

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->multiValueType:Lcom/alibaba/fastjson2/util/MapMultiValueType;

    .line 155
    .line 156
    invoke-virtual {v6, v5}, Lcom/alibaba/fastjson2/util/MapMultiValueType;->getType(Ljava/lang/String;)Ljava/lang/reflect/Type;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    move-object v9, v6

    .line 161
    :goto_4
    if-nez v9, :cond_8

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    goto :goto_5

    .line 168
    :cond_8
    invoke-virtual {p1, v9}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    const-wide/16 v11, 0x0

    .line 173
    .line 174
    move-object v8, p1

    .line 175
    move-object/from16 v10, p3

    .line 176
    .line 177
    invoke-interface/range {v7 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    :goto_5
    const-wide/16 v7, 0x0

    .line 182
    .line 183
    if-nez v6, :cond_9

    .line 184
    .line 185
    sget-object v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 186
    .line 187
    iget-wide v10, v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 188
    .line 189
    and-long/2addr v10, v2

    .line 190
    cmp-long v10, v10, v7

    .line 191
    .line 192
    if-eqz v10, :cond_9

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_9
    if-eqz v4, :cond_a

    .line 196
    .line 197
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    goto :goto_6

    .line 202
    :cond_a
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    :goto_6
    if-eqz v10, :cond_c

    .line 207
    .line 208
    sget-object v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 209
    .line 210
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 211
    .line 212
    and-long/2addr v11, v2

    .line 213
    cmp-long v7, v11, v7

    .line 214
    .line 215
    if-eqz v7, :cond_c

    .line 216
    .line 217
    instance-of v7, v10, Ljava/util/Collection;

    .line 218
    .line 219
    if-eqz v7, :cond_b

    .line 220
    .line 221
    move-object v7, v10

    .line 222
    check-cast v7, Ljava/util/Collection;

    .line 223
    .line 224
    invoke-interface {v7, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    invoke-interface {v0, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_b
    invoke-static {v10, v6}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    :cond_c
    :goto_7
    move-object v5, v9

    .line 239
    goto/16 :goto_3

    .line 240
    .line 241
    :cond_d
    :goto_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 242
    .line 243
    .line 244
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;->builder:Ljava/util/function/Function;

    .line 245
    .line 246
    if-eqz p1, :cond_e

    .line 247
    .line 248
    invoke-interface {p1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    return-object p1

    .line 253
    :cond_e
    return-object v0
.end method
