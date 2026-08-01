.class public final Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世楪兰哲苏;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;Landroidx/collection/飘花落叶言子楪哲世兰苏;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    invoke-static {v0, p1}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲兰世(ILandroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Landroidx/collection/飘花落叶言子世楪兰哲苏;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-direct {v0, v1}, Landroidx/collection/飘花落叶言子世楪兰哲苏;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世楪兰哲苏;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 36
    .line 37
    iget v3, v2, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:I

    .line 38
    .line 39
    invoke-virtual {p2, v3}, Landroidx/collection/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    iget-object v3, p0, Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世楪兰哲苏;

    .line 46
    .line 47
    iget v2, v2, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:I

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Landroidx/collection/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(I)Z

    .line 50
    .line 51
    .line 52
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-void
.end method
