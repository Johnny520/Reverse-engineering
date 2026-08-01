.class public final L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世兰苏哲;
.super L飘花落叶言苏楪子世哲兰/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Lorg/luckypray/dexkit/result/MethodDataList;

.field public 飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/result/ClassDataList;

.field public 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public 飘花落叶言子楪世哲苏兰:Ljava/util/List;

.field public 飘花落叶言子楪苏世哲兰:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;


# virtual methods
.method public final 飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I
    .locals 12

    .line 1
    iget-object v0, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    new-instance v3, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v4}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/CharSequence;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v3}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪世哲苏(Ljava/util/ArrayList;)[I

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲([I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v0, v2

    .line 55
    :goto_1
    iget-object v3, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    new-instance v4, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-static {v3, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/CharSequence;)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-static {v4}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪世哲苏(Ljava/util/ArrayList;)[I

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {p1, v3}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲([I)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    move v3, v2

    .line 106
    :goto_3
    iget-object v4, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/result/ClassDataList;

    .line 107
    .line 108
    const/16 v5, 0x8

    .line 109
    .line 110
    const/4 v6, -0x1

    .line 111
    const/4 v7, 0x1

    .line 112
    if-eqz v4, :cond_6

    .line 113
    .line 114
    new-instance v8, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-static {v4, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_4

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    check-cast v9, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 138
    .line 139
    invoke-virtual {v9}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()J

    .line 140
    .line 141
    .line 142
    move-result-wide v9

    .line 143
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_4
    invoke-static {v8}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏哲世(Ljava/util/ArrayList;)[J

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    array-length v8, v4

    .line 156
    invoke-virtual {p1, v5, v8, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世(III)V

    .line 157
    .line 158
    .line 159
    array-length v8, v4

    .line 160
    sub-int/2addr v8, v7

    .line 161
    :goto_5
    if-ge v6, v8, :cond_5

    .line 162
    .line 163
    aget-wide v9, v4, v8

    .line 164
    .line 165
    invoke-virtual {p1, v9, v10}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(J)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v8, v8, -0x1

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_5
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世()I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    goto :goto_6

    .line 176
    :cond_6
    move v4, v2

    .line 177
    :goto_6
    iget-object v8, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Lorg/luckypray/dexkit/result/MethodDataList;

    .line 178
    .line 179
    if-eqz v8, :cond_9

    .line 180
    .line 181
    new-instance v9, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-static {v8, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    if-eqz v8, :cond_7

    .line 199
    .line 200
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    check-cast v8, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 205
    .line 206
    invoke-virtual {v8}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()J

    .line 207
    .line 208
    .line 209
    move-result-wide v10

    .line 210
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_7
    invoke-static {v9}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏哲世(Ljava/util/ArrayList;)[J

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    array-length v8, v1

    .line 223
    invoke-virtual {p1, v5, v8, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世(III)V

    .line 224
    .line 225
    .line 226
    array-length v5, v1

    .line 227
    sub-int/2addr v5, v7

    .line 228
    :goto_8
    if-ge v6, v5, :cond_8

    .line 229
    .line 230
    aget-wide v8, v1, v5

    .line 231
    .line 232
    invoke-virtual {p1, v8, v9}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(J)V

    .line 233
    .line 234
    .line 235
    add-int/lit8 v5, v5, -0x1

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_8
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世()I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    goto :goto_9

    .line 243
    :cond_9
    move v1, v2

    .line 244
    :goto_9
    iget-object p0, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 245
    .line 246
    if-eqz p0, :cond_a

    .line 247
    .line 248
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    goto :goto_a

    .line 253
    :cond_a
    move p0, v2

    .line 254
    :goto_a
    const/4 v5, 0x7

    .line 255
    invoke-virtual {p1, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 256
    .line 257
    .line 258
    const/4 v5, 0x6

    .line 259
    invoke-virtual {p1, v5, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 260
    .line 261
    .line 262
    const/4 p0, 0x4

    .line 263
    invoke-virtual {p1, p0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 264
    .line 265
    .line 266
    const/4 p0, 0x3

    .line 267
    invoke-virtual {p1, p0, v4}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v7, v3}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 277
    .line 278
    .line 279
    move-result p0

    .line 280
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 281
    .line 282
    .line 283
    return p0
.end method
