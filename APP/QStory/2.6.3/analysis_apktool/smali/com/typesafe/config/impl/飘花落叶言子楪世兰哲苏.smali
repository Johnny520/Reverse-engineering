.class public final Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;
.implements Lcom/typesafe/config/impl/飘花落叶言子楪兰世苏哲;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/List;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez p0, :cond_2

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    instance-of v0, p2, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    instance-of p2, p2, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 34
    .line 35
    if-nez p2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "placed nested DelayedMerge in a ConfigDelayedMerge, should have consolidated stack"

    .line 39
    .line 40
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    return-void

    .line 45
    :cond_2
    const-string p0, "creating empty delayed merge value"

    .line 46
    .line 47
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/util/List;Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V
    .locals 8

    .line 1
    iget-boolean v0, p5, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    iget-boolean v1, p5, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "# unresolved merge of "

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v3, " values follows (\n"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    if-nez p4, :cond_0

    .line 34
    .line 35
    invoke-static {p1, p2, p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "# this unresolved merge will not be parseable because it\'s at the root of the object\n"

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2, p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 44
    .line 45
    .line 46
    const-string v2, "# the HOCON format has no way to list multiple root objects in a single file\n"

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const/4 v2, 0x0

    .line 67
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const-string v4, "\n"

    .line 72
    .line 73
    if-eqz v3, :cond_7

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-static {p1, p2, p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 84
    .line 85
    .line 86
    const-string v5, " from "

    .line 87
    .line 88
    const-string v6, "#     unmerged value "

    .line 89
    .line 90
    if-eqz p4, :cond_2

    .line 91
    .line 92
    const-string v7, " for key "

    .line 93
    .line 94
    invoke-static {v2, v6, v7}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-static {p4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    invoke-virtual {v3}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v5}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    iget-object v5, v5, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 155
    .line 156
    if-eqz v5, :cond_3

    .line 157
    .line 158
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    goto :goto_2

    .line 163
    :cond_3
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 164
    .line 165
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_4

    .line 174
    .line 175
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    check-cast v6, Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {p1, p2, p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 182
    .line 183
    .line 184
    const-string v7, "# "

    .line 185
    .line 186
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_4
    invoke-static {p1, p2, p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 197
    .line 198
    .line 199
    if-eqz p4, :cond_6

    .line 200
    .line 201
    invoke-static {p4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    if-eqz v1, :cond_5

    .line 209
    .line 210
    const-string v4, " : "

    .line 211
    .line 212
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_5
    const-string v4, ":"

    .line 217
    .line 218
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    :cond_6
    :goto_4
    invoke-virtual {v3, p1, p2, p3, p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 222
    .line 223
    .line 224
    const-string v3, ","

    .line 225
    .line 226
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    if-eqz v1, :cond_1

    .line 230
    .line 231
    const/16 v3, 0xa

    .line 232
    .line 233
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_7
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    add-int/lit8 p0, p0, -0x1

    .line 243
    .line 244
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 245
    .line 246
    .line 247
    if-eqz v1, :cond_8

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    add-int/lit8 p0, p0, -0x1

    .line 254
    .line 255
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    :cond_8
    if-eqz v0, :cond_9

    .line 262
    .line 263
    invoke-static {p1, p2, p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 264
    .line 265
    .line 266
    const-string p0, "# ) end of unresolved merge\n"

    .line 267
    .line 268
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    :cond_9
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Ljava/util/List;I)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1, p2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const-string p1, "Nothing else in the merge stack, replacing with null"

    .line 27
    .line 28
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object v0

    .line 32
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    :goto_1
    move-object v0, p1

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    return-object v0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/util/List;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->ignoresFallbacks()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪兰世苏哲;Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual/range {p2 .. p2}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    new-instance v5, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v6, "delayed merge stack has "

    .line 19
    .line 20
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v6, " items:"

    .line 31
    .line 32
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v2, v5}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v5, 0x0

    .line 47
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 58
    .line 59
    invoke-virtual/range {p2 .. p2}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    add-int/2addr v7, v4

    .line 64
    new-instance v8, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v9, ": "

    .line 73
    .line 74
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v7, v6}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    add-int/2addr v5, v4

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-object/from16 v6, p2

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_1a

    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    check-cast v9, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 108
    .line 109
    instance-of v10, v9, Lcom/typesafe/config/impl/飘花落叶言子楪兰世苏哲;

    .line 110
    .line 111
    if-nez v10, :cond_19

    .line 112
    .line 113
    instance-of v10, v9, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;

    .line 114
    .line 115
    if-eqz v10, :cond_10

    .line 116
    .line 117
    add-int/lit8 v10, v8, 0x1

    .line 118
    .line 119
    move-object/from16 v11, p2

    .line 120
    .line 121
    invoke-interface {v0, v11, v10}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;I)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-eqz v12, :cond_1

    .line 130
    .line 131
    invoke-virtual {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    new-instance v13, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v14, "remainder portion: "

    .line 138
    .line 139
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    invoke-static {v12, v13}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    if-eqz v12, :cond_2

    .line 157
    .line 158
    invoke-virtual {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    const-string v13, "building sourceForEnd"

    .line 163
    .line 164
    invoke-static {v12, v13}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_2
    move-object v12, v0

    .line 168
    check-cast v12, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 169
    .line 170
    iget-object v13, v1, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 171
    .line 172
    iget-object v14, v1, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 173
    .line 174
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 175
    .line 176
    .line 177
    move-result v15

    .line 178
    const-string v3, " replacement "

    .line 179
    .line 180
    move/from16 v16, v4

    .line 181
    .line 182
    const-string v4, " in "

    .line 183
    .line 184
    const/16 p1, 0x0

    .line 185
    .line 186
    const-string v5, "@"

    .line 187
    .line 188
    if-eqz v15, :cond_3

    .line 189
    .line 190
    new-instance v15, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    move-object/from16 v17, v2

    .line 193
    .line 194
    const-string v2, "replaceWithinCurrentParent old "

    .line 195
    .line 196
    invoke-direct {v15, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-static {v12}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-static {v12}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-static {v2}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_3
    move-object/from16 v17, v2

    .line 243
    .line 244
    :goto_2
    if-ne v12, v10, :cond_4

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_4
    const-string v2, " with "

    .line 248
    .line 249
    if-eqz v14, :cond_b

    .line 250
    .line 251
    iget-object v13, v14, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v13, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 254
    .line 255
    invoke-interface {v13, v12, v10}, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;->replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    instance-of v12, v10, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 260
    .line 261
    if-eqz v12, :cond_5

    .line 262
    .line 263
    check-cast v10, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_5
    move-object/from16 v10, p1

    .line 267
    .line 268
    :goto_3
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    if-eqz v12, :cond_6

    .line 273
    .line 274
    new-instance v12, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    const-string v15, "replaceCurrentParent old "

    .line 277
    .line 278
    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-static {v13}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 288
    .line 289
    .line 290
    move-result v15

    .line 291
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-static {v13}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-static {v3}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    :cond_6
    if-ne v13, v10, :cond_7

    .line 324
    .line 325
    :goto_4
    move-object v2, v1

    .line 326
    goto/16 :goto_7

    .line 327
    .line 328
    :cond_7
    move-object v3, v10

    .line 329
    check-cast v3, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 330
    .line 331
    invoke-static {v14, v13, v3}, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲(Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    if-eqz v5, :cond_8

    .line 340
    .line 341
    new-instance v5, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-string v12, "replaced "

    .line 344
    .line 345
    invoke-direct {v5, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-static {v2}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    new-instance v2, Ljava/lang/StringBuilder;

    .line 371
    .line 372
    const-string v4, "path was: "

    .line 373
    .line 374
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v4, " is now "

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-static {v2}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    :cond_8
    if-eqz v3, :cond_a

    .line 396
    .line 397
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;

    .line 398
    .line 399
    move-object v4, v3

    .line 400
    :goto_5
    iget-object v5, v4, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 403
    .line 404
    if-eqz v5, :cond_9

    .line 405
    .line 406
    move-object v4, v5

    .line 407
    goto :goto_5

    .line 408
    :cond_9
    iget-object v4, v4, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v4, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 411
    .line 412
    invoke-direct {v2, v4, v3}, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;)V

    .line 413
    .line 414
    .line 415
    goto :goto_7

    .line 416
    :cond_a
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;

    .line 417
    .line 418
    invoke-static {}, Lcom/typesafe/config/impl/SimpleConfigObject;->empty()Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-direct {v2, v3}, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)V

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_b
    if-ne v12, v13, :cond_f

    .line 427
    .line 428
    instance-of v3, v10, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 429
    .line 430
    if-eqz v3, :cond_f

    .line 431
    .line 432
    new-instance v2, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;

    .line 433
    .line 434
    check-cast v10, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 435
    .line 436
    instance-of v3, v10, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 437
    .line 438
    if-eqz v3, :cond_c

    .line 439
    .line 440
    check-cast v10, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 441
    .line 442
    goto :goto_6

    .line 443
    :cond_c
    invoke-static {}, Lcom/typesafe/config/impl/SimpleConfigObject;->empty()Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 444
    .line 445
    .line 446
    move-result-object v10

    .line 447
    :goto_6
    invoke-direct {v2, v10}, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)V

    .line 448
    .line 449
    .line 450
    :goto_7
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v3, :cond_d

    .line 455
    .line 456
    invoke-virtual {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    new-instance v4, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    const-string v5, "  sourceForEnd before reset parents but after replace: "

    .line 463
    .line 464
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    invoke-static {v3, v4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 475
    .line 476
    .line 477
    :cond_d
    iget-object v3, v2, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 478
    .line 479
    if-nez v3, :cond_e

    .line 480
    .line 481
    goto :goto_8

    .line 482
    :cond_e
    new-instance v3, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;

    .line 483
    .line 484
    iget-object v2, v2, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 485
    .line 486
    invoke-direct {v3, v2}, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)V

    .line 487
    .line 488
    .line 489
    move-object v2, v3

    .line 490
    goto :goto_8

    .line 491
    :cond_f
    new-instance v0, Lcom/typesafe/config/ConfigException$BugOrBroken;

    .line 492
    .line 493
    new-instance v3, Ljava/lang/StringBuilder;

    .line 494
    .line 495
    const-string v5, "replace in parent not possible "

    .line 496
    .line 497
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    invoke-direct {v0, v1}, Lcom/typesafe/config/ConfigException$BugOrBroken;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    throw v0

    .line 523
    :cond_10
    move-object/from16 v11, p2

    .line 524
    .line 525
    move-object/from16 v17, v2

    .line 526
    .line 527
    move/from16 v16, v4

    .line 528
    .line 529
    const/16 p1, 0x0

    .line 530
    .line 531
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    if-eqz v2, :cond_11

    .line 536
    .line 537
    invoke-virtual {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    const-string v3, "will resolve end against the original source with parent pushed"

    .line 542
    .line 543
    invoke-static {v2, v3}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 544
    .line 545
    .line 546
    :cond_11
    invoke-virtual {v1, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;)Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    :goto_8
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    if-eqz v3, :cond_12

    .line 555
    .line 556
    invoke-virtual {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    new-instance v4, Ljava/lang/StringBuilder;

    .line 561
    .line 562
    const-string v5, "sourceForEnd      ="

    .line 563
    .line 564
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    invoke-static {v3, v4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 575
    .line 576
    .line 577
    :cond_12
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    if-eqz v3, :cond_14

    .line 582
    .line 583
    invoke-virtual {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    new-instance v4, Ljava/lang/StringBuilder;

    .line 588
    .line 589
    const-string v5, "Resolving highest-priority item in delayed merge "

    .line 590
    .line 591
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    const-string v5, " against "

    .line 598
    .line 599
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    const-string v5, " endWasRemoved="

    .line 606
    .line 607
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    if-eq v1, v2, :cond_13

    .line 611
    .line 612
    move/from16 v5, v16

    .line 613
    .line 614
    goto :goto_9

    .line 615
    :cond_13
    const/4 v5, 0x0

    .line 616
    :goto_9
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    invoke-static {v3, v4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 624
    .line 625
    .line 626
    :cond_14
    invoke-virtual {v6, v9, v2}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    iget-object v3, v2, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 631
    .line 632
    iget-object v6, v2, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;

    .line 633
    .line 634
    if-eqz v3, :cond_17

    .line 635
    .line 636
    if-nez v7, :cond_15

    .line 637
    .line 638
    move-object v7, v3

    .line 639
    goto :goto_a

    .line 640
    :cond_15
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 641
    .line 642
    .line 643
    move-result v2

    .line 644
    if-eqz v2, :cond_16

    .line 645
    .line 646
    invoke-virtual {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    add-int/lit8 v2, v2, 0x1

    .line 651
    .line 652
    new-instance v4, Ljava/lang/StringBuilder;

    .line 653
    .line 654
    const-string v5, "merging "

    .line 655
    .line 656
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    const-string v5, " with fallback "

    .line 663
    .line 664
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    invoke-static {v2, v4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 675
    .line 676
    .line 677
    :cond_16
    invoke-virtual {v7, v3}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 678
    .line 679
    .line 680
    move-result-object v7

    .line 681
    :cond_17
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 682
    .line 683
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 684
    .line 685
    .line 686
    move-result v2

    .line 687
    if-eqz v2, :cond_18

    .line 688
    .line 689
    invoke-virtual {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    new-instance v3, Ljava/lang/StringBuilder;

    .line 694
    .line 695
    const-string v4, "stack merged, yielding: "

    .line 696
    .line 697
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    invoke-static {v2, v3}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)V

    .line 708
    .line 709
    .line 710
    :cond_18
    move/from16 v4, v16

    .line 711
    .line 712
    move-object/from16 v2, v17

    .line 713
    .line 714
    goto/16 :goto_1

    .line 715
    .line 716
    :cond_19
    const/16 p1, 0x0

    .line 717
    .line 718
    const-string v1, "A delayed merge should not contain another one: "

    .line 719
    .line 720
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    return-object p1

    .line 724
    :cond_1a
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 725
    .line 726
    invoke-direct {v0, v6, v7}, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)V

    .line 727
    .line 728
    .line 729
    return-object v0
.end method


# virtual methods
.method public final canEqual(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 11
    .line 12
    if-eq p0, p1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v1

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_2
    return v1
.end method

.method public final hasDescendant(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->hasDescendantInList(Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ignoresFallbacks()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final mergedWithNonObject(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithNonObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    return-object p0
.end method

.method public final mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    return-object p0
.end method

.method public final mergedWithTheUnmergeable(Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithTheUnmergeable(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    return-object p0
.end method

.method public final newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p1, p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    return-object p1
.end method

.method public final render(Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    invoke-static/range {p0 .. p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/util/List;Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    return-void
.end method

.method public final render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-virtual/range {v0 .. v5}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->render(Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->replaceChildInList(Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {p2, p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-object p2
.end method

.method public final resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;
    .locals 0

    .line 1
    sget-object p0, Lcom/typesafe/config/impl/ResolveStatus;->UNRESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resolveSubstitutions(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪兰世苏哲;Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final unwrapped()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p0, Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    const-string v0, "called unwrapped() on value with unresolved substitutions, need to Config#resolve() first, see API docs"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/typesafe/config/ConfigException$NotResolved;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final valueType()Lcom/typesafe/config/ConfigValueType;
    .locals 1

    .line 1
    new-instance p0, Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    const-string v0, "called valueType() on value with unresolved substitutions, need to Config#resolve() first, see API docs"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/typesafe/config/ConfigException$NotResolved;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;I)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, p0, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Ljava/util/List;I)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
