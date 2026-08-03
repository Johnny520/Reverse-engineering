.class final Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;
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
.method public varargs constructor <init>(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class;",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v7, p2

    .line 10
    move-object/from16 v3, p3

    .line 11
    .line 12
    move-object/from16 v9, p4

    .line 13
    .line 14
    move-object/from16 v10, p5

    .line 15
    .line 16
    move-object/from16 v11, p6

    .line 17
    .line 18
    move-object/from16 v12, p7

    .line 19
    .line 20
    invoke-direct/range {v1 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public addSubType(Ljava/lang/Class;Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlso:[Ljava/lang/Class;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    if-ne v3, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlso:[Ljava/lang/Class;

    .line 16
    .line 17
    array-length v1, v0

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v5, v0

    .line 25
    check-cast v5, [Ljava/lang/Class;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoNames:[Ljava/lang/String;

    .line 28
    .line 29
    array-length v1, v0

    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v6, v0

    .line 37
    check-cast v6, [Ljava/lang/String;

    .line 38
    .line 39
    array-length v0, v5

    .line 40
    add-int/lit8 v0, v0, -0x1

    .line 41
    .line 42
    aput-object p1, v5, v0

    .line 43
    .line 44
    if-nez p2, :cond_2

    .line 45
    .line 46
    const-class v0, Lcom/alibaba/fastjson2/annotation/JSONType;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lcom/alibaba/fastjson2/annotation/JSONType;

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, Lcom/alibaba/fastjson2/annotation/JSONType;->typeName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    :cond_2
    if-eqz p2, :cond_3

    .line 61
    .line 62
    array-length p1, v6

    .line 63
    add-int/lit8 p1, p1, -0x1

    .line 64
    .line 65
    aput-object p2, v6, p1

    .line 66
    .line 67
    :cond_3
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    .line 68
    .line 69
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 70
    .line 71
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 72
    .line 73
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKey:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoDefault:Ljava/lang/Class;

    .line 76
    .line 77
    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 78
    .line 79
    invoke-direct/range {v1 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;-><init>(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method

.method public createInstance(J)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
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
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeNameHash:J

    .line 12
    .line 13
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 14
    .line 15
    or-long/2addr v4, p4

    .line 16
    move-object v0, p1

    .line 17
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 28
    .line 29
    if-eq v0, v2, :cond_1

    .line 30
    .line 31
    move-object v2, p2

    .line 32
    move-object v3, p3

    .line 33
    move-wide v4, p4

    .line 34
    move-object v0, v1

    .line 35
    move-object v1, p1

    .line 36
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportBeanArray()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0

    .line 67
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "expect object, but "

    .line 70
    .line 71
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    return-object v0

    .line 98
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->mark()Lcom/alibaba/fastjson2/JSONReader$SavePoint;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 103
    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    move-object v3, v6

    .line 107
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_6

    .line 112
    .line 113
    if-nez v3, :cond_5

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getFeatures()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    or-long/2addr v0, p4

    .line 124
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;->createInstance(J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :cond_5
    return-object v3

    .line 130
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    iget-wide v7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKeyHashCode:J

    .line 135
    .line 136
    cmp-long v7, v4, v7

    .line 137
    .line 138
    if-nez v7, :cond_b

    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readValueHashCode()J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-virtual {p0, v7, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-nez v4, :cond_8

    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-virtual {v7, v4, v6}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    if-eqz v5, :cond_7

    .line 163
    .line 164
    move-object v4, v5

    .line 165
    goto :goto_1

    .line 166
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v2, "autoType not support : "

    .line 169
    .line 170
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const/4 v0, 0x0

    .line 188
    return-object v0

    .line 189
    :cond_8
    :goto_1
    if-ne v4, p0, :cond_9

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_9
    if-eqz v2, :cond_a

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->reset(Lcom/alibaba/fastjson2/JSONReader$SavePoint;)V

    .line 195
    .line 196
    .line 197
    :cond_a
    const/4 v0, 0x1

    .line 198
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 199
    .line 200
    .line 201
    move-object v1, p1

    .line 202
    move-object v2, p2

    .line 203
    move-object v3, p3

    .line 204
    move-object v0, v4

    .line 205
    move-wide v4, p4

    .line 206
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0

    .line 211
    :cond_b
    const-wide/16 v7, 0x0

    .line 212
    .line 213
    cmp-long v7, v4, v7

    .line 214
    .line 215
    if-nez v7, :cond_c

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_c
    invoke-virtual {p0, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    if-nez v4, :cond_d

    .line 223
    .line 224
    iget-wide v7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 225
    .line 226
    or-long/2addr v7, p4

    .line 227
    invoke-virtual {p1, v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_d

    .line 232
    .line 233
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 234
    .line 235
    .line 236
    move-result-wide v4

    .line 237
    invoke-virtual {p0, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    :cond_d
    if-nez v4, :cond_e

    .line 242
    .line 243
    invoke-virtual {p0, p1, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_e
    if-nez v3, :cond_f

    .line 248
    .line 249
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getFeatures()J

    .line 254
    .line 255
    .line 256
    move-result-wide v7

    .line 257
    or-long/2addr v7, p4

    .line 258
    invoke-virtual {p0, v7, v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;->createInstance(J)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    :cond_f
    invoke-virtual {v4, p1, v3}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 266
    .line 267
    goto/16 :goto_0
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 24
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
    move-wide/from16 v2, p4

    .line 6
    .line 7
    iget-boolean v4, v1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    return-object v1

    .line 16
    :cond_0
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 33
    .line 34
    .line 35
    return-object v5

    .line 36
    :cond_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v6, 0x0

    .line 41
    if-eqz v4, :cond_6

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readValueHashCode()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlso:[Ljava/lang/Class;

    .line 48
    .line 49
    array-length v7, v4

    .line 50
    :goto_0
    if-ge v6, v7, :cond_5

    .line 51
    .line 52
    aget-object v8, v4, v6

    .line 53
    .line 54
    const-class v9, Ljava/lang/Enum;

    .line 55
    .line 56
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_4

    .line 61
    .line 62
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    instance-of v9, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 67
    .line 68
    if-eqz v9, :cond_3

    .line 69
    .line 70
    check-cast v8, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 71
    .line 72
    invoke-virtual {v8, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->getEnumByHashCode(J)Ljava/lang/Enum;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v8, v5

    .line 78
    :goto_1
    if-eqz v8, :cond_4

    .line 79
    .line 80
    return-object v8

    .line 81
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v4, "not support input "

    .line 91
    .line 92
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    return-object v1

    .line 111
    :cond_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->mark()Lcom/alibaba/fastjson2/JSONReader$SavePoint;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 116
    .line 117
    .line 118
    move-result-wide v7

    .line 119
    or-long/2addr v7, v2

    .line 120
    invoke-virtual {v1, v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v7

    .line 124
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    const-wide/16 v10, 0x0

    .line 129
    .line 130
    if-eqz v9, :cond_8

    .line 131
    .line 132
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 133
    .line 134
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 135
    .line 136
    and-long/2addr v4, v7

    .line 137
    cmp-long v4, v4, v10

    .line 138
    .line 139
    if-eqz v4, :cond_7

    .line 140
    .line 141
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->readArrayMappingObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    return-object v1

    .line 146
    :cond_7
    move-object/from16 v2, p2

    .line 147
    .line 148
    move-object/from16 v3, p3

    .line 149
    .line 150
    move-wide v4, v7

    .line 151
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processObjectInputSingleItemArray(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    move-object v7, v0

    .line 156
    return-object v1

    .line 157
    :cond_8
    move-object v7, v0

    .line 158
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_c

    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    const/16 v8, 0x74

    .line 169
    .line 170
    if-eq v0, v8, :cond_b

    .line 171
    .line 172
    const/16 v8, 0x66

    .line 173
    .line 174
    if-ne v0, v8, :cond_9

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_9
    const/16 v8, 0x22

    .line 178
    .line 179
    if-eq v0, v8, :cond_c

    .line 180
    .line 181
    const/16 v8, 0x27

    .line 182
    .line 183
    if-eq v0, v8, :cond_c

    .line 184
    .line 185
    const/16 v8, 0x7d

    .line 186
    .line 187
    if-ne v0, v8, :cond_a

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :goto_2
    const/4 v0, 0x0

    .line 198
    return-object v0

    .line 199
    :cond_b
    :goto_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 200
    .line 201
    .line 202
    return-object v5

    .line 203
    :cond_c
    :goto_4
    move-object v0, v5

    .line 204
    move-object v8, v0

    .line 205
    :goto_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    if-eqz v9, :cond_10

    .line 210
    .line 211
    if-nez v0, :cond_d

    .line 212
    .line 213
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 214
    .line 215
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 216
    .line 217
    or-long/2addr v2, v4

    .line 218
    invoke-virtual {v7, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;->createInstance(J)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    :cond_d
    if-eqz v8, :cond_e

    .line 223
    .line 224
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-eqz v3, :cond_e

    .line 237
    .line 238
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    check-cast v3, Ljava/util/Map$Entry;

    .line 243
    .line 244
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    check-cast v4, Ljava/lang/Long;

    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 251
    .line 252
    .line 253
    move-result-wide v4

    .line 254
    invoke-virtual {v7, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v4, v0, v3}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_e
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 267
    .line 268
    .line 269
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getBuildFunction()Ljava/util/function/Function;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    if-eqz v1, :cond_f

    .line 274
    .line 275
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    :cond_f
    return-object v0

    .line 280
    :cond_10
    iget-object v9, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 281
    .line 282
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 283
    .line 284
    .line 285
    move-result-wide v12

    .line 286
    invoke-virtual {v9}, Lcom/alibaba/fastjson2/JSONReader$Context;->getContextAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getTypeKeyHash()J

    .line 291
    .line 292
    .line 293
    move-result-wide v15

    .line 294
    cmp-long v15, v12, v15

    .line 295
    .line 296
    if-eqz v15, :cond_12

    .line 297
    .line 298
    iget-object v15, v7, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoDefault:Ljava/lang/Class;

    .line 299
    .line 300
    if-eqz v15, :cond_11

    .line 301
    .line 302
    const-class v5, Ljava/lang/Void;

    .line 303
    .line 304
    if-eq v15, v5, :cond_11

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_11
    move-wide/from16 v20, v10

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_12
    :goto_7
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 311
    .line 312
    .line 313
    move-result-wide v15

    .line 314
    or-long/2addr v15, v2

    .line 315
    move-wide/from16 v20, v10

    .line 316
    .line 317
    iget-wide v10, v9, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 318
    .line 319
    or-long v18, v15, v10

    .line 320
    .line 321
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 322
    .line 323
    iget-wide v10, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 324
    .line 325
    and-long v10, v18, v10

    .line 326
    .line 327
    cmp-long v5, v10, v20

    .line 328
    .line 329
    if-nez v5, :cond_19

    .line 330
    .line 331
    if-eqz v14, :cond_13

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_13
    :goto_8
    invoke-virtual {v7, v12, v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    if-nez v5, :cond_14

    .line 339
    .line 340
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 341
    .line 342
    .line 343
    move-result-wide v9

    .line 344
    or-long/2addr v9, v2

    .line 345
    invoke-virtual {v1, v9, v10}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    if-eqz v9, :cond_14

    .line 350
    .line 351
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 352
    .line 353
    .line 354
    move-result-wide v9

    .line 355
    invoke-virtual {v7, v9, v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    :cond_14
    if-nez v0, :cond_15

    .line 360
    .line 361
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 362
    .line 363
    iget-wide v9, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 364
    .line 365
    or-long/2addr v9, v2

    .line 366
    invoke-virtual {v7, v9, v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;->createInstance(J)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    :cond_15
    if-nez v5, :cond_16

    .line 371
    .line 372
    invoke-virtual {v7, v1, v0, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 373
    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_16
    if-nez v0, :cond_18

    .line 377
    .line 378
    invoke-virtual {v5, v1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    if-nez v8, :cond_17

    .line 383
    .line 384
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 385
    .line 386
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 387
    .line 388
    .line 389
    :cond_17
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 390
    .line 391
    .line 392
    move-result-object v9

    .line 393
    invoke-interface {v8, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    :goto_9
    move v15, v6

    .line 397
    goto/16 :goto_f

    .line 398
    .line 399
    :cond_18
    invoke-virtual {v5, v1, v0}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    goto :goto_9

    .line 403
    :cond_19
    :goto_a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 404
    .line 405
    .line 406
    move-result-wide v10

    .line 407
    const-wide/16 v15, -0x1

    .line 408
    .line 409
    cmp-long v5, v10, v15

    .line 410
    .line 411
    if-nez v5, :cond_1a

    .line 412
    .line 413
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isNumber()Z

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    if-eqz v5, :cond_1a

    .line 418
    .line 419
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v10

    .line 427
    invoke-static {v10}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 428
    .line 429
    .line 430
    move-result-wide v15

    .line 431
    move-object/from16 v22, v10

    .line 432
    .line 433
    move-object v10, v5

    .line 434
    move-object/from16 v5, v22

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_1a
    move-wide v15, v10

    .line 438
    const/4 v5, 0x0

    .line 439
    const/4 v10, 0x0

    .line 440
    :goto_b
    if-eqz v14, :cond_1c

    .line 441
    .line 442
    iget-object v11, v7, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 443
    .line 444
    move-object/from16 v17, v11

    .line 445
    .line 446
    invoke-interface/range {v14 .. v19}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    move-result-object v11

    .line 450
    move-wide/from16 v2, v18

    .line 451
    .line 452
    move-wide/from16 v22, v15

    .line 453
    .line 454
    move-object/from16 v16, v5

    .line 455
    .line 456
    move v15, v6

    .line 457
    move-wide/from16 v5, v22

    .line 458
    .line 459
    if-nez v11, :cond_1b

    .line 460
    .line 461
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v11

    .line 465
    move-object/from16 v17, v0

    .line 466
    .line 467
    iget-object v0, v7, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 468
    .line 469
    invoke-interface {v14, v11, v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    if-eqz v0, :cond_1d

    .line 474
    .line 475
    invoke-virtual {v9, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    goto :goto_d

    .line 480
    :cond_1b
    move-object/from16 v17, v0

    .line 481
    .line 482
    goto :goto_c

    .line 483
    :cond_1c
    move-object/from16 v17, v0

    .line 484
    .line 485
    move-wide/from16 v2, v18

    .line 486
    .line 487
    move-wide/from16 v22, v15

    .line 488
    .line 489
    move-object/from16 v16, v5

    .line 490
    .line 491
    move v15, v6

    .line 492
    move-wide/from16 v5, v22

    .line 493
    .line 494
    :cond_1d
    :goto_c
    const/4 v0, 0x0

    .line 495
    :goto_d
    if-nez v0, :cond_1e

    .line 496
    .line 497
    invoke-virtual {v7, v9, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    :cond_1e
    if-nez v0, :cond_21

    .line 502
    .line 503
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    iget-object v5, v7, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 508
    .line 509
    invoke-virtual {v9, v0, v5, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    if-nez v2, :cond_1f

    .line 514
    .line 515
    iget-object v3, v7, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoDefault:Ljava/lang/Class;

    .line 516
    .line 517
    if-eqz v3, :cond_1f

    .line 518
    .line 519
    invoke-virtual {v9, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    :cond_1f
    if-eqz v2, :cond_20

    .line 524
    .line 525
    move-object/from16 v22, v2

    .line 526
    .line 527
    move-object v2, v0

    .line 528
    move-object/from16 v0, v22

    .line 529
    .line 530
    goto :goto_e

    .line 531
    :cond_20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 532
    .line 533
    const-string v3, "No suitable ObjectReader found for"

    .line 534
    .line 535
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    goto/16 :goto_2

    .line 553
    .line 554
    :cond_21
    const/4 v2, 0x0

    .line 555
    :goto_e
    if-ne v0, v7, :cond_22

    .line 556
    .line 557
    move-object/from16 v0, v17

    .line 558
    .line 559
    :goto_f
    add-int/lit8 v6, v15, 0x1

    .line 560
    .line 561
    move-wide/from16 v2, p4

    .line 562
    .line 563
    move-wide/from16 v10, v20

    .line 564
    .line 565
    const/4 v5, 0x0

    .line 566
    goto/16 :goto_5

    .line 567
    .line 568
    :cond_22
    invoke-interface {v0, v12, v13}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 569
    .line 570
    .line 571
    move-result-object v6

    .line 572
    if-eqz v6, :cond_24

    .line 573
    .line 574
    if-nez v2, :cond_24

    .line 575
    .line 576
    if-eqz v16, :cond_23

    .line 577
    .line 578
    move-object/from16 v8, v16

    .line 579
    .line 580
    goto :goto_10

    .line 581
    :cond_23
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    move-object v8, v5

    .line 586
    goto :goto_10

    .line 587
    :cond_24
    move-object v8, v2

    .line 588
    :goto_10
    if-nez v15, :cond_25

    .line 589
    .line 590
    if-eqz v6, :cond_26

    .line 591
    .line 592
    :cond_25
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONReader;->reset(Lcom/alibaba/fastjson2/JSONReader$SavePoint;)V

    .line 593
    .line 594
    .line 595
    :cond_26
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFeatures()J

    .line 596
    .line 597
    .line 598
    move-result-wide v2

    .line 599
    or-long v4, p4, v2

    .line 600
    .line 601
    move-object/from16 v2, p2

    .line 602
    .line 603
    move-object/from16 v3, p3

    .line 604
    .line 605
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    if-eqz v6, :cond_28

    .line 610
    .line 611
    if-eqz v10, :cond_27

    .line 612
    .line 613
    invoke-virtual {v6, v0, v10}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    return-object v0

    .line 617
    :cond_27
    invoke-virtual {v6, v0, v8}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    :cond_28
    return-object v0
.end method
