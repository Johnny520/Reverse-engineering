.class public final Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Collection;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget v0, Landroidx/collection/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    new-instance v0, Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    invoke-direct {v0, v1}, Landroidx/collection/飘花落叶言子世哲苏兰楪;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
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

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroidx/collection/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪苏世哲兰:I

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/collection/飘花落叶言子世哲兰苏楪;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Landroidx/collection/飘花落叶言子世哲兰苏楪;-><init>(Landroidx/collection/飘花落叶言子世哲苏兰楪;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Landroidx/collection/飘花落叶言子世哲兰楪苏;

    .line 12
    .line 13
    invoke-direct {p0, v0}, Landroidx/collection/飘花落叶言子世哲兰楪苏;-><init>(Landroidx/collection/飘花落叶言子世哲兰苏楪;)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final removeIf(Ljava/util/function/Predicate;)Z
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

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪苏世哲兰:I

    .line 4
    .line 5
    return p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/util/Collection;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
