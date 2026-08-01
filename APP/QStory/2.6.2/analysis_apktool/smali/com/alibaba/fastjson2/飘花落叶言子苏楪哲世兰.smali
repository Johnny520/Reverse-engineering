.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/BiConsumer;
.implements Ljava/util/function/Consumer;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/JSONArray;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;Lcom/alibaba/fastjson2/JSONArray;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/JSONArray;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Ljava/util/Map;->forEach(Ljava/util/function/BiConsumer;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    instance-of v0, p1, Ljava/util/List;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v1, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;

    .line 43
    .line 44
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:J

    .line 45
    .line 46
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/JSONArray;

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    invoke-interface {v0, v2, v3}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_5

    .line 61
    .line 62
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    const/4 v1, 0x0

    .line 67
    :goto_0
    move-object v2, v0

    .line 68
    check-cast v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 69
    .line 70
    iget-object v2, v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-ge v1, v3, :cond_5

    .line 77
    .line 78
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 83
    .line 84
    invoke-virtual {v2, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->accept(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    sget-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:J

    .line 95
    .line 96
    cmp-long p0, v2, v0

    .line 97
    .line 98
    if-nez p0, :cond_5

    .line 99
    .line 100
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_5
    :goto_1
    return-void
.end method

.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 104
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;

    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/JSONArray;

    if-eqz p1, :cond_0

    .line 105
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_0
    instance-of p1, p2, Ljava/util/Map;

    if-eqz p1, :cond_1

    .line 107
    check-cast p2, Ljava/util/Map;

    invoke-interface {p2, p0}, Ljava/util/Map;->forEach(Ljava/util/function/BiConsumer;)V

    return-void

    .line 108
    :cond_1
    instance-of p1, p2, Ljava/util/List;

    if-eqz p1, :cond_2

    .line 109
    check-cast p2, Ljava/util/List;

    invoke-interface {p2, p0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    return-void

    .line 110
    :cond_2
    iget-wide p0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:J

    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:J

    cmp-long p0, p0, v2

    if-nez p0, :cond_3

    .line 111
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method
