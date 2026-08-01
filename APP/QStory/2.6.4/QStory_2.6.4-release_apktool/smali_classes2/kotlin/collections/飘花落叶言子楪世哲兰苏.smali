.class public final Lkotlin/collections/飘花落叶言子楪世哲兰苏;
.super Landroidx/core/view/飘花落叶言子苏世哲兰楪;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Lkotlin/collections/飘花落叶言子楪世兰哲苏;


# direct methods
.method public constructor <init>(Lkotlin/collections/飘花落叶言子楪世兰哲苏;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Lkotlin/collections/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/collections/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    invoke-direct {p0, p1, v0}, Landroidx/core/view/飘花落叶言子苏世哲兰楪;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lkotlin/collections/飘花落叶言子楪世兰哲苏;->Companion:Lkotlin/collections/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    invoke-virtual {p1}, Lkotlin/collections/飘花落叶言子楪世苏哲兰;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p2, p1}, Lkotlin/collections/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 17
    .line 18
    .line 19
    iput p2, p0, Landroidx/core/view/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
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

.method public final hasPrevious()Z
    .locals 0

    .line 1
    iget p0, p0, Landroidx/core/view/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final nextIndex()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/core/view/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    return p0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/collections/飘花落叶言子楪世哲兰苏;->hasPrevious()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Landroidx/core/view/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    iput v0, p0, Landroidx/core/view/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:I

    .line 12
    .line 13
    iget-object p0, p0, Lkotlin/collections/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/collections/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final previousIndex()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/core/view/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    add-int/lit8 p0, p0, -0x1

    .line 4
    .line 5
    return p0
.end method

.method public final set(Ljava/lang/Object;)V
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
