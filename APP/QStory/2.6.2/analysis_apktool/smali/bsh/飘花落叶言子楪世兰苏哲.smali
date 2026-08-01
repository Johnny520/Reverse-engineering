.class public final Lbsh/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lbsh/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Lbsh/飘花落叶言子楪世兰哲苏;Ljava/util/ListIterator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lbsh/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iput-object p2, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lbsh/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    invoke-virtual {v1, v0, p1}, Lbsh/飘花落叶言子楪世兰哲苏;->add(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, v1, Lbsh/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 9
    .line 10
    iget v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Integer;

    .line 17
    .line 18
    iget-object v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    iput p1, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 25
    .line 26
    return-void
.end method

.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/ListIterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final hasPrevious()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    iget-object p0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lbsh/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子楪世兰哲苏;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final nextIndex()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/ListIterator;->nextIndex()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    iget-object p0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lbsh/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子楪世兰哲苏;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final previousIndex()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/ListIterator;->previousIndex()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lbsh/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget v1, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lbsh/飘花落叶言子楪世兰哲苏;->remove(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ListIterator;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 11
    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 15
    .line 16
    return-void
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lbsh/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget p0, p0, Lbsh/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, Lbsh/飘花落叶言子楪世兰哲苏;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method
