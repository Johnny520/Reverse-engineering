.class public abstract Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# virtual methods
.method public abstract 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public final 飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/飘花落叶言世哲兰子楪苏;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子楪兰苏哲世()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v1, v0, 0x3

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x7

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x3

    .line 11
    if-eqz v0, :cond_b

    .line 12
    .line 13
    if-eq v0, v2, :cond_a

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-eq v0, v4, :cond_9

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eq v0, v3, :cond_3

    .line 20
    .line 21
    const/4 p0, 0x4

    .line 22
    if-eq v0, p0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x5

    .line 25
    if-ne v0, p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子楪苏兰世哲()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    check-cast p3, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 32
    .line 33
    shl-int/lit8 p2, v1, 0x3

    .line 34
    .line 35
    or-int/2addr p0, p2

    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p3, p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return v2

    .line 44
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidWireType()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    throw p0

    .line 49
    :cond_1
    if-eqz p1, :cond_2

    .line 50
    .line 51
    return v4

    .line 52
    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidEndTag()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    throw p0

    .line 57
    :cond_3
    new-instance v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 58
    .line 59
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;-><init>()V

    .line 60
    .line 61
    .line 62
    shl-int/2addr v1, v3

    .line 63
    or-int/lit8 v5, v1, 0x4

    .line 64
    .line 65
    add-int/2addr p1, v2

    .line 66
    const/16 v6, 0x64

    .line 67
    .line 68
    if-ge p1, v6, :cond_8

    .line 69
    .line 70
    :cond_4
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子世楪兰苏哲()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const v7, 0x7fffffff

    .line 75
    .line 76
    .line 77
    if-eq v6, v7, :cond_5

    .line 78
    .line 79
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;->飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/飘花落叶言世哲兰子楪苏;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-nez v6, :cond_4

    .line 84
    .line 85
    :cond_5
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子楪兰苏哲世()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-ne v5, p0, :cond_7

    .line 90
    .line 91
    iget-boolean p0, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰苏哲:Z

    .line 92
    .line 93
    if-eqz p0, :cond_6

    .line 94
    .line 95
    iput-boolean v4, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰苏哲:Z

    .line 96
    .line 97
    :cond_6
    check-cast p3, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 98
    .line 99
    or-int/lit8 p0, v1, 0x3

    .line 100
    .line 101
    invoke-virtual {p3, p0, v0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return v2

    .line 105
    :cond_7
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidEndTag()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    throw p0

    .line 110
    :cond_8
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->recursionLimitExceeded()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    throw p0

    .line 115
    :cond_9
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子世苏哲楪兰()Lcom/google/protobuf/ByteString;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p3, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 120
    .line 121
    shl-int/lit8 p1, v1, 0x3

    .line 122
    .line 123
    or-int/2addr p1, v4

    .line 124
    invoke-virtual {p3, p1, p0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return v2

    .line 128
    :cond_a
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子楪世哲苏兰()J

    .line 129
    .line 130
    .line 131
    move-result-wide p0

    .line 132
    check-cast p3, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 133
    .line 134
    shl-int/lit8 p2, v1, 0x3

    .line 135
    .line 136
    or-int/2addr p2, v2

    .line 137
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p3, p2, p0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return v2

    .line 145
    :cond_b
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子世哲苏兰楪()J

    .line 146
    .line 147
    .line 148
    move-result-wide p0

    .line 149
    check-cast p3, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 150
    .line 151
    shl-int/lit8 p2, v1, 0x3

    .line 152
    .line 153
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {p3, p2, p0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return v2
.end method

.method public abstract 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;
.end method
