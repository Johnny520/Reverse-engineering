.class public final L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰世苏哲;
.super L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲兰苏:Landroid/graphics/Matrix;

.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-object p2, p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲兰苏:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-direct {p0}, L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪苏哲兰;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroid/graphics/Matrix;L飘花落叶言楪苏兰子哲世/飘花落叶言子楪世苏哲兰;ILandroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object p1, p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪苏哲兰;

    .line 18
    .line 19
    iget-object v1, p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲兰苏:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {v0, v1, p2, p3, p4}, L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰(Landroid/graphics/Matrix;L飘花落叶言楪苏兰子哲世/飘花落叶言子楪世苏哲兰;ILandroid/graphics/Canvas;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method
