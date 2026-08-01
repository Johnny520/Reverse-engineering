.class public final Landroidx/collection/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Map;
.implements L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Landroidx/collection/飘花落叶言子苏世兰哲楪;

.field public 飘花落叶言子楪哲兰世苏:Landroidx/collection/飘花落叶言子楪苏哲世兰;

.field public 飘花落叶言子楪哲兰苏世:Landroidx/collection/飘花落叶言子楪哲兰世苏;

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;


# direct methods
.method public constructor <init>(Landroidx/collection/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Landroidx/collection/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Landroidx/collection/飘花落叶言子楪苏哲世兰;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroidx/collection/飘花落叶言子楪苏哲世兰;-><init>(Landroidx/collection/飘花落叶言子世兰楪苏哲;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Landroidx/collection/飘花落叶言子楪苏哲世兰;

    .line 14
    .line 15
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Landroidx/collection/飘花落叶言子楪兰哲苏世;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Landroidx/collection/飘花落叶言子楪兰哲苏世;

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 19
    .line 20
    iget-object p1, p1, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->hashCode()I

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
    iget-object p0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏哲世兰()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰苏世:Landroidx/collection/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Landroidx/collection/飘花落叶言子楪哲兰世苏;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroidx/collection/飘花落叶言子楪哲兰世苏;-><init>(Landroidx/collection/飘花落叶言子世兰楪苏哲;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰苏世:Landroidx/collection/飘花落叶言子楪哲兰世苏;

    .line 14
    .line 15
    return-object v0
.end method

.method public final merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 9
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Operation is not supported for read-only collection"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 9
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Operation is not supported for read-only collection"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final replaceAll(Ljava/util/function/BiFunction;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 2
    .line 3
    iget p0, p0, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世兰苏哲:I

    .line 4
    .line 5
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:Landroidx/collection/飘花落叶言子苏世兰哲楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Landroidx/collection/飘花落叶言子苏世兰哲楪;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroidx/collection/飘花落叶言子苏世兰哲楪;-><init>(Landroidx/collection/飘花落叶言子世兰楪苏哲;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/collection/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:Landroidx/collection/飘花落叶言子苏世兰哲楪;

    .line 14
    .line 15
    return-object v0
.end method
