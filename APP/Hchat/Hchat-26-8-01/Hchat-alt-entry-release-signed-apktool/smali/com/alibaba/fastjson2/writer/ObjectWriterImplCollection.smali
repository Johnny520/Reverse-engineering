.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;
.super Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;

.field static final LINKED_HASH_SET_JSONB_TYPE_HASH:J

.field static final LINKED_HASH_SET_JSONB_TYPE_NAME_BYTES:[B

.field static final TREE_SET_JSONB_TYPE_HASH:J

.field static final TREE_SET_JSONB_TYPE_NAME_BYTES:[B


# instance fields
.field features:J

.field itemType:Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;

    .line 7
    .line 8
    const-class v0, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->LINKED_HASH_SET_JSONB_TYPE_NAME_BYTES:[B

    .line 19
    .line 20
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    sput-wide v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->LINKED_HASH_SET_JSONB_TYPE_HASH:J

    .line 29
    .line 30
    const-class v0, Ljava/util/TreeSet;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sput-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->TREE_SET_JSONB_TYPE_NAME_BYTES:[B

    .line 41
    .line 42
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    sput-wide v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->TREE_SET_JSONB_TYPE_HASH:J

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 7

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 6
    .line 7
    .line 8
    move-object p1, p0

    .line 9
    return-void

    .line 10
    :cond_0
    move-object v1, p1

    .line 11
    move-object p1, p0

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    instance-of p3, p2, Ljava/util/Set;

    .line 19
    .line 20
    if-eqz p3, :cond_2

    .line 21
    .line 22
    iget-wide p3, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->features:J

    .line 23
    .line 24
    or-long/2addr p3, p5

    .line 25
    invoke-virtual {v1, p2, p3, p4}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;J)Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    const-string p3, "Set"

    .line 32
    .line 33
    invoke-virtual {v1, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    check-cast p2, Ljava/lang/Iterable;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->startArray()V

    .line 39
    .line 40
    .line 41
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const/4 p3, 0x0

    .line 46
    const/4 p4, 0x0

    .line 47
    move p5, p4

    .line 48
    move-object p4, p3

    .line 49
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p6

    .line 53
    if-eqz p6, :cond_6

    .line 54
    .line 55
    if-eqz p5, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeComma()V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 67
    .line 68
    .line 69
    add-int/lit8 p5, p5, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object p6

    .line 76
    if-ne p6, p3, :cond_5

    .line 77
    .line 78
    :goto_1
    move-object v0, p4

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    invoke-virtual {v1, p6}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    move-object p3, p6

    .line 85
    goto :goto_1

    .line 86
    :goto_2
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    iget-object v4, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->itemType:Ljava/lang/reflect/Type;

    .line 91
    .line 92
    iget-wide v5, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->features:J

    .line 93
    .line 94
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 p5, p5, 0x1

    .line 98
    .line 99
    move-object p4, v0

    .line 100
    goto :goto_0

    .line 101
    :cond_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->endArray()V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 14

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v3, v2, Ljava/lang/Class;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    move-object v3, v2

    .line 19
    check-cast v3, Ljava/lang/Class;

    .line 20
    .line 21
    move-object v5, v4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    instance-of v3, v2, Ljava/lang/reflect/ParameterizedType;

    .line 24
    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    array-length v6, v5

    .line 35
    if-ne v6, v7, :cond_2

    .line 36
    .line 37
    aget-object v5, v5, v8

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v5, v4

    .line 41
    :goto_0
    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    instance-of v6, v3, Ljava/lang/Class;

    .line 46
    .line 47
    if-eqz v6, :cond_3

    .line 48
    .line 49
    check-cast v3, Ljava/lang/Class;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move-object v3, v4

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    move-object v3, v4

    .line 55
    move-object v5, v3

    .line 56
    :goto_1
    move-object v6, v0

    .line 57
    check-cast v6, Ljava/util/Collection;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    invoke-virtual {p1, v0, v3}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    const-class v10, Ljava/util/Set;

    .line 70
    .line 71
    if-ne v3, v10, :cond_5

    .line 72
    .line 73
    const-class v3, Ljava/util/HashSet;

    .line 74
    .line 75
    if-ne v9, v3, :cond_5

    .line 76
    .line 77
    :goto_2
    move v0, v8

    .line 78
    goto :goto_3

    .line 79
    :cond_5
    const-class v3, Ljava/util/Collection;

    .line 80
    .line 81
    if-ne v2, v3, :cond_6

    .line 82
    .line 83
    const-class v2, Ljava/util/ArrayList;

    .line 84
    .line 85
    if-ne v9, v2, :cond_6

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    :goto_3
    if-eqz v0, :cond_9

    .line 89
    .line 90
    const-class v0, Ljava/util/LinkedHashSet;

    .line 91
    .line 92
    if-ne v9, v0, :cond_7

    .line 93
    .line 94
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->LINKED_HASH_SET_JSONB_TYPE_NAME_BYTES:[B

    .line 95
    .line 96
    sget-wide v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->LINKED_HASH_SET_JSONB_TYPE_HASH:J

    .line 97
    .line 98
    invoke-virtual {p1, v0, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName([BJ)Z

    .line 99
    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_7
    const-class v0, Ljava/util/TreeSet;

    .line 103
    .line 104
    if-ne v9, v0, :cond_8

    .line 105
    .line 106
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->TREE_SET_JSONB_TYPE_NAME_BYTES:[B

    .line 107
    .line 108
    sget-wide v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->TREE_SET_JSONB_TYPE_HASH:J

    .line 109
    .line 110
    invoke-virtual {p1, v0, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName([BJ)Z

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    invoke-static {v9}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_9
    :goto_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-le v2, v7, :cond_a

    .line 130
    .line 131
    instance-of v2, v6, Ljava/util/SortedSet;

    .line 132
    .line 133
    if-nez v2, :cond_a

    .line 134
    .line 135
    instance-of v2, v6, Ljava/util/LinkedHashSet;

    .line 136
    .line 137
    if-nez v2, :cond_a

    .line 138
    .line 139
    move v9, v8

    .line 140
    goto :goto_5

    .line 141
    :cond_a
    move v9, v0

    .line 142
    :goto_5
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    move-object v0, v4

    .line 154
    move v11, v8

    .line 155
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_10

    .line 160
    .line 161
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-nez v2, :cond_b

    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 168
    .line 169
    .line 170
    move-object v12, v4

    .line 171
    :goto_7
    move-object v4, v5

    .line 172
    goto :goto_a

    .line 173
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    if-ne v3, v4, :cond_c

    .line 178
    .line 179
    move-object v12, v4

    .line 180
    goto :goto_8

    .line 181
    :cond_c
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    move-object v12, v3

    .line 186
    :goto_8
    if-eqz v9, :cond_d

    .line 187
    .line 188
    invoke-static {v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez v3, :cond_d

    .line 193
    .line 194
    move v13, v7

    .line 195
    goto :goto_9

    .line 196
    :cond_d
    move v13, v8

    .line 197
    :goto_9
    if-eqz v13, :cond_e

    .line 198
    .line 199
    invoke-virtual {p1, v11, v2}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-eqz v3, :cond_e

    .line 204
    .line 205
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_e
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    move-object v1, p1

    .line 217
    move-object v4, v5

    .line 218
    move-wide/from16 v5, p5

    .line 219
    .line 220
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 221
    .line 222
    .line 223
    if-eqz v13, :cond_f

    .line 224
    .line 225
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_f
    :goto_a
    add-int/lit8 v11, v11, 0x1

    .line 229
    .line 230
    move-object v5, v4

    .line 231
    move-object v4, v12

    .line 232
    goto :goto_6

    .line 233
    :cond_10
    return-void
.end method
