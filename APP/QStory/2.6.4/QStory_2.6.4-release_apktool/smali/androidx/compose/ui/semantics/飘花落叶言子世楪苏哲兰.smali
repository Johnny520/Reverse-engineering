.class public final Landroidx/compose/ui/semantics/飘花落叶言子世楪苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/util/Comparator;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;Ljava/util/Comparator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/Comparator;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Comparator;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/Comparator;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    check-cast p1, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 11
    .line 12
    iget-object p1, p1, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 13
    .line 14
    check-cast p2, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 15
    .line 16
    iget-object p2, p2, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Comparator;

    .line 19
    .line 20
    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method
