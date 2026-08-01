.class public final Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲苏兰;
.super Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/stream/Stream;->empty()Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lorg/apache/commons/lang3/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lorg/apache/commons/lang3/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-super {p0}, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    invoke-static {v1}, Lorg/apache/commons/lang3/builder/ToStringStyle;->unregister(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const-string p0, "includeFieldNames and excludeFieldNames must not intersect"

    .line 49
    .line 50
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuffer;

    .line 7
    .line 8
    iget-object v3, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Lorg/apache/commons/lang3/builder/ToStringStyle;

    .line 9
    .line 10
    iget-object p0, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v3, v2, v1, p0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->reflectionAppendArrayDetail(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 23
    .line 24
    const/16 v4, 0x12

    .line 25
    .line 26
    invoke-direct {v0, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-static {p1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 v0, 0x1

    .line 39
    invoke-static {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible([Ljava/lang/reflect/AccessibleObject;Z)V

    .line 40
    .line 41
    .line 42
    array-length v4, p1

    .line 43
    const/4 v5, 0x0

    .line 44
    move v6, v5

    .line 45
    :goto_0
    if-ge v6, v4, :cond_8

    .line 46
    .line 47
    aget-object v7, p1, v6

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    const/16 v10, 0x24

    .line 58
    .line 59
    invoke-virtual {v9, v10}, Ljava/lang/String;->indexOf(I)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const/4 v10, -0x1

    .line 64
    if-eq v9, v10, :cond_3

    .line 65
    .line 66
    :cond_2
    :goto_1
    move v9, v5

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-eqz v9, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    invoke-static {v1}, Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-nez v9, :cond_6

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    invoke-static {v1, v9}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-ltz v9, :cond_2

    .line 105
    .line 106
    move v9, v0

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    const-class v9, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世兰苏哲;

    .line 109
    .line 110
    invoke-virtual {v7, v9}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    xor-int/2addr v9, v0

    .line 115
    :goto_2
    if-eqz v9, :cond_7

    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v7, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    const-class v10, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世兰哲苏;

    .line 122
    .line 123
    invoke-virtual {v7, v10}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    xor-int/2addr v7, v0

    .line 128
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-virtual {v3, v2, v8, v9, v7}, Lorg/apache/commons/lang3/builder/ToStringStyle;->append(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :catch_0
    move-exception p0

    .line 137
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_7
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_8
    return-void
.end method
