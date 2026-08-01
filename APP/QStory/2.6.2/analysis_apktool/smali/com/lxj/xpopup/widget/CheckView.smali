.class public Lcom/lxj/xpopup/widget/CheckView;
.super Landroid/view/View;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:Landroid/graphics/Path;

.field public final 飘花落叶言子楪哲苏兰世:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    iput v0, p0, Lcom/lxj/xpopup/widget/CheckView;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    new-instance p2, Landroid/graphics/Path;

    .line 8
    .line 9
    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lcom/lxj/xpopup/widget/CheckView;->飘花落叶言子楪哲兰苏世:Landroid/graphics/Path;

    .line 13
    .line 14
    new-instance p2, Landroid/graphics/Paint;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lcom/lxj/xpopup/widget/CheckView;->飘花落叶言子楪哲苏兰世:Landroid/graphics/Paint;

    .line 21
    .line 22
    const/high16 p0, 0x40000000    # 2.0f

    .line 23
    .line 24
    invoke-static {p1, p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    int-to-float p0, p0

    .line 29
    invoke-virtual {p2, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 33
    .line 34
    invoke-virtual {p2, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/lxj/xpopup/widget/CheckView;->飘花落叶言子楪哲兰世苏:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    const/high16 v1, 0x40800000    # 4.0f

    .line 15
    .line 16
    div-float/2addr v0, v1

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    const/high16 v3, 0x40000000    # 2.0f

    .line 23
    .line 24
    div-float/2addr v2, v3

    .line 25
    iget-object v4, p0, Lcom/lxj/xpopup/widget/CheckView;->飘花落叶言子楪哲兰苏世:Landroid/graphics/Path;

    .line 26
    .line 27
    invoke-virtual {v4, v0, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    int-to-float v0, v0

    .line 35
    div-float/2addr v0, v3

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    mul-int/lit8 v2, v2, 0x3

    .line 41
    .line 42
    int-to-float v2, v2

    .line 43
    div-float/2addr v2, v1

    .line 44
    invoke-virtual {v4, v0, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-float v0, v0

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    int-to-float v2, v2

    .line 57
    div-float/2addr v2, v1

    .line 58
    invoke-virtual {v4, v0, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Lcom/lxj/xpopup/widget/CheckView;->飘花落叶言子楪哲苏兰世:Landroid/graphics/Paint;

    .line 62
    .line 63
    invoke-virtual {p1, v4, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/lxj/xpopup/widget/CheckView;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/lxj/xpopup/widget/CheckView;->飘花落叶言子楪哲苏兰世:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
