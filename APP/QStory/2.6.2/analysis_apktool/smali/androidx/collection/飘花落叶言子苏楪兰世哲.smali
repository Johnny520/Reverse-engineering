.class public abstract Landroidx/collection/飘花落叶言子苏楪兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Set;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;


# direct methods
.method public constructor <init>(Landroidx/collection/飘花落叶言子世哲苏兰楪;)V
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
    iput-object p1, p0, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroidx/collection/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_1
    const/4 p0, 0x1

    .line 31
    return p0
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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast p1, Landroidx/collection/飘花落叶言子苏楪兰世哲;

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

    .line 23
    .line 24
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子苏楪哲世兰;->hashCode()I

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
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

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

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

    .line 2
    .line 3
    iget p0, p0, Landroidx/collection/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪苏世哲兰:I

    .line 4
    .line 5
    return p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/collection/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏楪哲世兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子苏楪哲世兰;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
