.class public Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final synthetic 飘花落叶言子世楪哲苏兰:I


# instance fields
.field public 飘花落叶言子世楪苏兰哲:Z

.field public 飘花落叶言子世楪苏哲兰:Landroid/view/View$OnTouchListener;

.field public final 飘花落叶言子楪兰世哲苏:Z

.field public 飘花落叶言子楪兰世苏哲:I

.field public 飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;

.field public 飘花落叶言子楪兰哲苏世:I

.field public final 飘花落叶言子楪兰苏世哲:I

.field public 飘花落叶言子楪兰苏哲世:I

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰苏哲世:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    sget-object v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:[I

    .line 11
    .line 12
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 p2, 0x4

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲苏兰世:I

    .line 23
    .line 24
    const/4 p2, 0x3

    .line 25
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲兰世苏:I

    .line 30
    .line 31
    const/4 p2, 0x6

    .line 32
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲兰苏世:I

    .line 37
    .line 38
    const/4 p2, 0x5

    .line 39
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰世苏哲:I

    .line 44
    .line 45
    const/4 p2, 0x2

    .line 46
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iput-boolean p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 51
    .line 52
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰苏世哲:I

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲兰苏世:I

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    :cond_1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲兰苏世:I

    .line 73
    .line 74
    iget p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰世苏哲:I

    .line 75
    .line 76
    if-nez p1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    :cond_2
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰世苏哲:I

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance p2, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;

    .line 95
    .line 96
    invoke-direct {p2, p0, v0}, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 100
    .line 101
    .line 102
    :cond_3
    return-void
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子世楪苏哲兰:Landroid/view/View$OnTouchListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子世楪苏兰哲:Z

    .line 10
    .line 11
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public getDialogXSafetyMode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    return p0
.end method

.method public getOnYChanged()Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰哲苏世:I

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子世楪苏兰哲:Z

    .line 2
    .line 3
    return p0
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰苏哲世:I

    .line 18
    .line 19
    const/4 v3, -0x1

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰苏哲世:I

    .line 25
    .line 26
    :cond_0
    iget-boolean v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲苏兰世:I

    .line 31
    .line 32
    iget v3, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰苏哲世:I

    .line 33
    .line 34
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iput v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲苏兰世:I

    .line 43
    .line 44
    :cond_1
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲兰世苏:I

    .line 45
    .line 46
    if-le p2, v2, :cond_2

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    add-int/2addr p2, v2

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    add-int/2addr p2, v2

    .line 60
    :cond_2
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲苏兰世:I

    .line 61
    .line 62
    if-le p1, v2, :cond_3

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    add-int/2addr p1, v2

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    add-int/2addr p1, v2

    .line 76
    :cond_3
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setMinHeight(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public setMinWidth(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public setNavBarHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子世楪苏哲兰:Landroid/view/View$OnTouchListener;

    .line 2
    .line 3
    return-void
.end method

.method public setTranslationY(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(F)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setY(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setY(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    :cond_0
    return-void
.end method
