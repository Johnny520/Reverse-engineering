.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世哲兰;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashSet;


# direct methods
.method public varargs constructor <init>([Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    array-length v0, p1

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    if-ge v2, v0, :cond_3

    .line 16
    .line 17
    aget-object v3, p1, v2

    .line 18
    .line 19
    instance-of v4, v3, Ljava/math/BigDecimal;

    .line 20
    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    check-cast v3, Ljava/math/BigDecimal;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/math/BigDecimal;->signum()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    new-instance v3, Ljava/math/BigDecimal;

    .line 32
    .line 33
    sget-object v4, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 34
    .line 35
    invoke-direct {v3, v4, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v3}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :goto_1
    invoke-virtual {v3}, Ljava/math/BigDecimal;->scale()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰:Ljava/math/BigInteger;

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-ltz v4, :cond_1

    .line 60
    .line 61
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲兰苏:Ljava/math/BigInteger;

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-gtz v4, :cond_1

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/math/BigInteger;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    goto :goto_2

    .line 78
    :cond_1
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪兰苏哲:Ljava/math/BigInteger;

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-ltz v4, :cond_2

    .line 85
    .line 86
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪兰哲苏:Ljava/math/BigInteger;

    .line 87
    .line 88
    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-gtz v4, :cond_2

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/math/BigInteger;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :cond_2
    :goto_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashSet;

    .line 103
    .line 104
    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 6

    .line 1
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    check-cast p1, Ljava/math/BigDecimal;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Ljava/math/BigDecimal;

    .line 15
    .line 16
    sget-object v2, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 17
    .line 18
    invoke-direct {v0, v2, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {p1, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/math/BigDecimal;->unscaledValue()Ljava/math/BigInteger;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move-object p1, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    instance-of v0, p1, Ljava/math/BigInteger;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    move-object v0, p1

    .line 63
    check-cast v0, Ljava/math/BigInteger;

    .line 64
    .line 65
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪兰苏哲:Ljava/math/BigInteger;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ltz v2, :cond_4

    .line 72
    .line 73
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪兰哲苏:Ljava/math/BigInteger;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-gtz v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :cond_4
    :goto_1
    instance-of v0, p1, Ljava/lang/Long;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    move-object v0, p1

    .line 94
    check-cast v0, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    const-wide/32 v4, -0x80000000

    .line 101
    .line 102
    .line 103
    cmp-long v0, v2, v4

    .line 104
    .line 105
    if-ltz v0, :cond_5

    .line 106
    .line 107
    const-wide/32 v4, 0x7fffffff

    .line 108
    .line 109
    .line 110
    cmp-long v0, v2, v4

    .line 111
    .line 112
    if-gtz v0, :cond_5

    .line 113
    .line 114
    long-to-int p1, v2

    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :cond_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashSet;

    .line 120
    .line 121
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-nez p0, :cond_7

    .line 126
    .line 127
    if-nez p1, :cond_6

    .line 128
    .line 129
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_6
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 133
    .line 134
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Enum:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const-string v0, "expect type %s, but %s"

    .line 145
    .line 146
    invoke-direct {p0, v0, p1, v1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 151
    .line 152
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Enum:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
