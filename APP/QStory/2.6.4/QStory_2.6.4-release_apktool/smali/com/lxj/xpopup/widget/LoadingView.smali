.class public Lcom/lxj/xpopup/widget/LoadingView;
.super Landroid/view/View;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世楪兰哲苏:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

.field public final 飘花落叶言子世楪兰苏哲:I

.field public final 飘花落叶言子世楪哲兰苏:I

.field public final 飘花落叶言子世楪哲苏兰:Landroid/animation/ArgbEvaluator;

.field public 飘花落叶言子世楪苏兰哲:F

.field public 飘花落叶言子世楪苏哲兰:F

.field public 飘花落叶言子楪兰世哲苏:F

.field public 飘花落叶言子楪兰世苏哲:F

.field public final 飘花落叶言子楪兰哲世苏:Landroid/graphics/Paint;

.field public 飘花落叶言子楪兰哲苏世:F

.field public 飘花落叶言子楪兰苏世哲:F

.field public 飘花落叶言子楪兰苏哲世:F

.field public final 飘花落叶言子楪哲兰世苏:F

.field public 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:I


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
    const/16 p2, 0xa

    .line 6
    .line 7
    iput p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    const/high16 p2, 0x42100000    # 36.0f

    .line 10
    .line 11
    iput p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲兰世苏:F

    .line 12
    .line 13
    iput v0, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲兰苏世:I

    .line 14
    .line 15
    const/high16 p2, 0x40000000    # 2.0f

    .line 16
    .line 17
    iput p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪苏兰哲:F

    .line 18
    .line 19
    new-instance p2, Landroid/animation/ArgbEvaluator;

    .line 20
    .line 21
    invoke-direct {p2}, Landroid/animation/ArgbEvaluator;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪哲苏兰:Landroid/animation/ArgbEvaluator;

    .line 25
    .line 26
    const-string p2, "#EEEEEE"

    .line 27
    .line 28
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iput p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪哲兰苏:I

    .line 33
    .line 34
    const-string p2, "#111111"

    .line 35
    .line 36
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iput p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪兰苏哲:I

    .line 41
    .line 42
    new-instance p2, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 43
    .line 44
    const/16 v0, 0xc

    .line 45
    .line 46
    invoke-direct {p2, p0, v0}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪兰哲苏:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 50
    .line 51
    new-instance p2, Landroid/graphics/Paint;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰哲世苏:Landroid/graphics/Paint;

    .line 58
    .line 59
    iget v0, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪苏兰哲:F

    .line 60
    .line 61
    invoke-static {p1, v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    int-to-float p1, p1

    .line 66
    iput p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪苏兰哲:F

    .line 67
    .line 68
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 69
    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪兰哲苏:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x50

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪兰哲苏:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲苏兰世:I

    .line 5
    .line 6
    add-int/lit8 v1, v0, -0x1

    .line 7
    .line 8
    :goto_0
    if-ltz v1, :cond_0

    .line 9
    .line 10
    iget v2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲兰苏世:I

    .line 11
    .line 12
    add-int/2addr v2, v1

    .line 13
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    rem-int/2addr v2, v0

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    const/high16 v3, 0x3f800000    # 1.0f

    .line 22
    .line 23
    mul-float/2addr v2, v3

    .line 24
    int-to-float v3, v0

    .line 25
    div-float/2addr v2, v3

    .line 26
    iget v3, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪哲兰苏:I

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget v4, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪兰苏哲:I

    .line 33
    .line 34
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v5, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪哲苏兰:Landroid/animation/ArgbEvaluator;

    .line 39
    .line 40
    invoke-virtual {v5, v2, v3, v4}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iget-object v8, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰哲世苏:Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    iget v4, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰苏世哲:F

    .line 56
    .line 57
    iget v5, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰世哲苏:F

    .line 58
    .line 59
    iget v6, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰苏哲世:F

    .line 60
    .line 61
    move v7, v5

    .line 62
    move-object v3, p1

    .line 63
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 64
    .line 65
    .line 66
    iget p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰苏世哲:F

    .line 67
    .line 68
    iget v2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰世哲苏:F

    .line 69
    .line 70
    iget v4, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪苏兰哲:F

    .line 71
    .line 72
    const/high16 v5, 0x40000000    # 2.0f

    .line 73
    .line 74
    div-float/2addr v4, v5

    .line 75
    invoke-virtual {v3, p1, v2, v4, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    iget p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰苏哲世:F

    .line 79
    .line 80
    iget v2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰世哲苏:F

    .line 81
    .line 82
    iget v4, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪苏兰哲:F

    .line 83
    .line 84
    div-float/2addr v4, v5

    .line 85
    invoke-virtual {v3, p1, v2, v4, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 86
    .line 87
    .line 88
    iget p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰世苏哲:F

    .line 89
    .line 90
    iget v2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰世哲苏:F

    .line 91
    .line 92
    iget v4, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲兰世苏:F

    .line 93
    .line 94
    invoke-virtual {v3, v4, p1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v1, v1, -0x1

    .line 98
    .line 99
    move-object p1, v3

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    int-to-float p1, p1

    .line 9
    const/high16 p2, 0x40000000    # 2.0f

    .line 10
    .line 11
    div-float/2addr p1, p2

    .line 12
    iput p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰哲苏世:F

    .line 13
    .line 14
    const/high16 p3, 0x40200000    # 2.5f

    .line 15
    .line 16
    div-float/2addr p1, p3

    .line 17
    iput p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪苏哲兰:F

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-float p1, p1

    .line 24
    div-float/2addr p1, p2

    .line 25
    iput p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰世苏哲:F

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-float p1, p1

    .line 32
    div-float/2addr p1, p2

    .line 33
    iput p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰世哲苏:F

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1, p2}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    int-to-float p1, p1

    .line 44
    iput p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪苏兰哲:F

    .line 45
    .line 46
    iget-object p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰哲世苏:Landroid/graphics/Paint;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 49
    .line 50
    .line 51
    iget p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰世苏哲:F

    .line 52
    .line 53
    iget p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪苏哲兰:F

    .line 54
    .line 55
    add-float/2addr p1, p2

    .line 56
    iput p1, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰苏世哲:F

    .line 57
    .line 58
    iget p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰哲苏世:F

    .line 59
    .line 60
    const/high16 p3, 0x40400000    # 3.0f

    .line 61
    .line 62
    div-float/2addr p2, p3

    .line 63
    add-float/2addr p2, p1

    .line 64
    iput p2, p0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪兰苏哲世:F

    .line 65
    .line 66
    return-void
.end method
