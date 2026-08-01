.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:J


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:J

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲苏兰:J

    .line 8
    .line 9
    const-string v0, "ordinal"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
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
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

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
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 20
    .line 21
    iget-wide v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    return v0

    .line 38
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 8
    .line 9
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 11

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 4
    .line 5
    iget-object v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 13
    .line 14
    :goto_0
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_1
    instance-of v3, v1, Ljava/util/Map;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_6

    .line 24
    .line 25
    check-cast v1, Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-nez p0, :cond_5

    .line 32
    .line 33
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_5

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/util/Map$Entry;

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    instance-of v6, v3, Ljava/lang/Enum;

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    move-object v6, v3

    .line 66
    check-cast v6, Ljava/lang/Enum;

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_3

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    instance-of v6, v3, Ljava/lang/Long;

    .line 84
    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    if-nez v4, :cond_4

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v6

    .line 95
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    :cond_4
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_2

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    :cond_5
    :goto_1
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 110
    .line 111
    return-void

    .line 112
    :cond_6
    instance-of v3, v1, Ljava/util/Collection;

    .line 113
    .line 114
    const/4 v6, 0x1

    .line 115
    if-eqz v3, :cond_e

    .line 116
    .line 117
    check-cast v1, Ljava/util/Collection;

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_d

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    instance-of v2, v1, Ljava/util/Map;

    .line 138
    .line 139
    if-eqz v2, :cond_7

    .line 140
    .line 141
    check-cast v1, Ljava/util/Map;

    .line 142
    .line 143
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-nez v1, :cond_8

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    instance-of v2, v1, Ljava/util/Collection;

    .line 151
    .line 152
    if-eqz v2, :cond_b

    .line 153
    .line 154
    if-ne p0, v6, :cond_9

    .line 155
    .line 156
    check-cast v1, Ljava/util/Collection;

    .line 157
    .line 158
    move-object v4, v1

    .line 159
    goto :goto_2

    .line 160
    :cond_9
    if-nez v4, :cond_a

    .line 161
    .line 162
    new-instance v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 163
    .line 164
    invoke-direct {v4, p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 165
    .line 166
    .line 167
    :cond_a
    check-cast v1, Ljava/util/Collection;

    .line 168
    .line 169
    invoke-interface {v4, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_b
    if-nez v4, :cond_c

    .line 174
    .line 175
    new-instance v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 176
    .line 177
    invoke-direct {v4, p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 178
    .line 179
    .line 180
    :cond_c
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_d
    iput-object v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 185
    .line 186
    return-void

    .line 187
    :cond_e
    instance-of v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 188
    .line 189
    if-eqz v3, :cond_13

    .line 190
    .line 191
    check-cast v1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 192
    .line 193
    iget-object v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 194
    .line 195
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 196
    .line 197
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-eqz v4, :cond_11

    .line 213
    .line 214
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    iput-object v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 219
    .line 220
    new-instance v4, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 221
    .line 222
    iget-object v5, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 223
    .line 224
    invoke-direct {v4, v2, p1, v5, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V

    .line 228
    .line 229
    .line 230
    iget-object v4, v4, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 231
    .line 232
    if-nez v4, :cond_f

    .line 233
    .line 234
    iget-wide v7, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:J

    .line 235
    .line 236
    sget-object v5, Lcom/alibaba/fastjson2/JSONPath$Feature;->KeepNullValue:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 237
    .line 238
    iget-wide v9, v5, Lcom/alibaba/fastjson2/JSONPath$Feature;->mask:J

    .line 239
    .line 240
    and-long/2addr v7, v9

    .line 241
    const-wide/16 v9, 0x0

    .line 242
    .line 243
    cmp-long v5, v7, v9

    .line 244
    .line 245
    if-nez v5, :cond_f

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_f
    instance-of v5, v4, Ljava/util/Collection;

    .line 249
    .line 250
    if-eqz v5, :cond_10

    .line 251
    .line 252
    check-cast v4, Ljava/util/Collection;

    .line 253
    .line 254
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_10
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_11
    if-eqz v0, :cond_12

    .line 263
    .line 264
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 265
    .line 266
    invoke-direct {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;-><init>(Ljava/util/List;)V

    .line 267
    .line 268
    .line 269
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_12
    iput-object v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 273
    .line 274
    :goto_4
    iput-boolean v6, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 275
    .line 276
    return-void

    .line 277
    :cond_13
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    instance-of v2, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 290
    .line 291
    iget-wide v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 292
    .line 293
    if-eqz v2, :cond_15

    .line 294
    .line 295
    invoke-interface {v0, v6, v7}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    if-eqz p0, :cond_14

    .line 300
    .line 301
    invoke-virtual {p0, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 306
    .line 307
    :cond_14
    :goto_5
    return-void

    .line 308
    :cond_15
    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲苏兰:J

    .line 309
    .line 310
    cmp-long p0, v6, v2

    .line 311
    .line 312
    if-nez p0, :cond_16

    .line 313
    .line 314
    instance-of p0, v1, Ljava/lang/Enum;

    .line 315
    .line 316
    if-eqz p0, :cond_16

    .line 317
    .line 318
    check-cast v1, Ljava/lang/Enum;

    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 325
    .line 326
    return-void

    .line 327
    :cond_16
    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏:J

    .line 328
    .line 329
    cmp-long p0, v6, v2

    .line 330
    .line 331
    if-nez p0, :cond_17

    .line 332
    .line 333
    instance-of p0, v1, Ljava/lang/Enum;

    .line 334
    .line 335
    if-eqz p0, :cond_17

    .line 336
    .line 337
    check-cast v1, Ljava/lang/Enum;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 348
    .line 349
    return-void

    .line 350
    :cond_17
    instance-of p0, v1, Ljava/lang/String;

    .line 351
    .line 352
    if-eqz p0, :cond_19

    .line 353
    .line 354
    check-cast v1, Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    if-nez p0, :cond_18

    .line 361
    .line 362
    const/4 p0, 0x0

    .line 363
    invoke-virtual {v1, p0}, Ljava/lang/String;->charAt(I)C

    .line 364
    .line 365
    .line 366
    move-result p0

    .line 367
    const/16 v0, 0x7b

    .line 368
    .line 369
    if-ne p0, v0, :cond_18

    .line 370
    .line 371
    new-instance p0, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    const-string v0, "$."

    .line 374
    .line 375
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世楪苏(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 398
    .line 399
    return-void

    .line 400
    :cond_18
    iput-object v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 401
    .line 402
    return-void

    .line 403
    :cond_19
    instance-of p0, v1, Ljava/lang/Number;

    .line 404
    .line 405
    if-nez p0, :cond_1b

    .line 406
    .line 407
    instance-of p0, v1, Ljava/lang/Boolean;

    .line 408
    .line 409
    if-eqz p0, :cond_1a

    .line 410
    .line 411
    goto :goto_6

    .line 412
    :cond_1a
    new-instance p0, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    const-string p1, "not support : "

    .line 415
    .line 416
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-static {v1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    return-void

    .line 427
    :cond_1b
    :goto_6
    iput-object v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 428
    .line 429
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 8
    .line 9
    iget-object v4, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    iget-boolean v5, v3, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 14
    .line 15
    if-nez v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v3, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 18
    .line 19
    instance-of v6, v5, Lcom/alibaba/fastjson2/飘花落叶言子世哲苏兰楪;

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    instance-of v5, v5, Lcom/alibaba/fastjson2/飘花落叶言子苏世楪兰哲;

    .line 24
    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-boolean v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 32
    .line 33
    iget-wide v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    if-eqz v5, :cond_f

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_7

    .line 43
    .line 44
    :goto_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    goto/16 :goto_c

    .line 51
    .line 52
    :cond_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    const-wide/16 v10, 0x0

    .line 57
    .line 58
    cmp-long v3, v8, v10

    .line 59
    .line 60
    if-nez v3, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    cmp-long v3, v8, v6

    .line 64
    .line 65
    if-nez v3, :cond_6

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世兰楪()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_5

    .line 78
    .line 79
    :cond_4
    if-eqz v4, :cond_5

    .line 80
    .line 81
    goto/16 :goto_c

    .line 82
    .line 83
    :cond_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 88
    .line 89
    iput-boolean v0, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_e

    .line 101
    .line 102
    if-eqz v3, :cond_e

    .line 103
    .line 104
    iget-object v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 105
    .line 106
    instance-of v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

    .line 107
    .line 108
    if-eqz v3, :cond_e

    .line 109
    .line 110
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 111
    .line 112
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    const/4 v8, 0x0

    .line 120
    :goto_1
    if-ge v8, v5, :cond_d

    .line 121
    .line 122
    const/16 v9, -0x5a

    .line 123
    .line 124
    invoke-virtual {v1, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_c

    .line 129
    .line 130
    :goto_2
    const/16 v9, -0x5b

    .line 131
    .line 132
    invoke-virtual {v1, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_8

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 140
    .line 141
    .line 142
    move-result-wide v9

    .line 143
    cmp-long v9, v9, v6

    .line 144
    .line 145
    if-nez v9, :cond_b

    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-nez v9, :cond_9

    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世兰楪()Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-eqz v9, :cond_a

    .line 158
    .line 159
    :cond_9
    if-eqz v4, :cond_a

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_b
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 175
    .line 176
    .line 177
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_d
    iput-object v3, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 181
    .line 182
    iput-boolean v0, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 183
    .line 184
    return-void

    .line 185
    :cond_e
    const-string v0, "TODO"

    .line 186
    .line 187
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_f
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    iget-char v8, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 196
    .line 197
    const-string v10, "TODO : "

    .line 198
    .line 199
    const/16 v14, 0x2d

    .line 200
    .line 201
    const/16 v15, 0x2b

    .line 202
    .line 203
    const/16 v9, 0x27

    .line 204
    .line 205
    const/16 v0, 0x22

    .line 206
    .line 207
    const/16 v11, 0x7d

    .line 208
    .line 209
    const/16 v12, 0x5b

    .line 210
    .line 211
    const/16 v13, 0x2c

    .line 212
    .line 213
    if-eqz v5, :cond_1c

    .line 214
    .line 215
    if-ne v8, v11, :cond_11

    .line 216
    .line 217
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰哲楪()Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eqz v3, :cond_10

    .line 225
    .line 226
    goto/16 :goto_c

    .line 227
    .line 228
    :cond_10
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 229
    .line 230
    .line 231
    :cond_11
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_12

    .line 236
    .line 237
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_12
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 242
    .line 243
    .line 244
    move-result-wide v16

    .line 245
    cmp-long v3, v16, v6

    .line 246
    .line 247
    if-nez v3, :cond_1b

    .line 248
    .line 249
    iget-char v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 250
    .line 251
    if-eq v3, v0, :cond_1a

    .line 252
    .line 253
    if-eq v3, v9, :cond_1a

    .line 254
    .line 255
    if-eq v3, v15, :cond_19

    .line 256
    .line 257
    if-eq v3, v14, :cond_19

    .line 258
    .line 259
    if-eq v3, v12, :cond_17

    .line 260
    .line 261
    const/16 v0, 0x66

    .line 262
    .line 263
    if-eq v3, v0, :cond_16

    .line 264
    .line 265
    const/16 v0, 0x6e

    .line 266
    .line 267
    if-eq v3, v0, :cond_15

    .line 268
    .line 269
    const/16 v0, 0x74

    .line 270
    .line 271
    if-eq v3, v0, :cond_16

    .line 272
    .line 273
    const/16 v0, 0x7b

    .line 274
    .line 275
    if-eq v3, v0, :cond_13

    .line 276
    .line 277
    packed-switch v3, :pswitch_data_0

    .line 278
    .line 279
    .line 280
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 281
    .line 282
    invoke-static {v0, v10}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_13
    if-eqz v4, :cond_14

    .line 287
    .line 288
    instance-of v0, v4, Lcom/alibaba/fastjson2/飘花落叶言子苏世楪哲兰;

    .line 289
    .line 290
    if-nez v0, :cond_14

    .line 291
    .line 292
    instance-of v0, v4, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

    .line 293
    .line 294
    if-nez v0, :cond_14

    .line 295
    .line 296
    goto/16 :goto_c

    .line 297
    .line 298
    :cond_14
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    const/4 v0, 0x1

    .line 303
    iput-boolean v0, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_15
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰哲子()V

    .line 307
    .line 308
    .line 309
    const/4 v9, 0x0

    .line 310
    goto :goto_5

    .line 311
    :cond_16
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    goto :goto_5

    .line 320
    :cond_17
    if-eqz v4, :cond_18

    .line 321
    .line 322
    instance-of v0, v4, Lcom/alibaba/fastjson2/飘花落叶言子苏世楪哲兰;

    .line 323
    .line 324
    if-nez v0, :cond_18

    .line 325
    .line 326
    instance-of v0, v4, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

    .line 327
    .line 328
    if-nez v0, :cond_18

    .line 329
    .line 330
    instance-of v0, v4, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

    .line 331
    .line 332
    if-nez v0, :cond_18

    .line 333
    .line 334
    goto/16 :goto_c

    .line 335
    .line 336
    :cond_18
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    const/4 v5, 0x1

    .line 341
    iput-boolean v5, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_19
    :pswitch_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏楪兰()Ljava/lang/Number;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    goto :goto_5

    .line 352
    :cond_1a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v9

    .line 356
    :goto_5
    iput-object v9, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 357
    .line 358
    return-void

    .line 359
    :cond_1b
    const/4 v5, 0x1

    .line 360
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 361
    .line 362
    .line 363
    iget-char v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 364
    .line 365
    if-ne v3, v13, :cond_11

    .line 366
    .line 367
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_4

    .line 371
    .line 372
    :cond_1c
    if-ne v8, v12, :cond_2d

    .line 373
    .line 374
    if-eqz v3, :cond_2d

    .line 375
    .line 376
    iget-object v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 377
    .line 378
    instance-of v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

    .line 379
    .line 380
    if-eqz v3, :cond_2d

    .line 381
    .line 382
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 383
    .line 384
    .line 385
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 386
    .line 387
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 388
    .line 389
    .line 390
    :goto_6
    iget-char v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 391
    .line 392
    const/16 v8, 0x1a

    .line 393
    .line 394
    if-eq v5, v8, :cond_2c

    .line 395
    .line 396
    const/16 v8, 0x5d

    .line 397
    .line 398
    if-ne v5, v8, :cond_1d

    .line 399
    .line 400
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 401
    .line 402
    .line 403
    goto/16 :goto_b

    .line 404
    .line 405
    :cond_1d
    const/16 v8, 0x7b

    .line 406
    .line 407
    if-ne v5, v8, :cond_2a

    .line 408
    .line 409
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 410
    .line 411
    .line 412
    :goto_7
    iget-char v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 413
    .line 414
    if-ne v5, v11, :cond_1e

    .line 415
    .line 416
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 417
    .line 418
    .line 419
    const/16 v8, 0x66

    .line 420
    .line 421
    goto/16 :goto_a

    .line 422
    .line 423
    :cond_1e
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 424
    .line 425
    .line 426
    move-result-wide v16

    .line 427
    cmp-long v5, v16, v6

    .line 428
    .line 429
    if-nez v5, :cond_29

    .line 430
    .line 431
    iget-char v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 432
    .line 433
    if-eq v5, v0, :cond_27

    .line 434
    .line 435
    if-eq v5, v9, :cond_27

    .line 436
    .line 437
    if-eq v5, v15, :cond_25

    .line 438
    .line 439
    if-eq v5, v12, :cond_23

    .line 440
    .line 441
    const/16 v8, 0x66

    .line 442
    .line 443
    if-eq v5, v8, :cond_22

    .line 444
    .line 445
    const/16 v0, 0x6e

    .line 446
    .line 447
    if-eq v5, v0, :cond_21

    .line 448
    .line 449
    const/16 v0, 0x74

    .line 450
    .line 451
    if-eq v5, v0, :cond_22

    .line 452
    .line 453
    const/16 v0, 0x7b

    .line 454
    .line 455
    if-eq v5, v0, :cond_1f

    .line 456
    .line 457
    if-eq v5, v14, :cond_26

    .line 458
    .line 459
    const/16 v0, 0x2e

    .line 460
    .line 461
    if-eq v5, v0, :cond_26

    .line 462
    .line 463
    packed-switch v5, :pswitch_data_1

    .line 464
    .line 465
    .line 466
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 467
    .line 468
    invoke-static {v0, v10}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;)V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :cond_1f
    if-eqz v4, :cond_20

    .line 473
    .line 474
    goto :goto_a

    .line 475
    :cond_20
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    goto :goto_8

    .line 480
    :cond_21
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰哲子()V

    .line 481
    .line 482
    .line 483
    const/4 v0, 0x0

    .line 484
    goto :goto_8

    .line 485
    :cond_22
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    goto :goto_8

    .line 494
    :cond_23
    const/16 v8, 0x66

    .line 495
    .line 496
    if-eqz v4, :cond_24

    .line 497
    .line 498
    goto :goto_a

    .line 499
    :cond_24
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    goto :goto_8

    .line 504
    :cond_25
    const/16 v8, 0x66

    .line 505
    .line 506
    :cond_26
    :pswitch_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏楪兰()Ljava/lang/Number;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    goto :goto_8

    .line 514
    :cond_27
    const/16 v8, 0x66

    .line 515
    .line 516
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    :goto_8
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    :cond_28
    :goto_9
    const/16 v0, 0x22

    .line 524
    .line 525
    goto :goto_7

    .line 526
    :cond_29
    const/16 v8, 0x66

    .line 527
    .line 528
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 529
    .line 530
    .line 531
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 532
    .line 533
    if-ne v0, v13, :cond_28

    .line 534
    .line 535
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 536
    .line 537
    .line 538
    goto :goto_9

    .line 539
    :cond_2a
    const/16 v8, 0x66

    .line 540
    .line 541
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 542
    .line 543
    .line 544
    :goto_a
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 545
    .line 546
    if-ne v0, v13, :cond_2b

    .line 547
    .line 548
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 549
    .line 550
    .line 551
    :cond_2b
    const/16 v0, 0x22

    .line 552
    .line 553
    goto/16 :goto_6

    .line 554
    .line 555
    :cond_2c
    :goto_b
    iput-object v3, v2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 556
    .line 557
    :cond_2d
    :goto_c
    return-void

    .line 558
    nop

    .line 559
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

    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
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
