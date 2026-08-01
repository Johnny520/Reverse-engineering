.class public Lcom/lxj/xpopup/widget/PartShadowContainer;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:F

.field public 飘花落叶言子楪哲苏兰世:F


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
    return-void
.end method


# virtual methods
.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x2

    .line 7
    new-array v3, v2, [I

    .line 8
    .line 9
    invoke-virtual {v1, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 10
    .line 11
    .line 12
    new-instance v4, Landroid/graphics/Rect;

    .line 13
    .line 14
    aget v0, v3, v0

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    aget v6, v3, v5

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    add-int/2addr v7, v0

    .line 24
    aget v3, v3, v5

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v1, v3

    .line 31
    invoke-direct {v4, v0, v6, v7, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v0, v1, v4}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(FFLandroid/graphics/Rect;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    if-eq v0, v5, :cond_0

    .line 55
    .line 56
    if-eq v0, v2, :cond_0

    .line 57
    .line 58
    const/4 v1, 0x3

    .line 59
    if-eq v0, v1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget v1, p0, Lcom/lxj/xpopup/widget/PartShadowContainer;->飘花落叶言子楪哲苏兰世:F

    .line 67
    .line 68
    sub-float/2addr v0, v1

    .line 69
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iget v1, p0, Lcom/lxj/xpopup/widget/PartShadowContainer;->飘花落叶言子楪哲兰世苏:F

    .line 74
    .line 75
    sub-float/2addr p1, v1

    .line 76
    float-to-double v0, v0

    .line 77
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 78
    .line 79
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    float-to-double v6, p1

    .line 84
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    add-double/2addr v2, v0

    .line 89
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 101
    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    iput p1, p0, Lcom/lxj/xpopup/widget/PartShadowContainer;->飘花落叶言子楪哲苏兰世:F

    .line 105
    .line 106
    iput p1, p0, Lcom/lxj/xpopup/widget/PartShadowContainer;->飘花落叶言子楪哲兰世苏:F

    .line 107
    .line 108
    return v5

    .line 109
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iput v0, p0, Lcom/lxj/xpopup/widget/PartShadowContainer;->飘花落叶言子楪哲苏兰世:F

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iput p1, p0, Lcom/lxj/xpopup/widget/PartShadowContainer;->飘花落叶言子楪哲兰世苏:F

    .line 120
    .line 121
    :cond_2
    :goto_0
    return v5
.end method

.method public setOnClickOutsideListener(L飘花落叶言楪哲兰子世苏/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    return-void
.end method
