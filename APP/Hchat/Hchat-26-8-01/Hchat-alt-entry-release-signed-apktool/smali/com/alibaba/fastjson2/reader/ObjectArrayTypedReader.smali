.class final Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field final componentClass:Ljava/lang/Class;

.field final componentClassHash:J

.field final componentType:Ljava/lang/Class;

.field final typeName:Ljava/lang/String;

.field final typeNameHashCode:J


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;-><init>(Ljava/lang/Class;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentType:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentClassHash:J

    .line 19
    .line 20
    const-string v1, "["

    .line 21
    .line 22
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->typeName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iput-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->typeNameHashCode:J

    .line 33
    .line 34
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentClass:Ljava/lang/Class;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentClass:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v1, 0x0

    .line 18
    move v2, v1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_7

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentType:Ljava/lang/Class;

    .line 36
    .line 37
    if-eq v4, v5, :cond_0

    .line 38
    .line 39
    sget-object v6, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 40
    .line 41
    invoke-virtual {v6, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-interface {v4, v3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :cond_0
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentType:Ljava/lang/Class;

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_6

    .line 58
    .line 59
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 60
    .line 61
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentType:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    instance-of v5, v3, Ljava/util/Map;

    .line 68
    .line 69
    if-eqz v5, :cond_1

    .line 70
    .line 71
    check-cast v3, Ljava/util/Map;

    .line 72
    .line 73
    invoke-interface {v4, v3, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    goto :goto_2

    .line 78
    :cond_1
    instance-of v5, v3, Ljava/util/Collection;

    .line 79
    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    check-cast v3, Ljava/util/Collection;

    .line 83
    .line 84
    invoke-interface {v4, v3, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    instance-of v5, v3, [Ljava/lang/Object;

    .line 90
    .line 91
    if-eqz v5, :cond_3

    .line 92
    .line 93
    check-cast v3, [Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSONArray;->of([Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-interface {v4, v3, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    if-eqz v3, :cond_6

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_5

    .line 115
    .line 116
    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    new-instance v6, Lcom/alibaba/fastjson2/JSONArray;

    .line 121
    .line 122
    invoke-direct {v6, v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 123
    .line 124
    .line 125
    move v7, v1

    .line 126
    :goto_1
    if-ge v7, v5, :cond_4

    .line 127
    .line 128
    invoke-static {v3, v7}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-virtual {v6, v8}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    add-int/lit8 v7, v7, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    invoke-interface {v4, v6, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    goto :goto_2

    .line 143
    :cond_5
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentType:Ljava/lang/Class;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const-string p2, ", but "

    .line 150
    .line 151
    const-string p3, "component type not match, expect "

    .line 152
    .line 153
    invoke-static {p3, p1, p2, v5}, Lah/a;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    const/4 p1, 0x0

    .line 157
    return-object p1

    .line 158
    :cond_6
    :goto_2
    add-int/lit8 v4, v2, 0x1

    .line 159
    .line 160
    aput-object v3, v0, v2

    .line 161
    .line 162
    move v2, v4

    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_7
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/16 v2, -0x6e

    .line 6
    .line 7
    if-ne v1, v2, :cond_3

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    sget-wide v3, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->TYPE_HASH_CODE:J

    .line 17
    .line 18
    cmp-long v3, v1, v3

    .line 19
    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    iget-wide v3, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->typeNameHashCode:J

    .line 23
    .line 24
    cmp-long v3, v1, v3

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-wide v4, p4

    .line 30
    invoke-virtual {p1, p4, p5}, Lcom/alibaba/fastjson2/JSONReader;->isSupportAutoType(J)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;->objectClass:Ljava/lang/Class;

    .line 37
    .line 38
    move-object v0, p1

    .line 39
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReaderAutoType(JLjava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    move-object v2, p2

    .line 46
    move-object v3, p3

    .line 47
    move-wide v4, p4

    .line 48
    move-object v0, v1

    .line 49
    move-object v1, p1

    .line 50
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, "auotype not support : "

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    return-object v0

    .line 82
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v2, "not support autotype : "

    .line 85
    .line 86
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    return-object v0

    .line 109
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    const/4 v1, -0x1

    .line 114
    const/4 v7, 0x0

    .line 115
    if-ne v6, v1, :cond_4

    .line 116
    .line 117
    return-object v7

    .line 118
    :cond_4
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentClass:Ljava/lang/Class;

    .line 119
    .line 120
    invoke-static {v1, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    move-object v8, v1

    .line 125
    check-cast v8, [Ljava/lang/Object;

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    move v9, v1

    .line 129
    :goto_1
    if-ge v9, v6, :cond_8

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v2, ".."

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_5

    .line 148
    .line 149
    move-object v1, v8

    .line 150
    goto :goto_2

    .line 151
    :cond_5
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {p1, v8, v9, v1}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask([Ljava/lang/Object;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 156
    .line 157
    .line 158
    move-object v1, v7

    .line 159
    :goto_2
    move-object v0, v1

    .line 160
    goto :goto_3

    .line 161
    :cond_6
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentClass:Ljava/lang/Class;

    .line 162
    .line 163
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentClassHash:J

    .line 164
    .line 165
    move-object v0, p1

    .line 166
    move-wide v4, p4

    .line 167
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_7

    .line 172
    .line 173
    const/4 v2, 0x0

    .line 174
    const/4 v3, 0x0

    .line 175
    move-wide v4, p4

    .line 176
    move-object v0, v1

    .line 177
    move-object v1, p1

    .line 178
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    goto :goto_3

    .line 183
    :cond_7
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentType:Ljava/lang/Class;

    .line 184
    .line 185
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :goto_3
    aput-object v0, v8, v9

    .line 190
    .line 191
    add-int/lit8 v9, v9, 0x1

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_8
    return-object v8
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean p4, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const-wide/16 v4, 0x0

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    move-object v0, p0

    .line 17
    move-object v1, p1

    .line 18
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 p2, 0x0

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    iget-object p1, v0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentType:Ljava/lang/Class;

    .line 33
    .line 34
    const/16 p2, 0x10

    .line 35
    .line 36
    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    :goto_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_2
    add-int/lit8 p3, p2, 0x1

    .line 58
    .line 59
    array-length p4, p1

    .line 60
    sub-int p4, p3, p4

    .line 61
    .line 62
    if-lez p4, :cond_4

    .line 63
    .line 64
    array-length p4, p1

    .line 65
    shr-int/lit8 p5, p4, 0x1

    .line 66
    .line 67
    add-int/2addr p4, p5

    .line 68
    sub-int p5, p4, p3

    .line 69
    .line 70
    if-gez p5, :cond_3

    .line 71
    .line 72
    move p4, p3

    .line 73
    :cond_3
    invoke-static {p1, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :cond_4
    iget-object p4, v0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;->componentType:Ljava/lang/Class;

    .line 78
    .line 79
    invoke-virtual {v1, p4}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    aput-object p4, p1, p2

    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 86
    .line 87
    .line 88
    move p2, p3

    .line 89
    goto :goto_0

    .line 90
    :cond_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    const/16 p3, 0x22

    .line 95
    .line 96
    if-ne p1, p3, :cond_6

    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    return-object p2

    .line 109
    :cond_6
    const-string p1, "TODO"

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const/4 p1, 0x0

    .line 119
    return-object p1
.end method
