.class final Lcom/alibaba/fastjson2/JSONPathSegmentIndex;
.super Lcom/alibaba/fastjson2/JSONPathSegment;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final ONE:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

.field static final TWO:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

.field static final ZERO:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;


# instance fields
.field final index:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->ZERO:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 8
    .line 9
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->ONE:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 16
    .line 17
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->TWO:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONPathSegment;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p1, "not support negative index"

    .line 10
    .line 11
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1
.end method

.method private eval(Ljava/util/Map;)Ljava/lang/Object;
    .locals 7

    .line 192
    iget v0, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 193
    iget v0, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_6

    .line 194
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    .line 195
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v4, :cond_3

    .line 196
    instance-of v4, p1, Ljava/util/LinkedHashMap;

    if-nez v4, :cond_3

    instance-of v4, p1, Ljava/util/SortedMap;

    if-eqz v4, :cond_1

    goto :goto_1

    .line 197
    :cond_1
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    if-gt v3, v1, :cond_6

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    if-ge v3, v1, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 198
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 199
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    .line 200
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 201
    instance-of v5, v4, Ljava/lang/Long;

    if-eqz v5, :cond_2

    .line 202
    iget v5, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    int-to-long v5, v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 203
    :cond_3
    :goto_1
    iget p1, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    if-gt v3, p1, :cond_6

    if-ge v3, v1, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 204
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 205
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    .line 206
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 207
    instance-of v5, v4, Ljava/lang/Long;

    .line 208
    iget v6, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    if-eqz v5, :cond_4

    int-to-long v5, v6

    .line 209
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    return-object p1

    :cond_4
    if-ne v3, v6, :cond_5

    move-object v0, p1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    return-object v0
.end method

.method public static of(I)Lcom/alibaba/fastjson2/JSONPathSegmentIndex;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->ZERO:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->ONE:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x2

    .line 13
    if-ne p0, v0, :cond_2

    .line 14
    .line 15
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->TWO:Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public eval(Lcom/alibaba/fastjson2/JSONPath$Context;)V
    .locals 5

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
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->eval:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    instance-of v2, v0, Ljava/util/List;

    .line 17
    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    check-cast v0, Ljava/util/List;

    .line 21
    .line 22
    iget v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v2, v3, :cond_2

    .line 29
    .line 30
    iget v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 31
    .line 32
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 37
    .line 38
    :cond_2
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->eval:Z

    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    instance-of v2, v0, Ljava/util/SortedSet;

    .line 42
    .line 43
    if-nez v2, :cond_b

    .line 44
    .line 45
    instance-of v2, v0, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    if-nez v2, :cond_b

    .line 48
    .line 49
    iget v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 50
    .line 51
    if-nez v2, :cond_4

    .line 52
    .line 53
    instance-of v2, v0, Ljava/util/Collection;

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    move-object v2, v0

    .line 58
    check-cast v2, Ljava/util/Collection;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-ne v2, v1, :cond_4

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    instance-of v2, v0, [Ljava/lang/Object;

    .line 68
    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    check-cast v0, [Ljava/lang/Object;

    .line 72
    .line 73
    iget v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 74
    .line 75
    array-length v3, v0

    .line 76
    if-ge v2, v3, :cond_5

    .line 77
    .line 78
    aget-object v0, v0, v2

    .line 79
    .line 80
    iput-object v0, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 81
    .line 82
    :cond_5
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->eval:Z

    .line 83
    .line 84
    return-void

    .line 85
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_8

    .line 94
    .line 95
    invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    iget v3, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 100
    .line 101
    if-ge v3, v2, :cond_7

    .line 102
    .line 103
    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 108
    .line 109
    :cond_7
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->eval:Z

    .line 110
    .line 111
    return-void

    .line 112
    :cond_8
    const-class v3, Ljava/util/Map;

    .line 113
    .line 114
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_9

    .line 119
    .line 120
    check-cast v0, Ljava/util/Map;

    .line 121
    .line 122
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->eval(Ljava/util/Map;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 127
    .line 128
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->eval:Z

    .line 129
    .line 130
    return-void

    .line 131
    :cond_9
    iget v3, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 132
    .line 133
    if-nez v3, :cond_a

    .line 134
    .line 135
    iput-object v0, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 136
    .line 137
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->eval:Z

    .line 138
    .line 139
    return-void

    .line 140
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string v1, "jsonpath not support operate : "

    .line 143
    .line 144
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object p1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->path:Lcom/alibaba/fastjson2/JSONPath;

    .line 148
    .line 149
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string p1, ", objectClass"

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v0, p1, v1}, Lah/a;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_b
    :goto_1
    check-cast v0, Ljava/util/Collection;

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const/4 v2, 0x0

    .line 169
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_d

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    iget v4, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 180
    .line 181
    if-ne v2, v4, :cond_c

    .line 182
    .line 183
    iput-object v3, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_d
    :goto_3
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/JSONPath$Context;->eval:Z

    .line 190
    .line 191
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->stringSize(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v1, v0, 0x2

    .line 8
    .line 9
    new-array v1, v1, [C

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/16 v3, 0x5b

    .line 13
    .line 14
    aput-char v3, v1, v2

    .line 15
    .line 16
    iget v2, p0, Lcom/alibaba/fastjson2/JSONPathSegmentIndex;->index:I

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-static {v1, v3, v2}, Lcom/alibaba/fastjson2/util/IOUtils;->writeInt32([CII)I

    .line 20
    .line 21
    .line 22
    add-int/2addr v0, v3

    .line 23
    const/16 v2, 0x5d

    .line 24
    .line 25
    aput-char v2, v1, v0

    .line 26
    .line 27
    new-instance v0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
