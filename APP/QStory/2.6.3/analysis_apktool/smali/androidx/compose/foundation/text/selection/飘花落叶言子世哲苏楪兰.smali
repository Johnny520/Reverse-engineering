.class public final Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/layout/飘花落叶言子世兰苏楪哲;


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏楪兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏楪兰;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Ljava/util/List;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 6

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v1, v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 24
    .line 25
    invoke-interface {v4, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget v5, v4, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 30
    .line 31
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v5, v4, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 36
    .line 37
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p2, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲苏世;

    .line 48
    .line 49
    const/4 p3, 0x1

    .line 50
    invoke-direct {p2, p0, p3}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2, v3, p2}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
