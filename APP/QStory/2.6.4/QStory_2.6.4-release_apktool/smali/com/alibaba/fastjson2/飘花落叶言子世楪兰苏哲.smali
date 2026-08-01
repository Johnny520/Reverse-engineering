.class public final Lcom/alibaba/fastjson2/飘花落叶言子世楪兰苏哲;
.super Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public final 飘花落叶言子楪苏哲世兰:D


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/alibaba/fastjson2/JSONPathFilter$Operator;Ljava/lang/Double;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;-><init>(Ljava/lang/String;J)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 5
    .line 6
    invoke-virtual {p5}, Ljava/lang/Double;->doubleValue()D

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iput-wide p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲世兰:D

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 2
    .line 3
    sget-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    instance-of v1, p1, Ljava/lang/Number;

    .line 28
    .line 29
    if-eqz v1, :cond_a

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_1
    iget-wide v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲世兰:D

    .line 42
    .line 43
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p1, v1}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const/4 v1, 0x1

    .line 58
    if-eqz p0, :cond_8

    .line 59
    .line 60
    if-eq p0, v1, :cond_7

    .line 61
    .line 62
    const/4 v2, 0x2

    .line 63
    if-eq p0, v2, :cond_6

    .line 64
    .line 65
    const/4 v2, 0x3

    .line 66
    if-eq p0, v2, :cond_5

    .line 67
    .line 68
    const/4 v2, 0x4

    .line 69
    if-eq p0, v2, :cond_4

    .line 70
    .line 71
    const/4 v2, 0x5

    .line 72
    if-ne p0, v2, :cond_3

    .line 73
    .line 74
    if-gtz p1, :cond_9

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 78
    .line 79
    .line 80
    return v0

    .line 81
    :cond_4
    if-gez p1, :cond_9

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    if-ltz p1, :cond_9

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    if-lez p1, :cond_9

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_7
    if-eqz p1, :cond_9

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_8
    if-nez p1, :cond_9

    .line 94
    .line 95
    :goto_2
    return v1

    .line 96
    :cond_9
    :goto_3
    return v0

    .line 97
    :cond_a
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 98
    .line 99
    .line 100
    return v0
.end method
