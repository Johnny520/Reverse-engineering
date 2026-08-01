.class public final Landroidx/compose/runtime/internal/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/runtime/飘花落叶言子哲楪世兰苏;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/Set;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v0, v0, [Landroidx/compose/runtime/飘花落叶言子世苏兰楪哲;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p1, v1, v0}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    aget-object v3, v1, v2

    .line 11
    .line 12
    check-cast v3, Landroidx/compose/runtime/飘花落叶言子世苏兰楪哲;

    .line 13
    .line 14
    iget-object v3, v3, Landroidx/compose/runtime/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子哲楪世兰苏;

    .line 15
    .line 16
    iget-object v4, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v4, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    invoke-interface {v3}, Landroidx/compose/runtime/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世兰苏哲()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 0

    .line 1
    return-void
.end method
