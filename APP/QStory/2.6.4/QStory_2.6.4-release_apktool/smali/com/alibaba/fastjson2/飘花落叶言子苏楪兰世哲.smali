.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/JSONArray;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Lcom/alibaba/fastjson2/JSONArray;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/JSONArray;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONArray;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONArray;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    const/16 v2, 0x800

    .line 6
    .line 7
    if-ge p3, v2, :cond_9

    .line 8
    .line 9
    instance-of v2, p1, Ljava/util/Map;

    .line 10
    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    move-object p3, p1

    .line 14
    check-cast p3, Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰:J

    .line 21
    .line 22
    cmp-long v2, v0, v2

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲兰苏:J

    .line 31
    .line 32
    cmp-long v0, v0, v2

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-interface {p3, p0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    instance-of v2, p1, Ljava/util/Collection;

    .line 44
    .line 45
    if-eqz v2, :cond_5

    .line 46
    .line 47
    move-object p3, p1

    .line 48
    check-cast p3, Ljava/util/Collection;

    .line 49
    .line 50
    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰:J

    .line 51
    .line 52
    cmp-long v2, v0, v2

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲兰苏:J

    .line 61
    .line 62
    cmp-long v0, v0, v2

    .line 63
    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_4
    :goto_1
    invoke-interface {p3, p0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_5
    if-eqz p1, :cond_8

    .line 74
    .line 75
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 76
    .line 77
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    instance-of v1, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰世楪哲;

    .line 92
    .line 93
    if-eqz v1, :cond_8

    .line 94
    .line 95
    check-cast v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰世楪哲;

    .line 96
    .line 97
    iget-object v0, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 98
    .line 99
    const/4 v1, 0x1

    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v2, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 114
    .line 115
    invoke-direct {v2, v1}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v2, Lbsh/飘花落叶言子苏楪哲世兰;

    .line 123
    .line 124
    const/4 v3, 0x2

    .line 125
    invoke-direct {v2, p1, v3}, Lbsh/飘花落叶言子苏楪哲世兰;-><init>(Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    goto :goto_3

    .line 141
    :cond_7
    :goto_2
    new-instance p1, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    :goto_3
    add-int/2addr p3, v1

    .line 147
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONArray;I)V

    .line 148
    .line 149
    .line 150
    :cond_8
    return-void

    .line 151
    :cond_9
    const-string p0, "level too large"

    .line 152
    .line 153
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method
