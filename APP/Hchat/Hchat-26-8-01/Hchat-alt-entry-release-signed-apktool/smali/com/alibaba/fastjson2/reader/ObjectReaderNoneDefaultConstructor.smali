.class public Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final creator:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;TT;>;"
        }
    .end annotation
.end field

.field final paramNames:[Ljava/lang/String;

.field final setterFieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Function<",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;TT;>;[",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            "[",
            "Ljava/lang/Class;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v10, 0x0

    .line 2
    invoke-static/range {p8 .. p9}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->concat([Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 3
    .line 4
    .line 5
    move-result-object v11

    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v7, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v3, p3

    .line 12
    move-wide/from16 v4, p4

    .line 13
    .line 14
    move-object/from16 v8, p10

    .line 15
    .line 16
    move-object/from16 v9, p11

    .line 17
    .line 18
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 p1, p7

    .line 22
    .line 23
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->paramNames:[Ljava/lang/String;

    .line 24
    .line 25
    move-object/from16 p1, p6

    .line 26
    .line 27
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->creator:Ljava/util/function/Function;

    .line 28
    .line 29
    move-object/from16 p1, p9

    .line 30
    .line 31
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->setterFieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 32
    .line 33
    return-void
.end method

.method public static concat([Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;)[Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    array-length v0, p0

    .line 5
    array-length v1, p1

    .line 6
    add-int/2addr v1, v0

    .line 7
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, [Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    array-length v2, p1

    .line 15
    invoke-static {p1, v1, p0, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection;",
            "J)TT;"
        }
    .end annotation

    .line 297
    sget-object p2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 298
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 299
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 300
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 301
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    array-length v3, v2

    if-lt v0, v3, :cond_0

    goto :goto_3

    .line 302
    :cond_0
    aget-object v2, v2, v0

    if-eqz v1, :cond_2

    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    .line 304
    iget-object v4, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 305
    iget-object v5, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 306
    instance-of v6, v5, Ljava/lang/Class;

    if-nez v6, :cond_1

    .line 307
    invoke-static {v1, v5, p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_1
    if-eq v3, v4, :cond_2

    .line 308
    invoke-virtual {p2, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 309
    invoke-interface {v3, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 310
    :cond_2
    :goto_1
    instance-of v3, v2, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;

    if-eqz v3, :cond_3

    .line 311
    check-cast v2, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;->paramNameHash:J

    goto :goto_2

    .line 312
    :cond_3
    iget-wide v2, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 313
    :goto_2
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p3, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 314
    :cond_4
    :goto_3
    invoke-virtual {p0, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->createInstanceNoneDefaultConstructor(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createInstance(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map;",
            "J)TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getTypeKey()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 23
    .line 24
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 25
    .line 26
    and-long/2addr v6, p2

    .line 27
    const-wide/16 v8, 0x0

    .line 28
    .line 29
    cmp-long v2, v6, v8

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v0, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v2, v3

    .line 39
    :goto_0
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getObjectClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    or-long/2addr v4, p2

    .line 50
    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :cond_1
    if-eq v2, p0, :cond_2

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-interface {v2, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v2, v3

    .line 72
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_9

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Ljava/util/Map$Entry;

    .line 83
    .line 84
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {p0, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    if-eqz v4, :cond_6

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iget-object v7, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 109
    .line 110
    if-eq v6, v7, :cond_6

    .line 111
    .line 112
    instance-of v8, v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 113
    .line 114
    if-eqz v8, :cond_4

    .line 115
    .line 116
    iget-object v6, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 117
    .line 118
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    check-cast v4, Ljava/util/Map;

    .line 123
    .line 124
    invoke-interface {v6, v4, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    instance-of v8, v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 130
    .line 131
    if-eqz v8, :cond_5

    .line 132
    .line 133
    check-cast v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 134
    .line 135
    iget-object v6, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 136
    .line 137
    invoke-virtual {v4, v6, p2, p3}, Lcom/alibaba/fastjson2/JSONArray;->to(Ljava/lang/reflect/Type;J)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    if-eqz v6, :cond_6

    .line 147
    .line 148
    invoke-interface {v6, v4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    :cond_6
    :goto_2
    if-nez v2, :cond_7

    .line 153
    .line 154
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 155
    .line 156
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 157
    .line 158
    .line 159
    :cond_7
    instance-of v6, v5, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;

    .line 160
    .line 161
    if-eqz v6, :cond_8

    .line 162
    .line 163
    check-cast v5, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;

    .line 164
    .line 165
    iget-wide v5, v5, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;->paramNameHash:J

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_8
    iget-wide v5, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 169
    .line 170
    :goto_3
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_9
    if-nez v2, :cond_a

    .line 179
    .line 180
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 181
    .line 182
    :cond_a
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->createInstanceNoneDefaultConstructor(Ljava/util/Map;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const/4 v2, 0x0

    .line 187
    move v4, v2

    .line 188
    :goto_4
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->setterFieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 189
    .line 190
    array-length v6, v5

    .line 191
    if-ge v4, v6, :cond_10

    .line 192
    .line 193
    aget-object v5, v5, v4

    .line 194
    .line 195
    iget-object v6, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 196
    .line 197
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    if-nez v6, :cond_b

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_b
    iget-object v7, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 205
    .line 206
    if-eqz v7, :cond_c

    .line 207
    .line 208
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    if-eqz v7, :cond_c

    .line 217
    .line 218
    :try_start_0
    iget-object v7, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 219
    .line 220
    invoke-virtual {v7, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    instance-of v8, v7, Ljava/util/Collection;

    .line 225
    .line 226
    if-eqz v8, :cond_c

    .line 227
    .line 228
    check-cast v7, Ljava/util/Collection;

    .line 229
    .line 230
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    if-nez v7, :cond_c

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :catch_0
    :cond_c
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    iget-object v8, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 242
    .line 243
    iget-object v9, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 244
    .line 245
    if-eq v7, v8, :cond_f

    .line 246
    .line 247
    invoke-virtual {v0, v7, v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    instance-of v8, v9, Ljava/lang/Class;

    .line 252
    .line 253
    if-nez v8, :cond_d

    .line 254
    .line 255
    invoke-static {v6, v9, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    goto :goto_5

    .line 260
    :cond_d
    if-eqz v7, :cond_e

    .line 261
    .line 262
    invoke-interface {v7, v6}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    goto :goto_5

    .line 267
    :cond_e
    instance-of v7, v6, Ljava/util/Map;

    .line 268
    .line 269
    if-eqz v7, :cond_f

    .line 270
    .line 271
    new-array v7, v2, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 272
    .line 273
    invoke-static {v0, v7}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-virtual {v5, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    check-cast v6, Ljava/util/Map;

    .line 282
    .line 283
    iget-wide v8, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 284
    .line 285
    or-long/2addr v8, p2

    .line 286
    invoke-interface {v7, v6, v8, v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    :cond_f
    :goto_5
    invoke-virtual {v5, v1, v6}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_10
    return-object v1
.end method

.method public createInstanceNoneDefaultConstructor(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->creator:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, -0x51

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 20
    .line 21
    .line 22
    return-object v6

    .line 23
    :cond_1
    const/16 v1, -0x6e

    .line 24
    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 30
    .line 31
    .line 32
    move-result-wide v9

    .line 33
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 34
    .line 35
    or-long v11, v0, p4

    .line 36
    .line 37
    move-object v7, p1

    .line 38
    invoke-virtual/range {v7 .. v12}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eq v0, p0, :cond_2

    .line 45
    .line 46
    move-object v1, p1

    .line 47
    move-object v2, p2

    .line 48
    move-object/from16 v3, p3

    .line 49
    .line 50
    move-wide/from16 v4, p4

    .line 51
    .line 52
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v2, 0x0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportBeanArray()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    move v0, v2

    .line 75
    move-object v3, v6

    .line 76
    :goto_0
    if-ge v0, p2, :cond_6

    .line 77
    .line 78
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 79
    .line 80
    aget-object v4, v4, v0

    .line 81
    .line 82
    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    :cond_3
    iget-wide v7, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 94
    .line 95
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v3, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v0, "expect object, but "

    .line 108
    .line 109
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/4 p1, 0x0

    .line 135
    return-object p1

    .line 136
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 137
    .line 138
    .line 139
    move v0, v2

    .line 140
    move-object v3, v6

    .line 141
    move-object v4, v3

    .line 142
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_b

    .line 147
    .line 148
    move-object v6, v4

    .line 149
    :cond_6
    if-nez v3, :cond_7

    .line 150
    .line 151
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 152
    .line 153
    :cond_7
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->createInstanceNoneDefaultConstructor(Ljava/util/Map;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->setterFieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 158
    .line 159
    if-eqz v0, :cond_8

    .line 160
    .line 161
    :goto_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->setterFieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 162
    .line 163
    array-length v4, v0

    .line 164
    if-ge v2, v4, :cond_8

    .line 165
    .line 166
    aget-object v0, v0, v2

    .line 167
    .line 168
    iget-wide v4, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 169
    .line 170
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v0, p2, v4}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    add-int/lit8 v2, v2, 0x1

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_8
    if-eqz v6, :cond_a

    .line 185
    .line 186
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_a

    .line 199
    .line 200
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Ljava/util/Map$Entry;

    .line 205
    .line 206
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Ljava/lang/Long;

    .line 211
    .line 212
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v2, Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide v3

    .line 222
    invoke-virtual {p0, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    const-string v4, ".."

    .line 227
    .line 228
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_9

    .line 233
    .line 234
    invoke-virtual {v3, p2, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_9
    invoke-virtual {v3, p1, p2, v2}, Lcom/alibaba/fastjson2/reader/FieldReader;->addResolveTask(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_a
    return-object p2

    .line 243
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 244
    .line 245
    .line 246
    move-result-wide v7

    .line 247
    const-wide/16 v9, 0x0

    .line 248
    .line 249
    cmp-long v5, v7, v9

    .line 250
    .line 251
    if-nez v5, :cond_c

    .line 252
    .line 253
    move-wide/from16 v9, p4

    .line 254
    .line 255
    goto/16 :goto_5

    .line 256
    .line 257
    :cond_c
    const-wide v9, 0x6570797440L

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    cmp-long v5, v7, v9

    .line 263
    .line 264
    if-nez v5, :cond_f

    .line 265
    .line 266
    if-nez v0, :cond_f

    .line 267
    .line 268
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 269
    .line 270
    .line 271
    move-result-wide v2

    .line 272
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 273
    .line 274
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    if-nez v2, :cond_e

    .line 279
    .line 280
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 285
    .line 286
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-eqz v0, :cond_d

    .line 291
    .line 292
    move-object v1, p1

    .line 293
    move-object v2, p2

    .line 294
    move-object/from16 v3, p3

    .line 295
    .line 296
    move-wide/from16 v4, p4

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_d
    new-instance p2, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    const-string v0, "auotype not support : "

    .line 302
    .line 303
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    const/4 p1, 0x0

    .line 321
    return-object p1

    .line 322
    :cond_e
    move-object v0, v2

    .line 323
    move-object v1, p1

    .line 324
    move-object/from16 v3, p3

    .line 325
    .line 326
    move-wide/from16 v4, p4

    .line 327
    .line 328
    move-object v2, p2

    .line 329
    :goto_4
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object p2

    .line 333
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 334
    .line 335
    .line 336
    return-object p2

    .line 337
    :cond_f
    move-wide/from16 v9, p4

    .line 338
    .line 339
    invoke-virtual {p0, v7, v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    if-nez v5, :cond_10

    .line 344
    .line 345
    invoke-virtual {p0, p1, v6, v9, v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 346
    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    if-eqz v11, :cond_12

    .line 354
    .line 355
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    if-nez v4, :cond_11

    .line 363
    .line 364
    new-instance v4, Ljava/util/HashMap;

    .line 365
    .line 366
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 367
    .line 368
    .line 369
    :cond_11
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    invoke-interface {v4, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_12
    invoke-virtual {v5, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    if-nez v3, :cond_13

    .line 382
    .line 383
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 384
    .line 385
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 386
    .line 387
    .line 388
    :cond_13
    iget-wide v11, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 389
    .line 390
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-virtual {v3, v5, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    :goto_5
    add-int/lit8 v0, v0, 0x1

    .line 398
    .line 399
    goto/16 :goto_1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v6, p4

    .line 6
    .line 7
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    move-object/from16 v2, p2

    .line 23
    .line 24
    move-object/from16 v3, p3

    .line 25
    .line 26
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v8, v0

    .line 31
    return-object v1

    .line 32
    :cond_1
    move-object v8, v0

    .line 33
    iget-wide v2, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 34
    .line 35
    or-long/2addr v2, v6

    .line 36
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader;->isSupportBeanArray(J)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v10, 0x0

    .line 42
    if-eqz v0, :cond_6

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_6

    .line 49
    .line 50
    :goto_0
    iget-object v0, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 51
    .line 52
    array-length v2, v0

    .line 53
    if-ge v10, v2, :cond_3

    .line 54
    .line 55
    aget-object v0, v0, v10

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-nez v9, :cond_2

    .line 62
    .line 63
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    move-object v9, v2

    .line 69
    :cond_2
    iget-object v2, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 70
    .line 71
    aget-object v2, v2, v10

    .line 72
    .line 73
    iget-wide v2, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 74
    .line 75
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v9, v2, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    add-int/lit8 v10, v10, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 92
    .line 93
    .line 94
    if-nez v9, :cond_4

    .line 95
    .line 96
    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 97
    .line 98
    :cond_4
    invoke-virtual {v8, v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->createInstanceNoneDefaultConstructor(Ljava/util/Map;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v2, "array not end, "

    .line 106
    .line 107
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    return-object v0

    .line 130
    :cond_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_8

    .line 135
    .line 136
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isTypeRedirect()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_7

    .line 141
    .line 142
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_8

    .line 151
    .line 152
    return-object v9

    .line 153
    :cond_8
    :goto_1
    iget-object v11, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 154
    .line 155
    iget-wide v2, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 156
    .line 157
    or-long/2addr v2, v6

    .line 158
    iget-wide v4, v11, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 159
    .line 160
    or-long v12, v2, v4

    .line 161
    .line 162
    move-object v15, v9

    .line 163
    move v14, v10

    .line 164
    :goto_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_f

    .line 169
    .line 170
    iget-boolean v0, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 171
    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    if-nez v15, :cond_9

    .line 175
    .line 176
    new-instance v15, Ljava/util/LinkedHashMap;

    .line 177
    .line 178
    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    .line 179
    .line 180
    .line 181
    :cond_9
    iget-object v0, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 182
    .line 183
    array-length v2, v0

    .line 184
    move v3, v10

    .line 185
    :goto_3
    if-ge v3, v2, :cond_b

    .line 186
    .line 187
    aget-object v4, v0, v3

    .line 188
    .line 189
    iget-object v5, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 190
    .line 191
    if-eqz v5, :cond_a

    .line 192
    .line 193
    iget-wide v5, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 194
    .line 195
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v15, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    if-nez v5, :cond_a

    .line 204
    .line 205
    iget-wide v5, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 206
    .line 207
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    iget-object v4, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-virtual {v15, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_b
    if-nez v15, :cond_c

    .line 220
    .line 221
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_c
    move-object v0, v15

    .line 225
    :goto_4
    iget-object v2, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->creator:Ljava/util/function/Function;

    .line 226
    .line 227
    invoke-interface {v2, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v2, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->setterFieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 232
    .line 233
    if-eqz v2, :cond_e

    .line 234
    .line 235
    if-eqz v15, :cond_e

    .line 236
    .line 237
    :goto_5
    iget-object v2, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;->setterFieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 238
    .line 239
    array-length v3, v2

    .line 240
    if-ge v10, v3, :cond_e

    .line 241
    .line 242
    aget-object v2, v2, v10

    .line 243
    .line 244
    iget-wide v3, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 245
    .line 246
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v15, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    if-eqz v3, :cond_d

    .line 255
    .line 256
    invoke-virtual {v2, v0, v3}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_e
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 263
    .line 264
    .line 265
    return-object v0

    .line 266
    :cond_f
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 267
    .line 268
    .line 269
    move-result-wide v2

    .line 270
    const-wide/16 v4, 0x0

    .line 271
    .line 272
    cmp-long v0, v2, v4

    .line 273
    .line 274
    if-nez v0, :cond_10

    .line 275
    .line 276
    goto/16 :goto_8

    .line 277
    .line 278
    :cond_10
    move-wide/from16 v16, v4

    .line 279
    .line 280
    iget-wide v4, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKeyHashCode:J

    .line 281
    .line 282
    cmp-long v0, v2, v4

    .line 283
    .line 284
    if-nez v0, :cond_15

    .line 285
    .line 286
    if-nez v14, :cond_15

    .line 287
    .line 288
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 289
    .line 290
    .line 291
    move-result-wide v1

    .line 292
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 293
    .line 294
    .line 295
    move-result-wide v3

    .line 296
    cmp-long v0, v1, v3

    .line 297
    .line 298
    if-nez v0, :cond_12

    .line 299
    .line 300
    :cond_11
    move-object/from16 v1, p1

    .line 301
    .line 302
    goto/16 :goto_8

    .line 303
    .line 304
    :cond_12
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 305
    .line 306
    iget-wide v3, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 307
    .line 308
    and-long/2addr v3, v12

    .line 309
    cmp-long v0, v3, v16

    .line 310
    .line 311
    if-eqz v0, :cond_13

    .line 312
    .line 313
    iget-object v3, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 314
    .line 315
    iget-wide v4, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 316
    .line 317
    move-object/from16 v0, p1

    .line 318
    .line 319
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReaderAutoType(JLjava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    goto :goto_6

    .line 324
    :cond_13
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iget-object v1, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 329
    .line 330
    invoke-virtual {v11, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    :goto_6
    if-nez v1, :cond_14

    .line 335
    .line 336
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    iget-object v1, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 341
    .line 342
    iget-wide v2, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 343
    .line 344
    invoke-virtual {v11, v0, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    :cond_14
    move-object v0, v1

    .line 349
    if-eqz v0, :cond_11

    .line 350
    .line 351
    const-wide/16 v4, 0x0

    .line 352
    .line 353
    move-object/from16 v1, p1

    .line 354
    .line 355
    move-object/from16 v2, p2

    .line 356
    .line 357
    move-object/from16 v3, p3

    .line 358
    .line 359
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 364
    .line 365
    .line 366
    return-object v0

    .line 367
    :cond_15
    invoke-virtual {v8, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    if-nez v0, :cond_17

    .line 372
    .line 373
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 374
    .line 375
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 376
    .line 377
    and-long/2addr v2, v12

    .line 378
    cmp-long v2, v2, v16

    .line 379
    .line 380
    if-eqz v2, :cond_17

    .line 381
    .line 382
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 383
    .line 384
    .line 385
    move-result-wide v2

    .line 386
    invoke-virtual {v8, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-nez v0, :cond_17

    .line 391
    .line 392
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    const-string v3, "is"

    .line 397
    .line 398
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-eqz v3, :cond_17

    .line 403
    .line 404
    const/4 v3, 0x2

    .line 405
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 410
    .line 411
    .line 412
    move-result-wide v2

    .line 413
    invoke-virtual {v8, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    if-eqz v2, :cond_17

    .line 418
    .line 419
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 420
    .line 421
    const-class v4, Ljava/lang/Boolean;

    .line 422
    .line 423
    if-eq v3, v4, :cond_16

    .line 424
    .line 425
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 426
    .line 427
    if-ne v3, v4, :cond_17

    .line 428
    .line 429
    :cond_16
    move-object v0, v2

    .line 430
    :cond_17
    if-nez v0, :cond_18

    .line 431
    .line 432
    invoke-virtual {v8, v1, v9, v6, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 433
    .line 434
    .line 435
    goto :goto_8

    .line 436
    :cond_18
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    if-nez v15, :cond_19

    .line 441
    .line 442
    new-instance v15, Ljava/util/LinkedHashMap;

    .line 443
    .line 444
    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    .line 445
    .line 446
    .line 447
    :cond_19
    instance-of v3, v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;

    .line 448
    .line 449
    if-eqz v3, :cond_1a

    .line 450
    .line 451
    check-cast v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;

    .line 452
    .line 453
    iget-wide v3, v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;->paramNameHash:J

    .line 454
    .line 455
    goto :goto_7

    .line 456
    :cond_1a
    iget-wide v3, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 457
    .line 458
    :goto_7
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {v15, v0, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    :goto_8
    add-int/lit8 v14, v14, 0x1

    .line 466
    .line 467
    goto/16 :goto_2
.end method
