.class public final Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;
.implements Lcom/typesafe/config/impl/飘花落叶言子楪兰世苏哲;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/List;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez p0, :cond_3

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    instance-of v0, p2, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    instance-of p2, p2, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 43
    .line 44
    if-nez p2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string p0, "placed nested DelayedMerge in a ConfigDelayedMergeObject, should have consolidated stack"

    .line 48
    .line 49
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    return-void

    .line 54
    :cond_2
    const-string p0, "created a delayed merge object not guaranteed to be an object"

    .line 55
    .line 56
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3
    const-string p0, "creating empty delayed merge object"

    .line 61
    .line 62
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public static 飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;
    .locals 2

    .line 1
    new-instance v0, Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    const-string v1, "need to Config#resolve() before using this object, see the API docs for Config#resolve()"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/typesafe/config/ConfigException$NotResolved;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final attemptPeekWithPartialResolve(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_8

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    instance-of v3, v1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 21
    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    move-object v3, v1

    .line 25
    check-cast v3, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    invoke-virtual {v3, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->attemptPeekWithPartialResolve(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->ignoresFallbacks()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    return-object v3

    .line 40
    :cond_1
    instance-of v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-string p0, "should not be reached: unmergeable object returned null value"

    .line 46
    .line 47
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_3
    instance-of v0, v1, Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;

    .line 52
    .line 53
    if-nez v0, :cond_7

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object p1, Lcom/typesafe/config/impl/ResolveStatus;->UNRESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 60
    .line 61
    if-ne p0, p1, :cond_5

    .line 62
    .line 63
    instance-of p0, v1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    return-object v2

    .line 68
    :cond_4
    const-string p0, "Expecting a list here, not "

    .line 69
    .line 70
    invoke-static {v1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_5
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->ignoresFallbacks()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_6

    .line 79
    .line 80
    return-object v2

    .line 81
    :cond_6
    const-string p0, "resolved non-object should ignore fallbacks"

    .line 82
    .line 83
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_7
    new-instance v0, Lcom/typesafe/config/ConfigException$NotResolved;

    .line 88
    .line 89
    const-string v2, "Key \'"

    .line 90
    .line 91
    const-string v3, "\' is not available at \'"

    .line 92
    .line 93
    invoke-static {v2, p1, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p0, "\' because value at \'"

    .line 109
    .line 110
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p0, "\' has not been resolved and may turn out to contain or hide \'"

    .line 125
    .line 126
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p0, "\'. Be sure to Config#resolve() before using a config object."

    .line 130
    .line 131
    invoke-static {v2, p1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-direct {v0, p0}, Lcom/typesafe/config/ConfigException$NotResolved;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :cond_8
    const-string p0, "Delayed merge stack does not contain any unmergeable values"

    .line 140
    .line 141
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object v2
.end method

.method public final canEqual(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return p0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 11
    .line 12
    if-eq p0, p1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v1

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_2
    return v1
.end method

.method public final get(Ljava/lang/Object;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    move-result-object p0

    throw p0
.end method

.method public final hasDescendant(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->hasDescendantInList(Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ignoresFallbacks()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final mergedWithNonObject(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithNonObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    return-object p0
.end method

.method public final mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithNonObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    return-object p0
.end method

.method public final mergedWithTheUnmergeable(Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithTheUnmergeable(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子世兰楪哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    return-object p0
.end method

.method public final newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/ResolveStatus;->UNRESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p1, p2, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    const-string p0, "attempt to create resolved ConfigDelayedMergeObject"

    .line 14
    .line 15
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p1, p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    return-object p1
.end method

.method public final render(Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    invoke-static/range {p0 .. p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/util/List;Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    return-void
.end method

.method public final render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-virtual/range {v0 .. v5}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->render(Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->replaceChildInList(Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {p2, p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-object p2
.end method

.method public final resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;
    .locals 0

    .line 1
    sget-object p0, Lcom/typesafe/config/impl/ResolveStatus;->UNRESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resolveSubstitutions(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪兰世苏哲;Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    instance-of p2, p1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "Expecting a resolve result to be an object, but it was "

    .line 15
    .line 16
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final unwrapped()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 8
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    return-object p0
.end method

.method public final withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public final withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 10
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    return-object p0
.end method

.method public final withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 9
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    return-object p0
.end method

.method public final withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 11
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    return-object p0
.end method

.method public final withOnlyPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final withOnlyPathOrNull(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final withValue(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final withoutPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lcom/typesafe/config/ConfigException$NotResolved;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;I)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, p0, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Ljava/util/List;I)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
