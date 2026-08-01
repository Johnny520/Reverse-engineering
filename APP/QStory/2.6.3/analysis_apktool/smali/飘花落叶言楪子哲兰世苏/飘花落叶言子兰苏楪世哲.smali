.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪世哲;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:J

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 7
    .line 8
    iput-wide p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪世哲兰苏:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 9

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世哲苏兰楪(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    if-eqz p4, :cond_1

    .line 16
    .line 17
    iget-object p4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 18
    .line 19
    if-eq p4, p3, :cond_1

    .line 20
    .line 21
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    check-cast p2, Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰世楪(I)V

    .line 35
    .line 36
    .line 37
    sget-object p4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 38
    .line 39
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/JSONWriter$Feature;)Z

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    const/4 v0, 0x0

    .line 44
    :goto_0
    if-ge v0, p3, :cond_5

    .line 45
    .line 46
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    move-object v4, v1

    .line 51
    check-cast v4, Ljava/lang/Enum;

    .line 52
    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 56
    .line 57
    .line 58
    move-object v3, p1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 65
    .line 66
    if-eq v1, v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-wide v5, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪世哲兰苏:J

    .line 73
    .line 74
    or-long v7, v5, p5

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    iget-object v6, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 78
    .line 79
    move-object v3, p1

    .line 80
    invoke-interface/range {v2 .. v8}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v3, p1

    .line 85
    if-eqz p4, :cond_4

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :goto_1
    invoke-virtual {v3, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    move-object p1, v3

    .line 102
    goto :goto_0

    .line 103
    :cond_5
    move-object v3, p1

    .line 104
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    check-cast p2, Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-ge p0, p3, :cond_3

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    check-cast p3, Ljava/lang/String;

    .line 29
    .line 30
    if-nez p3, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 43
    .line 44
    .line 45
    return-void
.end method
