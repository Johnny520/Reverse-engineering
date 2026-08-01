.class public abstract Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;
.implements Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;


# instance fields
.field private final config:Lcom/typesafe/config/impl/SimpleConfig;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/typesafe/config/impl/SimpleConfig;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lcom/typesafe/config/impl/SimpleConfig;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->config:Lcom/typesafe/config/impl/SimpleConfig;

    .line 10
    .line 11
    return-void
.end method

.method public static mergeOrigins(Ljava/util/Collection;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;)",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_0
    instance-of v4, v3, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    move-object v4, v3

    .line 41
    check-cast v4, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    sget-object v5, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 48
    .line 49
    if-ne v4, v5, :cond_1

    .line 50
    .line 51
    move-object v4, v3

    .line 52
    check-cast v4, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {v3}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    if-nez v2, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_4
    const-string p0, "can\'t merge origins on empty list"

    .line 82
    .line 83
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v1
.end method

.method public static varargs mergeOrigins([Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 87
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->mergeOrigins(Ljava/util/Collection;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    move-result-object p0

    return-object p0
.end method

.method public static weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "ConfigObject is immutable, you can\'t call Map."

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static 飘花落叶言子楪世哲兰苏(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->attemptPeekWithPartialResolve(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catch Lcom/typesafe/config/ConfigException$NotResolved; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object p0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :goto_0
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;Lcom/typesafe/config/ConfigException$NotResolved;)Lcom/typesafe/config/ConfigException$NotResolved;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    throw p0
.end method


# virtual methods
.method public abstract attemptPeekWithPartialResolve(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.end method

.method public clear()V
    .locals 0

    .line 1
    const-string p0, "clear"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method

.method public bridge synthetic constructDelayedMerge(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->constructDelayedMerge(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public constructDelayedMerge(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/util/List<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;)",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    new-instance p0, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public abstract get(Ljava/lang/Object;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.end method

.method public bridge synthetic newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public abstract newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
.end method

.method public newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final peekAssumingResolved(Ljava/lang/String;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->attemptPeekWithPartialResolve(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Lcom/typesafe/config/ConfigException$NotResolved; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    invoke-static {p2, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;Lcom/typesafe/config/ConfigException$NotResolved;)Lcom/typesafe/config/ConfigException$NotResolved;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    throw p0
.end method

.method public peekPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->put(Ljava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public put(Ljava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 10
    const-string p0, "put"

    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+",
            "Ljava/lang/String;",
            "+",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string p0, "putAll"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method

.method public bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->remove(Ljava/lang/Object;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    move-result-object p0

    return-object p0
.end method

.method public remove(Ljava/lang/Object;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    const-string p0, "remove"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method

.method public toConfig()Lcom/typesafe/config/impl/SimpleConfig;
    .locals 0

    .line 6
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->config:Lcom/typesafe/config/impl/SimpleConfig;

    return-object p0
.end method

.method public bridge synthetic toConfig()L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->toConfig()Lcom/typesafe/config/impl/SimpleConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic toFallbackValue()Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->toFallbackValue()Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toFallbackValue()Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 6
    return-object p0
.end method

.method public bridge synthetic toFallbackValue()L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 7
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->toFallbackValue()Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public valueType()Lcom/typesafe/config/ConfigValueType;
    .locals 0

    .line 1
    sget-object p0, Lcom/typesafe/config/ConfigValueType;->OBJECT:Lcom/typesafe/config/ConfigValueType;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withFallback(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public abstract withOnlyPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
.end method

.method public abstract withOnlyPathOrNull(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
.end method

.method public bridge synthetic withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public abstract withValue(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
.end method

.method public abstract withoutPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
.end method
