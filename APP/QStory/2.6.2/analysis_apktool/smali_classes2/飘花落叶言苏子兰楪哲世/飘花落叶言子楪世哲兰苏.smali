.class public final L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲兰苏;
.super L飘花落叶言苏子兰世楪哲/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:Lorg/luckypray/dexkit/result/FieldDataList;

.field public 飘花落叶言子楪世苏哲兰:Lorg/luckypray/dexkit/result/ClassDataList;


# virtual methods
.method public final 飘花落叶言子楪哲苏兰世(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I
    .locals 9

    .line 1
    iget-object v0, p0, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lorg/luckypray/dexkit/result/ClassDataList;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    new-instance v6, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v0, v3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    check-cast v7, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 36
    .line 37
    invoke-virtual {v7}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()J

    .line 38
    .line 39
    .line 40
    move-result-wide v7

    .line 41
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪兰苏世(Ljava/util/ArrayList;)[J

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    array-length v6, v0

    .line 54
    invoke-virtual {p1, v1, v6, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世(III)V

    .line 55
    .line 56
    .line 57
    array-length v6, v0

    .line 58
    sub-int/2addr v6, v4

    .line 59
    :goto_1
    if-ge v2, v6, :cond_1

    .line 60
    .line 61
    aget-wide v7, v0, v6

    .line 62
    .line 63
    invoke-virtual {p1, v7, v8}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(J)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v6, v6, -0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move v0, v5

    .line 75
    :goto_2
    iget-object p0, p0, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Lorg/luckypray/dexkit/result/FieldDataList;

    .line 76
    .line 77
    if-eqz p0, :cond_5

    .line 78
    .line 79
    new-instance v6, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-static {p0, v3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 103
    .line 104
    invoke-virtual {v3}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()J

    .line 105
    .line 106
    .line 107
    move-result-wide v7

    .line 108
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    invoke-static {v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪兰苏世(Ljava/util/ArrayList;)[J

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    array-length v3, p0

    .line 121
    invoke-virtual {p1, v1, v3, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世(III)V

    .line 122
    .line 123
    .line 124
    array-length v1, p0

    .line 125
    sub-int/2addr v1, v4

    .line 126
    :goto_4
    if-ge v2, v1, :cond_4

    .line 127
    .line 128
    aget-wide v6, p0, v1

    .line 129
    .line 130
    invoke-virtual {p1, v6, v7}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(J)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 v1, v1, -0x1

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_4
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世()I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    goto :goto_5

    .line 141
    :cond_5
    move p0, v5

    .line 142
    :goto_5
    const/4 v1, 0x7

    .line 143
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 144
    .line 145
    .line 146
    const/4 v1, 0x6

    .line 147
    invoke-virtual {p1, v1, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 148
    .line 149
    .line 150
    const/4 v1, 0x4

    .line 151
    invoke-virtual {p1, v1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 152
    .line 153
    .line 154
    const/4 p0, 0x3

    .line 155
    invoke-virtual {p1, p0, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v4, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v5, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 169
    .line 170
    .line 171
    return p0
.end method
