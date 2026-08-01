.class public final L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏([B)[B
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    array-length v0, p0

    .line 6
    const/4 v1, 0x4

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    const/4 v0, 0x0

    .line 11
    aget-byte v0, p0, v0

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    array-length v0, p0

    .line 16
    invoke-static {p0, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_2
    :goto_0
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰([B)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    aget-byte v3, p0, v2

    .line 11
    .line 12
    const-string v4, "\u55b5\u545c\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5"

    .line 13
    .line 14
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    and-int/lit16 v3, v3, 0xff

    .line 19
    .line 20
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormat:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    filled-new-array {v0}, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->toJSONString([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object p0

    .line 16
    :catch_0
    const/16 p0, 0x323

    .line 17
    .line 18
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()[B
    .locals 10

    .line 1
    iget-object p0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 2
    .line 3
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-boolean v1, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 9
    .line 10
    new-instance v1, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;

    .line 11
    .line 12
    const/16 v2, 0x1000

    .line 13
    .line 14
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;-><init>(Ljava/io/OutputStream;I)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    :try_start_0
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_5

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    instance-of v7, v6, Ljava/lang/Long;

    .line 59
    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    check-cast v6, Ljava/lang/Long;

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    invoke-virtual {v1, v8, v6, v7}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子世哲苏楪兰(IJ)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catch_0
    move-exception p0

    .line 77
    goto/16 :goto_1

    .line 78
    .line 79
    :cond_1
    instance-of v7, v6, Ljava/lang/String;

    .line 80
    .line 81
    const/4 v8, 0x2

    .line 82
    if-eqz v7, :cond_2

    .line 83
    .line 84
    check-cast v6, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    array-length v9, v6

    .line 95
    invoke-virtual {v1, v7, v8}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏兰哲楪(II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v6, v9}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏([BI)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    instance-of v7, v6, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 103
    .line 104
    if-eqz v7, :cond_3

    .line 105
    .line 106
    check-cast v6, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 107
    .line 108
    invoke-virtual {v6}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()[B

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    array-length v9, v6

    .line 117
    invoke-virtual {v1, v7, v8}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏兰哲楪(II)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v6, v9}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏([BI)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    instance-of v7, v6, Ljava/lang/Integer;

    .line 125
    .line 126
    if-eqz v7, :cond_4

    .line 127
    .line 128
    check-cast v6, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    invoke-virtual {v1, v7, v6}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪哲兰苏(II)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_4
    const/16 v7, 0x320

    .line 143
    .line 144
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    new-instance v8, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const/16 v9, 0x321

    .line 154
    .line 155
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    new-instance v8, Ljava/lang/RuntimeException;

    .line 178
    .line 179
    invoke-direct {v8}, Ljava/lang/RuntimeException;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-static {v7, v6, v8, v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_5
    iget p0, v1, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 188
    .line 189
    if-lez p0, :cond_6

    .line 190
    .line 191
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子世兰苏哲楪()V

    .line 192
    .line 193
    .line 194
    :cond_6
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 195
    .line 196
    .line 197
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    return-object p0

    .line 199
    :goto_1
    const/16 v0, 0x322

    .line 200
    .line 201
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v0, v1, p0, v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 212
    .line 213
    .line 214
    const/4 p0, 0x0

    .line 215
    new-array p0, p0, [B

    .line 216
    .line 217
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 6
    .line 7
    const/16 v1, 0xe

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/JSONObject;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    instance-of v3, v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    new-instance v3, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 34
    .line 35
    invoke-direct {v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 36
    .line 37
    .line 38
    check-cast v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 39
    .line 40
    invoke-virtual {v3, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2, v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    instance-of v3, v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 48
    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    check-cast v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-ge v3, v4, :cond_0

    .line 59
    .line 60
    invoke-virtual {v1, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    instance-of v5, v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    new-instance v5, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    invoke-direct {v5}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 71
    .line 72
    .line 73
    check-cast v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 74
    .line 75
    invoke-virtual {v5, v4}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v2, v5}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    invoke-virtual {p0, v2, v4}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {p0, v2, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catch_0
    :cond_4
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲([B)V
    .locals 9

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/CodedInputStream$VarintExperiment;

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p1, v2, v1, v2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lez v1, :cond_8

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    ushr-int/lit8 v3, v1, 0x3

    .line 22
    .line 23
    and-int/lit8 v1, v1, 0x7

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    if-eq v1, v4, :cond_7

    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    if-eq v1, v4, :cond_7

    .line 30
    .line 31
    const/4 v4, 0x5

    .line 32
    if-gt v1, v4, :cond_7

    .line 33
    .line 34
    if-eqz v1, :cond_6

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-eq v1, v5, :cond_5

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    if-eq v1, v5, :cond_1

    .line 41
    .line 42
    if-eq v1, v4, :cond_0

    .line 43
    .line 44
    new-instance v4, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const/16 v5, 0x31f

    .line 50
    .line 51
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p0, v3, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲苏兰楪()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {p0, v3, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰楪苏哲()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {p1, v1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲苏楪兰(I)[B

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :try_start_0
    new-instance v4, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 90
    .line 91
    invoke-direct {v4}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v3, v4}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catch_0
    :try_start_1
    new-instance v4, Ljava/lang/String;

    .line 102
    .line 103
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 104
    .line 105
    invoke-direct {v4, v1, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    array-length v6, v1

    .line 113
    array-length v7, v5

    .line 114
    if-eq v6, v7, :cond_2

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    move v6, v2

    .line 118
    :goto_1
    array-length v7, v1

    .line 119
    if-ge v6, v7, :cond_4

    .line 120
    .line 121
    aget-byte v7, v1, v6

    .line 122
    .line 123
    aget-byte v8, v5, v6

    .line 124
    .line 125
    if-eq v7, v8, :cond_3

    .line 126
    .line 127
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰([B)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {p0, v3, v4}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    invoke-virtual {p0, v3, v4}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 159
    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :catch_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰([B)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {p0, v3, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰哲楪苏()J

    .line 192
    .line 193
    .line 194
    move-result-wide v4

    .line 195
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {p0, v3, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子世兰哲楪苏()J

    .line 205
    .line 206
    .line 207
    move-result-wide v4

    .line 208
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {p0, v3, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_7
    new-instance p0, Ljava/io/IOException;

    .line 218
    .line 219
    const/16 p1, 0x31e

    .line 220
    .line 221
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw p0

    .line 244
    :cond_8
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰()Lcom/alibaba/fastjson2/JSONObject;
    .locals 7

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_5

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x1

    .line 39
    if-le v4, v5, :cond_3

    .line 40
    .line 41
    new-instance v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 42
    .line 43
    invoke-direct {v4}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    instance-of v6, v5, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    check-cast v5, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 65
    .line 66
    invoke-virtual {v5}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0, v2, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_0

    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    instance-of v6, v4, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 101
    .line 102
    if-eqz v6, :cond_4

    .line 103
    .line 104
    check-cast v4, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 105
    .line 106
    invoke-virtual {v4}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    :cond_4
    invoke-virtual {v0, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    return-object v0
.end method
