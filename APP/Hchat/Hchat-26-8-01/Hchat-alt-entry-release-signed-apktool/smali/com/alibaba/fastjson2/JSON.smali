.class public interface abstract Lcom/alibaba/fastjson2/JSON;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final VERSION:Ljava/lang/String; = "2.0.60"


# direct methods
.method public static config(Lcom/alibaba/fastjson2/JSONReader$Feature;Z)V
    .locals 2

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    if-ne p0, v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p0, "not support config global autotype support"

    .line 9
    .line 10
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 15
    .line 16
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    .line 17
    .line 18
    iget-wide p0, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 19
    .line 20
    or-long/2addr p0, v0

    .line 21
    sput-wide p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    .line 25
    .line 26
    iget-wide p0, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 27
    .line 28
    not-long p0, p0

    .line 29
    and-long/2addr p0, v0

    .line 30
    sput-wide p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    .line 31
    .line 32
    return-void
.end method

.method public static config(Lcom/alibaba/fastjson2/JSONWriter$Feature;Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 41
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    iget-wide p0, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr p0, v0

    sput-wide p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    return-void

    .line 42
    :cond_0
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    iget-wide p0, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    not-long p0, p0

    and-long/2addr p0, v0

    sput-wide p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    return-void
.end method

.method public static varargs config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 6

    const/4 v0, 0x0

    .line 33
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 34
    aget-object v1, p0, v0

    .line 35
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    if-eq v1, v2, :cond_0

    .line 36
    sget-wide v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long v1, v2, v4

    sput-wide v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 37
    :cond_0
    const-string p0, "not support config global autotype support"

    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static varargs config([Lcom/alibaba/fastjson2/JSONWriter$Feature;)V
    .locals 6

    const/4 v0, 0x0

    .line 38
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 39
    aget-object v1, p0, v0

    .line 40
    sget-wide v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long v1, v2, v4

    sput-wide v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static varargs configEnumAsJavaBean([Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Enum;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectWriterProvider()Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->configEnumAsJavaBean([Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static configReaderDateFormat(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static configReaderZoneId(Ljava/time/ZoneId;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    .line 2
    .line 3
    return-void
.end method

.method public static configWriterDateFormat(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFormat:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static configWriterZoneId(Ljava/time/ZoneId;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterZoneId:Ljava/time/ZoneId;

    .line 2
    .line 3
    return-void
.end method

.method public static varargs copy(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;[",
            "Lcom/alibaba/fastjson2/JSONWriter$Feature;",
            ")TT;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isPrimitiveOrEnum(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    const/4 v3, 0x0

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    move v7, v3

    .line 20
    move-wide v10, v4

    .line 21
    move v4, v7

    .line 22
    move v5, v4

    .line 23
    :goto_0
    array-length v6, p1

    .line 24
    if-ge v4, v6, :cond_4

    .line 25
    .line 26
    aget-object v6, p1, v4

    .line 27
    .line 28
    iget-wide v8, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 29
    .line 30
    or-long/2addr v10, v8

    .line 31
    sget-object v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 32
    .line 33
    const/4 v9, 0x1

    .line 34
    if-ne v6, v8, :cond_2

    .line 35
    .line 36
    move v5, v9

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    sget-object v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 39
    .line 40
    if-ne v6, v8, :cond_3

    .line 41
    .line 42
    move v7, v9

    .line 43
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 47
    .line 48
    invoke-virtual {v4, v1, v1, v5}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    sget-object v6, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 53
    .line 54
    invoke-virtual {v6, v1, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    instance-of v1, v4, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 59
    .line 60
    if-eqz v1, :cond_9

    .line 61
    .line 62
    instance-of v1, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    .line 63
    .line 64
    if-eqz v1, :cond_9

    .line 65
    .line 66
    invoke-interface {v4}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->getFieldWriters()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    instance-of v1, v8, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;

    .line 71
    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    new-instance v1, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-direct {v1, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 81
    .line 82
    .line 83
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v3, v4, :cond_5

    .line 88
    .line 89
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 94
    .line 95
    invoke-virtual {v4, p0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget-object v4, v4, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-interface {v8, v1, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :cond_6
    invoke-interface {v8, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    move v4, v3

    .line 117
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-ge v4, v5, :cond_8

    .line 122
    .line 123
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 128
    .line 129
    iget-object v6, v5, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 130
    .line 131
    invoke-interface {v8, v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    if-nez v6, :cond_7

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_7
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    new-array v7, v3, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 143
    .line 144
    invoke-static {v5, v7}, Lcom/alibaba/fastjson2/JSON;->copy(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v6, v1, v5}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_8
    return-object v1

    .line 155
    :cond_9
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONWriter;->ofJSONB([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Lcom/alibaba/fastjson2/JSONWriter;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    :try_start_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 160
    .line 161
    filled-new-array {v0}, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->config([Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 166
    .line 167
    .line 168
    move-object v0, v4

    .line 169
    const/4 v4, 0x0

    .line 170
    const-wide/16 v5, 0x0

    .line 171
    .line 172
    const/4 v3, 0x0

    .line 173
    move-object v2, p0

    .line 174
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->getBytes()[B

    .line 178
    .line 179
    .line 180
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 181
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    .line 182
    .line 183
    .line 184
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 185
    .line 186
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportClassForName:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 187
    .line 188
    filled-new-array {v1, v2}, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->ofJSONB([B[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    if-eqz v7, :cond_a

    .line 197
    .line 198
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 199
    .line 200
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 201
    .line 202
    filled-new-array {v2}, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 207
    .line 208
    .line 209
    :cond_a
    move-object v6, v8

    .line 210
    goto :goto_6

    .line 211
    :catchall_0
    move-exception v0

    .line 212
    move-object v7, v1

    .line 213
    :goto_5
    move-object v1, v0

    .line 214
    goto :goto_7

    .line 215
    :goto_6
    const/4 v8, 0x0

    .line 216
    const/4 v9, 0x0

    .line 217
    move-object v7, v1

    .line 218
    :try_start_2
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 222
    if-eqz v7, :cond_b

    .line 223
    .line 224
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    .line 225
    .line 226
    .line 227
    :cond_b
    return-object v0

    .line 228
    :catchall_1
    move-exception v0

    .line 229
    goto :goto_5

    .line 230
    :goto_7
    if-eqz v7, :cond_c

    .line 231
    .line 232
    :try_start_3
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 233
    .line 234
    .line 235
    goto :goto_8

    .line 236
    :catchall_2
    move-exception v0

    .line 237
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    :cond_c
    :goto_8
    throw v1

    .line 241
    :catchall_3
    move-exception v0

    .line 242
    move-object v2, v0

    .line 243
    if-eqz v1, :cond_d

    .line 244
    .line 245
    :try_start_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 246
    .line 247
    .line 248
    goto :goto_9

    .line 249
    :catchall_4
    move-exception v0

    .line 250
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 251
    .line 252
    .line 253
    :cond_d
    :goto_9
    throw v2
.end method

.method public static varargs copyTo(Ljava/lang/Object;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONWriter$Feature;",
            ")TT;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    move v5, v2

    .line 15
    move v6, v5

    .line 16
    move v7, v6

    .line 17
    :goto_0
    array-length v8, v0

    .line 18
    if-ge v5, v8, :cond_3

    .line 19
    .line 20
    aget-object v8, v0, v5

    .line 21
    .line 22
    iget-wide v9, v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    or-long/2addr v3, v9

    .line 25
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 26
    .line 27
    const/4 v10, 0x1

    .line 28
    if-ne v8, v9, :cond_1

    .line 29
    .line 30
    move v6, v10

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 33
    .line 34
    if-ne v8, v9, :cond_2

    .line 35
    .line 36
    move v7, v10

    .line 37
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 41
    .line 42
    invoke-virtual {v5, v1, v1, v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 47
    .line 48
    move-object/from16 v5, p1

    .line 49
    .line 50
    invoke-virtual {v1, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    instance-of v5, v8, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 55
    .line 56
    if-eqz v5, :cond_c

    .line 57
    .line 58
    instance-of v5, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    .line 59
    .line 60
    if-eqz v5, :cond_c

    .line 61
    .line 62
    invoke-interface {v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->getFieldWriters()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    instance-of v5, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;

    .line 67
    .line 68
    if-eqz v5, :cond_5

    .line 69
    .line 70
    new-instance v5, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-direct {v5, v6}, Ljava/util/HashMap;-><init>(I)V

    .line 77
    .line 78
    .line 79
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-ge v2, v6, :cond_4

    .line 84
    .line 85
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    check-cast v6, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 90
    .line 91
    invoke-virtual {v6, p0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    iget-object v6, v6, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-interface {v1, v5, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_5
    invoke-interface {v1, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    move v4, v2

    .line 113
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-ge v4, v5, :cond_b

    .line 118
    .line 119
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 124
    .line 125
    iget-object v6, v5, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 126
    .line 127
    invoke-interface {v1, v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    if-nez v6, :cond_6

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_6
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    iget-object v8, v5, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 139
    .line 140
    const-class v9, Ljava/util/Date;

    .line 141
    .line 142
    const-class v10, Ljava/lang/String;

    .line 143
    .line 144
    if-ne v8, v9, :cond_7

    .line 145
    .line 146
    iget-object v9, v6, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 147
    .line 148
    if-ne v9, v10, :cond_7

    .line 149
    .line 150
    check-cast v7, Ljava/util/Date;

    .line 151
    .line 152
    iget-object v5, v5, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v7, v5}, Lcom/alibaba/fastjson2/util/DateUtils;->format(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    goto :goto_4

    .line 159
    :cond_7
    const-class v9, Ljava/time/LocalDate;

    .line 160
    .line 161
    if-ne v8, v9, :cond_8

    .line 162
    .line 163
    iget-object v8, v6, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 164
    .line 165
    if-ne v8, v10, :cond_8

    .line 166
    .line 167
    check-cast v7, Ljava/time/LocalDate;

    .line 168
    .line 169
    iget-object v5, v5, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v7, v5}, Lcom/alibaba/fastjson2/util/DateUtils;->format(Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    goto :goto_4

    .line 176
    :cond_8
    if-eqz v7, :cond_a

    .line 177
    .line 178
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v6, v5}, Lcom/alibaba/fastjson2/reader/FieldReader;->supportAcceptType(Ljava/lang/Class;)Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_9

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_9
    new-array v5, v2, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 190
    .line 191
    invoke-static {v7, v5}, Lcom/alibaba/fastjson2/JSON;->copy(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    :cond_a
    :goto_4
    invoke-virtual {v6, v3, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_b
    return-object v3

    .line 202
    :cond_c
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONWriter;->ofJSONB([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Lcom/alibaba/fastjson2/JSONWriter;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    :try_start_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 207
    .line 208
    filled-new-array {v0}, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v9, v0}, Lcom/alibaba/fastjson2/JSONWriter;->config([Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 213
    .line 214
    .line 215
    const/4 v12, 0x0

    .line 216
    const-wide/16 v13, 0x0

    .line 217
    .line 218
    const/4 v11, 0x0

    .line 219
    move-object v10, p0

    .line 220
    invoke-interface/range {v8 .. v14}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9}, Lcom/alibaba/fastjson2/JSONWriter;->getBytes()[B

    .line 224
    .line 225
    .line 226
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 227
    invoke-virtual {v9}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    .line 228
    .line 229
    .line 230
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 231
    .line 232
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportClassForName:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 233
    .line 234
    filled-new-array {v0, v2}, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->ofJSONB([B[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    if-eqz v7, :cond_d

    .line 243
    .line 244
    :try_start_1
    iget-object p0, v10, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 245
    .line 246
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 247
    .line 248
    filled-new-array {v0}, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :catchall_0
    move-exception v0

    .line 257
    move-object p0, v0

    .line 258
    goto :goto_7

    .line 259
    :cond_d
    :goto_6
    const/4 v12, 0x0

    .line 260
    const-wide/16 v13, 0x0

    .line 261
    .line 262
    const/4 v11, 0x0

    .line 263
    move-object v9, v1

    .line 264
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 268
    if-eqz v10, :cond_e

    .line 269
    .line 270
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    .line 271
    .line 272
    .line 273
    :cond_e
    return-object p0

    .line 274
    :goto_7
    if-eqz v10, :cond_f

    .line 275
    .line 276
    :try_start_2
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 277
    .line 278
    .line 279
    goto :goto_8

    .line 280
    :catchall_1
    move-exception v0

    .line 281
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    :cond_f
    :goto_8
    throw p0

    .line 285
    :catchall_2
    move-exception v0

    .line 286
    move-object p0, v0

    .line 287
    if-eqz v9, :cond_10

    .line 288
    .line 289
    :try_start_3
    invoke-virtual {v9}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 290
    .line 291
    .line 292
    goto :goto_9

    .line 293
    :catchall_3
    move-exception v0

    .line 294
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    :cond_10
    :goto_9
    throw p0
.end method

.method public static isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z
    .locals 4

    .line 1
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 4
    .line 5
    and-long/2addr v0, v2

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    cmp-long p0, v0, v2

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public static isEnabled(Lcom/alibaba/fastjson2/JSONWriter$Feature;)Z
    .locals 4

    .line 16
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isValid(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 65
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    .line 66
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 68
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    move v1, v0

    .line 69
    :goto_0
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return v1

    :goto_1
    if-eqz p0, :cond_2

    .line 70
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    throw v1
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_3
    :goto_3
    return v0
.end method

.method public static varargs isValid(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move p1, v0

    .line 37
    :goto_0
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0

    .line 38
    .line 39
    .line 40
    return p1

    .line 41
    :goto_1
    if-eqz p0, :cond_2

    .line 42
    .line 43
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catchall_1
    move-exception p0

    .line 48
    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_2
    throw p1
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0

    .line 52
    :catch_0
    :cond_3
    :goto_3
    return v0
.end method

.method public static isValid([B)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 59
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_3

    .line 60
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of([B)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 62
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    move v1, v0

    .line 63
    :goto_0
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return v1

    :goto_1
    if-eqz p0, :cond_2

    .line 64
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    throw v1
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_3
    :goto_3
    return v0
.end method

.method public static isValid([BIILjava/nio/charset/Charset;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 73
    array-length v1, p0

    if-eqz v1, :cond_3

    if-nez p2, :cond_0

    goto :goto_3

    .line 74
    :cond_0
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 76
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    move p1, v0

    .line 77
    :goto_0
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return p1

    :goto_1
    if-eqz p0, :cond_2

    .line 78
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    throw p1
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_3
    :goto_3
    return v0
.end method

.method public static isValid([BLjava/nio/charset/Charset;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 71
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lcom/alibaba/fastjson2/JSON;->isValid([BIILjava/nio/charset/Charset;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method public static isValid([C)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 53
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_3

    .line 54
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of([C)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 56
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    move v1, v0

    .line 57
    :goto_0
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return v1

    :goto_1
    if-eqz p0, :cond_2

    .line 58
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    throw v1
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_3
    :goto_3
    return v0
.end method

.method public static isValidArray(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 22
    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v0

    .line 43
    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 44
    .line 45
    .line 46
    return v1

    .line 47
    :goto_1
    if-eqz p0, :cond_3

    .line 48
    .line 49
    :try_start_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_1
    move-exception p0

    .line 54
    :try_start_6
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_2
    throw v1
    :try_end_6
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    .line 58
    :catch_0
    :cond_4
    :goto_3
    return v0
.end method

.method public static isValidArray([B)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 59
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_3

    .line 60
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of([B)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    .line 62
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return v0

    .line 63
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 64
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_2
    move v1, v0

    .line 65
    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    return v1

    :goto_1
    if-eqz p0, :cond_3

    .line 66
    :try_start_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    :try_start_6
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw v1
    :try_end_6
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    :cond_4
    :goto_3
    return v0
.end method

.method public static isValidObject(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isObject()Z

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 22
    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v0

    .line 43
    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 44
    .line 45
    .line 46
    return v1

    .line 47
    :goto_1
    if-eqz p0, :cond_3

    .line 48
    .line 49
    :try_start_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_1
    move-exception p0

    .line 54
    :try_start_6
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_2
    throw v1
    :try_end_6
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    .line 58
    :catch_0
    :cond_4
    :goto_3
    return v0
.end method

.method public static isValidObject([B)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 59
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_3

    .line 60
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of([B)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isObject()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    .line 62
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return v0

    .line 63
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 64
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_2
    move v1, v0

    .line 65
    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_4
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    return v1

    :goto_1
    if-eqz p0, :cond_3

    .line 66
    :try_start_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    :try_start_6
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw v1
    :try_end_6
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    :cond_4
    :goto_3
    return v0
.end method

.method public static mixIn(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixIn(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixIn(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static parse(Ljava/io/InputStream;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 220
    :cond_0
    const-class v0, Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v1

    .line 221
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    invoke-direct {v2, p1, p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    .line 222
    :try_start_0
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 223
    iget-char v0, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_2

    iget-wide v0, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v3

    const-wide/16 v3, 0x0

    cmp-long p1, v0, v3

    if-eqz p1, :cond_1

    goto :goto_0

    .line 224
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 225
    :cond_2
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    .line 226
    :goto_1
    :try_start_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static parse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 12

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v3, v1, p0, v4, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 35
    .line 36
    const-wide/16 v8, 0x0

    .line 37
    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 41
    .line 42
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 43
    .line 44
    iget-wide v10, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 45
    .line 46
    and-long/2addr v5, v10

    .line 47
    cmp-long v2, v5, v8

    .line 48
    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    const/16 v2, 0x7b

    .line 52
    .line 53
    if-eq p0, v2, :cond_1

    .line 54
    .line 55
    const/16 v5, 0x5b

    .line 56
    .line 57
    if-ne p0, v5, :cond_3

    .line 58
    .line 59
    :cond_1
    if-ne p0, v2, :cond_2

    .line 60
    .line 61
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 62
    .line 63
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, p0, v8, v9}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    move-object p0, v0

    .line 72
    goto :goto_3

    .line 73
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 74
    .line 75
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    iget-object v0, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const-class p0, Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {v0, p0, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const/4 v5, 0x0

    .line 96
    const-wide/16 v6, 0x0

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :cond_4
    :goto_1
    iget-char v0, v3, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 104
    .line 105
    const/16 v2, 0x1a

    .line 106
    .line 107
    if-eq v0, v2, :cond_6

    .line 108
    .line 109
    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 110
    .line 111
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 112
    .line 113
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 114
    .line 115
    and-long/2addr v0, v4

    .line 116
    cmp-long v0, v0, v8

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 122
    .line 123
    const-string v0, "input not end"

    .line 124
    .line 125
    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :cond_6
    :goto_2
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :goto_3
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :goto_4
    throw p0

    .line 146
    :cond_7
    :goto_5
    const/4 p0, 0x0

    .line 147
    return-object p0
.end method

.method public static varargs parse(Ljava/lang/String;II[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 9

    if-eqz p0, :cond_4

    .line 158
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    if-nez p2, :cond_0

    goto :goto_3

    .line 159
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    move-result-object v0

    .line 160
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 161
    const-class p3, Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, p3, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v3

    .line 162
    invoke-static {p0, p1, p2, v1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;IILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v4

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    .line 163
    :try_start_0
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 164
    iget-char p1, v4, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_2

    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_1

    goto :goto_0

    .line 165
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 166
    :cond_2
    :goto_0
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_1
    if-eqz v4, :cond_3

    .line 167
    :try_start_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw p0

    :cond_4
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parse(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 7

    if-eqz p0, :cond_3

    .line 168
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 169
    :cond_0
    const-class v0, Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v1

    .line 170
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v2, p1, p0, v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    .line 171
    :try_start_0
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 172
    iget-char v0, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_2

    iget-wide v0, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v3

    const-wide/16 v3, 0x0

    cmp-long p1, v0, v3

    if-eqz p1, :cond_1

    goto :goto_0

    .line 173
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 174
    :cond_2
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 175
    :goto_1
    :try_start_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_3
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parse(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 9

    if-eqz p0, :cond_3

    .line 148
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 149
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    move-result-object v0

    .line 150
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 151
    const-class p1, Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v3

    .line 152
    new-instance v4, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-direct {v4, v1, p0, v2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    .line 153
    :try_start_0
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 154
    iget-char p1, v4, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_2

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    goto :goto_0

    .line 155
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 156
    :cond_2
    :goto_0
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 157
    :goto_1
    :try_start_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_3
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parse([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 7

    if-eqz p0, :cond_4

    .line 184
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_3

    .line 185
    :cond_0
    const-class v0, Ljava/lang/Object;

    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v1

    .line 186
    invoke-static {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v2

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    .line 187
    :try_start_0
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 188
    iget-char p1, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_2

    iget-wide p1, p4, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide p3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, p3

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-eqz p1, :cond_1

    goto :goto_0

    .line 189
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 190
    :cond_2
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_1
    if-eqz v2, :cond_3

    .line 191
    :try_start_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw p0

    :cond_4
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parse([BLcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 8

    if-eqz p0, :cond_3

    .line 176
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_3

    .line 177
    :cond_0
    const-class v0, Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v1

    .line 178
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v6, 0x0

    array-length v7, p0

    const/4 v4, 0x0

    move-object v5, p0

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    move-object p0, v3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    .line 179
    :try_start_0
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    .line 180
    iget-char v0, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_2

    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v3

    const-wide/16 v3, 0x0

    cmp-long p0, v0, v3

    if-eqz p0, :cond_1

    goto :goto_0

    .line 181
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 182
    :cond_2
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p1

    .line 183
    :goto_1
    :try_start_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_3
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parse([B[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 9

    if-eqz p0, :cond_3

    .line 192
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_4

    .line 193
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    move-result-object v0

    .line 194
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 195
    const-class p1, Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    .line 196
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, v1

    .line 197
    :try_start_0
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 198
    :try_start_1
    iget-char p1, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_2

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_1

    goto :goto_1

    .line 199
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    :goto_0
    move-object p0, v0

    goto :goto_2

    .line 200
    :cond_2
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v4

    goto :goto_0

    .line 201
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_3
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parse([CLcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 7

    if-eqz p0, :cond_4

    .line 202
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_3

    .line 203
    :cond_0
    const-class v0, Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v1

    .line 204
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->of([CLcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v2

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    .line 205
    :try_start_0
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 206
    iget-char v0, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_2

    iget-wide v0, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v3

    const-wide/16 v3, 0x0

    cmp-long p1, v0, v3

    if-eqz p1, :cond_1

    goto :goto_0

    .line 207
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 208
    :cond_2
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_1
    if-eqz v2, :cond_3

    .line 209
    :try_start_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw p0

    :cond_4
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parse([C[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 9

    if-eqz p0, :cond_3

    .line 210
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_4

    .line 211
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    move-result-object v0

    .line 212
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 213
    const-class p1, Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    .line 214
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, v1

    .line 215
    :try_start_0
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 216
    :try_start_1
    iget-char p1, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_2

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_1

    goto :goto_1

    .line 217
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    :goto_0
    move-object p0, v0

    goto :goto_2

    .line 218
    :cond_2
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v4

    goto :goto_0

    .line 219
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_3
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseArray(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 194
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 195
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 196
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 197
    :cond_1
    :try_start_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 198
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 199
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 200
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 201
    :cond_2
    :goto_0
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_4

    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_3

    goto :goto_1

    .line 202
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "input not end"

    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_5

    .line 204
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1
.end method

.method public static varargs parseArray(Ljava/io/InputStream;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 181
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 182
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 183
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p0, p1, v2}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 184
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 185
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 186
    :cond_1
    :try_start_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 187
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 188
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 189
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 190
    :cond_2
    :goto_0
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_4

    iget-wide v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    goto :goto_1

    .line 191
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_5

    .line 193
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1
.end method

.method public static parseArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 271
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    .line 272
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 273
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 274
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v1, v2, p0, v3, v4}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 275
    :try_start_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 276
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    .line 277
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 278
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 279
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 280
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 281
    :cond_2
    :goto_0
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_3

    goto :goto_1

    .line 282
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 283
    :cond_4
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 284
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static varargs parseArray(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 162
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    .line 163
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 164
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 165
    new-instance p1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {p1, v2, p0, v1, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 166
    :try_start_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 167
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    .line 168
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 169
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 170
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 171
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 172
    :cond_2
    :goto_0
    iget-char v0, p1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_4

    iget-wide v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    goto :goto_1

    .line 173
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 175
    :goto_2
    :try_start_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static varargs parseArray(Ljava/net/URL;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 176
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    :try_start_1
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSON;->parseArray(Ljava/io/InputStream;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    .line 178
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_2

    .line 179
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 180
    :goto_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSON#parseArray cannot parse \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' to \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p0, Lcom/alibaba/fastjson2/JSONArray;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static parseArray([B)Lcom/alibaba/fastjson2/JSONArray;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 120
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_4

    .line 121
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 122
    new-instance v3, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v3, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 123
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v6, 0x0

    array-length v7, p0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 124
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 125
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object v0

    .line 126
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 127
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 128
    iget-object v0, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 129
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 130
    :cond_2
    :goto_0
    iget-char v0, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_4

    iget-wide v0, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v3

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    if-eqz v0, :cond_3

    goto :goto_1

    .line 131
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    .line 133
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static parseArray([BIILjava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 134
    array-length v1, p0

    if-eqz v1, :cond_6

    if-nez p2, :cond_0

    goto :goto_4

    .line 135
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 136
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 137
    invoke-static {p0, p1, p2, p3, v2}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 138
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 139
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 140
    :cond_1
    :try_start_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 141
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 142
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p2, :cond_2

    .line 143
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 144
    :cond_2
    :goto_0
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p3, 0x1a

    if-eq p2, p3, :cond_4

    iget-wide p2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v0

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    if-eqz p2, :cond_3

    goto :goto_1

    .line 145
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "input not end"

    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_5

    .line 147
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1

    :cond_6
    :goto_4
    return-object v0
.end method

.method public static parseArray([C)Lcom/alibaba/fastjson2/JSONArray;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 148
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_4

    .line 149
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 150
    new-instance v3, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v3, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 151
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v6, 0x0

    array-length v7, p0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    .line 152
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 153
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    .line 154
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 155
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 156
    iget-object v0, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 157
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 158
    :cond_2
    :goto_0
    iget-char v0, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_4

    iget-wide v0, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v3

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    if-eqz v0, :cond_3

    goto :goto_1

    .line 159
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 161
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static parseArray(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 227
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 228
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 229
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 230
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 231
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 232
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 233
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 234
    :cond_1
    :goto_0
    iget-char p1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v2, 0x1a

    if-eq p1, v2, :cond_3

    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-eqz p1, :cond_2

    goto :goto_1

    .line 235
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 237
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseArray(Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 249
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 250
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 251
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 252
    new-instance p2, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {p2, v1, p0, v0, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 253
    :try_start_0
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 254
    iget-object p1, p2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 255
    invoke-virtual {p2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 256
    :cond_1
    :goto_0
    iget-char p1, p2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_3

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    goto :goto_1

    .line 257
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    :cond_3
    :goto_1
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 259
    :goto_2
    :try_start_1
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseArray(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 216
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 217
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 218
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 219
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 220
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 221
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 222
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 223
    :cond_1
    :goto_0
    iget-char p1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v2, 0x1a

    if-eq p1, v2, :cond_3

    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-eqz p1, :cond_2

    goto :goto_1

    .line 224
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 226
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseArray(Ljava/lang/String;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 205
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 206
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 207
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 208
    new-instance p2, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {p2, v1, p0, v0, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 209
    :try_start_0
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 210
    iget-object p1, p2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 211
    invoke-virtual {p2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 212
    :cond_1
    :goto_0
    iget-char p1, p2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_3

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    goto :goto_1

    .line 213
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    :cond_3
    :goto_1
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 215
    :goto_2
    :try_start_1
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseArray(Ljava/lang/String;[Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 238
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 239
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 240
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 241
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 242
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader;->readList([Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 243
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 244
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 245
    :cond_1
    :goto_0
    iget-char p1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v2, 0x1a

    if-eq p1, v2, :cond_3

    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-eqz p1, :cond_2

    goto :goto_1

    .line 246
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 248
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseArray(Ljava/lang/String;[Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 12
    .line 13
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 14
    .line 15
    invoke-direct {v2, v1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {p2, v2, p0, v3, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_1
    :try_start_1
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 39
    .line 40
    .line 41
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    array-length v0, p1

    .line 44
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    array-length v0, p1

    .line 48
    if-ge v3, v0, :cond_2

    .line 49
    .line 50
    aget-object v0, p1, v3

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReader;->endArray()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    invoke-virtual {p2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    iget-char p1, p2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 75
    .line 76
    const/16 v0, 0x1a

    .line 77
    .line 78
    if-eq p1, v0, :cond_5

    .line 79
    .line 80
    iget-wide v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 81
    .line 82
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 83
    .line 84
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 85
    .line 86
    and-long/2addr v0, v2

    .line 87
    const-wide/16 v2, 0x0

    .line 88
    .line 89
    cmp-long p1, v0, v2

    .line 90
    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 95
    .line 96
    const-string p1, "input not end"

    .line 97
    .line 98
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    :cond_5
    :goto_1
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :goto_2
    :try_start_2
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :catchall_1
    move-exception p1

    .line 115
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    :goto_3
    throw p0

    .line 119
    :cond_6
    :goto_4
    return-object v0
.end method

.method public static varargs parseArray([BIILjava/nio/charset/Charset;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/nio/charset/Charset;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 307
    array-length v0, p0

    if-eqz v0, :cond_5

    if-nez p2, :cond_0

    goto :goto_4

    .line 308
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 309
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p5}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 310
    invoke-static {p0, p1, p2, p3, v1}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 311
    :try_start_0
    invoke-virtual {p0, p4}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p1

    .line 312
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p2, :cond_1

    .line 313
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 314
    :cond_1
    :goto_0
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p3, 0x1a

    if-eq p2, p3, :cond_3

    iget-wide p2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide p4, p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, p4

    const-wide/16 p4, 0x0

    cmp-long p2, p2, p4

    if-eqz p2, :cond_2

    goto :goto_1

    .line 315
    :cond_2
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "input not end"

    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 316
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_4

    .line 317
    :try_start_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    throw p1

    :cond_5
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseArray([BLjava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 296
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_4

    .line 297
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 298
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 299
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 300
    :try_start_0
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 301
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 302
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 303
    :cond_1
    :goto_0
    iget-char p1, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_3

    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_2

    goto :goto_1

    .line 304
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    .line 306
    :goto_2
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseArray([BLjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 285
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_4

    .line 286
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 287
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 288
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 289
    :try_start_0
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 290
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 291
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 292
    :cond_1
    :goto_0
    iget-char p1, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_3

    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_2

    goto :goto_1

    .line 293
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    .line 295
    :goto_2
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseArray([CLjava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([C",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 260
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_4

    .line 261
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 262
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 263
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    .line 264
    :try_start_0
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 265
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 266
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 267
    :cond_1
    :goto_0
    iget-char p1, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_3

    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_2

    goto :goto_1

    .line 268
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 270
    :goto_2
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 370
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    .line 371
    invoke-static {p0, p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 372
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 373
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 374
    :cond_1
    :try_start_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v2, 0x0

    .line 375
    invoke-virtual {p0, p1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 376
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 377
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 378
    :cond_2
    :goto_0
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq v0, v4, :cond_4

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    goto :goto_1

    .line 379
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 380
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_5

    .line 381
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1
.end method

.method public static parseObject(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 382
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 383
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 384
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 385
    :cond_1
    :try_start_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v0, 0x0

    .line 386
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 387
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v2, :cond_2

    .line 388
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 389
    :cond_2
    :goto_0
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v2, v3, :cond_4

    iget-wide v2, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long p2, v2, v0

    if-eqz p2, :cond_3

    goto :goto_1

    .line 390
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "input not end"

    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 391
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_5

    .line 392
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1
.end method

.method public static varargs parseObject(Ljava/io/InputStream;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 332
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p1

    .line 333
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p0, v1, p1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 334
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 335
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 336
    :cond_1
    :try_start_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v1, 0x0

    .line 337
    invoke-virtual {p0, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 338
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v3, :cond_2

    .line 339
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 340
    :cond_2
    :goto_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_4

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    cmp-long p1, v3, v1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 341
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 342
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    :goto_2
    if-eqz p0, :cond_5

    .line 343
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1
.end method

.method public static varargs parseObject(Ljava/io/Reader;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 320
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p1

    .line 321
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/Reader;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 322
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 323
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 324
    :cond_1
    :try_start_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v1, 0x0

    .line 325
    invoke-virtual {p0, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 326
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v3, :cond_2

    .line 327
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 328
    :cond_2
    :goto_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_4

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    cmp-long p1, v3, v1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 329
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 330
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    :goto_2
    if-eqz p0, :cond_5

    .line 331
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1
.end method

.method public static parseObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 962
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    .line 963
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 964
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v2, v1, p0, v3, v4}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 965
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 966
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    .line 967
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v3, 0x0

    .line 968
    invoke-virtual {v2, p0, v3, v4}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 969
    iget-object v0, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 970
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 971
    :cond_2
    :goto_0
    iget-char v0, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v5, 0x1a

    if-eq v0, v5, :cond_4

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v5

    cmp-long v0, v0, v3

    if-eqz v0, :cond_3

    goto :goto_1

    .line 972
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 973
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 974
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static parseObject(Ljava/lang/String;IILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 296
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    if-nez p2, :cond_0

    goto :goto_4

    .line 297
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;IILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 298
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 299
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 300
    :cond_1
    :try_start_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v0, 0x0

    .line 301
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 302
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p2, :cond_2

    .line 303
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 304
    :cond_2
    :goto_0
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v2, 0x1a

    if-eq p2, v2, :cond_4

    iget-wide p2, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v2

    cmp-long p2, p2, v0

    if-eqz p2, :cond_3

    goto :goto_1

    .line 305
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "input not end"

    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 306
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_5

    .line 307
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1

    :cond_6
    :goto_4
    return-object v0
.end method

.method public static varargs parseObject(Ljava/lang/String;II[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 283
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    if-nez p2, :cond_0

    goto :goto_4

    .line 284
    :cond_0
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p3

    .line 285
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;IILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 286
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 287
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 288
    :cond_1
    :try_start_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v0, 0x0

    .line 289
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 290
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p2, :cond_2

    .line 291
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 292
    :cond_2
    :goto_0
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v2, 0x1a

    if-eq p2, v2, :cond_4

    iget-wide p2, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v2

    cmp-long p2, p2, v0

    if-eqz p2, :cond_3

    goto :goto_1

    .line 293
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "input not end"

    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 294
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_5

    .line 295
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1

    :cond_6
    :goto_4
    return-object v0
.end method

.method public static parseObject(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 308
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    .line 309
    :cond_0
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 310
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 311
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 312
    :cond_1
    :try_start_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v1, 0x0

    .line 313
    invoke-virtual {p0, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 314
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v3, :cond_2

    .line 315
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 316
    :cond_2
    :goto_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_4

    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    cmp-long p1, v3, v1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 317
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 318
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    :goto_2
    if-eqz p0, :cond_5

    .line 319
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1

    :cond_6
    :goto_4
    return-object v0
.end method

.method public static varargs parseObject(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 270
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    .line 271
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p1

    .line 272
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v1, p1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 273
    :try_start_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 274
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    .line 275
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v2, 0x0

    .line 276
    invoke-virtual {v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 277
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 278
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 279
    :cond_2
    :goto_0
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq v0, v4, :cond_4

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v6, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v4, v6

    cmp-long p1, v4, v2

    if-eqz p1, :cond_3

    goto :goto_1

    .line 280
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 281
    :cond_4
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 282
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static parseObject(Ljava/net/URL;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 393
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 394
    :try_start_1
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/JSON;->parseObject(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONObject;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    .line 395
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    return-object v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_2

    .line 396
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 397
    :goto_1
    const-string v1, "JSON#parseObject cannot parse \'"

    const-string v2, "\'"

    invoke-static {v1, p0, v2, v0}, Lah/a;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject([B)Lcom/alibaba/fastjson2/JSONObject;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 344
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_4

    .line 345
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v3

    .line 346
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v6, 0x0

    array-length v7, p0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 347
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 348
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object v0

    .line 349
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v0, 0x0

    .line 350
    invoke-virtual {v2, p0, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 351
    iget-object v4, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v4, :cond_2

    .line 352
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 353
    :cond_2
    :goto_0
    iget-char v4, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_4

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    cmp-long v0, v3, v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 354
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 355
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    .line 356
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static varargs parseObject([BIILjava/nio/charset/Charset;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 437
    array-length v1, p0

    if-eqz v1, :cond_6

    if-nez p2, :cond_0

    goto :goto_4

    .line 438
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    .line 439
    invoke-static {p0, p1, p2, p3, v1}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    .line 440
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 441
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    .line 442
    :cond_1
    :try_start_1
    invoke-virtual {v1, p4}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 443
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 p2, 0x0

    .line 444
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 445
    iget-object p4, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p4, :cond_2

    .line 446
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 447
    :cond_2
    :goto_0
    iget-char p4, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p4, v0, :cond_4

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    cmp-long p2, v0, p2

    if-eqz p2, :cond_3

    goto :goto_1

    .line 448
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "input not end"

    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 449
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p1

    :goto_2
    if-eqz p0, :cond_5

    .line 450
    :try_start_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p1

    :cond_6
    :goto_4
    return-object v0
.end method

.method public static varargs parseObject([BII[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 411
    array-length v1, p0

    if-eqz v1, :cond_5

    if-nez p2, :cond_0

    goto :goto_4

    .line 412
    :cond_0
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v3

    .line 413
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v4, 0x0

    move-object v5, p0

    move v6, p1

    move v7, p2

    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 414
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 415
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object v0

    .line 416
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 p1, 0x0

    .line 417
    invoke-virtual {v2, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 418
    iget-object p3, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p3, :cond_2

    .line 419
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 420
    :cond_2
    :goto_0
    iget-char p3, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p3, v0, :cond_4

    iget-wide v0, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v3

    cmp-long p1, v0, p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 421
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 422
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    .line 423
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static varargs parseObject([B[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 398
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_4

    .line 399
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v3

    .line 400
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v6, 0x0

    array-length v7, p0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 401
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 402
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object v0

    .line 403
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v0, 0x0

    .line 404
    invoke-virtual {v2, p0, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 405
    iget-object p1, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 406
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 407
    :cond_2
    :goto_0
    iget-char p1, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq p1, v4, :cond_4

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    cmp-long p1, v3, v0

    if-eqz p1, :cond_3

    goto :goto_1

    .line 408
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 409
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    .line 410
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static parseObject([C)Lcom/alibaba/fastjson2/JSONObject;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 357
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_4

    .line 358
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v3

    .line 359
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v6, 0x0

    array-length v7, p0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    .line 360
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 361
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    .line 362
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 v0, 0x0

    .line 363
    invoke-virtual {v2, p0, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 364
    iget-object v4, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v4, :cond_2

    .line 365
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 366
    :cond_2
    :goto_0
    iget-char v4, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_4

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    cmp-long v0, v3, v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 367
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 368
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 369
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static varargs parseObject([CII[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 424
    array-length v1, p0

    if-eqz v1, :cond_5

    if-nez p2, :cond_0

    goto :goto_4

    .line 425
    :cond_0
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v3

    .line 426
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v4, 0x0

    move-object v5, p0

    move v6, p1

    move v7, p2

    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    .line 427
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    .line 428
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    .line 429
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    const-wide/16 p1, 0x0

    .line 430
    invoke-virtual {v2, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 431
    iget-object p3, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p3, :cond_2

    .line 432
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 433
    :cond_2
    :goto_0
    iget-char p3, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p3, v0, :cond_4

    iget-wide v0, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v3

    cmp-long p1, v0, p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 434
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 435
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 436
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static varargs parseObject(Ljava/io/InputStream;Ljava/lang/reflect/Type;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 909
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 910
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    if-eqz p2, :cond_1

    .line 911
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    .line 912
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 913
    :cond_1
    iget-wide p2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v2

    const-wide/16 v2, 0x0

    cmp-long p2, p2, v2

    if-eqz p2, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 914
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v4

    .line 915
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p0, p2, v1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v5

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v6, p1

    .line 916
    :try_start_0
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 917
    iget-object p1, v5, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 918
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 919
    :cond_3
    :goto_1
    iget-char p1, v5, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_5

    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_4

    goto :goto_2

    .line 920
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v5, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 921
    :cond_5
    :goto_2
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_3
    if-eqz v5, :cond_6

    .line 922
    :try_start_1
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_4
    throw p0
.end method

.method public static varargs parseObject(Ljava/io/InputStream;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 854
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 855
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 856
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long p2, v3, v5

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 857
    :goto_0
    invoke-virtual {v1, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v7

    .line 858
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p0, p2, v2}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v8

    .line 859
    :try_start_0
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    .line 860
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    :cond_2
    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v9, p1

    .line 861
    :try_start_1
    invoke-interface/range {v7 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 862
    iget-object p1, v8, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 863
    invoke-virtual {v8, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 864
    :cond_3
    :goto_1
    iget-char p1, v8, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_5

    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v5

    if-eqz p1, :cond_4

    goto :goto_2

    .line 865
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v8, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 866
    :cond_5
    :goto_2
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_3
    if-eqz v8, :cond_6

    .line 867
    :try_start_2
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_4
    throw p0
.end method

.method public static parseObject(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/nio/charset/Charset;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 880
    :cond_0
    iget-wide v1, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 881
    :goto_0
    iget-object v2, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v2, p2, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v5

    .line 882
    invoke-static {p0, p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v6

    .line 883
    :try_start_0
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    .line 884
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    :cond_2
    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move-object v7, p2

    .line 885
    :try_start_1
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 886
    iget-object p1, v6, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 887
    invoke-virtual {v6, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 888
    :cond_3
    :goto_1
    iget-char p1, v6, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_5

    iget-wide p1, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v3

    if-eqz p1, :cond_4

    goto :goto_2

    .line 889
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v6, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 890
    :cond_5
    :goto_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_3
    if-eqz v6, :cond_6

    .line 891
    :try_start_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_4
    throw p0
.end method

.method public static parseObject(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/nio/charset/Charset;",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 868
    :cond_0
    iget-wide v1, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 869
    :goto_0
    iget-object v2, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v2, p2, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v5

    .line 870
    invoke-static {p0, p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v6

    .line 871
    :try_start_0
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    .line 872
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object v0

    :cond_2
    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move-object v7, p2

    .line 873
    :try_start_1
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 874
    iget-object p1, v6, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 875
    invoke-virtual {v6, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 876
    :cond_3
    :goto_1
    iget-char p1, v6, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_5

    iget-wide p1, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v3

    if-eqz p1, :cond_4

    goto :goto_2

    .line 877
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v6, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 878
    :cond_5
    :goto_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_3
    if-eqz v6, :cond_6

    .line 879
    :try_start_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_4
    throw p0
.end method

.method public static varargs parseObject(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/nio/charset/Charset;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 923
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 924
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 925
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p3, v2, v4

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    .line 926
    :goto_0
    invoke-virtual {v0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v6

    .line 927
    invoke-static {p0, p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v7

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v8, p2

    .line 928
    :try_start_0
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 929
    iget-object p1, v7, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 930
    invoke-virtual {v7, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 931
    :cond_2
    :goto_1
    iget-char p1, v7, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_4

    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v4

    if-eqz p1, :cond_3

    goto :goto_2

    .line 932
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v7, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 933
    :cond_4
    :goto_2
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_3
    if-eqz v7, :cond_5

    .line 934
    :try_start_1
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_4
    throw p0
.end method

.method public static varargs parseObject(Ljava/io/Reader;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 840
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 841
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 842
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long p2, v3, v5

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 843
    :goto_0
    invoke-virtual {v1, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v7

    .line 844
    new-instance v8, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-direct {v8, v2, p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/Reader;)V

    .line 845
    :try_start_0
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    .line 846
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    :cond_2
    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v9, p1

    .line 847
    :try_start_1
    invoke-interface/range {v7 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 848
    iget-object p1, v8, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 849
    invoke-virtual {v8, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 850
    :cond_3
    :goto_1
    iget-char p1, v8, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_5

    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v5

    if-eqz p1, :cond_4

    goto :goto_2

    .line 851
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v8, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 852
    :cond_5
    :goto_2
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 853
    :goto_3
    :try_start_2
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0
.end method

.method public static varargs parseObject(Ljava/lang/String;IILjava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 567
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    if-nez p2, :cond_0

    goto :goto_6

    .line 568
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 569
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v3, p4

    invoke-direct {v2, v1, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 570
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    :goto_0
    move-object/from16 v9, p3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    goto :goto_0

    .line 571
    :goto_1
    invoke-virtual {v1, v9, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v7

    .line 572
    new-instance v8, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-direct {v8, v2, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    .line 573
    :try_start_0
    invoke-interface/range {v7 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 574
    iget-object p1, v8, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 575
    invoke-virtual {v8, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_4

    .line 576
    :cond_2
    :goto_2
    iget-char p1, v8, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_4

    iget-wide v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    cmp-long p1, v0, v5

    if-eqz p1, :cond_3

    goto :goto_3

    .line 577
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v8, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 578
    :cond_4
    :goto_3
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 579
    :goto_4
    :try_start_1
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0

    :cond_5
    :goto_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/lang/String;Lcom/alibaba/fastjson2/TypeReference;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/TypeReference<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 540
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    .line 541
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 542
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1, v0, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 543
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/TypeReference;->getType()Ljava/lang/reflect/Type;

    move-result-object v5

    .line 544
    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v3

    const-wide/16 v9, 0x0

    cmp-long p1, p1, v9

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, p2

    .line 545
    :goto_0
    invoke-virtual {v1, v5, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v3

    .line 546
    new-instance v4, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-direct {v4, v2, p0, p2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    .line 547
    :try_start_0
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 548
    iget-object p1, v4, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 549
    invoke-virtual {v4, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 550
    :cond_2
    :goto_1
    iget-char p1, v4, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_4

    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v9

    if-eqz p1, :cond_3

    goto :goto_2

    .line 551
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 552
    :cond_4
    :goto_2
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 553
    :goto_3
    :try_start_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_5
    :goto_5
    return-object v0
.end method

.method public static varargs parseObject(Ljava/lang/String;Lcom/alibaba/fastjson2/TypeReference;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/TypeReference<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 527
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_5

    .line 528
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 529
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 530
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/TypeReference;->getType()Ljava/lang/reflect/Type;

    move-result-object v4

    .line 531
    sget-wide p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v8, 0x0

    cmp-long p1, p1, v8

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    invoke-virtual {v0, v4, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    .line 532
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-direct {v3, v1, p0, p2, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    .line 533
    :try_start_0
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 534
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 535
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 536
    :cond_2
    :goto_1
    iget-char p1, v3, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_4

    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v8

    if-eqz p1, :cond_3

    goto :goto_2

    .line 537
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v3, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 538
    :cond_4
    :goto_2
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 539
    :goto_3
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_5
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 451
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_5

    .line 452
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 453
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 454
    sget-wide v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-virtual {v0, p1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v6

    .line 455
    new-instance v7, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {v7, v1, p0, v3, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v8, p1

    .line 456
    :try_start_0
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 457
    iget-object p1, v7, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 458
    invoke-virtual {v7, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 459
    :cond_2
    :goto_1
    iget-char p1, v7, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_4

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    cmp-long p1, v0, v4

    if-eqz p1, :cond_3

    goto :goto_2

    .line 460
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v7, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 461
    :cond_4
    :goto_2
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 462
    :goto_3
    :try_start_1
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_5
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject(Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 580
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_5

    .line 581
    :cond_0
    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 582
    :goto_0
    iget-object v4, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v4, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v5

    .line 583
    new-instance v6, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {v6, p2, p0, v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move-object v7, p1

    .line 584
    :try_start_0
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 585
    iget-object p1, v6, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 586
    invoke-virtual {v6, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 587
    :cond_2
    :goto_1
    iget-char p1, v6, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_4

    iget-wide p1, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_2

    .line 588
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v6, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 589
    :cond_4
    :goto_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 590
    :goto_3
    :try_start_1
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_5
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 463
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    .line 464
    :cond_0
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext(Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p2

    .line 465
    iget-wide v1, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p3, v1, v3

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    goto :goto_0

    :cond_1
    move p3, v1

    .line 466
    :goto_0
    iget-object v2, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v2, p1, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v5

    .line 467
    new-instance v6, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p3

    invoke-direct {v6, p2, p0, v1, p3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 468
    :try_start_0
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    .line 469
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    :cond_2
    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move-object v7, p1

    .line 470
    :try_start_1
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 471
    iget-object p1, v6, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 472
    invoke-virtual {v6, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 473
    :cond_3
    :goto_1
    iget-char p1, v6, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p3, 0x1a

    if-eq p1, p3, :cond_5

    iget-wide p1, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v3

    if-eqz p1, :cond_4

    goto :goto_2

    .line 474
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v6, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 475
    :cond_5
    :goto_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 476
    :goto_3
    :try_start_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_6
    :goto_5
    return-object v0
.end method

.method public static varargs parseObject(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_6

    .line 591
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 592
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 593
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    if-eqz p2, :cond_1

    .line 594
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    .line 595
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 596
    :cond_1
    iget-wide p2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v2

    const-wide/16 v2, 0x0

    cmp-long p2, p2, v2

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    move p2, p3

    .line 597
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v4

    .line 598
    new-instance v5, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {v5, v1, p0, p3, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v6, p1

    .line 599
    :try_start_0
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 600
    iget-object p1, v5, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 601
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 602
    :cond_3
    :goto_1
    iget-char p1, v5, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_5

    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_4

    goto :goto_2

    .line 603
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v5, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 604
    :cond_5
    :goto_2
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 605
    :goto_3
    :try_start_1
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_6
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 554
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_5

    .line 555
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 556
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 557
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    move p2, v2

    .line 558
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v6

    .line 559
    new-instance v7, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {v7, v1, p0, v2, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v8, p1

    .line 560
    :try_start_0
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 561
    iget-object p1, v7, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 562
    invoke-virtual {v7, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 563
    :cond_2
    :goto_1
    iget-char p1, v7, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_4

    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v4

    if-eqz p1, :cond_3

    goto :goto_2

    .line 564
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v7, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 565
    :cond_4
    :goto_2
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 566
    :goto_3
    :try_start_1
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_5
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 492
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 493
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 494
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 495
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 496
    :try_start_0
    sget-wide v5, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v7, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v5, v7

    const-wide/16 v8, 0x0

    cmp-long p0, v5, v8

    if-eqz p0, :cond_1

    const/4 v4, 0x1

    :cond_1
    invoke-virtual {v0, p1, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v4, p1

    .line 497
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 498
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 499
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 500
    :cond_2
    :goto_0
    iget-char p1, v3, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_4

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v4

    cmp-long p1, v0, v8

    if-eqz p1, :cond_3

    goto :goto_1

    .line 501
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v3, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 502
    :cond_4
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 503
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject(Ljava/lang/String;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 504
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 505
    :cond_0
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v1

    .line 506
    invoke-static {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v2

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v3, p1

    .line 507
    :try_start_0
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 508
    iget-object p1, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 509
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 510
    :cond_1
    :goto_0
    iget-char p1, v2, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_3

    iget-wide p1, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_2

    goto :goto_1

    .line 511
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 512
    :cond_3
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_2
    if-eqz v2, :cond_4

    .line 513
    :try_start_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    throw p0

    :cond_5
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/lang/String;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 619
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    .line 620
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 621
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1, v0, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 622
    iget-wide p2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v3

    const-wide/16 v3, 0x0

    cmp-long p2, p2, v3

    const/4 p3, 0x0

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    move p2, p3

    .line 623
    :goto_0
    invoke-virtual {v1, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v5

    .line 624
    new-instance v6, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {v6, v2, p0, p3, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move-object v7, p1

    .line 625
    :try_start_0
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 626
    iget-object p1, v6, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 627
    invoke-virtual {v6, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 628
    :cond_2
    :goto_1
    iget-char p1, v6, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_4

    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v3

    if-eqz p1, :cond_3

    goto :goto_2

    .line 629
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v6, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 630
    :cond_4
    :goto_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 631
    :goto_3
    :try_start_1
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_5
    :goto_5
    return-object v0
.end method

.method public static varargs parseObject(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_6

    .line 632
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 633
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 634
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    if-eqz p2, :cond_1

    .line 635
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    .line 636
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 637
    :cond_1
    iget-wide p2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v2

    const-wide/16 v2, 0x0

    cmp-long p2, p2, v2

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    move p2, p3

    .line 638
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v4

    .line 639
    new-instance v5, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {v5, v1, p0, p3, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v6, p1

    .line 640
    :try_start_0
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 641
    iget-object p1, v5, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 642
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 643
    :cond_3
    :goto_1
    iget-char p1, v5, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_5

    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_4

    goto :goto_2

    .line 644
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v5, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 645
    :cond_5
    :goto_2
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 646
    :goto_3
    :try_start_1
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_6
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/String;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 477
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    .line 478
    :cond_0
    invoke-static {p3, p4}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p3

    .line 479
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 480
    iget-wide v1, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    const/4 p4, 0x0

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    move p2, p4

    .line 481
    :goto_0
    iget-object v1, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v1, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v5

    .line 482
    new-instance v6, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {v6, p3, p0, p4, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 483
    :try_start_0
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfNull()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    .line 484
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object v0

    :cond_2
    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move-object v7, p1

    .line 485
    :try_start_1
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 486
    iget-object p1, v6, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 487
    invoke-virtual {v6, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 488
    :cond_3
    :goto_1
    iget-char p1, v6, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_5

    iget-wide p1, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide p3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, p3

    cmp-long p1, p1, v3

    if-eqz p1, :cond_4

    goto :goto_2

    .line 489
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v6, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 490
    :cond_5
    :goto_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 491
    :goto_3
    :try_start_2
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_6
    :goto_5
    return-object v0
.end method

.method public static varargs parseObject(Ljava/lang/String;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 606
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_5

    .line 607
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 608
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 609
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    move p2, v2

    .line 610
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v6

    .line 611
    new-instance v7, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {v7, v1, p0, v2, p2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v8, p1

    .line 612
    :try_start_0
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 613
    iget-object p1, v7, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 614
    invoke-virtual {v7, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 615
    :cond_2
    :goto_1
    iget-char p1, v7, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_4

    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v4

    if-eqz p1, :cond_3

    goto :goto_2

    .line 616
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v7, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 617
    :cond_4
    :goto_2
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 618
    :goto_3
    :try_start_1
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_5
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/lang/String;[Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .line 526
    new-instance v0, Lcom/alibaba/fastjson2/util/MultiType;

    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/util/MultiType;-><init>([Ljava/lang/reflect/Type;)V

    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/JSON;->parseObject(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/net/URL;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/net/URL;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 897
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 898
    :try_start_1
    invoke-static {v0, p1, p2}, Lcom/alibaba/fastjson2/JSON;->parseObject(Ljava/io/InputStream;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    .line 899
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    return-object p2

    :catchall_0
    move-exception p2

    if-eqz v0, :cond_2

    .line 900
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 901
    :goto_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSON#parseObject cannot parse \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' to \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static varargs parseObject(Ljava/net/URL;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/net/URL;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 892
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 893
    :try_start_1
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/JSON;->parseObject(Ljava/io/InputStream;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_1

    .line 894
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_2

    .line 895
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 896
    const-string p1, "parseObject error"

    invoke-static {p1, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/net/URL;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/net/URL;",
            "Ljava/util/function/Function<",
            "Lcom/alibaba/fastjson2/JSONObject;",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 902
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 903
    :try_start_1
    invoke-static {v1, p2}, Lcom/alibaba/fastjson2/JSON;->parseObject(Ljava/io/InputStream;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p2, :cond_2

    if-eqz v1, :cond_1

    .line 904
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    return-object v0

    .line 905
    :cond_2
    :try_start_3
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v1, :cond_3

    .line 906
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :cond_3
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_4

    .line 907
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_6
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 908
    :goto_1
    const-string p2, "JSON#parseObject cannot parse \'"

    const-string v0, "\'"

    invoke-static {p2, p0, v0, p1}, Lah/a;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject(Ljava/nio/ByteBuffer;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 828
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 829
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 830
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 831
    :goto_0
    invoke-virtual {v1, p1, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v7

    .line 832
    invoke-static {p0, v2, v0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/nio/ByteBuffer;Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v8

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v9, p1

    .line 833
    :try_start_0
    invoke-interface/range {v7 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 834
    iget-object p1, v8, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 835
    invoke-virtual {v8, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    .line 836
    :cond_2
    :goto_1
    iget-char p1, v8, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_4

    iget-wide v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    cmp-long p1, v0, v5

    if-eqz p1, :cond_3

    goto :goto_2

    .line 837
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v8, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 838
    :cond_4
    :goto_2
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_3
    if-eqz v8, :cond_5

    .line 839
    :try_start_1
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_4
    throw p0
.end method

.method public static varargs parseObject([BIILjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 673
    array-length v0, p0

    if-eqz v0, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_7

    .line 674
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 675
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v1, p4

    invoke-direct {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 676
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v7, 0x0

    cmp-long v1, v3, v7

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move-object/from16 v11, p3

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 677
    :goto_1
    invoke-virtual {v0, v11, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 678
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v3, 0x0

    move-object v4, p0

    move/from16 v5, p1

    move/from16 v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 679
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 680
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 681
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_5

    .line 682
    :cond_2
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v0, v2, v7

    if-eqz v0, :cond_3

    goto :goto_4

    .line 683
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 684
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 685
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_5
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject([BIILjava/nio/charset/Charset;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/nio/charset/Charset;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_6

    .line 948
    array-length v1, p0

    if-eqz v1, :cond_6

    if-nez p2, :cond_0

    goto/16 :goto_6

    .line 949
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 950
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v3, p5

    invoke-direct {v2, v1, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 951
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    :goto_0
    move-object/from16 v9, p4

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    goto :goto_0

    .line 952
    :goto_1
    invoke-virtual {v1, v9, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v7

    move-object/from16 v1, p3

    .line 953
    invoke-static {p0, p1, p2, v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v8

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    .line 954
    :try_start_0
    invoke-interface/range {v7 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 955
    iget-object p1, v8, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 956
    invoke-virtual {v8, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_4

    .line 957
    :cond_2
    :goto_2
    iget-char p1, v8, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_4

    iget-wide v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    cmp-long p1, v0, v5

    if-eqz p1, :cond_3

    goto :goto_3

    .line 958
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v8, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 959
    :cond_4
    :goto_3
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_4
    if-eqz v8, :cond_5

    .line 960
    :try_start_1
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_5
    throw p0

    :cond_6
    :goto_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject([BIILjava/nio/charset/Charset;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/nio/charset/Charset;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_6

    .line 935
    array-length v1, p0

    if-eqz v1, :cond_6

    if-nez p2, :cond_0

    goto :goto_6

    .line 936
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 937
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 938
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    :goto_0
    move-object/from16 v9, p4

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    goto :goto_0

    .line 939
    :goto_1
    invoke-virtual {v1, v9, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v7

    move-object/from16 v1, p3

    .line 940
    invoke-static {p0, p1, p2, v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v8

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    .line 941
    :try_start_0
    invoke-interface/range {v7 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 942
    iget-object p1, v8, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 943
    invoke-virtual {v8, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_4

    .line 944
    :cond_2
    :goto_2
    iget-char p1, v8, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_4

    iget-wide v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    cmp-long p1, v0, v5

    if-eqz p1, :cond_3

    goto :goto_3

    .line 945
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v8, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 946
    :cond_4
    :goto_3
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    return-object p0

    :goto_4
    if-eqz v8, :cond_5

    .line 947
    :try_start_1
    invoke-virtual {v8}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_5
    throw p0

    :cond_6
    :goto_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject([BLjava/lang/Class;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 699
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_5

    .line 700
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v2

    .line 701
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 702
    :try_start_0
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v5, p1

    move-object v4, v1

    .line 703
    :try_start_1
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 704
    :try_start_2
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 705
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :goto_0
    move-object p0, v0

    goto :goto_3

    .line 706
    :cond_1
    :goto_1
    iget-char p1, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_3

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_2

    goto :goto_2

    .line 707
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 708
    :cond_3
    :goto_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v4

    goto :goto_0

    .line 709
    :goto_3
    :try_start_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0

    :cond_4
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject([BLjava/lang/Class;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 723
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 724
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    move-object p0, v2

    .line 725
    :try_start_0
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v7, 0x0

    cmp-long p2, v2, v7

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 726
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v3, p1

    move-object v2, v1

    move-object v1, p2

    .line 727
    :try_start_1
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v1, v2

    .line 728
    :try_start_2
    iget-object p2, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p2, :cond_2

    .line 729
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    :goto_1
    move-object p0, v0

    goto :goto_4

    .line 730
    :cond_2
    :goto_2
    iget-char p2, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p2, v0, :cond_4

    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long p0, v2, v7

    if-eqz p0, :cond_3

    goto :goto_3

    .line 731
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 732
    :cond_4
    :goto_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p1

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_1

    .line 733
    :goto_4
    :try_start_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0

    :cond_5
    :goto_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject([BLjava/lang/Class;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 710
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 711
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v2

    .line 712
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 713
    :try_start_0
    invoke-virtual {v2, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->config(Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 714
    iget-wide p2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v3

    const-wide/16 v9, 0x0

    cmp-long p0, p2, v9

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    .line 715
    :goto_0
    iget-object p2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {p2, p1, p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v5, p1

    move-object v4, v1

    .line 716
    :try_start_1
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 717
    :try_start_2
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 718
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    :goto_1
    move-object p0, v0

    goto :goto_4

    .line 719
    :cond_2
    :goto_2
    iget-char p1, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x1a

    if-eq p1, p2, :cond_4

    iget-wide p1, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v2

    cmp-long p1, p1, v9

    if-eqz p1, :cond_3

    goto :goto_3

    .line 720
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 721
    :cond_4
    :goto_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v4

    goto :goto_1

    .line 722
    :goto_4
    :try_start_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0

    :cond_5
    :goto_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject([BLjava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 748
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 749
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 750
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v1, p2

    invoke-direct {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 751
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v7, 0x0

    cmp-long v1, v3, v7

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 752
    :goto_1
    invoke-virtual {v0, v11, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 753
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 754
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 755
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 756
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_5

    .line 757
    :cond_2
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v0, v2, v7

    if-eqz v0, :cond_3

    goto :goto_4

    .line 758
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 759
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 760
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_5
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject([BLjava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 686
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 687
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 688
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 689
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v7, 0x0

    cmp-long v1, v3, v7

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 690
    :goto_1
    invoke-virtual {v0, v11, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 691
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 692
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 693
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 694
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_5

    .line 695
    :cond_2
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v0, v2, v7

    if-eqz v0, :cond_3

    goto :goto_4

    .line 696
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 697
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 698
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_5
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject([BLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 800
    array-length v1, p0

    if-nez v1, :cond_0

    goto/16 :goto_7

    .line 801
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 802
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v3, p2

    move-object/from16 v5, p3

    invoke-direct {v2, v1, v0, v3, v5}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 803
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v7, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 804
    :goto_1
    invoke-virtual {v1, v11, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 805
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 806
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 807
    :try_start_1
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v3, :cond_2

    .line 808
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object v2, v0

    goto :goto_5

    .line 809
    :cond_2
    :goto_3
    iget-char v3, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v2, v2, v7

    if-eqz v2, :cond_3

    goto :goto_4

    .line 810
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    const-string v2, "input not end"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 811
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 812
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2

    :cond_5
    :goto_7
    return-object v0
.end method

.method public static varargs parseObject([BLjava/lang/reflect/Type;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v0, p2

    if-eqz p0, :cond_6

    .line 813
    array-length v1, p0

    if-nez v1, :cond_0

    goto/16 :goto_7

    .line 814
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 815
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v3, p3

    invoke-direct {v2, v1, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    if-eqz v0, :cond_1

    .line 816
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 817
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 818
    :cond_1
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v7, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 819
    :goto_1
    invoke-virtual {v1, v11, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 820
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 821
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 822
    :try_start_1
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v3, :cond_3

    .line 823
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object v2, v0

    goto :goto_5

    .line 824
    :cond_3
    :goto_3
    iget-char v3, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_5

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v2, v2, v7

    if-eqz v2, :cond_4

    goto :goto_4

    .line 825
    :cond_4
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    const-string v2, "input not end"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 826
    :cond_5
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 827
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2

    :cond_6
    :goto_7
    const/4 v0, 0x0

    return-object v0
.end method

.method public static varargs parseObject([BLjava/lang/reflect/Type;Ljava/lang/String;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 734
    array-length v1, p0

    if-nez v1, :cond_0

    goto/16 :goto_7

    .line 735
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 736
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v3, p3

    move-object/from16 v5, p4

    invoke-direct {v2, v1, v0, v3, v5}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    move-object/from16 v0, p2

    .line 737
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 738
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v7, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 739
    :goto_1
    invoke-virtual {v1, v11, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 740
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 741
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 742
    :try_start_1
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v3, :cond_2

    .line 743
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object v2, v0

    goto :goto_5

    .line 744
    :cond_2
    :goto_3
    iget-char v3, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v2, v2, v7

    if-eqz v2, :cond_3

    goto :goto_4

    .line 745
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    const-string v2, "input not end"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 746
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 747
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2

    :cond_5
    :goto_7
    return-object v0
.end method

.method public static varargs parseObject([BLjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 761
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 762
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 763
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v1, p2

    invoke-direct {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 764
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v7, 0x0

    cmp-long v1, v3, v7

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 765
    :goto_1
    invoke-virtual {v0, v11, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 766
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 767
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 768
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 769
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_5

    .line 770
    :cond_2
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v0, v2, v7

    if-eqz v0, :cond_3

    goto :goto_4

    .line 771
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 772
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 773
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF8;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_5
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject([CIILjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([CII",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 647
    array-length v0, p0

    if-eqz v0, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_7

    .line 648
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 649
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v1, p4

    invoke-direct {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 650
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v7, 0x0

    cmp-long v1, v3, v7

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move-object/from16 v11, p3

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 651
    :goto_1
    invoke-virtual {v0, v11, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 652
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v3, 0x0

    move-object v4, p0

    move/from16 v5, p1

    move/from16 v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 653
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 654
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 655
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_5

    .line 656
    :cond_2
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v0, v2, v7

    if-eqz v0, :cond_3

    goto :goto_4

    .line 657
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 658
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 659
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_5
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject([CLjava/lang/Class;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([C",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 660
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 661
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 662
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 663
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v7, 0x0

    cmp-long v1, v3, v7

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 664
    :goto_1
    invoke-virtual {v0, v11, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 665
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 666
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 667
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 668
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_5

    .line 669
    :cond_2
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v0, v2, v7

    if-eqz v0, :cond_3

    goto :goto_4

    .line 670
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 671
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 672
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_5
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject([CLjava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([C",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 774
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 775
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 776
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v1, p2

    invoke-direct {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 777
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v7, 0x0

    cmp-long v1, v3, v7

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 778
    :goto_1
    invoke-virtual {v0, v11, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 779
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 780
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 781
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 782
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_5

    .line 783
    :cond_2
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v0, v2, v7

    if-eqz v0, :cond_3

    goto :goto_4

    .line 784
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 785
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 786
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_5
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject([CLjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([C",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 787
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 788
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 789
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v1, p2

    invoke-direct {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 790
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v7, 0x0

    cmp-long v1, v3, v7

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move-object/from16 v11, p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 791
    :goto_1
    invoke-virtual {v0, v11, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v9

    .line 792
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v5, 0x0

    array-length v6, p0

    const/4 v3, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v10, v1

    .line 793
    :try_start_0
    invoke-interface/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 794
    :try_start_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 795
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_5

    .line 796
    :cond_2
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_4

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    cmp-long v0, v2, v7

    if-eqz v0, :cond_3

    goto :goto_4

    .line 797
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string v0, "input not end"

    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 798
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_2

    .line 799
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_5
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject(Ljava/lang/String;Lcom/alibaba/fastjson2/util/MapMultiValueType;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>(",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/util/MapMultiValueType<",
            "TT;>;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_5

    .line 514
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 515
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 516
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 517
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    .line 518
    :try_start_0
    sget-wide v5, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v7, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v5, v7

    const-wide/16 v8, 0x0

    cmp-long p0, v5, v8

    if-eqz p0, :cond_1

    const/4 v4, 0x1

    :cond_1
    invoke-virtual {v0, p1, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v4, p1

    .line 519
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    .line 520
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 521
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 522
    :cond_2
    :goto_0
    iget-char p1, v3, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_4

    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v4

    cmp-long p1, v0, v8

    if-eqz p1, :cond_3

    goto :goto_1

    .line 523
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    const-string p1, "input not end"

    invoke-virtual {v3, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 524
    :cond_4
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V

    return-object p0

    .line 525
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :cond_5
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseObject(Ljava/io/InputStream;Ljava/lang/reflect/Type;Ljava/util/function/Consumer;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/function/Consumer<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")V"
        }
    .end annotation

    .line 961
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/16 v2, 0xa

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSON;->parseObject(Ljava/io/InputStream;Ljava/nio/charset/Charset;CLjava/lang/reflect/Type;Ljava/util/function/Consumer;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    return-void
.end method

.method public static varargs parseObject(Ljava/io/InputStream;Ljava/nio/charset/Charset;CLjava/lang/reflect/Type;Ljava/util/function/Consumer;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/nio/charset/Charset;",
            "C",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/function/Consumer<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p3

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    const/4 v6, 0x1

    .line 15
    sub-int/2addr v3, v6

    .line 16
    and-int/2addr v0, v3

    .line 17
    aget-object v7, v1, v0

    .line 18
    .line 19
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v7, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, [B

    .line 27
    .line 28
    const/high16 v8, 0x80000

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-array v0, v8, [B

    .line 33
    .line 34
    :cond_0
    sget-object v9, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 35
    .line 36
    new-instance v10, Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 37
    .line 38
    move-object/from16 v3, p5

    .line 39
    .line 40
    invoke-direct {v10, v9, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 41
    .line 42
    .line 43
    iget-wide v3, v10, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 44
    .line 45
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 46
    .line 47
    iget-wide v11, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 48
    .line 49
    and-long/2addr v3, v11

    .line 50
    const-wide/16 v11, 0x0

    .line 51
    .line 52
    cmp-long v3, v3, v11

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    move v14, v6

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v14, 0x0

    .line 59
    :goto_0
    move-object v15, v0

    .line 60
    const/4 v0, 0x0

    .line 61
    const/4 v3, 0x0

    .line 62
    :goto_1
    :try_start_0
    array-length v4, v15

    .line 63
    sub-int/2addr v4, v0

    .line 64
    move-object/from16 v5, p0

    .line 65
    .line 66
    invoke-virtual {v5, v15, v0, v4}, Ljava/io/InputStream;->read([BII)I

    .line 67
    .line 68
    .line 69
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    const/4 v6, -0x1

    .line 71
    if-ne v4, v6, :cond_2

    .line 72
    .line 73
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 74
    .line 75
    invoke-virtual {v0, v7, v15}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    add-int v6, v0, v4

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    :goto_2
    if-ge v0, v6, :cond_8

    .line 83
    .line 84
    move/from16 v16, v8

    .line 85
    .line 86
    :try_start_1
    aget-byte v8, v15, v0

    .line 87
    .line 88
    move-wide/from16 v17, v11

    .line 89
    .line 90
    move/from16 v11, p2

    .line 91
    .line 92
    if-ne v8, v11, :cond_7

    .line 93
    .line 94
    sub-int v4, v0, v3

    .line 95
    .line 96
    move-object/from16 v8, p1

    .line 97
    .line 98
    invoke-static {v15, v3, v4, v8, v10}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-nez v1, :cond_3

    .line 103
    .line 104
    invoke-virtual {v9, v2, v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    :cond_3
    move-object v4, v3

    .line 109
    goto :goto_3

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :catch_0
    move-exception v0

    .line 114
    goto/16 :goto_8

    .line 115
    .line 116
    :goto_3
    const/4 v3, 0x0

    .line 117
    move v12, v0

    .line 118
    move-object v0, v1

    .line 119
    move-object v1, v4

    .line 120
    const-wide/16 v4, 0x0

    .line 121
    .line 122
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    iget-object v4, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 127
    .line 128
    if-eqz v4, :cond_4

    .line 129
    .line 130
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    iget-char v4, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 134
    .line 135
    const/16 v5, 0x1a

    .line 136
    .line 137
    if-eq v4, v5, :cond_5

    .line 138
    .line 139
    iget-object v4, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 140
    .line 141
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 142
    .line 143
    sget-object v13, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 144
    .line 145
    move-wide/from16 v19, v4

    .line 146
    .line 147
    iget-wide v4, v13, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 148
    .line 149
    and-long v4, v19, v4

    .line 150
    .line 151
    cmp-long v4, v4, v17

    .line 152
    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    :cond_5
    move-object/from16 v5, p4

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 159
    .line 160
    const-string v3, "input not end"

    .line 161
    .line 162
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :goto_4
    invoke-interface {v5, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    add-int/lit8 v1, v12, 0x1

    .line 174
    .line 175
    move v3, v1

    .line 176
    const/4 v4, 0x1

    .line 177
    move-object v1, v0

    .line 178
    goto :goto_5

    .line 179
    :cond_7
    move-object/from16 v8, p1

    .line 180
    .line 181
    move-object/from16 v5, p4

    .line 182
    .line 183
    move v12, v0

    .line 184
    :goto_5
    add-int/lit8 v0, v12, 0x1

    .line 185
    .line 186
    move-object/from16 v5, p0

    .line 187
    .line 188
    move/from16 v8, v16

    .line 189
    .line 190
    move-wide/from16 v11, v17

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_8
    move-object/from16 v5, p4

    .line 194
    .line 195
    move/from16 v16, v8

    .line 196
    .line 197
    move-wide/from16 v17, v11

    .line 198
    .line 199
    move-object/from16 v8, p1

    .line 200
    .line 201
    move/from16 v11, p2

    .line 202
    .line 203
    array-length v0, v15

    .line 204
    if-ne v6, v0, :cond_a

    .line 205
    .line 206
    if-eqz v4, :cond_9

    .line 207
    .line 208
    array-length v0, v15

    .line 209
    sub-int/2addr v0, v3

    .line 210
    const/4 v4, 0x0

    .line 211
    invoke-static {v15, v3, v15, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 212
    .line 213
    .line 214
    move v3, v4

    .line 215
    goto :goto_7

    .line 216
    :cond_9
    const/4 v4, 0x0

    .line 217
    array-length v0, v15

    .line 218
    add-int v0, v0, v16

    .line 219
    .line 220
    invoke-static {v15, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 221
    .line 222
    .line 223
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    move-object v15, v0

    .line 225
    :goto_6
    move v0, v6

    .line 226
    goto :goto_7

    .line 227
    :cond_a
    const/4 v4, 0x0

    .line 228
    goto :goto_6

    .line 229
    :goto_7
    move/from16 v8, v16

    .line 230
    .line 231
    move-wide/from16 v11, v17

    .line 232
    .line 233
    const/4 v6, 0x1

    .line 234
    goto/16 :goto_1

    .line 235
    .line 236
    :goto_8
    :try_start_2
    new-instance v1, Lcom/alibaba/fastjson2/JSONException;

    .line 237
    .line 238
    new-instance v3, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string v4, "JSON#parseObject cannot parse the \'InputStream\' to \'"

    .line 244
    .line 245
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v2, "\'"

    .line 252
    .line 253
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-direct {v1, v2, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 264
    :goto_9
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 265
    .line 266
    invoke-virtual {v1, v7, v15}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    throw v0
.end method

.method public static parseObject(Ljava/io/Reader;CLjava/lang/reflect/Type;Ljava/util/function/Consumer;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "C",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/function/Consumer<",
            "TT;>;)V"
        }
    .end annotation

    move-object/from16 v2, p2

    .line 975
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    array-length v3, v1

    const/4 v6, 0x1

    sub-int/2addr v3, v6

    and-int/2addr v0, v3

    .line 976
    aget-object v7, v1, v0

    .line 977
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, v7, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    const/16 v8, 0x2000

    if-nez v0, :cond_0

    .line 978
    new-array v0, v8, [C

    .line 979
    :cond_0
    sget-object v9, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 980
    new-instance v10, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v10, v9}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 981
    iget-wide v3, v10, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v11, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v11

    const-wide/16 v11, 0x0

    cmp-long v3, v3, v11

    const/4 v11, 0x0

    if-eqz v3, :cond_1

    move v12, v6

    goto :goto_0

    :cond_1
    move v12, v11

    :goto_0
    move-object v13, v0

    move v0, v11

    move v3, v0

    .line 982
    :goto_1
    :try_start_0
    array-length v4, v13

    sub-int/2addr v4, v0

    move-object/from16 v14, p0

    invoke-virtual {v14, v13, v0, v4}, Ljava/io/Reader;->read([CII)I

    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    .line 983
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, v7, v13}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_2
    add-int v15, v0, v4

    move v4, v11

    :goto_2
    if-ge v0, v15, :cond_5

    .line 984
    :try_start_1
    aget-char v5, v13, v0

    move/from16 v6, p1

    if-ne v5, v6, :cond_4

    sub-int v4, v0, v3

    .line 985
    invoke-static {v13, v3, v4, v10}, Lcom/alibaba/fastjson2/JSONReader;->of([CIILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v3

    if-nez v1, :cond_3

    .line 986
    invoke-virtual {v9, v2, v12}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v1

    :cond_3
    move-object v4, v3

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_7

    :catch_0
    move-exception v0

    goto :goto_6

    :goto_3
    const/4 v3, 0x0

    move/from16 v16, v0

    move-object v0, v1

    move-object v1, v4

    const-wide/16 v4, 0x0

    .line 987
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v5, p3

    .line 988
    invoke-interface {v5, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v1, v16, 0x1

    move v3, v1

    const/4 v4, 0x1

    move-object v1, v0

    goto :goto_4

    :cond_4
    move-object/from16 v5, p3

    move/from16 v16, v0

    :goto_4
    add-int/lit8 v0, v16, 0x1

    const/4 v6, 0x1

    goto :goto_2

    :cond_5
    move/from16 v6, p1

    move-object/from16 v5, p3

    .line 989
    array-length v0, v13

    if-ne v15, v0, :cond_7

    if-eqz v4, :cond_6

    .line 990
    array-length v0, v13

    sub-int/2addr v0, v3

    .line 991
    invoke-static {v13, v3, v13, v11, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v3, v11

    goto :goto_5

    .line 992
    :cond_6
    array-length v0, v13

    add-int/2addr v0, v8

    invoke-static {v13, v0}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v13, v0

    :cond_7
    move v0, v15

    :goto_5
    const/4 v6, 0x1

    goto :goto_1

    .line 993
    :goto_6
    :try_start_2
    new-instance v1, Lcom/alibaba/fastjson2/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON#parseObject cannot parse the \'Reader\' to \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 994
    :goto_7
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v7, v13}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 995
    throw v0
.end method

.method public static register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "*>;)",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "*>;"
        }
    .end annotation

    .line 50
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p0

    return-object p0
.end method

.method public static register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter<",
            "*>;)",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter<",
            "*>;"
        }
    .end annotation

    .line 49
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p0

    return-object p0
.end method

.method public static register(Ljava/lang/Class;Lcom/alibaba/fastjson2/filter/Filter;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/ContextNameFilter;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/ContextValueFilter;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void

    .line 39
    :cond_1
    :goto_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->setFilter(Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static registerIfAbsent(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "*>;)",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerIfAbsent(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static registerIfAbsent(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter<",
            "*>;)",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter<",
            "*>;"
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->registerIfAbsent(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p0

    return-object p0
.end method

.method public static registerSeeAlsoSubType(Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/JSON;->registerSeeAlsoSubType(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public static registerSeeAlsoSubType(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerSeeAlsoSubType(Ljava/lang/Class;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static to(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    instance-of v0, p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v0, v0, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 13
    .line 14
    invoke-virtual {p1, p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->to(Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 20
    .line 21
    invoke-static {p1, p0, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static toJSON(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 118
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/JSON;->toJSON(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static varargs toJSON(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    instance-of v0, p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 6
    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    instance-of v0, p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    if-nez p1, :cond_2

    .line 15
    .line 16
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createWriteContext()Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_2
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONFactory;->createWriteContext([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    instance-of v0, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isEnabled(Lcom/alibaba/fastjson2/JSONWriter$Feature;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    invoke-interface {v1}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->getFeatures()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 50
    .line 51
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 52
    .line 53
    and-long/2addr v2, v4

    .line 54
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    cmp-long v0, v2, v4

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    check-cast v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 61
    .line 62
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 63
    .line 64
    invoke-virtual {v1, p0, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->toJSONObject(Ljava/lang/Object;J)Lcom/alibaba/fastjson2/JSONObject;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_3
    :try_start_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONWriter;->of(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    .line 70
    .line 71
    .line 72
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    :try_start_1
    iget-wide v6, p1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    move-object v3, p0

    .line 78
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    :try_start_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSON;->parse(Ljava/lang/String;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    move-object p0, v0

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    :try_start_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    move-object p1, v0

    .line 103
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_1
    throw p0
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    .line 107
    :catch_0
    move-exception v0

    .line 108
    move-object p0, v0

    .line 109
    const-string p1, "toJSONString error"

    .line 110
    .line 111
    invoke-static {p1, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    const/4 p0, 0x0

    .line 115
    return-object p0

    .line 116
    :cond_5
    move-object v3, p0

    .line 117
    return-object v3
.end method

.method public static toJSONBytes(Ljava/lang/Object;)[B
    .locals 13

    .line 189
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 190
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    .line 191
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 192
    :goto_0
    new-instance v7, Lcom/alibaba/fastjson2/JSONWriterUTF8;

    invoke-direct {v7, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V

    if-nez p0, :cond_1

    .line 193
    :try_start_0
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 194
    :cond_1
    iput-object p0, v7, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 195
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object v1, v7, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 196
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 197
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    if-ne v1, v3, :cond_2

    iget-object v3, v7, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v8, v3, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    cmp-long v3, v8, v4

    if-nez v3, :cond_2

    .line 198
    check-cast p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-virtual {v7, p0}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    goto :goto_1

    .line 199
    :cond_2
    invoke-virtual {v0, v1, v1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v6

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v9, 0x0

    move-object v8, p0

    .line 200
    invoke-interface/range {v6 .. v12}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 201
    :goto_1
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V

    return-object p0

    .line 203
    :goto_2
    :try_start_1
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static varargs toJSONBytes(Ljava/lang/Object;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 9

    .line 131
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 132
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    if-eqz p1, :cond_0

    .line 133
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    .line 134
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    .line 135
    :cond_0
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 136
    :goto_0
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterUTF8;

    invoke-direct {v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V

    if-nez p0, :cond_2

    .line 137
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 138
    :cond_2
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 139
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p2, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 141
    invoke-virtual {v0, p2, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 142
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 143
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V

    return-object p0

    .line 145
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static varargs toJSONBytes(Ljava/lang/Object;Ljava/lang/String;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 9

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 2
    .line 3
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 4
    .line 5
    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 9
    .line 10
    .line 11
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 12
    .line 13
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 14
    .line 15
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 16
    .line 17
    and-long/2addr v2, v4

    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    cmp-long p3, v2, v4

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p3, 0x0

    .line 27
    :goto_0
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterUTF8;

    .line 28
    .line 29
    invoke-direct {v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V

    .line 30
    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    move-object p0, v0

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 44
    .line 45
    iput-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    iget-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 56
    .line 57
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    if-eqz p2, :cond_3

    .line 61
    .line 62
    array-length p1, p2

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v0, p1, p1, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const/4 v6, 0x0

    .line 79
    const-wide/16 v7, 0x0

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    move-object v4, p0

    .line 83
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 84
    .line 85
    .line 86
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->getBytes()[B

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    move-object p1, v0

    .line 100
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :goto_3
    throw p0
.end method

.method public static toJSONBytes(Ljava/lang/Object;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONWriter$Context;)[B
    .locals 9

    .line 118
    iget-object v0, p2, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 119
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSONWriter;->ofUTF8(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v2

    if-nez p0, :cond_0

    .line 120
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 121
    :cond_0
    iput-object p0, v2, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 122
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p2, v2, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 124
    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    const-wide/16 v3, 0x0

    if-ne p2, v1, :cond_1

    iget-object v1, v2, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    cmp-long v1, v5, v3

    if-nez v1, :cond_1

    .line 125
    check-cast p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONWriter;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    goto :goto_1

    .line 126
    :cond_1
    sget-wide v5, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v7, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v5, v7

    cmp-long v1, v5, v3

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p2, p2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    .line 127
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 128
    :goto_1
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONWriter;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    return-object p0

    :goto_2
    if-eqz v2, :cond_3

    .line 130
    :try_start_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    throw p0
.end method

.method public static varargs toJSONBytes(Ljava/lang/Object;Ljava/nio/charset/Charset;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 9

    .line 104
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 105
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 106
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->ofUTF8(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v3

    if-nez p0, :cond_0

    .line 107
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 108
    :cond_0
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 109
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p2, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 111
    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    const-wide/16 v4, 0x0

    if-ne p2, v1, :cond_1

    iget-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    cmp-long v1, v1, v4

    if-nez v1, :cond_1

    .line 112
    check-cast p0, Lcom/alibaba/fastjson2/JSONObject;

    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONWriter;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    goto :goto_1

    .line 113
    :cond_1
    sget-wide v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v1, v6

    cmp-long v1, v1, v4

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p2, p2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 114
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 115
    :goto_1
    invoke-virtual {v3, p1}, Lcom/alibaba/fastjson2/JSONWriter;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    return-object p0

    :goto_2
    if-eqz v3, :cond_3

    .line 117
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    throw p0
.end method

.method public static varargs toJSONBytes(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 9

    .line 162
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 163
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 164
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 165
    :goto_0
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterUTF8;

    invoke-direct {v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V

    if-nez p0, :cond_1

    .line 166
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 167
    :cond_1
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 168
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 169
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 170
    invoke-virtual {v0, v1, v1, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 171
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 172
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V

    return-object p0

    .line 174
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static varargs toJSONBytes(Ljava/lang/Object;[Lcom/alibaba/fastjson2/filter/Filter;)[B
    .locals 10

    .line 146
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 147
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    .line 148
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 149
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 150
    :goto_0
    new-instance v4, Lcom/alibaba/fastjson2/JSONWriterUTF8;

    invoke-direct {v4, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V

    if-eqz p1, :cond_1

    .line 151
    :try_start_0
    array-length v1, p1

    if-eqz v1, :cond_1

    .line 152
    iget-object v1, v4, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    :cond_1
    :goto_1
    if-nez p0, :cond_2

    .line 153
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_2

    .line 154
    :cond_2
    iput-object p0, v4, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 155
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p1, v4, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 157
    invoke-virtual {v0, p1, p1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v3

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p0

    .line 158
    invoke-interface/range {v3 .. v9}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 159
    :goto_2
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V

    return-object p0

    .line 161
    :goto_3
    :try_start_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0
.end method

.method public static varargs toJSONBytes(Ljava/lang/Object;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 9

    .line 175
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 176
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 177
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 178
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 179
    :goto_0
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterUTF8;

    invoke-direct {v3, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V

    if-nez p0, :cond_1

    .line 180
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 181
    :cond_1
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 182
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p2, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 183
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 184
    invoke-virtual {v0, p2, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 185
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 186
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V

    return-object p0

    .line 188
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterUTF8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static toJSONString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 13

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 2
    .line 3
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    .line 6
    .line 7
    .line 8
    sget-wide v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    .line 9
    .line 10
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->OptimizedForAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 11
    .line 12
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 13
    .line 14
    and-long/2addr v2, v4

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    :try_start_0
    new-instance v2, Lcom/alibaba/fastjson2/JSONWriterUTF8;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF8;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    move-object v7, v2

    .line 27
    goto :goto_2

    .line 28
    :catch_0
    move-exception v0

    .line 29
    :goto_1
    move-object v8, p0

    .line 30
    goto/16 :goto_9

    .line 31
    .line 32
    :catch_1
    move-exception v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance v2, Lcom/alibaba/fastjson2/JSONWriterUTF16;

    .line 35
    .line 36
    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONWriterUTF16;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_2
    if-nez p0, :cond_1

    .line 41
    .line 42
    :try_start_1
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 43
    .line 44
    .line 45
    :goto_3
    move-object v8, p0

    .line 46
    goto :goto_6

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object v8, p0

    .line 49
    :goto_4
    move-object p0, v0

    .line 50
    goto :goto_7

    .line 51
    :cond_1
    iput-object p0, v7, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 54
    .line 55
    iput-object v2, v7, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 62
    .line 63
    if-ne v2, v3, :cond_2

    .line 64
    .line 65
    iget-wide v8, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 66
    .line 67
    cmp-long v3, v8, v4

    .line 68
    .line 69
    if-nez v3, :cond_2

    .line 70
    .line 71
    move-object v0, p0

    .line 72
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 73
    .line 74
    invoke-virtual {v7, v0}, Lcom/alibaba/fastjson2/JSONWriter;->write(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    iget-wide v8, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 79
    .line 80
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 81
    .line 82
    iget-wide v10, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 83
    .line 84
    and-long/2addr v8, v10

    .line 85
    cmp-long v1, v8, v4

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    goto :goto_5

    .line 91
    :cond_3
    const/4 v1, 0x0

    .line 92
    :goto_5
    invoke-virtual {v0, v2, v2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 93
    .line 94
    .line 95
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    const/4 v10, 0x0

    .line 97
    const-wide/16 v11, 0x0

    .line 98
    .line 99
    const/4 v9, 0x0

    .line 100
    move-object v8, p0

    .line 101
    :try_start_2
    invoke-interface/range {v6 .. v12}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 102
    .line 103
    .line 104
    :goto_6
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 108
    :try_start_3
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :catch_2
    move-exception v0

    .line 113
    goto :goto_9

    .line 114
    :catch_3
    move-exception v0

    .line 115
    goto :goto_9

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    goto :goto_4

    .line 118
    :goto_7
    :try_start_4
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 119
    .line 120
    .line 121
    goto :goto_8

    .line 122
    :catchall_2
    move-exception v0

    .line 123
    :try_start_5
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :goto_8
    throw p0
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_2

    .line 127
    :goto_9
    const-string p0, "JSON#toJSONString cannot serialize \'"

    .line 128
    .line 129
    const-string v1, "\'"

    .line 130
    .line 131
    invoke-static {p0, v8, v1, v0}, Lah/a;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    const/4 p0, 0x0

    .line 135
    return-object p0
.end method

.method public static toJSONString(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter$Context;)Ljava/lang/String;
    .locals 7

    .line 136
    :try_start_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONWriter;->of(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez p0, :cond_0

    .line 137
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v2, p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v2, p0

    goto :goto_3

    .line 138
    :cond_0
    :try_start_2
    iput-object p0, v1, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 139
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p1, v1, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 141
    invoke-virtual {v1, p1, p1}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    .line 142
    :try_start_3
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 143
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 144
    :try_start_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    :goto_1
    move-object p0, v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, p0

    goto :goto_2

    :goto_3
    if-eqz v1, :cond_1

    .line 145
    :try_start_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object p0, v0

    :try_start_6
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_4
    throw p1
    :try_end_6
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_2
    move-exception v0

    :goto_5
    move-object v2, p0

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_5

    .line 146
    :goto_6
    const-string p1, "JSON#toJSONString cannot serialize \'"

    const-string v0, "\'"

    invoke-static {p1, v2, v0, p0}, Lah/a;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs toJSONString(Ljava/lang/Object;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 9

    .line 160
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 161
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, p1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 162
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 163
    :goto_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->of(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v3

    if-nez p0, :cond_1

    .line 164
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 165
    :cond_1
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 166
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p2, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 167
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 168
    invoke-virtual {v0, p2, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 169
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 170
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    return-object p0

    :goto_2
    if-eqz v3, :cond_2

    .line 172
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    throw p0
.end method

.method public static varargs toJSONString(Ljava/lang/Object;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 9

    .line 187
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 188
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    if-eqz p1, :cond_0

    .line 189
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    .line 190
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    .line 191
    :cond_0
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 192
    :goto_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->of(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v3

    if-nez p0, :cond_2

    .line 193
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 194
    :cond_2
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 195
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p2, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 196
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 197
    invoke-virtual {v0, p2, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 198
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 199
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    return-object p0

    :goto_2
    if-eqz v3, :cond_3

    .line 201
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    throw p0
.end method

.method public static varargs toJSONString(Ljava/lang/Object;Ljava/lang/String;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 9

    .line 202
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 203
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 204
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    if-eqz p1, :cond_0

    .line 205
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    .line 206
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    .line 207
    :cond_0
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 208
    :goto_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->of(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v3

    if-nez p0, :cond_2

    .line 209
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 210
    :cond_2
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 211
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p2, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 212
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 213
    invoke-virtual {v0, p2, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 214
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 215
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    return-object p0

    :goto_2
    if-eqz v3, :cond_3

    .line 217
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    throw p0
.end method

.method public static varargs toJSONString(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 9

    .line 147
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 148
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 149
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 150
    :goto_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->of(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v3

    if-nez p0, :cond_1

    .line 151
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 152
    :cond_1
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 153
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 154
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 155
    invoke-virtual {v0, v1, v1, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 156
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 157
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    return-object p0

    :goto_2
    if-eqz v3, :cond_2

    .line 159
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    throw p0
.end method

.method public static varargs toJSONString(Ljava/lang/Object;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 9

    .line 173
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 174
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 175
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 176
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 177
    :goto_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->of(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v3

    if-nez p0, :cond_1

    .line 178
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 179
    :cond_1
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 180
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p2, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 182
    invoke-virtual {v0, p2, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 183
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 184
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V

    return-object p0

    :goto_2
    if-eqz v3, :cond_2

    .line 186
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    throw p0
.end method

.method public static toJavaObject(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/JSON;->to(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static writeTo(Ljava/io/OutputStream;Ljava/lang/Object;)I
    .locals 10

    .line 170
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 171
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    .line 172
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 173
    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->ofUTF8(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_1

    .line 174
    :try_start_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 175
    :cond_1
    iput-object p1, v4, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 176
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object v1, v4, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 178
    invoke-virtual {v0, v1, v1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v3

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    .line 179
    invoke-interface/range {v3 .. v9}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 180
    :goto_1
    invoke-virtual {v4, p0}, Lcom/alibaba/fastjson2/JSONWriter;->flushTo(Ljava/io/OutputStream;)I

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    :try_start_2
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return p0

    :goto_2
    if-eqz v4, :cond_2

    .line 182
    :try_start_3
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 183
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static writeTo(Ljava/io/OutputStream;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter$Context;)I
    .locals 7

    .line 128
    :try_start_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSONWriter;->ofUTF8(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    .line 129
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 130
    :cond_0
    iput-object p1, v1, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 131
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object v0, v1, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 133
    invoke-virtual {p2, v0, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    .line 134
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 135
    :goto_0
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONWriter;->flushTo(Ljava/io/OutputStream;)I

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return p0

    :goto_1
    if-eqz v1, :cond_1

    .line 137
    :try_start_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static varargs writeTo(Ljava/io/OutputStream;Ljava/lang/Object;Ljava/lang/String;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)I
    .locals 9

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 2
    .line 3
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 4
    .line 5
    invoke-direct {v1, v0, p4}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 9
    .line 10
    .line 11
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 12
    .line 13
    sget-object p4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 14
    .line 15
    iget-wide v4, p4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 16
    .line 17
    and-long/2addr v2, v4

    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    cmp-long p4, v2, v4

    .line 21
    .line 22
    if-eqz p4, :cond_0

    .line 23
    .line 24
    const/4 p4, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p4, 0x0

    .line 27
    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->ofUTF8(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    .line 28
    .line 29
    .line 30
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    move-object v4, p1

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    move-object p0, v0

    .line 40
    move-object v4, p1

    .line 41
    goto :goto_4

    .line 42
    :cond_1
    :try_start_2
    iput-object p1, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 45
    .line 46
    iput-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 47
    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    iget-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 57
    .line 58
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    if-eqz p3, :cond_3

    .line 62
    .line 63
    array-length p2, p3

    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    iget-object p2, v3, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 67
    .line 68
    invoke-virtual {p2, p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_3
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {v0, p2, p2, p4}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 76
    .line 77
    .line 78
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 79
    const/4 v6, 0x0

    .line 80
    const-wide/16 v7, 0x0

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    move-object v4, p1

    .line 84
    :try_start_5
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONWriter;->flushTo(Ljava/io/OutputStream;)I

    .line 88
    .line 89
    .line 90
    move-result p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 91
    :try_start_6
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 92
    .line 93
    .line 94
    return p0

    .line 95
    :catch_0
    move-exception v0

    .line 96
    :goto_2
    move-object p0, v0

    .line 97
    goto :goto_6

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    :goto_3
    move-object p0, v0

    .line 100
    goto :goto_4

    .line 101
    :catchall_2
    move-exception v0

    .line 102
    move-object v4, p1

    .line 103
    goto :goto_3

    .line 104
    :goto_4
    if-eqz v3, :cond_4

    .line 105
    .line 106
    :try_start_7
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :catchall_3
    move-exception v0

    .line 111
    move-object p1, v0

    .line 112
    :try_start_8
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_5
    throw p0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 116
    :catch_1
    move-exception v0

    .line 117
    move-object v4, p1

    .line 118
    goto :goto_2

    .line 119
    :goto_6
    const-string p1, "JSON#writeTo cannot serialize \'"

    .line 120
    .line 121
    const-string p2, "\' to \'OutputStream\'"

    .line 122
    .line 123
    invoke-static {p1, v4, p2, p0}, Lah/a;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    const/4 p0, 0x0

    .line 127
    return p0
.end method

.method public static varargs writeTo(Ljava/io/OutputStream;Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)I
    .locals 9

    .line 139
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 140
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 141
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 142
    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->ofUTF8(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_1

    .line 143
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 144
    :cond_1
    iput-object p1, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 145
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 147
    invoke-virtual {v0, v1, v1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    .line 148
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 149
    :goto_1
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONWriter;->flushTo(Ljava/io/OutputStream;)I

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    :try_start_2
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return p0

    :goto_2
    if-eqz v3, :cond_2

    .line 151
    :try_start_3
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 152
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static varargs writeTo(Ljava/io/OutputStream;Ljava/lang/Object;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)I
    .locals 9

    .line 153
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 154
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 155
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 156
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p3, v2, v4

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 157
    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONWriter;->ofUTF8(Lcom/alibaba/fastjson2/JSONWriter$Context;)Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez p1, :cond_1

    .line 158
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v4, p1

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v4, p1

    goto :goto_4

    .line 159
    :cond_1
    :try_start_2
    iput-object p1, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 160
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p2, :cond_2

    .line 161
    :try_start_3
    array-length v1, p2

    if-eqz v1, :cond_2

    .line 162
    iget-object v1, v3, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 163
    :cond_2
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 164
    invoke-virtual {v0, p2, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    .line 165
    :try_start_5
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 166
    :goto_1
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONWriter;->flushTo(Ljava/io/OutputStream;)I

    move-result p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 167
    :try_start_6
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return p0

    :catch_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_6

    :catchall_1
    move-exception v0

    :goto_3
    move-object p0, v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v4, p1

    goto :goto_3

    :goto_4
    if-eqz v3, :cond_3

    .line 168
    :try_start_7
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object p1, v0

    :try_start_8
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_5
    throw p0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :catch_1
    move-exception v0

    move-object v4, p1

    goto :goto_2

    .line 169
    :goto_6
    const-string p1, "JSON#writeTo cannot serialize \'"

    const-string p2, "\' to \'OutputStream\'"

    invoke-static {p1, v4, p2, p0}, Lah/a;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0
.end method
