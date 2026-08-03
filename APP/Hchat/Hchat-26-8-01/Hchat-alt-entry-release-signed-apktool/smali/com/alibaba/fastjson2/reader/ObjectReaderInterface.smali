.class public final Lcom/alibaba/fastjson2/reader/ObjectReaderInterface;
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


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createInstance(J)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    .line 72
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 73
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    invoke-static {p2, p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->newProxyInstance(Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONObject;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createInstance(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map;",
            "J)TT;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 15
    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_1
    if-ge v3, v2, :cond_3

    .line 19
    .line 20
    aget-object v4, v1, v3

    .line 21
    .line 22
    iget-object v5, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    instance-of v6, v5, Ljava/util/Map;

    .line 29
    .line 30
    if-eqz v6, :cond_2

    .line 31
    .line 32
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v4, v6}, Lcom/alibaba/fastjson2/reader/FieldReader;->getObjectReader(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    instance-of v7, v6, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;

    .line 41
    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    if-ne v0, p1, :cond_1

    .line 45
    .line 46
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>(Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    check-cast v5, Ljava/util/Map;

    .line 52
    .line 53
    invoke-interface {v6, v5, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-object v4, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->newProxyInstance(Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONObject;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 9
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
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v6, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v6

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 16
    .line 17
    or-long/2addr v4, p4

    .line 18
    move-object v0, p1

    .line 19
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 30
    .line 31
    if-eq v0, v2, :cond_1

    .line 32
    .line 33
    move-object v2, p2

    .line 34
    move-object v3, p3

    .line 35
    move-wide v4, p4

    .line 36
    move-object v0, v1

    .line 37
    move-object v1, p1

    .line 38
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportBeanArray()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "expect object, but "

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    return-object v0

    .line 91
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 95
    .line 96
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 97
    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->newProxyInstance(Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONObject;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 114
    .line 115
    .line 116
    move-result-wide v3

    .line 117
    iget-wide v7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKeyHashCode:J

    .line 118
    .line 119
    cmp-long v5, v3, v7

    .line 120
    .line 121
    if-nez v5, :cond_8

    .line 122
    .line 123
    if-nez v2, :cond_8

    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readValueHashCode()J

    .line 126
    .line 127
    .line 128
    move-result-wide v3

    .line 129
    iget-object v5, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 130
    .line 131
    invoke-virtual {p0, v5, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    if-nez v3, :cond_6

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v5, v3, v6}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-eqz v4, :cond_5

    .line 146
    .line 147
    move-object v3, v4

    .line 148
    goto :goto_1

    .line 149
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v2, "auotype not support : "

    .line 152
    .line 153
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    return-object v0

    .line 172
    :cond_6
    :goto_1
    if-ne v3, p0, :cond_7

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_7
    const/4 v0, 0x1

    .line 176
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 177
    .line 178
    .line 179
    move-object v1, p1

    .line 180
    move-object v2, p2

    .line 181
    move-wide v4, p4

    .line 182
    move-object v0, v3

    .line 183
    move-object v3, p3

    .line 184
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0

    .line 189
    :cond_8
    const-wide/16 v7, 0x0

    .line 190
    .line 191
    cmp-long v5, v3, v7

    .line 192
    .line 193
    if-nez v5, :cond_9

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_9
    invoke-virtual {p0, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    if-nez v3, :cond_a

    .line 201
    .line 202
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 203
    .line 204
    or-long/2addr v4, p4

    .line 205
    invoke-virtual {p1, v4, v5}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_a

    .line 210
    .line 211
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 212
    .line 213
    .line 214
    move-result-wide v3

    .line 215
    invoke-virtual {p0, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    :cond_a
    if-nez v3, :cond_b

    .line 220
    .line 221
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {v0, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_b
    invoke-virtual {v3, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    iget-object v3, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v0, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 243
    .line 244
    goto/16 :goto_0
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 17
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
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-boolean v1, v2, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderInterface;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    return-object v1

    .line 14
    :cond_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 22
    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    or-long v4, v4, p4

    .line 36
    .line 37
    invoke-virtual {v2, v4, v5}, Lcom/alibaba/fastjson2/JSONReader;->isSupportBeanArray(J)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->readArrayMappingObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    return-object v1

    .line 48
    :cond_2
    new-instance v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 49
    .line 50
    invoke-direct {v1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_6

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const/16 v5, 0x74

    .line 64
    .line 65
    if-eq v4, v5, :cond_5

    .line 66
    .line 67
    const/16 v5, 0x66

    .line 68
    .line 69
    if-ne v4, v5, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/16 v5, 0x22

    .line 73
    .line 74
    if-eq v4, v5, :cond_6

    .line 75
    .line 76
    const/16 v5, 0x27

    .line 77
    .line 78
    if-eq v4, v5, :cond_6

    .line 79
    .line 80
    const/16 v5, 0x7d

    .line 81
    .line 82
    if-ne v4, v5, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    const/4 v1, 0x0

    .line 93
    return-object v1

    .line 94
    :cond_5
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 95
    .line 96
    .line 97
    return-object v3

    .line 98
    :cond_6
    :goto_2
    const/4 v4, 0x0

    .line 99
    :goto_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_8

    .line 104
    .line 105
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 106
    .line 107
    .line 108
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->newProxyInstance(Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONObject;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getBuildFunction()Ljava/util/function/Function;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-eqz v2, :cond_7

    .line 119
    .line 120
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :cond_7
    return-object v1

    .line 125
    :cond_8
    iget-object v5, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 126
    .line 127
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 128
    .line 129
    .line 130
    move-result-wide v6

    .line 131
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReader$Context;->getContextAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    if-nez v4, :cond_11

    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getTypeKeyHash()J

    .line 138
    .line 139
    .line 140
    move-result-wide v9

    .line 141
    cmp-long v9, v6, v9

    .line 142
    .line 143
    if-nez v9, :cond_11

    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 146
    .line 147
    .line 148
    move-result-wide v9

    .line 149
    or-long v9, p4, v9

    .line 150
    .line 151
    iget-wide v11, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 152
    .line 153
    or-long v12, v9, v11

    .line 154
    .line 155
    sget-object v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 156
    .line 157
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 158
    .line 159
    and-long/2addr v9, v12

    .line 160
    const-wide/16 v14, 0x0

    .line 161
    .line 162
    cmp-long v9, v9, v14

    .line 163
    .line 164
    if-nez v9, :cond_9

    .line 165
    .line 166
    if-eqz v8, :cond_11

    .line 167
    .line 168
    :cond_9
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 169
    .line 170
    .line 171
    move-result-wide v9

    .line 172
    if-eqz v8, :cond_a

    .line 173
    .line 174
    iget-object v11, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 175
    .line 176
    invoke-interface/range {v8 .. v13}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    if-nez v11, :cond_a

    .line 181
    .line 182
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    iget-object v14, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 187
    .line 188
    invoke-interface {v8, v11, v14, v12, v13}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    if-eqz v8, :cond_a

    .line 193
    .line 194
    invoke-virtual {v5, v8}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    goto :goto_4

    .line 199
    :cond_a
    move-object v8, v3

    .line 200
    :goto_4
    if-nez v8, :cond_b

    .line 201
    .line 202
    invoke-virtual {v0, v5, v9, v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    :cond_b
    if-nez v8, :cond_d

    .line 207
    .line 208
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    iget-object v9, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 213
    .line 214
    invoke-virtual {v5, v8, v9, v12, v13}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    if-eqz v5, :cond_c

    .line 219
    .line 220
    move-object/from16 v16, v8

    .line 221
    .line 222
    move-object v8, v5

    .line 223
    move-object/from16 v5, v16

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v3, "No suitable ObjectReader found for"

    .line 229
    .line 230
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_d
    move-object v5, v3

    .line 250
    :goto_5
    if-ne v8, v0, :cond_e

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_e
    invoke-interface {v8, v6, v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    if-eqz v7, :cond_f

    .line 258
    .line 259
    if-nez v5, :cond_f

    .line 260
    .line 261
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    :cond_f
    move-object v9, v5

    .line 266
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 267
    .line 268
    .line 269
    move-result-wide v3

    .line 270
    or-long v5, p4, v3

    .line 271
    .line 272
    const/4 v3, 0x0

    .line 273
    const/4 v4, 0x0

    .line 274
    move-object v1, v8

    .line 275
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    if-eqz v7, :cond_10

    .line 280
    .line 281
    invoke-virtual {v7, v1, v9}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_10
    return-object v1

    .line 285
    :cond_11
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    if-nez v5, :cond_12

    .line 290
    .line 291
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 292
    .line 293
    .line 294
    move-result-wide v6

    .line 295
    or-long v6, p4, v6

    .line 296
    .line 297
    invoke-virtual {v2, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    if-eqz v6, :cond_12

    .line 302
    .line 303
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 304
    .line 305
    .line 306
    move-result-wide v5

    .line 307
    invoke-virtual {v0, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    :cond_12
    if-nez v5, :cond_13

    .line 312
    .line 313
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-virtual {v1, v5, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_13
    invoke-virtual {v5, v2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    iget-object v5, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 330
    .line 331
    invoke-virtual {v1, v5, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 335
    .line 336
    goto/16 :goto_3
.end method
