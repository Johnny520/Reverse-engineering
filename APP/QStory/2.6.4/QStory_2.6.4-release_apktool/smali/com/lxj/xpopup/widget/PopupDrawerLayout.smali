.class public Lcom/lxj/xpopup/widget/PopupDrawerLayout;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子世楪兰苏哲:Z

.field public 飘花落叶言子世楪哲兰苏:Z

.field public 飘花落叶言子世楪哲苏兰:F

.field public 飘花落叶言子世楪苏兰哲:F

.field public 飘花落叶言子世楪苏哲兰:F

.field public 飘花落叶言子楪兰世哲苏:Landroid/view/View;

.field public final 飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

.field public 飘花落叶言子楪兰哲世苏:Z

.field public 飘花落叶言子楪兰哲苏世:F

.field public 飘花落叶言子楪兰苏世哲:Landroid/view/View;

.field public 飘花落叶言子楪兰苏哲世:Z

.field public final 飘花落叶言子楪哲兰世苏:Z

.field public final 飘花落叶言子楪哲兰苏世:Z

.field public 飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    sget-object p1, Lcom/lxj/xpopup/enums/PopupPosition;->Left:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲兰世苏:Z

    .line 11
    .line 12
    iput-boolean p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏哲世:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰哲世苏:Z

    .line 17
    .line 18
    new-instance p1, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-direct {p1, p0, p2}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    new-instance p2, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {p2, v0, p0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 34
    .line 35
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroid/view/ViewGroup;FFI)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x2

    .line 14
    new-array v3, v3, [I

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 17
    .line 18
    .line 19
    new-instance v4, Landroid/graphics/Rect;

    .line 20
    .line 21
    aget v5, v3, v0

    .line 22
    .line 23
    const/4 v6, 0x1

    .line 24
    aget v7, v3, v6

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    add-int/2addr v8, v5

    .line 31
    aget v3, v3, v6

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    add-int/2addr v9, v3

    .line 38
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, p2, v4}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(FFLandroid/graphics/Rect;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_6

    .line 46
    .line 47
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 48
    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    instance-of p0, v2, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;

    .line 52
    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    check-cast v2, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;

    .line 56
    .line 57
    return v0

    .line 58
    :cond_0
    instance-of p0, v2, Landroid/widget/HorizontalScrollView;

    .line 59
    .line 60
    const/4 v1, -0x1

    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    check-cast v2, Landroid/widget/HorizontalScrollView;

    .line 64
    .line 65
    if-nez p3, :cond_1

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_5

    .line 72
    .line 73
    invoke-virtual {v2, v6}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_7

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {v2, p3}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0

    .line 85
    :cond_2
    instance-of p0, v2, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;

    .line 86
    .line 87
    if-eqz p0, :cond_3

    .line 88
    .line 89
    check-cast v2, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 96
    .line 97
    invoke-virtual {p0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-nez p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {p0, v6}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_7

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    check-cast v2, Landroid/view/ViewGroup;

    .line 111
    .line 112
    invoke-static {v2, p1, p2, p3}, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪世苏兰哲(Landroid/view/ViewGroup;FFI)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    return p0

    .line 117
    :cond_4
    instance-of v3, v2, Landroid/widget/AbsSeekBar;

    .line 118
    .line 119
    if-eqz v3, :cond_6

    .line 120
    .line 121
    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    :cond_5
    :goto_1
    return v6

    .line 128
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_7
    return v0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Lcom/lxj/xpopup/widget/PopupDrawerLayout;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 2
    .line 3
    sget-object v1, Lcom/lxj/xpopup/enums/PopupPosition;->Left:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    neg-int v0, v0

    .line 14
    if-ge p1, v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    neg-int p1, p0

    .line 23
    :cond_0
    if-lez p1, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    return p1

    .line 28
    :cond_2
    sget-object v1, Lcom/lxj/xpopup/enums/PopupPosition;->Right:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 29
    .line 30
    if-ne v0, v1, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int/2addr v0, v1

    .line 43
    if-ge p1, v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sub-int/2addr p1, v0

    .line 56
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-le p1, v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_4
    return p1
.end method


# virtual methods
.method public final computeScroll()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->computeScroll()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    const/4 v1, 0x1

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

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 5
    .line 6
    .line 7
    return-void
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
    iput-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世哲苏:Landroid/view/View;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 17
    .line 18
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Z)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_9

    .line 18
    .line 19
    sget-object v2, Lcom/lxj/xpopup/enums/LayoutStatus;->Close:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget v3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰哲苏世:F

    .line 30
    .line 31
    cmpg-float v2, v2, v3

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-gez v2, :cond_2

    .line 35
    .line 36
    move v2, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v2, v3

    .line 39
    :goto_0
    iput-boolean v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪哲兰苏:Z

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iput v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰哲苏世:F

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iput v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪苏哲兰:F

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    if-eq v2, v1, :cond_4

    .line 60
    .line 61
    const/4 v4, 0x2

    .line 62
    if-eq v2, v4, :cond_3

    .line 63
    .line 64
    const/4 v4, 0x3

    .line 65
    if-eq v2, v4, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    iget v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰哲苏世:F

    .line 69
    .line 70
    iget v4, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪苏兰哲:F

    .line 71
    .line 72
    sub-float/2addr v2, v4

    .line 73
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    iget v4, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪苏哲兰:F

    .line 78
    .line 79
    iget v5, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪哲苏兰:F

    .line 80
    .line 81
    sub-float/2addr v4, v5

    .line 82
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    cmpl-float v2, v4, v2

    .line 87
    .line 88
    if-lez v2, :cond_6

    .line 89
    .line 90
    return v3

    .line 91
    :cond_4
    const/4 v2, 0x0

    .line 92
    iput v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰哲苏世:F

    .line 93
    .line 94
    iput v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪苏哲兰:F

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    iput v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪苏兰哲:F

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    iput v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪哲苏兰:F

    .line 108
    .line 109
    :cond_6
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-static {p0, v2, v4, v1}, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪世苏兰哲(Landroid/view/ViewGroup;FFI)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iput-boolean v1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪兰苏哲:Z

    .line 122
    .line 123
    invoke-virtual {v0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(Landroid/view/MotionEvent;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰哲世苏:Z

    .line 128
    .line 129
    iget-boolean v1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪哲兰苏:Z

    .line 130
    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    iget-boolean v1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪兰苏哲:Z

    .line 134
    .line 135
    if-nez v1, :cond_7

    .line 136
    .line 137
    return v0

    .line 138
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-static {p0, v0, v1, v3}, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪世苏兰哲(Landroid/view/ViewGroup;FFI)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_8

    .line 151
    .line 152
    iget-boolean p0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰哲世苏:Z

    .line 153
    .line 154
    return p0

    .line 155
    :cond_8
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    return p0

    .line 160
    :cond_9
    :goto_2
    return v1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世哲苏:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 p4, 0x0

    .line 12
    invoke-virtual {p1, p4, p4, p2, p3}, Landroid/view/View;->layout(IIII)V

    .line 13
    .line 14
    .line 15
    iget-boolean p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏哲世:Z

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 20
    .line 21
    sget-object p2, Lcom/lxj/xpopup/enums/PopupPosition;->Left:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 22
    .line 23
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 24
    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    neg-int p1, p1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p3, p1, p4, p4, p2}, Landroid/view/View;->layout(IIII)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iget-object p5, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 51
    .line 52
    .line 53
    move-result p5

    .line 54
    add-int/2addr p5, p2

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p3, p1, p4, p5, p2}, Landroid/view/View;->layout(IIII)V

    .line 60
    .line 61
    .line 62
    :goto_0
    const/4 p1, 0x1

    .line 63
    iput-boolean p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏哲世:Z

    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    iget-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    iget-object p4, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p4}, Landroid/view/View;->getRight()I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    iget-object p0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-virtual {p1, p2, p3, p4, p0}, Landroid/view/View;->layout(IIII)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Z)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    invoke-virtual {p0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(Landroid/view/MotionEvent;)V

    .line 21
    .line 22
    .line 23
    return v0
.end method

.method public setDrawerPosition(Lcom/lxj/xpopup/enums/PopupPosition;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 2
    .line 3
    return-void
.end method

.method public setOnCloseListener(Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    return-void
.end method
