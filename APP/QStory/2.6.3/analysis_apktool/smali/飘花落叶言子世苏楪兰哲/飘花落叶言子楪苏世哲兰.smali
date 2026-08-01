.class public final L飘花落叶言子世苏楪兰哲/飘花落叶言子楪苏世哲兰;
.super L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言子世苏楪兰哲/飘花落叶言子楪苏世哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言子世苏楪兰哲/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, L飘花落叶言子世苏楪兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子世苏楪兰哲/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏兰世哲;Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;L飘花落叶言子世苏楪兰哲/飘花落叶言子世苏兰哲楪;)V
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p3

    .line 6
    check-cast p3, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    iget p3, p3, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    const/4 p4, 0x1

    .line 11
    invoke-virtual {p1, p4}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    :goto_0
    if-ge p0, p4, :cond_0

    .line 22
    .line 23
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p5

    .line 27
    add-int v0, p3, p0

    .line 28
    .line 29
    invoke-interface {p2, v0, p5}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, v0, p5}, Landroidx/compose/runtime/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method
