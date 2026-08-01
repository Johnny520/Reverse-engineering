.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;
.super Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/HashSet;

.field public final 飘花落叶言子楪世苏兰哲:[J

.field public final 飘花落叶言子楪世苏哲兰:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 5
    .line 6
    array-length v0, p1

    .line 7
    new-array v0, v0, [J

    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:[J

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/util/HashSet;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    array-length v1, p1

    .line 20
    if-ge v0, v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:[J

    .line 23
    .line 24
    aget-object v2, p1, v0

    .line 25
    .line 26
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    aput-wide v2, v1, v0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/util/HashSet;

    .line 33
    .line 34
    aget-object v2, p1, v0

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 9
    .line 10
    :goto_0
    instance-of v1, v0, Ljava/util/Map;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    check-cast v0, Ljava/util/Map;

    .line 18
    .line 19
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 20
    .line 21
    array-length v1, v3

    .line 22
    invoke-direct {p0, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 23
    .line 24
    .line 25
    array-length v1, v3

    .line 26
    :goto_1
    if-ge v2, v1, :cond_1

    .line 27
    .line 28
    aget-object v4, v3, v2

    .line 29
    .line 30
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {p0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    instance-of v1, v0, Ljava/util/Collection;

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    iput-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    iget-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v1, v4, v4, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 67
    .line 68
    array-length v5, v3

    .line 69
    invoke-direct {v4, v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 70
    .line 71
    .line 72
    :goto_2
    array-length v5, v3

    .line 73
    if-ge v2, v5, :cond_5

    .line 74
    .line 75
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:[J

    .line 76
    .line 77
    aget-wide v6, v5, v2

    .line 78
    .line 79
    invoke-interface {v1, v6, v7}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    invoke-virtual {v5, v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    const/4 v5, 0x0

    .line 91
    :goto_3
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iput-object v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 98
    .line 99
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 7

    .line 1
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 10
    .line 11
    instance-of v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子世哲苏兰楪;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    instance-of v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏世楪兰哲;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v0, p1, Ljava/util/Map;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    check-cast p1, Ljava/util/Map;

    .line 35
    .line 36
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 37
    .line 38
    array-length v2, p0

    .line 39
    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 40
    .line 41
    .line 42
    array-length v2, p0

    .line 43
    :goto_0
    if-ge v1, v2, :cond_2

    .line 44
    .line 45
    aget-object v3, p0, v1

    .line 46
    .line 47
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iput-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    instance-of v0, p1, Ljava/util/Collection;

    .line 61
    .line 62
    if-eqz v0, :cond_8

    .line 63
    .line 64
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 65
    .line 66
    if-nez v0, :cond_7

    .line 67
    .line 68
    check-cast p1, Ljava/util/Collection;

    .line 69
    .line 70
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_6

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    instance-of v3, v2, Ljava/util/Map;

    .line 94
    .line 95
    if-eqz v3, :cond_4

    .line 96
    .line 97
    check-cast v2, Ljava/util/Map;

    .line 98
    .line 99
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 100
    .line 101
    array-length v4, p0

    .line 102
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 103
    .line 104
    .line 105
    array-length v4, p0

    .line 106
    move v5, v1

    .line 107
    :goto_2
    if-ge v5, v4, :cond_5

    .line 108
    .line 109
    aget-object v6, p0, v5

    .line 110
    .line 111
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v3, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    add-int/lit8 v5, v5, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_6
    iput-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 126
    .line 127
    return-void

    .line 128
    :cond_7
    iput-object p1, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 129
    .line 130
    return-void

    .line 131
    :cond_8
    const-string p0, "UnsupportedOperation "

    .line 132
    .line 133
    const-class p1, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲楪兰;

    .line 134
    .line 135
    invoke-static {p1, p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method
