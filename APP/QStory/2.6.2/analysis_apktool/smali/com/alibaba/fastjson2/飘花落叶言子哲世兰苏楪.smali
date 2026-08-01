.class public final Lcom/alibaba/fastjson2/飘花落叶言子哲世兰苏楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final 飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V
    .locals 9

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 4
    .line 5
    iget-wide v0, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 6
    .line 7
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 10
    .line 11
    or-long/2addr v0, v2

    .line 12
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲世苏兰(J)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰苏楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 29
    .line 30
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 31
    .line 32
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 33
    .line 34
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 35
    .line 36
    and-long/2addr v2, v0

    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    cmp-long v2, v2, v4

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v6, 0x1

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    move v2, v6

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move v2, v3

    .line 48
    :goto_0
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 49
    .line 50
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 51
    .line 52
    and-long/2addr v0, v7

    .line 53
    cmp-long v0, v0, v4

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move v6, v3

    .line 59
    :goto_1
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    array-length v1, v0

    .line 64
    move v4, v3

    .line 65
    :goto_2
    array-length v5, v0

    .line 66
    iget-char v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 67
    .line 68
    if-ge v4, v5, :cond_7

    .line 69
    .line 70
    aget-char v5, v0, v4

    .line 71
    .line 72
    if-eq v5, v7, :cond_6

    .line 73
    .line 74
    const/16 v7, 0x5c

    .line 75
    .line 76
    if-eq v5, v7, :cond_6

    .line 77
    .line 78
    const/16 v7, 0x20

    .line 79
    .line 80
    if-lt v5, v7, :cond_6

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    const/16 v7, 0x3c

    .line 85
    .line 86
    if-eq v5, v7, :cond_6

    .line 87
    .line 88
    const/16 v7, 0x3e

    .line 89
    .line 90
    if-eq v5, v7, :cond_6

    .line 91
    .line 92
    const/16 v7, 0x28

    .line 93
    .line 94
    if-eq v5, v7, :cond_6

    .line 95
    .line 96
    const/16 v7, 0x29

    .line 97
    .line 98
    if-eq v5, v7, :cond_6

    .line 99
    .line 100
    :cond_4
    if-eqz v6, :cond_5

    .line 101
    .line 102
    const/16 v7, 0x7f

    .line 103
    .line 104
    if-le v5, v7, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    :goto_3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲兰子(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_7
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 115
    .line 116
    add-int/2addr p1, v1

    .line 117
    add-int/lit8 p1, p1, 0x2

    .line 118
    .line 119
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 120
    .line 121
    array-length v2, v2

    .line 122
    if-lt p1, v2, :cond_8

    .line 123
    .line 124
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 125
    .line 126
    .line 127
    :cond_8
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 128
    .line 129
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 130
    .line 131
    add-int/lit8 v4, v2, 0x1

    .line 132
    .line 133
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 134
    .line 135
    aput-char v7, p1, v2

    .line 136
    .line 137
    array-length v2, v0

    .line 138
    invoke-static {v0, v3, p1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    .line 140
    .line 141
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 142
    .line 143
    add-int/2addr p1, v1

    .line 144
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 145
    .line 146
    add-int/lit8 v1, p1, 0x1

    .line 147
    .line 148
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 149
    .line 150
    aput-char v7, v0, p1

    .line 151
    .line 152
    return-void
.end method
