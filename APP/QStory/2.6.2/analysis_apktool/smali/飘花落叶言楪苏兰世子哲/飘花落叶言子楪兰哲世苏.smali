.class public final L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰哲世苏;
.super L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰哲苏世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世哲苏兰:F

.field public 飘花落叶言子楪世苏兰哲:F


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroid/graphics/Matrix;Landroid/graphics/Path;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 7
    .line 8
    .line 9
    iget v0, p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:F

    .line 10
    .line 11
    iget p0, p0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:F

    .line 12
    .line 13
    invoke-virtual {p2, v0, p0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
