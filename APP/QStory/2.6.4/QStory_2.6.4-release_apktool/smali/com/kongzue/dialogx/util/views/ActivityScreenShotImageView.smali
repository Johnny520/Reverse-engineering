.class public Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;
.super Landroid/widget/ImageView;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static 飘花落叶言子楪兰哲苏世:Z = true


# instance fields
.field public 飘花落叶言子楪兰世哲苏:I

.field public 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰苏世哲;

.field public 飘花落叶言子楪兰苏世哲:I

.field public 飘花落叶言子楪兰苏哲世:Z

.field public 飘花落叶言子楪哲兰世苏:F

.field public 飘花落叶言子楪哲兰苏世:F

.field public 飘花落叶言子楪哲苏兰世:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰世苏哲:Z

    .line 6
    .line 7
    sget-boolean p1, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰哲苏世:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x1

    .line 14
    :goto_0
    const/4 p2, 0x0

    .line 15
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private getDecorView()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {}, L飘花落叶言楪哲苏世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Landroid/app/Activity;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    instance-of v0, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    check-cast p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->getFromActivity()Landroid/app/Activity;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Landroid/view/ViewGroup;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Landroid/view/ViewGroup;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_2
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->setContentViewVisibility(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲苏兰世:F

    .line 9
    .line 10
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 11
    .line 12
    cmpl-float v0, v0, v1

    .line 13
    .line 14
    if-ltz v0, :cond_2

    .line 15
    .line 16
    iget v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰世苏:F

    .line 17
    .line 18
    cmpl-float v0, v0, v1

    .line 19
    .line 20
    if-lez v0, :cond_2

    .line 21
    .line 22
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰苏哲世:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/high16 v0, -0x1000000

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    new-instance v0, Landroid/graphics/Path;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 34
    .line 35
    .line 36
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲苏兰世:F

    .line 43
    .line 44
    iget v3, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 45
    .line 46
    sub-float/2addr v1, v3

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 48
    .line 49
    .line 50
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲苏兰世:F

    .line 51
    .line 52
    iget v3, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2, v1, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 55
    .line 56
    .line 57
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲苏兰世:F

    .line 58
    .line 59
    iget v3, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰世苏:F

    .line 60
    .line 61
    iget v4, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 62
    .line 63
    sub-float/2addr v3, v4

    .line 64
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 65
    .line 66
    .line 67
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲苏兰世:F

    .line 68
    .line 69
    iget v3, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰世苏:F

    .line 70
    .line 71
    iget v4, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 72
    .line 73
    sub-float v4, v1, v4

    .line 74
    .line 75
    invoke-virtual {v0, v1, v3, v4, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 76
    .line 77
    .line 78
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 79
    .line 80
    iget v3, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰世苏:F

    .line 81
    .line 82
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 83
    .line 84
    .line 85
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰世苏:F

    .line 86
    .line 87
    iget v3, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 88
    .line 89
    sub-float v3, v1, v3

    .line 90
    .line 91
    invoke-virtual {v0, v2, v1, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 92
    .line 93
    .line 94
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 95
    .line 96
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 97
    .line 98
    .line 99
    iget v1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 100
    .line 101
    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 105
    .line 106
    .line 107
    :cond_2
    const/4 v0, -0x1

    .line 108
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 109
    .line 110
    .line 111
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲苏兰世:F

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    int-to-float p2, p2

    .line 11
    cmpl-float p1, p1, p2

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰世苏:F

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    int-to-float p2, p2

    .line 22
    cmpl-float p1, p1, p2

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪世苏兰哲()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    int-to-float p1, p1

    .line 34
    iput p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲苏兰世:F

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    int-to-float p1, p1

    .line 41
    iput p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰世苏:F

    .line 42
    .line 43
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰苏哲世:Z

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪世苏兰哲()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setContentViewVisibility(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public setRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪哲兰苏世:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setScale(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰世苏哲:Z

    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰世哲苏:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰苏世哲:I

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰世哲苏:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰苏世哲:I

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->getDecorView()Landroid/view/ViewGroup;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void

    .line 43
    :cond_3
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰苏世哲;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->setContentViewVisibility(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v1

    .line 39
    const/4 v1, 0x0

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {p1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {p1, v1, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 73
    .line 74
    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    new-instance v3, Landroid/graphics/Canvas;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 81
    .line 82
    .line 83
    :try_start_0
    invoke-virtual {p1, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catch_0
    move-exception v3

    .line 88
    sget-object v4, L飘花落叶言楪哲苏子兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 91
    .line 92
    .line 93
    sget-boolean v3, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰哲苏世:Z

    .line 94
    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    sput-boolean v1, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰哲苏世:Z

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {v2, v1, v1, v3, p1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 119
    .line 120
    .line 121
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰苏哲世:Z

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->setContentViewVisibility(Z)V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰苏世哲;

    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰苏世哲;

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 142
    .line 143
    .line 144
    :cond_3
    :goto_1
    return-void
.end method
