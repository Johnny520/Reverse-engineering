.class public final Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;
.super Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪苏世兰哲:I

.field public final 飘花落叶言子楪苏哲世兰:Z

.field public final 飘花落叶言子楪苏哲兰世:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLjava/io/Serializable;ZI)V
    .locals 0

    .line 12
    iput p6, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:I

    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;-><init>(Ljava/lang/String;J)V

    iput-object p4, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:Ljava/io/Serializable;

    iput-boolean p5, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J[Ljava/lang/String;[JLjava/util/function/Function;[JZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 3
    .line 4
    invoke-direct/range {p0 .. p6}, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;-><init>(Ljava/lang/String;J[Ljava/lang/String;[JLjava/util/function/Function;)V

    .line 5
    .line 6
    .line 7
    iput-object p7, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:Ljava/io/Serializable;

    .line 8
    .line 9
    iput-boolean p8, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世兰苏哲()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_1
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_2
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:Ljava/io/Serializable;

    .line 5
    .line 6
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, [Ljava/lang/String;

    .line 12
    .line 13
    array-length v0, v2

    .line 14
    :goto_0
    if-ge v1, v0, :cond_2

    .line 15
    .line 16
    aget-object v3, v2, v1

    .line 17
    .line 18
    if-ne v3, p1, :cond_0

    .line 19
    .line 20
    :goto_1
    xor-int/lit8 p0, p0, 0x1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_2
    return p0

    .line 36
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast v2, Ljava/util/regex/Pattern;

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    xor-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    :cond_3
    return p1

    .line 55
    :pswitch_1
    check-cast v2, [J

    .line 56
    .line 57
    instance-of v0, p1, Ljava/lang/Byte;

    .line 58
    .line 59
    if-nez v0, :cond_b

    .line 60
    .line 61
    instance-of v0, p1, Ljava/lang/Short;

    .line 62
    .line 63
    if-nez v0, :cond_b

    .line 64
    .line 65
    instance-of v0, p1, Ljava/lang/Integer;

    .line 66
    .line 67
    if-nez v0, :cond_b

    .line 68
    .line 69
    instance-of v0, p1, Ljava/lang/Long;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    goto :goto_8

    .line 74
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    .line 75
    .line 76
    if-nez v0, :cond_9

    .line 77
    .line 78
    instance-of v0, p1, Ljava/lang/Double;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    goto :goto_6

    .line 83
    :cond_5
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 84
    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    check-cast p1, Ljava/math/BigDecimal;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v3

    .line 93
    array-length v0, v2

    .line 94
    :goto_3
    if-ge v1, v0, :cond_d

    .line 95
    .line 96
    aget-wide v5, v2, v1

    .line 97
    .line 98
    cmp-long v7, v5, v3

    .line 99
    .line 100
    if-nez v7, :cond_6

    .line 101
    .line 102
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {p1, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_6

    .line 111
    .line 112
    :goto_4
    xor-int/lit8 p0, p0, 0x1

    .line 113
    .line 114
    goto :goto_a

    .line 115
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    instance-of v0, p1, Ljava/math/BigInteger;

    .line 119
    .line 120
    if-eqz v0, :cond_d

    .line 121
    .line 122
    check-cast p1, Ljava/math/BigInteger;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    array-length v0, v2

    .line 129
    :goto_5
    if-ge v1, v0, :cond_d

    .line 130
    .line 131
    aget-wide v5, v2, v1

    .line 132
    .line 133
    cmp-long v7, v5, v3

    .line 134
    .line 135
    if-nez v7, :cond_8

    .line 136
    .line 137
    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {p1, v5}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_8

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_9
    :goto_6
    check-cast p1, Ljava/lang/Number;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 154
    .line 155
    .line 156
    move-result-wide v3

    .line 157
    array-length p1, v2

    .line 158
    :goto_7
    if-ge v1, p1, :cond_d

    .line 159
    .line 160
    aget-wide v5, v2, v1

    .line 161
    .line 162
    long-to-double v5, v5

    .line 163
    cmpl-double v0, v5, v3

    .line 164
    .line 165
    if-nez v0, :cond_a

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_b
    :goto_8
    check-cast p1, Ljava/lang/Number;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide v3

    .line 177
    array-length p1, v2

    .line 178
    :goto_9
    if-ge v1, p1, :cond_d

    .line 179
    .line 180
    aget-wide v5, v2, v1

    .line 181
    .line 182
    cmp-long v0, v5, v3

    .line 183
    .line 184
    if-nez v0, :cond_c

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_d
    :goto_a
    return p0

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
