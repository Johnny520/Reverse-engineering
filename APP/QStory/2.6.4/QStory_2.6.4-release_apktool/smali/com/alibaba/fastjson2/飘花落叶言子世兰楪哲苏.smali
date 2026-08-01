.class public final Lcom/alibaba/fastjson2/飘花落叶言子世兰楪哲苏;
.super Lcom/alibaba/fastjson2/飘花落叶言子世哲兰苏楪;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public transient 飘花落叶言子楪哲兰世苏:Ljava/math/BigDecimal;

.field public final 飘花落叶言子楪哲苏兰世:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲苏兰世:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-wide v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲苏兰世:J

    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    if-nez v0, :cond_7

    .line 8
    .line 9
    instance-of v0, p1, Ljava/lang/Long;

    .line 10
    .line 11
    if-nez v0, :cond_7

    .line 12
    .line 13
    instance-of v0, p1, Ljava/lang/Byte;

    .line 14
    .line 15
    if-nez v0, :cond_7

    .line 16
    .line 17
    instance-of v0, p1, Ljava/lang/Short;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    instance-of v0, p1, Ljava/lang/Float;

    .line 23
    .line 24
    if-nez v0, :cond_5

    .line 25
    .line 26
    instance-of v0, p1, Ljava/lang/Double;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    check-cast p1, Ljava/math/BigDecimal;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    new-instance p1, Ljava/math/BigDecimal;

    .line 44
    .line 45
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 46
    .line 47
    invoke-direct {p1, v0, v4}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/math/BigDecimal;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/math/BigDecimal;

    .line 64
    .line 65
    :cond_3
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/math/BigDecimal;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    return p0

    .line 72
    :cond_4
    return v4

    .line 73
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 76
    .line 77
    .line 78
    move-result-wide p0

    .line 79
    long-to-double v2, v2

    .line 80
    cmpl-double p0, p0, v2

    .line 81
    .line 82
    if-nez p0, :cond_6

    .line 83
    .line 84
    return v1

    .line 85
    :cond_6
    return v4

    .line 86
    :cond_7
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide p0

    .line 92
    cmp-long p0, p0, v2

    .line 93
    .line 94
    if-nez p0, :cond_8

    .line 95
    .line 96
    return v1

    .line 97
    :cond_8
    return v4
.end method
