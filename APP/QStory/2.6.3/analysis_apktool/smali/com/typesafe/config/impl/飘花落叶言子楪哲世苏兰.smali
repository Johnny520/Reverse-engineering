.class public abstract Lcom/typesafe/config/impl/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/ConfigValueType;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 5

    .line 1
    invoke-interface {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->valueType()Lcom/typesafe/config/ConfigValueType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/typesafe/config/ConfigValueType;->STRING:Lcom/typesafe/config/ConfigValueType;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v0, v1, :cond_6

    .line 10
    .line 11
    invoke-interface {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->unwrapped()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    sget-object v1, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:[I

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    aget p0, v1, p0

    .line 24
    .line 25
    if-eq p0, v3, :cond_5

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    if-eq p0, v1, :cond_4

    .line 29
    .line 30
    if-eq p0, v2, :cond_0

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    const-string p0, "true"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_3

    .line 41
    .line 42
    const-string p0, "yes"

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_3

    .line 49
    .line 50
    const-string p0, "on"

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const-string p0, "false"

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_2

    .line 66
    .line 67
    const-string p0, "no"

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    const-string p0, "off"

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_c

    .line 82
    .line 83
    :cond_2
    new-instance p0, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-direct {p0, p1, v0}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_3
    :goto_0
    new-instance p0, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p0, p1, v3}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_4
    const-string p0, "null"

    .line 105
    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_c

    .line 111
    .line 112
    new-instance p0, Lcom/typesafe/config/impl/ConfigNull;

    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/ConfigNull;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_5
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v1

    .line 126
    new-instance p0, Lcom/typesafe/config/impl/ConfigLong;

    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-direct {p0, v3, v1, v2, v0}, Lcom/typesafe/config/impl/ConfigLong;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;JLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    .line 135
    return-object p0

    .line 136
    :catch_0
    :try_start_1
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 137
    .line 138
    .line 139
    move-result-wide v1

    .line 140
    new-instance p0, Lcom/typesafe/config/impl/ConfigDouble;

    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-direct {p0, v3, v1, v2, v0}, Lcom/typesafe/config/impl/ConfigDouble;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;DLjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_6
    if-ne p0, v1, :cond_8

    .line 151
    .line 152
    sget-object p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:[I

    .line 153
    .line 154
    invoke-interface {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->valueType()Lcom/typesafe/config/ConfigValueType;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    aget p0, p0, v0

    .line 163
    .line 164
    if-eq p0, v3, :cond_7

    .line 165
    .line 166
    if-eq p0, v2, :cond_7

    .line 167
    .line 168
    goto/16 :goto_3

    .line 169
    .line 170
    :cond_7
    new-instance p0, Lcom/typesafe/config/impl/ConfigString$Quoted;

    .line 171
    .line 172
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->transformToString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-direct {p0, v0, p1}, Lcom/typesafe/config/impl/ConfigString$Quoted;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :cond_8
    sget-object v0, Lcom/typesafe/config/ConfigValueType;->LIST:Lcom/typesafe/config/ConfigValueType;

    .line 185
    .line 186
    if-ne p0, v0, :cond_c

    .line 187
    .line 188
    invoke-interface {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->valueType()Lcom/typesafe/config/ConfigValueType;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    sget-object v0, Lcom/typesafe/config/ConfigValueType;->OBJECT:Lcom/typesafe/config/ConfigValueType;

    .line 193
    .line 194
    if-ne p0, v0, :cond_c

    .line 195
    .line 196
    move-object p0, p1

    .line 197
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 198
    .line 199
    new-instance v0, Ljava/util/HashMap;

    .line 200
    .line 201
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :catch_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_a

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Ljava/lang/String;

    .line 223
    .line 224
    const/16 v4, 0xa

    .line 225
    .line 226
    :try_start_2
    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-gez v4, :cond_9

    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual {p0, v3}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->get(Ljava/lang/Object;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_a
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-nez p0, :cond_c

    .line 250
    .line 251
    new-instance p0, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 258
    .line 259
    .line 260
    new-instance v0, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;

    .line 261
    .line 262
    invoke-direct {v0, v2}, Landroidx/compose/animation/飘花落叶言子苏世哲楪兰;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eqz v1, :cond_b

    .line 282
    .line 283
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    check-cast v1, Ljava/util/Map$Entry;

    .line 288
    .line 289
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_b
    new-instance p0, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 298
    .line 299
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-direct {p0, p1, v0}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 304
    .line 305
    .line 306
    return-object p0

    .line 307
    :catch_2
    :cond_c
    :goto_3
    return-object p1
.end method
