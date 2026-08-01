.class public final Lcom/alibaba/fastjson2/飘花落叶言子世楪哲苏兰;
.super Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/alibaba/fastjson2/飘花落叶言子苏世楪兰哲;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 9
    .line 10
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {v1, v2}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/util/List;

    .line 44
    .line 45
    instance-of v1, v0, Ljava/util/List;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz v1, :cond_6

    .line 50
    .line 51
    check-cast v0, Ljava/util/List;

    .line 52
    .line 53
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-direct {v1, v4}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 60
    .line 61
    .line 62
    move v4, v3

    .line 63
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-ge v4, v5, :cond_5

    .line 68
    .line 69
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    move v7, v3

    .line 78
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_3

    .line 83
    .line 84
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    check-cast v7, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;

    .line 89
    .line 90
    iget-boolean v8, v7, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Z

    .line 91
    .line 92
    invoke-virtual {v7, p1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v8, :cond_1

    .line 97
    .line 98
    if-nez v7, :cond_2

    .line 99
    .line 100
    move v7, v3

    .line 101
    goto :goto_3

    .line 102
    :cond_1
    if-eqz v7, :cond_2

    .line 103
    .line 104
    move v7, v2

    .line 105
    goto :goto_3

    .line 106
    :cond_2
    move v7, v8

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    :goto_3
    if-eqz v7, :cond_4

    .line 109
    .line 110
    invoke-virtual {v1, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    iput-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 117
    .line 118
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 119
    .line 120
    return-void

    .line 121
    :cond_6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    move v1, v3

    .line 126
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_9

    .line 131
    .line 132
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;

    .line 137
    .line 138
    iget-boolean v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Z

    .line 139
    .line 140
    invoke-virtual {v1, p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v4, :cond_7

    .line 145
    .line 146
    if-nez v1, :cond_8

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_7
    if-eqz v1, :cond_8

    .line 150
    .line 151
    move v3, v2

    .line 152
    goto :goto_5

    .line 153
    :cond_8
    move v1, v4

    .line 154
    goto :goto_4

    .line 155
    :cond_9
    move v3, v1

    .line 156
    :goto_5
    if-eqz v3, :cond_a

    .line 157
    .line 158
    iput-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 159
    .line 160
    :cond_a
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 161
    .line 162
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V
    .locals 1

    .line 1
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
