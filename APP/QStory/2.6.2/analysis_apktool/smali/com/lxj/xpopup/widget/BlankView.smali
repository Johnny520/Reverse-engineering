.class public Lcom/lxj/xpopup/widget/BlankView;
.super Landroid/view/View;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Landroid/graphics/RectF;

.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:Landroid/graphics/Paint;

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    const-string p1, "#DDDDDD"

    .line 8
    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    new-instance p1, Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪哲兰苏世:Landroid/graphics/Paint;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    iput-object p2, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪兰世苏哲:Landroid/graphics/RectF;

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 27
    .line 28
    .line 29
    const/high16 p0, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪哲苏兰世:I

    .line 5
    .line 6
    iget-object v1, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪哲兰苏世:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪兰世苏哲:Landroid/graphics/RectF;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪哲兰世苏:I

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪兰世苏哲:Landroid/graphics/RectF;

    .line 28
    .line 29
    invoke-virtual {p1, p0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    int-to-float p2, p2

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    int-to-float p3, p3

    .line 16
    const/4 p4, 0x0

    .line 17
    invoke-direct {p1, p4, p4, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/lxj/xpopup/widget/BlankView;->飘花落叶言子楪兰世苏哲:Landroid/graphics/RectF;

    .line 21
    .line 22
    return-void
.end method
