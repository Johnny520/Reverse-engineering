.class public final L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;
.super L飘花落叶言苏楪子世哲兰/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/result/ClassDataList;

.field public 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public 飘花落叶言子楪世哲苏兰:Ljava/util/List;


# virtual methods
.method public final 飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I
    .locals 9

    .line 1
    iget-object v0, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

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
    iget-object v3, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

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
    iget-object v4, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/result/ClassDataList;

    .line 107
    .line 108
    const/4 v5, 0x1

    .line 109
    if-eqz v4, :cond_6

    .line 110
    .line 111
    new-instance v6, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-static {v4, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_4

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    check-cast v4, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 135
    .line 136
    invoke-virtual {v4}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()J

    .line 137
    .line 138
    .line 139
    move-result-wide v7

    .line 140
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_4
    invoke-static {v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏哲世(Ljava/util/ArrayList;)[J

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const/16 v4, 0x8

    .line 153
    .line 154
    array-length v6, v1

    .line 155
    invoke-virtual {p1, v4, v6, v4}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世(III)V

    .line 156
    .line 157
    .line 158
    array-length v4, v1

    .line 159
    sub-int/2addr v4, v5

    .line 160
    :goto_5
    const/4 v6, -0x1

    .line 161
    if-ge v6, v4, :cond_5

    .line 162
    .line 163
    aget-wide v6, v1, v4

    .line 164
    .line 165
    invoke-virtual {p1, v6, v7}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(J)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v4, v4, -0x1

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_5
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    goto :goto_6

    .line 176
    :cond_6
    move v1, v2

    .line 177
    :goto_6
    iget-object p0, p0, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 178
    .line 179
    if-eqz p0, :cond_7

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    goto :goto_7

    .line 186
    :cond_7
    move p0, v2

    .line 187
    :goto_7
    const/4 v4, 0x6

    .line 188
    invoke-virtual {p1, v4}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 189
    .line 190
    .line 191
    const/4 v4, 0x5

    .line 192
    invoke-virtual {p1, v4, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 193
    .line 194
    .line 195
    const/4 p0, 0x3

    .line 196
    invoke-virtual {p1, p0, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v5, v3}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 210
    .line 211
    .line 212
    return p0
.end method
