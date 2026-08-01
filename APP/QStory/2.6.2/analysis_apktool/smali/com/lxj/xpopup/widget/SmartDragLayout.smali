.class public Lcom/lxj/xpopup/widget/SmartDragLayout;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子世楪兰苏哲:Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子世楪哲兰苏:Landroid/view/View;

.field public 飘花落叶言子世楪哲苏兰:Z

.field public 飘花落叶言子世楪苏兰哲:F

.field public 飘花落叶言子世楪苏哲兰:F

.field public 飘花落叶言子楪兰世哲苏:Z

.field public 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪兰哲世苏:I

.field public 飘花落叶言子楪兰哲苏世:I

.field public 飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

.field public 飘花落叶言子楪兰苏哲世:I

.field public 飘花落叶言子楪哲兰世苏:Landroid/view/VelocityTracker;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    iput-boolean p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 7
    .line 8
    iput-boolean p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世苏哲:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 11
    .line 12
    sget-object p2, Lcom/lxj/xpopup/enums/LayoutStatus;->Close:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 15
    .line 16
    const/16 p2, 0x190

    .line 17
    .line 18
    iput p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏哲世:I

    .line 19
    .line 20
    new-instance p2, Landroid/widget/OverScroller;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final computeScroll()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->computeScroll()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0, v1, v0}, Lcom/lxj/xpopup/widget/SmartDragLayout;->scrollTo(II)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public getNestedScrollAxes()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲苏兰:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 5
    .line 6
    sget-object v1, Lcom/lxj/xpopup/enums/LayoutStatus;->Closing:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    sget-object v1, Lcom/lxj/xpopup/enums/LayoutStatus;->Opening:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    iget-object p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    div-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    iget-object p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    div-int/lit8 p2, p2, 0x2

    .line 29
    .line 30
    sub-int/2addr p1, p2

    .line 31
    iget-object p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    iget-object p4, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    add-int/2addr p4, p1

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 45
    .line 46
    .line 47
    move-result p5

    .line 48
    iget v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 49
    .line 50
    add-int/2addr p5, v0

    .line 51
    invoke-virtual {p2, p1, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 55
    .line 56
    sget-object p2, Lcom/lxj/xpopup/enums/LayoutStatus;->Open:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 57
    .line 58
    if-ne p1, p2, :cond_1

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    iget p3, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲苏世:I

    .line 69
    .line 70
    iget p4, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 71
    .line 72
    sub-int/2addr p3, p4

    .line 73
    sub-int/2addr p2, p3

    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/lxj/xpopup/widget/SmartDragLayout;->scrollTo(II)V

    .line 75
    .line 76
    .line 77
    :cond_1
    iget p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 78
    .line 79
    iput p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲苏世:I

    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    div-int/lit8 p1, p1, 0x2

    .line 87
    .line 88
    iget-object p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    div-int/lit8 p2, p2, 0x2

    .line 95
    .line 96
    sub-int/2addr p1, p2

    .line 97
    iget-object p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    iget-object p4, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 104
    .line 105
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 106
    .line 107
    .line 108
    move-result p4

    .line 109
    sub-int/2addr p3, p4

    .line 110
    iget-object p4, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 111
    .line 112
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 113
    .line 114
    .line 115
    move-result p4

    .line 116
    add-int/2addr p4, p1

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-virtual {p2, p1, p3, p4, p0}, Landroid/view/View;->layout(IIII)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 12
    .line 13
    if-ge p1, p2, :cond_0

    .line 14
    .line 15
    const p1, -0x3b448000    # -1500.0f

    .line 16
    .line 17
    .line 18
    cmpg-float p1, p3, p1

    .line 19
    .line 20
    if-gez p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 24
    .line 25
    new-instance p1, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    invoke-direct {p1, p0, p2}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;-><init>(Lcom/lxj/xpopup/widget/SmartDragLayout;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 0

    .line 1
    if-lez p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    add-int/2addr p1, p3

    .line 8
    iget p2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 9
    .line 10
    if-ge p1, p2, :cond_0

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    aput p3, p4, p2

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p0, p2, p1}, Lcom/lxj/xpopup/widget/SmartDragLayout;->scrollTo(II)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    add-int/2addr p2, p5

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/lxj/xpopup/widget/SmartDragLayout;->scrollTo(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    if-ne p3, p1, :cond_0

    .line 3
    .line 4
    iget-boolean p0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 2
    .line 3
    sget-object v1, Lcom/lxj/xpopup/enums/LayoutStatus;->Closing:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 4
    .line 5
    if-eq v0, v1, :cond_b

    .line 6
    .line 7
    sget-object v1, Lcom/lxj/xpopup/enums/LayoutStatus;->Opening:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    iget-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 27
    .line 28
    sget-object v2, Lcom/lxj/xpopup/enums/LayoutStatus;->Close:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 29
    .line 30
    if-ne v0, v2, :cond_2

    .line 31
    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    iput p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪苏哲兰:F

    .line 34
    .line 35
    iput p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪苏兰哲:F

    .line 36
    .line 37
    return v1

    .line 38
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_7

    .line 43
    .line 44
    if-eq v0, v1, :cond_4

    .line 45
    .line 46
    const/4 v2, 0x2

    .line 47
    if-eq v0, v2, :cond_3

    .line 48
    .line 49
    const/4 v2, 0x3

    .line 50
    if-eq v0, v2, :cond_4

    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :cond_3
    iget-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 55
    .line 56
    if-eqz v0, :cond_a

    .line 57
    .line 58
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰世苏:Landroid/view/VelocityTracker;

    .line 59
    .line 60
    if-eqz v0, :cond_a

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰世苏:Landroid/view/VelocityTracker;

    .line 66
    .line 67
    const/16 v1, 0x3e8

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪苏兰哲:F

    .line 77
    .line 78
    sub-float/2addr v0, v1

    .line 79
    float-to-int v0, v0

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    sub-int/2addr v2, v0

    .line 89
    invoke-virtual {p0, v1, v2}, Lcom/lxj/xpopup/widget/SmartDragLayout;->scrollTo(II)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iput p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪苏兰哲:F

    .line 97
    .line 98
    goto/16 :goto_1

    .line 99
    .line 100
    :cond_4
    new-instance v0, Landroid/graphics/Rect;

    .line 101
    .line 102
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-static {v2, v3, v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(FFLandroid/graphics/Rect;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    iget-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世苏哲:Z

    .line 125
    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget v2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪苏哲兰:F

    .line 133
    .line 134
    sub-float/2addr v0, v2

    .line 135
    float-to-double v2, v0

    .line 136
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 137
    .line 138
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 139
    .line 140
    .line 141
    move-result-wide v2

    .line 142
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    iget v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪苏兰哲:F

    .line 147
    .line 148
    sub-float/2addr p1, v0

    .line 149
    float-to-double v6, p1

    .line 150
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 151
    .line 152
    .line 153
    move-result-wide v4

    .line 154
    add-double/2addr v4, v2

    .line 155
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    double-to-float p1, v2

    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    int-to-float v0, v0

    .line 173
    cmpg-float p1, p1, v0

    .line 174
    .line 175
    if-gez p1, :cond_5

    .line 176
    .line 177
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 178
    .line 179
    .line 180
    :cond_5
    iget-boolean p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 181
    .line 182
    if-eqz p1, :cond_a

    .line 183
    .line 184
    iget-object p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰世苏:Landroid/view/VelocityTracker;

    .line 185
    .line 186
    if-eqz p1, :cond_a

    .line 187
    .line 188
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    const v0, 0x44bb8000    # 1500.0f

    .line 193
    .line 194
    .line 195
    cmpl-float p1, p1, v0

    .line 196
    .line 197
    if-lez p1, :cond_6

    .line 198
    .line 199
    iput-boolean v1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 200
    .line 201
    new-instance p1, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;

    .line 202
    .line 203
    invoke-direct {p1, p0, v1}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;-><init>(Lcom/lxj/xpopup/widget/SmartDragLayout;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_6
    invoke-virtual {p0}, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪世苏哲兰()V

    .line 211
    .line 212
    .line 213
    :goto_0
    const/4 p1, 0x0

    .line 214
    iput-object p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰世苏:Landroid/view/VelocityTracker;

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_7
    iget-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 218
    .line 219
    if-eqz v0, :cond_9

    .line 220
    .line 221
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰世苏:Landroid/view/VelocityTracker;

    .line 222
    .line 223
    if-eqz v0, :cond_8

    .line 224
    .line 225
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 226
    .line 227
    .line 228
    :cond_8
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iput-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰世苏:Landroid/view/VelocityTracker;

    .line 233
    .line 234
    :cond_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    iput v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪苏哲兰:F

    .line 239
    .line 240
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    iput p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪苏兰哲:F

    .line 245
    .line 246
    :cond_a
    :goto_1
    iget-boolean p0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 247
    .line 248
    return p0

    .line 249
    :cond_b
    :goto_2
    const/4 p0, 0x0

    .line 250
    return p0
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲兰苏:Landroid/view/View;

    .line 5
    .line 6
    return-void
.end method

.method public final scrollTo(II)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 2
    .line 3
    if-le p2, v0, :cond_0

    .line 4
    .line 5
    move p2, v0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-gez p2, :cond_1

    .line 8
    .line 9
    move p2, v1

    .line 10
    :cond_1
    int-to-float v2, p2

    .line 11
    const/high16 v3, 0x3f800000    # 1.0f

    .line 12
    .line 13
    mul-float/2addr v2, v3

    .line 14
    int-to-float v0, v0

    .line 15
    div-float/2addr v2, v0

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-le p2, v0, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    :cond_2
    iput-boolean v1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲苏兰:Z

    .line 24
    .line 25
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪兰苏哲:Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰哲苏;

    .line 26
    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    cmpl-float v1, v2, v1

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    iget-object v1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 39
    .line 40
    sget-object v4, Lcom/lxj/xpopup/enums/LayoutStatus;->Close:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 41
    .line 42
    if-eq v1, v4, :cond_3

    .line 43
    .line 44
    iput-object v4, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 45
    .line 46
    check-cast v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 49
    .line 50
    check-cast v0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->beforeDismiss()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->doAfterDismiss()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    cmpl-float v0, v2, v3

    .line 60
    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 64
    .line 65
    sget-object v1, Lcom/lxj/xpopup/enums/LayoutStatus;->Open:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 66
    .line 67
    if-eq v0, v1, :cond_4

    .line 68
    .line 69
    iput-object v1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 70
    .line 71
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪兰苏哲:Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰哲苏;

    .line 72
    .line 73
    check-cast v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(F)V

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-super {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public setDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏哲世:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnCloseListener(Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪兰苏哲:Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子世楪哲苏兰:Z

    .line 6
    .line 7
    iget v1, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    :goto_0
    div-int/lit8 v1, v1, 0x3

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    mul-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-le v0, v1, :cond_1

    .line 22
    .line 23
    iget v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    sub-int v6, v0, v1

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/4 v5, 0x0

    .line 42
    iget v7, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏哲世:I

    .line 43
    .line 44
    iget-object v2, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 45
    .line 46
    invoke-virtual/range {v2 .. v7}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method
