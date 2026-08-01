.class public Lcom/lxj/xpopup/widget/PhotoViewContainer;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:I

.field public final 飘花落叶言子楪兰世苏哲:I

.field public 飘花落叶言子楪兰苏世哲:F

.field public 飘花落叶言子楪兰苏哲世:F

.field public 飘花落叶言子楪哲兰世苏:Z

.field public final 飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

.field public 飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰世苏:Z

    .line 6
    .line 7
    const/16 p1, 0x50

    .line 8
    .line 9
    iput p1, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰世苏哲:I

    .line 10
    .line 11
    new-instance p1, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p1, p0, p2}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 30
    .line 31
    const/high16 v1, 0x42a00000    # 80.0f

    .line 32
    .line 33
    mul-float/2addr v1, p2

    .line 34
    const/high16 p2, 0x3f000000    # 0.5f

    .line 35
    .line 36
    add-float/2addr v1, p2

    .line 37
    float-to-int p2, v1

    .line 38
    iput p2, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰世苏哲:I

    .line 39
    .line 40
    new-instance p2, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {p2, v1, p0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private getCurrentImageView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言子兰苏楪哲世/飘花落叶言子楪苏世兰哲;->getCurrentItem()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/widget/FrameLayout;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public final computeScroll()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->computeScroll()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eq v0, v1, :cond_3

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    if-eq v0, v3, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget v3, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰苏世哲:F

    .line 34
    .line 35
    sub-float/2addr v0, v3

    .line 36
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iget v4, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰苏哲世:F

    .line 41
    .line 42
    sub-float/2addr v3, v4

    .line 43
    iget-object v4, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪苏世兰哲;

    .line 44
    .line 45
    invoke-virtual {v4, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    cmpl-float v0, v3, v0

    .line 57
    .line 58
    if-lez v0, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v1, v2

    .line 62
    :goto_0
    iput-boolean v1, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰世苏:Z

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰苏世哲:F

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰苏哲世:F

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/4 v0, 0x0

    .line 78
    iput v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰苏世哲:F

    .line 79
    .line 80
    iput v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰苏哲世:F

    .line 81
    .line 82
    iput-boolean v2, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰世苏:Z

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iput v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰苏世哲:F

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iput v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰苏哲世:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    :catch_0
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onFinishInflate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, L飘花落叶言子兰苏楪哲世/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-le v1, v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne p1, v1, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/lxj/xpopup/widget/PhotoViewContainer;->getCurrentImageView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-boolean p0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰世苏:Z

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    return v3

    .line 33
    :cond_1
    return v2
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    div-int/lit8 p1, p1, 0x3

    .line 9
    .line 10
    iput p1, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰世哲苏:I

    .line 11
    .line 12
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
    return v1
.end method

.method public setOnDragChangeListener(L飘花落叶言楪哲兰子世苏/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    return-void
.end method
