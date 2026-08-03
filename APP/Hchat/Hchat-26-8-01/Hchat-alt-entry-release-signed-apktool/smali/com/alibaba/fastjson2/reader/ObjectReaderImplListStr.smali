.class public final Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# instance fields
.field final instanceType:Ljava/lang/Class;

.field final listType:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->listType:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->instanceType:Ljava/lang/Class;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->lambda$readJSONBObject$0(Ljava/util/Collection;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->lambda$readJSONBObject$1(Ljava/util/Collection;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$readJSONBObject$0(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static synthetic lambda$readJSONBObject$1(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public createInstance(J)Ljava/lang/Object;
    .locals 0

    .line 69
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->instanceType:Ljava/lang/Class;

    const-class p2, Ljava/util/ArrayList;

    if-ne p1, p2, :cond_0

    .line 70
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 71
    :cond_0
    const-class p2, Ljava/util/LinkedList;

    if-ne p1, p2, :cond_1

    .line 72
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    return-object p1

    .line 73
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 74
    :catch_0
    const-string p1, "create list error, type "

    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->instanceType:Ljava/lang/Class;

    invoke-static {p2, p1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->listType:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    instance-of v1, v1, Ljava/lang/String;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-object p1

    .line 29
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->createInstance(J)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ljava/util/Collection;

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-eqz p3, :cond_5

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    if-eqz p3, :cond_4

    .line 50
    .line 51
    instance-of v0, p3, Ljava/lang/String;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    :goto_2
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    return-object p2
.end method

.method public getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->listType:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->instanceType:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->listType:Ljava/lang/Class;

    .line 12
    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    move-wide v5, p4

    .line 17
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :cond_1
    sget-object p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_ARRAYS_LIST:Ljava/lang/Class;

    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    if-ne p2, p1, :cond_3

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    new-array p2, p1, [Ljava/lang/String;

    .line 37
    .line 38
    :goto_0
    if-ge p3, p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    aput-object p4, p2, p3

    .line 45
    .line 46
    add-int/lit8 p3, p3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const-class p4, Ljava/util/ArrayList;

    .line 59
    .line 60
    if-ne p2, p4, :cond_5

    .line 61
    .line 62
    new-instance p2, Ljava/util/ArrayList;

    .line 63
    .line 64
    if-lez p1, :cond_4

    .line 65
    .line 66
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_4
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_5
    const-class p4, Lcom/alibaba/fastjson2/JSONArray;

    .line 77
    .line 78
    if-ne p2, p4, :cond_7

    .line 79
    .line 80
    new-instance p2, Lcom/alibaba/fastjson2/JSONArray;

    .line 81
    .line 82
    if-lez p1, :cond_6

    .line 83
    .line 84
    invoke-direct {p2, p1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_6
    invoke-direct {p2}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_3

    .line 93
    .line 94
    :cond_7
    sget-object p4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

    .line 95
    .line 96
    if-ne p2, p4, :cond_8

    .line 97
    .line 98
    new-instance p2, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 104
    .line 105
    const/4 p4, 0x1

    .line 106
    invoke-direct {v0, p4}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_3

    .line 110
    .line 111
    :cond_8
    sget-object p4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 112
    .line 113
    if-ne p2, p4, :cond_9

    .line 114
    .line 115
    new-instance p2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 121
    .line 122
    const/4 p4, 0x2

    .line 123
    invoke-direct {v0, p4}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_9
    sget-object p4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

    .line 128
    .line 129
    if-ne p2, p4, :cond_a

    .line 130
    .line 131
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 132
    .line 133
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 134
    .line 135
    .line 136
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 137
    .line 138
    const/4 p4, 0x3

    .line 139
    invoke-direct {v0, p4}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_a
    sget-object p4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON:Ljava/lang/Class;

    .line 144
    .line 145
    if-ne p2, p4, :cond_b

    .line 146
    .line 147
    new-instance p2, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 153
    .line 154
    const/16 p4, 0x11

    .line 155
    .line 156
    invoke-direct {v0, p4}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_b
    sget-object p4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON_LIST:Ljava/lang/Class;

    .line 161
    .line 162
    if-ne p2, p4, :cond_c

    .line 163
    .line 164
    new-instance p2, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 170
    .line 171
    const/16 p4, 0x12

    .line 172
    .line 173
    invoke-direct {v0, p4}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_c
    if-eqz p2, :cond_d

    .line 178
    .line 179
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->listType:Ljava/lang/Class;

    .line 180
    .line 181
    if-eq p2, p4, :cond_d

    .line 182
    .line 183
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p4

    .line 187
    check-cast p4, Ljava/util/Collection;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    .line 189
    move-object p2, p4

    .line 190
    goto :goto_3

    .line 191
    :catch_0
    move-exception v0

    .line 192
    :goto_1
    move-object p1, v0

    .line 193
    goto :goto_2

    .line 194
    :catch_1
    move-exception v0

    .line 195
    goto :goto_1

    .line 196
    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string p4, "create instance error "

    .line 199
    .line 200
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    const/4 p1, 0x0

    .line 218
    return-object p1

    .line 219
    :cond_d
    iget-object p2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 220
    .line 221
    iget-wide p4, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 222
    .line 223
    or-long/2addr p4, v5

    .line 224
    invoke-virtual {p0, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->createInstance(J)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    check-cast p2, Ljava/util/Collection;

    .line 229
    .line 230
    :goto_3
    if-ge p3, p1, :cond_e

    .line 231
    .line 232
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p4

    .line 236
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    add-int/lit8 p3, p3, 0x1

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_e
    if-eqz v0, :cond_f

    .line 243
    .line 244
    invoke-interface {v0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, Ljava/util/Collection;

    .line 249
    .line 250
    return-object p1

    .line 251
    :cond_f
    return-object p2
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v5, 0x0

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object p1, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 39
    .line 40
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 41
    .line 42
    or-long/2addr p1, p4

    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;->createInstance(J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ljava/util/Collection;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    const/16 p3, 0x5b

    .line 54
    .line 55
    if-ne p2, p3, :cond_5

    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-nez p2, :cond_4

    .line 72
    .line 73
    instance-of p3, p1, Ljava/util/SortedSet;

    .line 74
    .line 75
    if-eqz p3, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    const/16 p3, 0x22

    .line 83
    .line 84
    if-eq p2, p3, :cond_7

    .line 85
    .line 86
    const/16 p3, 0x27

    .line 87
    .line 88
    if-eq p2, p3, :cond_7

    .line 89
    .line 90
    const/16 p3, 0x7b

    .line 91
    .line 92
    if-ne p2, p3, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    return-object p1

    .line 104
    :cond_7
    :goto_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-nez p3, :cond_8

    .line 113
    .line 114
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_8
    :goto_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 118
    .line 119
    .line 120
    return-object p1
.end method
