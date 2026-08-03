.class final Lcom/alibaba/fastjson2/JSONPathSegmentName;
.super Lcom/alibaba/fastjson2/JSONPathSegment;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field final name:Ljava/lang/String;

.field final nameHashCode:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONPathSegment;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->nameHashCode:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    const-class v2, Lcom/alibaba/fastjson2/JSONPathSegmentName;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lcom/alibaba/fastjson2/JSONPathSegmentName;

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->nameHashCode:J

    .line 20
    .line 21
    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONPathSegmentName;->nameHashCode:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 30
    .line 31
    if-eq v2, v3, :cond_3

    .line 32
    .line 33
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    iget-object p1, p1, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    :cond_3
    return v0

    .line 46
    :cond_4
    :goto_0
    return v1
.end method

.method public eval(Lcom/alibaba/fastjson2/JSONPath$Context;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->parent:Lcom/alibaba/fastjson2/JSONPath$Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->root:Ljava/lang/Object;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 9
    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_1
    instance-of v1, v0, Ljava/util/Map;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    check-cast v0, Ljava/util/Map;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_5

    .line 28
    .line 29
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_5

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    instance-of v6, v5, Ljava/lang/Enum;

    .line 60
    .line 61
    if-eqz v6, :cond_3

    .line 62
    .line 63
    move-object v6, v5

    .line 64
    check-cast v6, Ljava/lang/Enum;

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    iget-object v7, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_3

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    instance-of v6, v5, Ljava/lang/Long;

    .line 84
    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    if-nez v2, :cond_4

    .line 88
    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v6

    .line 97
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    :cond_4
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_2

    .line 106
    .line 107
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :cond_5
    :goto_1
    iput-object v1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    instance-of v1, v0, Ljava/util/Collection;

    .line 115
    .line 116
    if-eqz v1, :cond_e

    .line 117
    .line 118
    check-cast v0, Ljava/util/Collection;

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_d

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    instance-of v4, v3, Ljava/util/Map;

    .line 139
    .line 140
    if-eqz v4, :cond_7

    .line 141
    .line 142
    check-cast v3, Ljava/util/Map;

    .line 143
    .line 144
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 145
    .line 146
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-nez v3, :cond_8

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_8
    instance-of v4, v3, Ljava/util/Collection;

    .line 154
    .line 155
    if-eqz v4, :cond_b

    .line 156
    .line 157
    const/4 v4, 0x1

    .line 158
    if-ne v1, v4, :cond_9

    .line 159
    .line 160
    check-cast v3, Ljava/util/Collection;

    .line 161
    .line 162
    move-object v2, v3

    .line 163
    goto :goto_2

    .line 164
    :cond_9
    if-nez v2, :cond_a

    .line 165
    .line 166
    new-instance v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 167
    .line 168
    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 169
    .line 170
    .line 171
    :cond_a
    check-cast v3, Ljava/util/Collection;

    .line 172
    .line 173
    invoke-interface {v2, v3}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_b
    if-nez v2, :cond_c

    .line 178
    .line 179
    new-instance v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 180
    .line 181
    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 182
    .line 183
    .line 184
    :cond_c
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_d
    iput-object v2, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 189
    .line 190
    return-void

    .line 191
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->path:Lcom/alibaba/fastjson2/JSONPath;

    .line 196
    .line 197
    iget-object v3, v3, Lcom/alibaba/fastjson2/JSONPath;->writerContext:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 198
    .line 199
    if-eqz v3, :cond_f

    .line 200
    .line 201
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    goto :goto_3

    .line 206
    :cond_f
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 207
    .line 208
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    :goto_3
    instance-of v4, v3, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 213
    .line 214
    if-eqz v4, :cond_11

    .line 215
    .line 216
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->nameHashCode:J

    .line 217
    .line 218
    invoke-interface {v3, v1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->getFieldWriter(J)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-eqz v1, :cond_10

    .line 223
    .line 224
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iput-object v0, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 229
    .line 230
    :cond_10
    :goto_4
    return-void

    .line 231
    :cond_11
    instance-of v3, v0, Ljava/lang/Number;

    .line 232
    .line 233
    if-nez v3, :cond_13

    .line 234
    .line 235
    instance-of v0, v0, Ljava/lang/Boolean;

    .line 236
    .line 237
    if-eqz v0, :cond_12

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_12
    const-string p1, "not support : "

    .line 241
    .line 242
    invoke-static {v1, p1}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_13
    :goto_5
    iput-object v2, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 251
    .line 252
    return-void
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->nameHashCode:J

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPathSegmentName;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
