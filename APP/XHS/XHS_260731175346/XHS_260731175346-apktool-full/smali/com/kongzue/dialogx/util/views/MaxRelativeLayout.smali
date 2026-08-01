.class public Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:I

.field public ᛷᛴᛷᛱ:Z

.field public ᛷᛵᛵᲈ:I

.field public ᛸᛲᲀᛵ:Landroid/view/View$OnTouchListener;

.field public ᛸᛴᛶᛳ:I

.field public ᛸᛷᲈᲈ:Z

.field public ᲀᲇᛳᲁ:I

.field public ᲇᛴᲇᛵ:I

.field public ᲇᛶᛴᲀ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲀᲇᛳᲁ:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛷᛵᛵᲈ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 12
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲀᲇᛳᲁ:I

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛷᛵᛵᲈ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛸᛲᲀᛵ:Landroid/view/View$OnTouchListener;

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
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛸᛷᲈᲈ:Z

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
    iget p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲇᛶᛴᲀ:I

    .line 2
    .line 3
    return p0
.end method

.method public getOnYChanged()Lxhss/ᛵᛶᲀᛵ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛸᛴᛶᛳ:I

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛸᛷᲈᲈ:Z

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
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲀᲇᛳᲁ:I

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
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲀᲇᛳᲁ:I

    .line 25
    .line 26
    move v2, p1

    .line 27
    :cond_0
    iget-boolean v3, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛷᛴᛷᛱ:Z

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    iget v3, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛷᛵᛵᲈ:I

    .line 32
    .line 33
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iput v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛷᛵᛵᲈ:I

    .line 42
    .line 43
    :cond_1
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛱᛱᛲᲇ:I

    .line 44
    .line 45
    if-le p2, v2, :cond_2

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    add-int/2addr p2, v2

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr p2, v2

    .line 59
    :cond_2
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛷᛵᛵᲈ:I

    .line 60
    .line 61
    if-le p1, v2, :cond_3

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    add-int/2addr p1, v2

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr p1, v2

    .line 75
    :cond_3
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 84
    .line 85
    .line 86
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
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲇᛴᲇᛵ:I

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
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛳᲁᲇᛸ:I

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public setNavBarHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛸᛴᛶᛳ:I

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
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛸᛲᲀᛵ:Landroid/view/View$OnTouchListener;

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

.method public final ᛷᛵᛵᲈ(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    sget-object v0, Lxhss/ᲈᛵᛳ;->ᛱᛱᛲᲇ:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 p2, 0x4

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛷᛵᛵᲈ:I

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛱᛱᛲᲇ:I

    .line 23
    .line 24
    const/4 p2, 0x6

    .line 25
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛳᲁᲇᛸ:I

    .line 30
    .line 31
    const/4 p2, 0x5

    .line 32
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲇᛴᲇᛵ:I

    .line 37
    .line 38
    const/4 p2, 0x2

    .line 39
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iput-boolean p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛷᛴᛷᛱ:Z

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲇᛶᛴᲀ:I

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    .line 57
    .line 58
    :cond_0
    iget p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛳᲁᲇᛸ:I

    .line 59
    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    :cond_1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᛳᲁᲇᛸ:I

    .line 67
    .line 68
    iget p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲇᛴᲇᛵ:I

    .line 69
    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    :cond_2
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->ᲇᛴᲇᛵ:I

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance p1, Lxhss/ᲁᛵᛱᛵ;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 94
    .line 95
    .line 96
    :cond_3
    return-void
.end method
