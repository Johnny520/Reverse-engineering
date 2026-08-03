.class public final Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# instance fields
.field final instanceType:Ljava/lang/Class;

.field final instanceTypeHash:J

.field final listType:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->listType:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->instanceType:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->instanceTypeHash:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public createInstance(J)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->instanceType:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p2, Ljava/util/ArrayList;

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    const-class p2, Ljava/util/LinkedList;

    .line 14
    .line 15
    if-ne p1, p2, :cond_1

    .line 16
    .line 17
    new-instance p1, Ljava/util/LinkedList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-object p1

    .line 28
    :catch_0
    const-string p1, "create list error, type "

    .line 29
    .line 30
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->instanceType:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-static {p2, p1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method

.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 0

    .line 37
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->createInstance(J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    .line 38
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 39
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/TypeUtils;->toLong(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->listType:Ljava/lang/Class;

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->instanceTypeHash:J

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    move-wide v4, p4

    .line 15
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_1
    const-class p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    if-ne v1, p2, :cond_2

    .line 28
    .line 29
    new-instance p2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const-class p2, Lcom/alibaba/fastjson2/JSONArray;

    .line 36
    .line 37
    if-ne v1, p2, :cond_3

    .line 38
    .line 39
    new-instance p2, Lcom/alibaba/fastjson2/JSONArray;

    .line 40
    .line 41
    invoke-direct {p2}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    if-eqz v1, :cond_4

    .line 46
    .line 47
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->listType:Ljava/lang/Class;

    .line 48
    .line 49
    if-eq v1, p2, :cond_4

    .line 50
    .line 51
    invoke-interface {p1, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Ljava/util/Collection;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    iget-object p2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 59
    .line 60
    iget-wide p2, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 61
    .line 62
    or-long/2addr p2, v4

    .line 63
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->createInstance(J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    check-cast p2, Ljava/util/Collection;

    .line 68
    .line 69
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    const/4 p4, 0x0

    .line 74
    :goto_1
    if-ge p4, p3, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64()Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    invoke-interface {p2, p5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    add-int/lit8 p4, p4, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    if-eqz p1, :cond_6

    .line 87
    .line 88
    invoke-interface {p1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getBuildFunction()Ljava/util/function/Function;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-eqz p1, :cond_6

    .line 93
    .line 94
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Ljava/util/Collection;

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_6
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
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

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
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/16 p2, 0x2c

    .line 31
    .line 32
    if-eqz p1, :cond_4

    .line 33
    .line 34
    iget-object p1, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 35
    .line 36
    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 37
    .line 38
    or-long p3, v3, p4

    .line 39
    .line 40
    invoke-virtual {p0, p3, p4}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->createInstance(J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-virtual {p3, p2}, Ljava/lang/String;->indexOf(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    const/4 p4, -0x1

    .line 55
    if-eq p2, p4, :cond_2

    .line 56
    .line 57
    const-string p2, ","

    .line 58
    .line 59
    invoke-virtual {p3, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    array-length p3, p2

    .line 64
    const/4 p4, 0x0

    .line 65
    :goto_0
    if-ge p4, p3, :cond_3

    .line 66
    .line 67
    aget-object p5, p2, p4

    .line 68
    .line 69
    invoke-static {p5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object p5

    .line 77
    invoke-interface {p1, p5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 p4, p4, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 84
    .line 85
    .line 86
    move-result-wide p2

    .line 87
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_4
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    const/16 v0, 0x5b

    .line 107
    .line 108
    if-ne p3, v0, :cond_9

    .line 109
    .line 110
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 111
    .line 112
    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    iget-object p1, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->instanceType:Ljava/lang/Class;

    .line 116
    .line 117
    const-class p3, Ljava/util/Collection;

    .line 118
    .line 119
    if-ne p1, p3, :cond_5

    .line 120
    .line 121
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 122
    .line 123
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    iget-object p1, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 128
    .line 129
    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 130
    .line 131
    or-long p3, v3, p4

    .line 132
    .line 133
    invoke-virtual {p0, p3, p4}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;->createInstance(J)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Ljava/util/Collection;

    .line 138
    .line 139
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 140
    .line 141
    .line 142
    move-result p3

    .line 143
    const-string p4, "illegal input error"

    .line 144
    .line 145
    if-nez p3, :cond_8

    .line 146
    .line 147
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    if-eqz p3, :cond_6

    .line 152
    .line 153
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 154
    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_6
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 158
    .line 159
    .line 160
    move-result p3

    .line 161
    if-eq p3, p2, :cond_7

    .line 162
    .line 163
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readInt64()Ljava/lang/Long;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_7
    invoke-virtual {v2, p4}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const/4 p1, 0x0

    .line 179
    return-object p1

    .line 180
    :cond_8
    invoke-virtual {v2, p4}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const/4 p1, 0x0

    .line 188
    return-object p1

    .line 189
    :cond_9
    const-string p1, "format error"

    .line 190
    .line 191
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const/4 p1, 0x0

    .line 199
    return-object p1
.end method
