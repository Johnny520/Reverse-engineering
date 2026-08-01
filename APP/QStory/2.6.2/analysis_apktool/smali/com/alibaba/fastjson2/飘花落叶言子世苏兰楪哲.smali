.class public final Lcom/alibaba/fastjson2/飘花落叶言子世苏兰楪哲;
.super Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪苏世兰哲:I

.field public final 飘花落叶言子楪苏哲世兰:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;J[Ljava/lang/String;[JLjava/lang/Object;I)V
    .locals 7

    .line 1
    iput p7, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    move-object v4, p4

    .line 8
    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;-><init>(Ljava/lang/String;J[Ljava/lang/String;[JLjava/util/function/Function;)V

    .line 10
    .line 11
    .line 12
    iput-object p6, v0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    .locals 12

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    instance-of v0, p1, Ljava/util/Collection;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p1, Ljava/util/Collection;

    .line 15
    .line 16
    check-cast p0, [Ljava/lang/String;

    .line 17
    .line 18
    array-length v0, p0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-ge v3, v0, :cond_2

    .line 21
    .line 22
    aget-object v4, p0, v3

    .line 23
    .line 24
    invoke-interface {p1, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    :goto_1
    move v1, v2

    .line 35
    :cond_2
    return v1

    .line 36
    :pswitch_0
    instance-of v0, p1, Ljava/util/Collection;

    .line 37
    .line 38
    if-eqz v0, :cond_9

    .line 39
    .line 40
    check-cast p1, Ljava/util/Collection;

    .line 41
    .line 42
    check-cast p0, [J

    .line 43
    .line 44
    array-length v0, p0

    .line 45
    move v3, v2

    .line 46
    :goto_2
    if-ge v3, v0, :cond_a

    .line 47
    .line 48
    aget-wide v4, p0, v3

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_9

    .line 59
    .line 60
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    instance-of v8, v7, Ljava/lang/Byte;

    .line 65
    .line 66
    if-nez v8, :cond_4

    .line 67
    .line 68
    instance-of v8, v7, Ljava/lang/Short;

    .line 69
    .line 70
    if-nez v8, :cond_4

    .line 71
    .line 72
    instance-of v8, v7, Ljava/lang/Integer;

    .line 73
    .line 74
    if-nez v8, :cond_4

    .line 75
    .line 76
    instance-of v8, v7, Ljava/lang/Long;

    .line 77
    .line 78
    if-eqz v8, :cond_5

    .line 79
    .line 80
    :cond_4
    move-object v8, v7

    .line 81
    check-cast v8, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v8

    .line 87
    cmp-long v8, v8, v4

    .line 88
    .line 89
    if-nez v8, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    instance-of v8, v7, Ljava/lang/Float;

    .line 93
    .line 94
    if-eqz v8, :cond_6

    .line 95
    .line 96
    long-to-float v8, v4

    .line 97
    move-object v9, v7

    .line 98
    check-cast v9, Ljava/lang/Float;

    .line 99
    .line 100
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    cmpl-float v8, v8, v9

    .line 105
    .line 106
    if-nez v8, :cond_6

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    instance-of v8, v7, Ljava/lang/Double;

    .line 110
    .line 111
    if-eqz v8, :cond_7

    .line 112
    .line 113
    long-to-double v8, v4

    .line 114
    move-object v10, v7

    .line 115
    check-cast v10, Ljava/lang/Double;

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    .line 118
    .line 119
    .line 120
    move-result-wide v10

    .line 121
    cmpl-double v8, v8, v10

    .line 122
    .line 123
    if-nez v8, :cond_7

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_7
    instance-of v8, v7, Ljava/math/BigDecimal;

    .line 127
    .line 128
    if-eqz v8, :cond_8

    .line 129
    .line 130
    move-object v8, v7

    .line 131
    check-cast v8, Ljava/math/BigDecimal;

    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/math/BigDecimal;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v9

    .line 137
    cmp-long v9, v4, v9

    .line 138
    .line 139
    if-nez v9, :cond_8

    .line 140
    .line 141
    invoke-static {v4, v5}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-virtual {v8, v9}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-nez v8, :cond_8

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_8
    instance-of v8, v7, Ljava/math/BigInteger;

    .line 153
    .line 154
    if-eqz v8, :cond_3

    .line 155
    .line 156
    check-cast v7, Ljava/math/BigInteger;

    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/math/BigInteger;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    cmp-long v8, v4, v8

    .line 163
    .line 164
    if-nez v8, :cond_3

    .line 165
    .line 166
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    invoke-virtual {v7, v8}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_3

    .line 175
    .line 176
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 177
    .line 178
    goto/16 :goto_2

    .line 179
    .line 180
    :cond_9
    move v1, v2

    .line 181
    :cond_a
    return v1

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
