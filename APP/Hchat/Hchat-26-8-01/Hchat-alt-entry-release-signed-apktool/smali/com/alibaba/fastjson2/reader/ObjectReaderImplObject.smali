.class public final Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createInstance(J)Ljava/lang/Object;
    .locals 0

    .line 74
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    return-object p1
.end method

.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 0

    .line 75
    return-object p1
.end method

.method public createInstance(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getTypeKey()Ljava/lang/String;

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
    if-eqz v2, :cond_3

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 22
    .line 23
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 24
    .line 25
    and-long/2addr v4, p2

    .line 26
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    cmp-long v4, v4, v6

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-interface {p0, v0, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->autoType(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    :goto_0
    if-nez v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->getObjectClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {p0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFeatures()J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    or-long/2addr v3, p2

    .line 49
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const-string p1, "No suitable ObjectReader found for"

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    return-object p1

    .line 67
    :cond_2
    :goto_1
    if-eq v2, p0, :cond_3

    .line 68
    .line 69
    invoke-interface {v2, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :cond_3
    return-object p1
.end method

.method public bridge synthetic getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;->getObjectClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x49

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x7d

    .line 10
    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    const/16 v1, -0x6e

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    const-class v3, Ljava/lang/Object;

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    move-wide/from16 v6, p4

    .line 28
    .line 29
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    move-object v7, p1

    .line 36
    move-object v8, p2

    .line 37
    move-object v9, p3

    .line 38
    move-wide/from16 v10, p4

    .line 39
    .line 40
    move-object v6, v1

    .line 41
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_1
    const/16 p2, -0x51

    .line 47
    .line 48
    if-ne v0, p2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    return-object p1

    .line 55
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 13
    .line 14
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 15
    .line 16
    or-long v2, p4, v2

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isObject()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/16 v13, 0x22

    .line 23
    .line 24
    const/16 v14, 0x2f

    .line 25
    .line 26
    const/16 v15, 0x5b

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz v4, :cond_22

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-wide/16 v16, 0x0

    .line 39
    .line 40
    if-eqz v4, :cond_8

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 43
    .line 44
    .line 45
    move-result-wide v18

    .line 46
    const-wide v20, 0x6570797440L

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    cmp-long v4, v18, v20

    .line 52
    .line 53
    if-nez v4, :cond_7

    .line 54
    .line 55
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/JSONReader$Context;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    invoke-interface {v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    if-eqz v7, :cond_1

    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 84
    .line 85
    .line 86
    move-result-object v22

    .line 87
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    if-eq v4, v8, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    :try_start_0
    invoke-virtual {v8, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    goto :goto_0

    .line 102
    :catch_0
    move-object v8, v5

    .line 103
    :goto_0
    if-eqz v8, :cond_2

    .line 104
    .line 105
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-nez v7, :cond_2

    .line 110
    .line 111
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    goto :goto_1

    .line 116
    :cond_1
    move-object v4, v5

    .line 117
    :cond_2
    :goto_1
    if-nez v6, :cond_5

    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    if-nez v6, :cond_5

    .line 137
    .line 138
    iget-object v7, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 139
    .line 140
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 141
    .line 142
    invoke-virtual {v7, v8}, Lcom/alibaba/fastjson2/JSONReader$Context;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-nez v7, :cond_4

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v2, "autoType not support : "

    .line 152
    .line 153
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object v5

    .line 171
    :cond_5
    :goto_2
    if-eqz v6, :cond_6

    .line 172
    .line 173
    const/4 v0, 0x1

    .line 174
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 175
    .line 176
    .line 177
    move-object/from16 v2, p2

    .line 178
    .line 179
    move-object/from16 v3, p3

    .line 180
    .line 181
    move-wide/from16 v4, p4

    .line 182
    .line 183
    move-object v0, v6

    .line 184
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0

    .line 189
    :cond_6
    move-wide/from16 v6, p4

    .line 190
    .line 191
    move-object v8, v4

    .line 192
    goto :goto_3

    .line 193
    :cond_7
    move-wide/from16 v6, p4

    .line 194
    .line 195
    move-object v8, v5

    .line 196
    goto :goto_3

    .line 197
    :cond_8
    move-wide/from16 v6, p4

    .line 198
    .line 199
    move-object v8, v5

    .line 200
    move-wide/from16 v18, v16

    .line 201
    .line 202
    :goto_3
    iget-object v4, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 203
    .line 204
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectSupplier()Ljava/util/function/Supplier;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    if-eqz v4, :cond_9

    .line 209
    .line 210
    invoke-interface {v4}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Ljava/util/Map;

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_9
    iget-wide v9, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 218
    .line 219
    or-long/2addr v9, v6

    .line 220
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 221
    .line 222
    iget-wide v11, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 223
    .line 224
    and-long/2addr v9, v11

    .line 225
    cmp-long v0, v9, v16

    .line 226
    .line 227
    if-eqz v0, :cond_a

    .line 228
    .line 229
    new-instance v0, Ljava/util/HashMap;

    .line 230
    .line 231
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_a
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->INSTANCE_OBJECT:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 236
    .line 237
    invoke-virtual {v1, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->createInstance(J)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, Ljava/util/Map;

    .line 246
    .line 247
    :goto_4
    if-eqz v8, :cond_c

    .line 248
    .line 249
    const-string v4, "java.util.ImmutableCollections$Map1"

    .line 250
    .line 251
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-nez v4, :cond_b

    .line 256
    .line 257
    const-string v4, "java.util.ImmutableCollections$MapN"

    .line 258
    .line 259
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_b

    .line 264
    .line 265
    const-string v4, "@type"

    .line 266
    .line 267
    invoke-interface {v0, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    :cond_b
    move-wide/from16 v18, v16

    .line 271
    .line 272
    :cond_c
    const/4 v4, 0x0

    .line 273
    move v6, v4

    .line 274
    :goto_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eqz v4, :cond_d

    .line 279
    .line 280
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 281
    .line 282
    .line 283
    return-object v0

    .line 284
    :cond_d
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-ne v4, v14, :cond_e

    .line 289
    .line 290
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 291
    .line 292
    .line 293
    :cond_e
    const/16 v4, 0x3a

    .line 294
    .line 295
    if-nez v6, :cond_f

    .line 296
    .line 297
    if-nez v8, :cond_f

    .line 298
    .line 299
    cmp-long v7, v18, v16

    .line 300
    .line 301
    if-eqz v7, :cond_f

    .line 302
    .line 303
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    goto :goto_6

    .line 308
    :cond_f
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isNumber()Z

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-eqz v7, :cond_10

    .line 313
    .line 314
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 319
    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_10
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    :goto_6
    const/16 v9, 0x7b

    .line 327
    .line 328
    if-nez v7, :cond_14

    .line 329
    .line 330
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    if-eq v7, v9, :cond_12

    .line 335
    .line 336
    if-ne v7, v15, :cond_11

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_11
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameUnquote()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    if-ne v10, v4, :cond_14

    .line 348
    .line 349
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 350
    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_12
    :goto_7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-eqz v4, :cond_13

    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_13
    const-string v0, "illegal input"

    .line 365
    .line 366
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-object v5

    .line 374
    :cond_14
    :goto_8
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 375
    .line 376
    .line 377
    move-result v10

    .line 378
    if-eq v10, v13, :cond_1e

    .line 379
    .line 380
    const/16 v4, 0x27

    .line 381
    .line 382
    if-eq v10, v4, :cond_1e

    .line 383
    .line 384
    const/16 v4, 0x2b

    .line 385
    .line 386
    if-eq v10, v4, :cond_1d

    .line 387
    .line 388
    const/16 v4, 0x53

    .line 389
    .line 390
    if-eq v10, v4, :cond_1b

    .line 391
    .line 392
    if-eq v10, v15, :cond_1a

    .line 393
    .line 394
    const/16 v4, 0x66

    .line 395
    .line 396
    if-eq v10, v4, :cond_19

    .line 397
    .line 398
    const/16 v4, 0x6e

    .line 399
    .line 400
    if-eq v10, v4, :cond_18

    .line 401
    .line 402
    const/16 v4, 0x74

    .line 403
    .line 404
    if-eq v10, v4, :cond_19

    .line 405
    .line 406
    if-eq v10, v9, :cond_15

    .line 407
    .line 408
    const/16 v4, 0x2d

    .line 409
    .line 410
    if-eq v10, v4, :cond_1d

    .line 411
    .line 412
    const/16 v9, 0x2e

    .line 413
    .line 414
    if-eq v10, v9, :cond_1d

    .line 415
    .line 416
    packed-switch v10, :pswitch_data_0

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    return-object v5

    .line 427
    :cond_15
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 428
    .line 429
    .line 430
    move-result v9

    .line 431
    if-eqz v9, :cond_17

    .line 432
    .line 433
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    const-string v10, ".."

    .line 438
    .line 439
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    if-eqz v10, :cond_16

    .line 444
    .line 445
    move-object v9, v0

    .line 446
    goto :goto_9

    .line 447
    :cond_16
    invoke-static {v9}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    invoke-virtual {v1, v0, v7, v9}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 452
    .line 453
    .line 454
    goto :goto_a

    .line 455
    :cond_17
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    goto :goto_9

    .line 460
    :cond_18
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readNullOrNewDate()Ljava/util/Date;

    .line 461
    .line 462
    .line 463
    move-result-object v9

    .line 464
    goto :goto_9

    .line 465
    :cond_19
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 466
    .line 467
    .line 468
    move-result v9

    .line 469
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    goto :goto_9

    .line 474
    :cond_1a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    goto :goto_9

    .line 479
    :cond_1b
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 480
    .line 481
    .line 482
    move-result v9

    .line 483
    if-eqz v9, :cond_1c

    .line 484
    .line 485
    const-class v9, Ljava/util/HashSet;

    .line 486
    .line 487
    invoke-virtual {v1, v9}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    goto :goto_9

    .line 492
    :cond_1c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    return-object v5

    .line 500
    :cond_1d
    :pswitch_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 501
    .line 502
    .line 503
    move-result-object v9

    .line 504
    goto :goto_9

    .line 505
    :cond_1e
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    :goto_9
    if-nez v9, :cond_1f

    .line 510
    .line 511
    sget-object v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 512
    .line 513
    iget-wide v10, v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 514
    .line 515
    and-long/2addr v10, v2

    .line 516
    cmp-long v10, v10, v16

    .line 517
    .line 518
    if-eqz v10, :cond_1f

    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_1f
    invoke-interface {v0, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v10

    .line 525
    if-eqz v10, :cond_21

    .line 526
    .line 527
    sget-object v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 528
    .line 529
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 530
    .line 531
    and-long/2addr v11, v2

    .line 532
    cmp-long v11, v11, v16

    .line 533
    .line 534
    if-eqz v11, :cond_21

    .line 535
    .line 536
    instance-of v11, v10, Ljava/util/Collection;

    .line 537
    .line 538
    if-eqz v11, :cond_20

    .line 539
    .line 540
    move-object v11, v10

    .line 541
    check-cast v11, Ljava/util/Collection;

    .line 542
    .line 543
    invoke-interface {v11, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    invoke-interface {v0, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    goto :goto_a

    .line 550
    :cond_20
    invoke-static {v10, v9}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 551
    .line 552
    .line 553
    move-result-object v9

    .line 554
    invoke-interface {v0, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    :cond_21
    :goto_a
    add-int/lit8 v6, v6, 0x1

    .line 558
    .line 559
    goto/16 :goto_5

    .line 560
    .line 561
    :cond_22
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    if-ne v0, v14, :cond_23

    .line 566
    .line 567
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    :cond_23
    if-eq v0, v13, :cond_2b

    .line 575
    .line 576
    const/16 v2, 0x27

    .line 577
    .line 578
    if-eq v0, v2, :cond_2b

    .line 579
    .line 580
    const/16 v2, 0x2b

    .line 581
    .line 582
    if-eq v0, v2, :cond_2a

    .line 583
    .line 584
    const/16 v2, 0x53

    .line 585
    .line 586
    if-eq v0, v2, :cond_28

    .line 587
    .line 588
    if-eq v0, v15, :cond_27

    .line 589
    .line 590
    const/16 v2, 0x66

    .line 591
    .line 592
    if-eq v0, v2, :cond_26

    .line 593
    .line 594
    const/16 v2, 0x6e

    .line 595
    .line 596
    if-eq v0, v2, :cond_25

    .line 597
    .line 598
    const/16 v2, 0x74

    .line 599
    .line 600
    if-eq v0, v2, :cond_26

    .line 601
    .line 602
    const/16 v2, 0x78

    .line 603
    .line 604
    if-eq v0, v2, :cond_24

    .line 605
    .line 606
    const/16 v4, 0x2d

    .line 607
    .line 608
    if-eq v0, v4, :cond_2a

    .line 609
    .line 610
    const/16 v9, 0x2e

    .line 611
    .line 612
    if-eq v0, v9, :cond_2a

    .line 613
    .line 614
    packed-switch v0, :pswitch_data_1

    .line 615
    .line 616
    .line 617
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    return-object v5

    .line 625
    :cond_24
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readBinary()[B

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    return-object v0

    .line 630
    :cond_25
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readNullOrNewDate()Ljava/util/Date;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    return-object v0

    .line 635
    :cond_26
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    return-object v0

    .line 644
    :cond_27
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    return-object v0

    .line 649
    :cond_28
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    if-eqz v0, :cond_29

    .line 654
    .line 655
    new-instance v0, Ljava/util/HashSet;

    .line 656
    .line 657
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Collection;)V

    .line 661
    .line 662
    .line 663
    return-object v0

    .line 664
    :cond_29
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    return-object v5

    .line 672
    :cond_2a
    :pswitch_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    return-object v0

    .line 677
    :cond_2b
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    return-object v0

    .line 682
    nop

    .line 683
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
