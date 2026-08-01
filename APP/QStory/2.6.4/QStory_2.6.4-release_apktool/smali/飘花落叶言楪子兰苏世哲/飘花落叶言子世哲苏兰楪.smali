.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲苏兰楪;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-object p0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    goto :goto_0

    .line 11
    :catch_1
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :catch_2
    move-exception p1

    .line 14
    :goto_0
    const-string v0, "invoke getter method error, "

    .line 15
    .line 16
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Ljava/util/List;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    :try_start_0
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Ljava/util/List;
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    iget-wide v2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 12
    .line 13
    or-long/2addr v0, v2

    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 20
    .line 21
    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 22
    .line 23
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 24
    .line 25
    iget-wide v7, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 26
    .line 27
    or-long/2addr v5, v7

    .line 28
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 29
    .line 30
    iget-wide v7, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 31
    .line 32
    or-long/2addr v5, v7

    .line 33
    and-long/2addr v5, v0

    .line 34
    cmp-long p2, v5, v2

    .line 35
    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世苏哲楪(J)V

    .line 42
    .line 43
    .line 44
    return v4

    .line 45
    :cond_0
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 46
    .line 47
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 48
    .line 49
    and-long/2addr v0, v5

    .line 50
    cmp-long v0, v0, v2

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p1, p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰苏世楪(L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲兰子苏(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰楪苏世(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return v4

    .line 77
    :cond_2
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 78
    .line 79
    const-class v1, Ljava/lang/String;

    .line 80
    .line 81
    if-ne v0, v1, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪兰世苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰楪苏世(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return v4

    .line 94
    :catch_0
    move-exception p0

    .line 95
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏哲楪兰()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 102
    return p0

    .line 103
    :cond_5
    throw p0
.end method
