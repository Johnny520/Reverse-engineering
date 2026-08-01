.class public final Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Z

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/List;

.field public final 飘花落叶言子楪苏世哲兰:Z


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;Ljava/util/List;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p3, 0x1

    .line 11
    const/4 v0, 0x0

    .line 12
    move v2, p3

    .line 13
    move v1, v0

    .line 14
    :goto_0
    add-int/lit8 v3, p1, -0x1

    .line 15
    .line 16
    if-ge v1, v3, :cond_4

    .line 17
    .line 18
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 23
    .line 24
    instance-of v4, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    check-cast v3, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

    .line 29
    .line 30
    iget v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 31
    .line 32
    if-gez v3, :cond_1

    .line 33
    .line 34
    move v2, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    instance-of v4, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰楪世;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-lez v1, :cond_3

    .line 44
    .line 45
    sub-int/2addr v1, p3

    .line 46
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 51
    .line 52
    instance-of p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 53
    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲兰苏()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    instance-of p1, v3, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    check-cast v3, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;

    .line 69
    .line 70
    iput-boolean v0, v3, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰:Z

    .line 71
    .line 72
    :cond_3
    move p3, v0

    .line 73
    :cond_4
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏世哲兰:Z

    .line 74
    .line 75
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰哲苏:Z

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const-class v0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰哲苏:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏世哲兰:Z

    .line 12
    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    const/4 v3, 0x0

    .line 25
    move-object v5, v2

    .line 26
    move v4, v3

    .line 27
    :goto_0
    if-ge v3, v1, :cond_6

    .line 28
    .line 29
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    check-cast v6, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    if-ge v3, v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v7, v2

    .line 47
    :goto_1
    new-instance v8, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 48
    .line 49
    invoke-direct {v8, p0, v5, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;)V

    .line 50
    .line 51
    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {v6, v8}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-virtual {v6, p1, v8}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 59
    .line 60
    .line 61
    :goto_2
    iget-boolean v5, v8, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 62
    .line 63
    if-eqz v5, :cond_5

    .line 64
    .line 65
    iget-object v4, v8, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 66
    .line 67
    if-nez v4, :cond_4

    .line 68
    .line 69
    move-object v5, v8

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/4 v4, 0x1

    .line 72
    :cond_5
    move-object v5, v8

    .line 73
    goto :goto_0

    .line 74
    :cond_6
    :goto_3
    iget-object p1, v5, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 75
    .line 76
    instance-of v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 77
    .line 78
    if-eqz v0, :cond_7

    .line 79
    .line 80
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 83
    .line 84
    :cond_7
    sget-object v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->AlwaysReturnList:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 85
    .line 86
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->mask:J

    .line 87
    .line 88
    iget-wide v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:J

    .line 89
    .line 90
    and-long/2addr v0, v2

    .line 91
    const-wide/16 v2, 0x0

    .line 92
    .line 93
    cmp-long p0, v0, v2

    .line 94
    .line 95
    if-eqz p0, :cond_9

    .line 96
    .line 97
    if-nez p1, :cond_8

    .line 98
    .line 99
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 100
    .line 101
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 102
    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_8
    instance-of p0, p1, Ljava/util/List;

    .line 106
    .line 107
    if-nez p0, :cond_9

    .line 108
    .line 109
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :cond_9
    return-object p1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v2

    .line 13
    move-object v5, v3

    .line 14
    :goto_0
    if-ge v4, v1, :cond_4

    .line 15
    .line 16
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 21
    .line 22
    add-int/lit8 v7, v4, 0x1

    .line 23
    .line 24
    if-ge v7, v1, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    check-cast v8, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v8, v3

    .line 34
    :goto_1
    new-instance v9, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 35
    .line 36
    invoke-direct {v9, p0, v5, v6, v8}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;)V

    .line 37
    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    iput-object p1, v9, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 42
    .line 43
    :cond_2
    if-lez v4, :cond_3

    .line 44
    .line 45
    add-int/lit8 v4, v4, -0x1

    .line 46
    .line 47
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 52
    .line 53
    instance-of v5, v4, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 54
    .line 55
    if-eqz v5, :cond_3

    .line 56
    .line 57
    check-cast v4, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 58
    .line 59
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲兰苏()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    instance-of v4, v6, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    move-object v4, v6

    .line 70
    check-cast v4, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;

    .line 71
    .line 72
    iput-boolean v2, v4, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰:Z

    .line 73
    .line 74
    :cond_3
    invoke-virtual {v6, v9}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 75
    .line 76
    .line 77
    move v4, v7

    .line 78
    move-object v5, v9

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    iget-object p0, v5, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object p1, v5, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 83
    .line 84
    iget-wide v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:J

    .line 85
    .line 86
    sget-object p1, Lcom/alibaba/fastjson2/JSONPath$Feature;->AlwaysReturnList:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 87
    .line 88
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONPath$Feature;->mask:J

    .line 89
    .line 90
    and-long/2addr v0, v2

    .line 91
    const-wide/16 v2, 0x0

    .line 92
    .line 93
    cmp-long p1, v0, v2

    .line 94
    .line 95
    if-eqz p1, :cond_6

    .line 96
    .line 97
    if-nez p0, :cond_5

    .line 98
    .line 99
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 100
    .line 101
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 102
    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_5
    instance-of p1, p0, Ljava/util/List;

    .line 106
    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    :cond_6
    return-object p0
.end method
