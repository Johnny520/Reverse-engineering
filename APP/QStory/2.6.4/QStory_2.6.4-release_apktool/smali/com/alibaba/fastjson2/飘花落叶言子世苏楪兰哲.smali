.class public final Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;
.super Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪苏世兰哲:J

.field public final 飘花落叶言子楪苏哲世兰:J

.field public final 飘花落叶言子楪苏哲兰世:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JJJZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;-><init>(Ljava/lang/String;J)V

    .line 2
    .line 3
    .line 4
    iput-wide p4, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:J

    .line 5
    .line 6
    iput-wide p6, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:J

    .line 7
    .line 8
    iput-boolean p8, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    instance-of v0, p1, Ljava/lang/Byte;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:J

    .line 4
    .line 5
    iget-wide v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:J

    .line 6
    .line 7
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 8
    .line 9
    if-nez v0, :cond_7

    .line 10
    .line 11
    instance-of v0, p1, Ljava/lang/Short;

    .line 12
    .line 13
    if-nez v0, :cond_7

    .line 14
    .line 15
    instance-of v0, p1, Ljava/lang/Integer;

    .line 16
    .line 17
    if-nez v0, :cond_7

    .line 18
    .line 19
    instance-of v0, p1, Ljava/lang/Long;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    instance-of v0, p1, Ljava/lang/Float;

    .line 25
    .line 26
    if-nez v0, :cond_5

    .line 27
    .line 28
    instance-of v0, p1, Ljava/lang/Double;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    check-cast p1, Ljava/math/BigDecimal;

    .line 38
    .line 39
    invoke-static {v3, v4}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-ltz v0, :cond_2

    .line 56
    .line 57
    if-gtz p1, :cond_2

    .line 58
    .line 59
    xor-int/lit8 p0, p0, 0x1

    .line 60
    .line 61
    :cond_2
    return p0

    .line 62
    :cond_3
    instance-of v0, p1, Ljava/math/BigInteger;

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    check-cast p1, Ljava/math/BigInteger;

    .line 67
    .line 68
    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-ltz v0, :cond_4

    .line 85
    .line 86
    if-gtz p1, :cond_4

    .line 87
    .line 88
    xor-int/lit8 p0, p0, 0x1

    .line 89
    .line 90
    :cond_4
    return p0

    .line 91
    :cond_5
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    long-to-double v3, v3

    .line 98
    cmpl-double p1, v5, v3

    .line 99
    .line 100
    if-ltz p1, :cond_6

    .line 101
    .line 102
    long-to-double v0, v1

    .line 103
    cmpg-double p1, v5, v0

    .line 104
    .line 105
    if-gtz p1, :cond_6

    .line 106
    .line 107
    xor-int/lit8 p0, p0, 0x1

    .line 108
    .line 109
    :cond_6
    return p0

    .line 110
    :cond_7
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v5

    .line 116
    cmp-long p1, v5, v3

    .line 117
    .line 118
    if-ltz p1, :cond_8

    .line 119
    .line 120
    cmp-long p1, v5, v1

    .line 121
    .line 122
    if-gtz p1, :cond_8

    .line 123
    .line 124
    xor-int/lit8 p0, p0, 0x1

    .line 125
    .line 126
    :cond_8
    return p0
.end method
