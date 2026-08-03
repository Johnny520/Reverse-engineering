.class final Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapString;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;J)V
    .locals 8

    .line 1
    const-class v4, Ljava/lang/String;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move-wide v5, p3

    .line 9
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_4

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/16 v0, 0x5b

    .line 21
    .line 22
    if-ne p2, v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const/16 v0, 0x7b

    .line 32
    .line 33
    if-ne p2, v0, :cond_1

    .line 34
    .line 35
    const-class v3, Ljava/lang/String;

    .line 36
    .line 37
    move-object v1, p0

    .line 38
    move-object v2, p1

    .line 39
    move-object v4, p3

    .line 40
    move-wide v5, p4

    .line 41
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapString;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_1
    move-object v1, p0

    .line 56
    move-object v2, p1

    .line 57
    :cond_2
    const-string p1, "expect \'{\', but \'[\'"

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    return-object p1

    .line 68
    :cond_3
    move-object v1, p0

    .line 69
    move-object v2, p1

    .line 70
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    return-object p1

    .line 78
    :cond_4
    move-object v1, p0

    .line 79
    move-object v2, p1

    .line 80
    :cond_5
    iget-object p1, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 81
    .line 82
    iget-object p2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->instanceType:Ljava/lang/Class;

    .line 83
    .line 84
    const-class p3, Ljava/util/HashMap;

    .line 85
    .line 86
    if-ne p2, p3, :cond_6

    .line 87
    .line 88
    new-instance p2, Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_6
    iget-wide p2, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 95
    .line 96
    or-long/2addr p2, p4

    .line 97
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->createInstance(J)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Ljava/util/Map;

    .line 102
    .line 103
    :goto_0
    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 104
    .line 105
    or-long p3, p4, v3

    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    :goto_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 109
    .line 110
    .line 111
    move-result p5

    .line 112
    if-eqz p5, :cond_7

    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 115
    .line 116
    .line 117
    return-object p2

    .line 118
    :cond_7
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p5

    .line 122
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-wide/16 v3, 0x0

    .line 127
    .line 128
    if-nez p1, :cond_8

    .line 129
    .line 130
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 131
    .line 132
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 133
    .line 134
    and-long/2addr v5, p3

    .line 135
    cmp-long v5, v5, v3

    .line 136
    .line 137
    if-eqz v5, :cond_8

    .line 138
    .line 139
    invoke-interface {p0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getTypeKey()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {p5, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_8

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    if-nez v0, :cond_9

    .line 151
    .line 152
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 153
    .line 154
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 155
    .line 156
    and-long/2addr v5, p3

    .line 157
    cmp-long v5, v5, v3

    .line 158
    .line 159
    if-eqz v5, :cond_9

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_9
    invoke-interface {p2, p5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    if-eqz v5, :cond_b

    .line 167
    .line 168
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 169
    .line 170
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 171
    .line 172
    and-long/2addr v6, p3

    .line 173
    cmp-long v3, v6, v3

    .line 174
    .line 175
    if-eqz v3, :cond_b

    .line 176
    .line 177
    instance-of v3, v5, Ljava/util/Collection;

    .line 178
    .line 179
    if-eqz v3, :cond_a

    .line 180
    .line 181
    move-object v3, v5

    .line 182
    check-cast v3, Ljava/util/Collection;

    .line 183
    .line 184
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    invoke-interface {p2, p5, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_a
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {p2, p5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    :cond_b
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 199
    .line 200
    goto :goto_1
.end method
