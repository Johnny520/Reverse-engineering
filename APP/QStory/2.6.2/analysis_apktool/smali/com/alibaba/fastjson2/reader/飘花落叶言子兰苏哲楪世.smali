.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲楪世;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_4

    .line 15
    .line 16
    iget-char p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 17
    .line 18
    const/16 v0, 0x5b

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    if-ne p2, v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 24
    .line 25
    .line 26
    iget-char p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 27
    .line 28
    const/16 v0, 0x7b

    .line 29
    .line 30
    if-ne p2, v0, :cond_1

    .line 31
    .line 32
    const-class p2, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲楪世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    const-string p0, "expect \'{\', but \'[\'"

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v7

    .line 58
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez p2, :cond_3

    .line 63
    .line 64
    const/16 v5, 0x6c

    .line 65
    .line 66
    const/16 v6, 0x22

    .line 67
    .line 68
    const/16 v1, 0x22

    .line 69
    .line 70
    const/16 v2, 0x6e

    .line 71
    .line 72
    const/16 v3, 0x75

    .line 73
    .line 74
    const/16 v4, 0x6c

    .line 75
    .line 76
    move-object v0, p1

    .line 77
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世苏楪兰(CCCCCC)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    :cond_3
    return-object v7

    .line 84
    :cond_4
    move-object v0, p1

    .line 85
    :cond_5
    iget-object p1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 86
    .line 87
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 88
    .line 89
    const-class p3, Ljava/util/HashMap;

    .line 90
    .line 91
    if-ne p2, p3, :cond_6

    .line 92
    .line 93
    new-instance p2, Ljava/util/HashMap;

    .line 94
    .line 95
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    iget-wide p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 100
    .line 101
    or-long/2addr p2, p4

    .line 102
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Ljava/util/Map;

    .line 107
    .line 108
    :goto_0
    iget-wide v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 109
    .line 110
    or-long p3, p4, v1

    .line 111
    .line 112
    const/4 p1, 0x0

    .line 113
    :goto_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 114
    .line 115
    .line 116
    move-result p5

    .line 117
    if-eqz p5, :cond_7

    .line 118
    .line 119
    const/16 p0, 0x2c

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 122
    .line 123
    .line 124
    return-object p2

    .line 125
    :cond_7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世哲楪()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p5

    .line 129
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏哲世兰:Z

    .line 130
    .line 131
    if-eqz v1, :cond_9

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_9

    .line 138
    .line 139
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 140
    .line 141
    invoke-direct {v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 142
    .line 143
    .line 144
    :goto_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_8

    .line 149
    .line 150
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    invoke-interface {p2, p5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_9
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    const-wide/16 v2, 0x0

    .line 167
    .line 168
    if-nez p1, :cond_a

    .line 169
    .line 170
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 171
    .line 172
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 173
    .line 174
    and-long/2addr v4, p3

    .line 175
    cmp-long v4, v4, v2

    .line 176
    .line 177
    if-eqz v4, :cond_a

    .line 178
    .line 179
    const-string v4, "@type"

    .line 180
    .line 181
    invoke-virtual {p5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_a

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_a
    if-nez v1, :cond_b

    .line 189
    .line 190
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 191
    .line 192
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 193
    .line 194
    and-long/2addr v4, p3

    .line 195
    cmp-long v4, v4, v2

    .line 196
    .line 197
    if-eqz v4, :cond_b

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_b
    invoke-interface {p2, p5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    if-eqz v4, :cond_d

    .line 205
    .line 206
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 207
    .line 208
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 209
    .line 210
    and-long/2addr v5, p3

    .line 211
    cmp-long v2, v5, v2

    .line 212
    .line 213
    if-eqz v2, :cond_d

    .line 214
    .line 215
    instance-of v2, v4, Ljava/util/Collection;

    .line 216
    .line 217
    if-eqz v2, :cond_c

    .line 218
    .line 219
    move-object v2, v4

    .line 220
    check-cast v2, Ljava/util/Collection;

    .line 221
    .line 222
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    invoke-interface {p2, p5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_c
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-interface {p2, p5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    :cond_d
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 237
    .line 238
    goto :goto_1
.end method
