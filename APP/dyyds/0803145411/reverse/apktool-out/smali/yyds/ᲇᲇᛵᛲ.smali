.class public abstract Lyyds/ᲇᲇᛵᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:I

.field public final ᛱᲈᲁ:Z

.field public ᛲᛲᲈᲈ:I

.field public final ᛲᛳᛶᲁ:Z

.field public ᛲᛴᛳᛲ:Lyyds/ᛱᛱᛴᲁ;

.field public ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

.field public ᛳᲁᲁᲇ:I

.field public ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

.field public ᛶᛷᛲᲁ:Z

.field public ᛷᛲᲈᛱ:Z

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:I

.field public final ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛱᛱ;

.field public ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛸᛷᲈᲇ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lyyds/ᛸᛷᲈᲇ;-><init>(Lyyds/ᲇᲇᛵᛲ;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lyyds/ᛸᛷᲈᲇ;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, v2}, Lyyds/ᛸᛷᲈᲇ;-><init>(Lyyds/ᲇᲇᛵᛲ;I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lyyds/ᛱᛵᛱᛱ;

    .line 17
    .line 18
    invoke-direct {v2, v0}, Lyyds/ᛱᛵᛱᛱ;-><init>(Lyyds/ᛸᛷᲈᲇ;)V

    .line 19
    .line 20
    .line 21
    iput-object v2, p0, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛱᛱ;

    .line 22
    .line 23
    new-instance v0, Lyyds/ᛱᛵᛱᛱ;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lyyds/ᛱᛵᛱᛱ;-><init>(Lyyds/ᛸᛷᲈᲇ;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᲇᲇᲇᛱ:Z

    .line 32
    .line 33
    iput-boolean v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛶᛷᛲᲁ:Z

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᲈᲁ:Z

    .line 37
    .line 38
    iput-boolean v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛳᛶᲁ:Z

    .line 39
    .line 40
    return-void
.end method

.method public static ᛱᛳᛶᛳ(Landroid/view/View;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

    .line 12
    .line 13
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 14
    .line 15
    sub-int/2addr v0, p0

    .line 16
    return v0
.end method

.method public static ᛲᛱᲁᛳ(Landroid/content/Context;Landroid/util/AttributeSet;II)Lyyds/ᲇᲁᲇᛶ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲇᲁᲇᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lyyds/ᛸᛸᲇᛳ;->ᛲᲈᲁ:[I

    .line 7
    .line 8
    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x0

    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    iput p3, v0, Lyyds/ᲇᲁᲇᛶ;->ᛲᲈᲁ:I

    .line 19
    .line 20
    const/16 p3, 0xa

    .line 21
    .line 22
    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, v0, Lyyds/ᲇᲁᲇᛶ;->ᛵᛸᛸᛷ:I

    .line 27
    .line 28
    const/16 p2, 0x9

    .line 29
    .line 30
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iput-boolean p2, v0, Lyyds/ᲇᲁᲇᛶ;->ᲀᛲᛳᲀ:Z

    .line 35
    .line 36
    const/16 p2, 0xb

    .line 37
    .line 38
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput-boolean p1, v0, Lyyds/ᲇᲁᲇᛶ;->ᲇᲈᛵᛷ:Z

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public static ᛲᛳᛴᛸ(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lyyds/ᲇᲁᛲᲀ;

    .line 6
    .line 7
    iget-object v0, v0, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    add-int/2addr p0, v1

    .line 16
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr p0, v0

    .line 19
    return p0
.end method

.method public static ᛲᲀᛵᛷ(III)Z
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lez p2, :cond_0

    .line 11
    .line 12
    if-eq p0, p2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/high16 p2, -0x80000000

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, p2, :cond_4

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    const/high16 p2, 0x40000000    # 2.0f

    .line 23
    .line 24
    if-eq v0, p2, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    if-ne p1, p0, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    return v2

    .line 32
    :cond_4
    if-lt p1, p0, :cond_5

    .line 33
    .line 34
    return v2

    .line 35
    :cond_5
    return v1
.end method

.method public static ᛵᲀᛵᛸ(Landroid/view/View;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

    .line 12
    .line 13
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    sub-int/2addr v0, p0

    .line 16
    return v0
.end method

.method public static ᛵᲀᲈᛴ(ZIIII)I
    .locals 4

    .line 1
    sub-int/2addr p1, p3

    .line 2
    const/4 p3, 0x0

    .line 3
    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, -0x2

    .line 8
    const/4 v1, -0x1

    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    const/high16 v3, 0x40000000    # 2.0f

    .line 12
    .line 13
    if-eqz p0, :cond_2

    .line 14
    .line 15
    if-ltz p4, :cond_0

    .line 16
    .line 17
    :goto_0
    move p2, v3

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    if-ne p4, v1, :cond_1

    .line 20
    .line 21
    if-eq p2, v2, :cond_4

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    if-eq p2, v3, :cond_4

    .line 26
    .line 27
    :cond_1
    move p2, p3

    .line 28
    move p4, p2

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    if-ltz p4, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    if-ne p4, v1, :cond_5

    .line 34
    .line 35
    :cond_4
    move p4, p1

    .line 36
    goto :goto_2

    .line 37
    :cond_5
    if-ne p4, v0, :cond_1

    .line 38
    .line 39
    if-eq p2, v2, :cond_7

    .line 40
    .line 41
    if-ne p2, v3, :cond_6

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_6
    move p4, p1

    .line 45
    move p2, p3

    .line 46
    goto :goto_2

    .line 47
    :cond_7
    :goto_1
    move p4, p1

    .line 48
    move p2, v2

    .line 49
    :goto_2
    invoke-static {p4, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public static ᛶᛷᛲᲁ(III)I
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/high16 v1, 0x40000000    # 2.0f

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :cond_0
    return p0

    .line 22
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public static ᛷᛴᛴᲁ(Landroid/view/View;IIII)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lyyds/ᲇᲁᛲᲀ;

    .line 6
    .line 7
    iget-object v1, v0, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

    .line 8
    .line 9
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 10
    .line 11
    add-int/2addr p1, v2

    .line 12
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 13
    .line 14
    add-int/2addr p1, v2

    .line 15
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    add-int/2addr p2, v2

    .line 18
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 19
    .line 20
    add-int/2addr p2, v2

    .line 21
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 22
    .line 23
    sub-int/2addr p3, v2

    .line 24
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 25
    .line 26
    sub-int/2addr p3, v2

    .line 27
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 28
    .line 29
    sub-int/2addr p4, v1

    .line 30
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 31
    .line 32
    sub-int/2addr p4, v0

    .line 33
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static ᛷᛸᲇᛶ(Landroid/view/View;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

    .line 12
    .line 13
    iget p0, p0, Landroid/graphics/Rect;->right:I

    .line 14
    .line 15
    add-int/2addr v0, p0

    .line 16
    return v0
.end method

.method public static ᲈᛷᲈᛶ(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲇᲁᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 8
    .line 9
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static ᲈᲀᛲᲀ(Landroid/view/View;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

    .line 12
    .line 13
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 14
    .line 15
    add-int/2addr v0, p0

    .line 16
    return v0
.end method


# virtual methods
.method public abstract ᛱᛳᲇ(Lyyds/ᲈᛳᲇᛲ;)I
.end method

.method public abstract ᛱᛵᛳᛳ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
.end method

.method public final ᛱᛵᲈᛸ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->requestLayout()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public ᛱᛸᲁᲇ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 0

    .line 1
    iget-object p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p1, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 19
    .line 20
    invoke-virtual {p0}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public ᛱᲀᲈᛲ()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract ᛱᲈᲁ(IILyyds/ᲈᛳᲇᛲ;Lyyds/ᲁᲇᛷᛳ;)V
.end method

.method public abstract ᛲᛱᛵᛱ()Z
.end method

.method public abstract ᛲᛲᲈᲈ(Lyyds/ᲈᛳᲇᛲ;)I
.end method

.method public ᛲᛳᛵᛱ(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛲᛳᛶᲁ(ILyyds/ᲁᲇᛷᛳ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract ᛲᛴᛳᛲ()Z
.end method

.method public ᛲᛶᛱᲈ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
    .locals 0

    .line 1
    iget-object p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p1, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 19
    .line 20
    invoke-virtual {p0}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public ᛲᲀᛲᛲ(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 6
    .line 7
    invoke-virtual {v0}, Lyyds/ᲈᲇᲀᛲ;->ᛷᛲᲈᛱ()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lyyds/ᲈᲇᲀᛲ;->ᛷᲈᲈᲁ(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public ᛳᛴᲇᛶ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p3}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    move v0, p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, p2

    .line 15
    :goto_0
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {p3}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    :cond_1
    move v2, p2

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v1, 0x1

    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-static/range {v0 .. v5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object p1, p4, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final ᛳᛵᛶᲀ(Lyyds/ᛵᲇᛲᛱ;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 5
    .line 6
    iput-object p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 10
    .line 11
    iput p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iput-object p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 15
    .line 16
    iget-object v0, p1, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 17
    .line 18
    iput-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 31
    .line 32
    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    .line 33
    .line 34
    iput p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛷᛵᲇᲀ:I

    .line 35
    .line 36
    iput p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛲᲈᲈ:I

    .line 37
    .line 38
    return-void
.end method

.method public abstract ᛳᛷᛶᛲ(Landroid/view/View;ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)Landroid/view/View;
.end method

.method public ᛳᛸᛴᛶ(Landroid/view/ViewGroup$LayoutParams;)Lyyds/ᲇᲁᛲᲀ;
    .locals 0

    .line 1
    instance-of p0, p1, Lyyds/ᲇᲁᛲᲀ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lyyds/ᲇᲁᛲᲀ;

    .line 6
    .line 7
    check-cast p1, Lyyds/ᲇᲁᛲᲀ;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lyyds/ᲇᲁᛲᲀ;-><init>(Lyyds/ᲇᲁᛲᲀ;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    new-instance p0, Lyyds/ᲇᲁᛲᲀ;

    .line 18
    .line 19
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lyyds/ᲇᲁᛲᲀ;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    new-instance p0, Lyyds/ᲇᲁᛲᲀ;

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lyyds/ᲇᲁᛲᲀ;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public abstract ᛳᲁᲁᲇ(Lyyds/ᲈᛳᲇᛲ;)I
.end method

.method public ᛴᛵᛷᛳ(ILandroid/os/Bundle;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 4
    .line 5
    iget v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 6
    .line 7
    iget v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iget-object v3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 27
    .line 28
    invoke-virtual {v3, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    :cond_0
    const/16 v2, 0x2000

    .line 43
    .line 44
    const/16 v3, 0x1000

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    const/4 v5, 0x0

    .line 48
    if-eq p1, v3, :cond_4

    .line 49
    .line 50
    if-eq p1, v2, :cond_1

    .line 51
    .line 52
    move v0, v5

    .line 53
    move v1, v0

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    iget-object v6, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 56
    .line 57
    const/4 v7, -0x1

    .line 58
    invoke-virtual {v6, v7}, Landroid/view/View;->canScrollVertically(I)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    sub-int/2addr v0, v6

    .line 69
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    sub-int/2addr v0, v6

    .line 74
    neg-int v0, v0

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    move v0, v5

    .line 77
    :goto_0
    iget-object v6, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 78
    .line 79
    invoke-virtual {v6, v7}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    sub-int/2addr v1, v6

    .line 90
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    sub-int/2addr v1, v6

    .line 95
    neg-int v1, v1

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move v1, v5

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    iget-object v6, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 100
    .line 101
    invoke-virtual {v6, v4}, Landroid/view/View;->canScrollVertically(I)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_5

    .line 106
    .line 107
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    sub-int/2addr v0, v6

    .line 112
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    sub-int/2addr v0, v6

    .line 117
    goto :goto_1

    .line 118
    :cond_5
    move v0, v5

    .line 119
    :goto_1
    iget-object v6, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 120
    .line 121
    invoke-virtual {v6, v4}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-eqz v6, :cond_3

    .line 126
    .line 127
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    sub-int/2addr v1, v6

    .line 132
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    sub-int/2addr v1, v6

    .line 137
    :goto_2
    if-nez v0, :cond_6

    .line 138
    .line 139
    if-nez v1, :cond_6

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    const/4 v6, 0x0

    .line 143
    const/high16 v7, 0x3f800000    # 1.0f

    .line 144
    .line 145
    if-eqz p2, :cond_8

    .line 146
    .line 147
    const-string v8, "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT"

    .line 148
    .line 149
    invoke-virtual {p2, v8, v7}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    cmpg-float v8, p2, v6

    .line 154
    .line 155
    if-gez v8, :cond_9

    .line 156
    .line 157
    sget-boolean p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 158
    .line 159
    if-nez p0, :cond_7

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    new-instance p1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v0, "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value ("

    .line 167
    .line 168
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p2, ")"

    .line 175
    .line 176
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p0

    .line 187
    :cond_8
    move p2, v7

    .line 188
    :cond_9
    const/high16 v8, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 189
    .line 190
    invoke-static {p2, v8}, Ljava/lang/Float;->compare(FF)I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    if-nez v8, :cond_d

    .line 195
    .line 196
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 197
    .line 198
    iget-object p2, p0, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 199
    .line 200
    if-nez p2, :cond_a

    .line 201
    .line 202
    :goto_3
    return v5

    .line 203
    :cond_a
    if-eq p1, v3, :cond_c

    .line 204
    .line 205
    if-eq p1, v2, :cond_b

    .line 206
    .line 207
    return v4

    .line 208
    :cond_b
    invoke-virtual {p0, v5}, Lyyds/ᛵᲇᛲᛱ;->ᛵᛲᛶᲁ(I)V

    .line 209
    .line 210
    .line 211
    return v4

    .line 212
    :cond_c
    invoke-virtual {p2}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    sub-int/2addr p1, v4

    .line 217
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛲᛱ;->ᛵᛲᛶᲁ(I)V

    .line 218
    .line 219
    .line 220
    return v4

    .line 221
    :cond_d
    invoke-static {v7, p2}, Ljava/lang/Float;->compare(FF)I

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eqz p1, :cond_e

    .line 226
    .line 227
    invoke-static {v6, p2}, Ljava/lang/Float;->compare(FF)I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_e

    .line 232
    .line 233
    int-to-float p1, v1

    .line 234
    mul-float/2addr p1, p2

    .line 235
    float-to-int v1, p1

    .line 236
    int-to-float p1, v0

    .line 237
    mul-float/2addr p1, p2

    .line 238
    float-to-int v0, p1

    .line 239
    :cond_e
    move v7, v0

    .line 240
    move v6, v1

    .line 241
    iget-object v5, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 242
    .line 243
    const/high16 v9, -0x80000000

    .line 244
    .line 245
    const/4 v10, 0x1

    .line 246
    const/4 v8, 0x0

    .line 247
    invoke-virtual/range {v5 .. v10}, Lyyds/ᛵᲇᛲᛱ;->ᛴᛵᛷᛳ(IILandroid/view/animation/PathInterpolator;IZ)V

    .line 248
    .line 249
    .line 250
    return v4
.end method

.method public ᛴᛸᛴᛸ(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 46
    .line 47
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_1
    return-void
.end method

.method public ᛴᛸᲁᛵ(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛵᛲᛵᲁ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛵᛲᛶᲁ(Lyyds/ᲈᲈᲁᛱ;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lyyds/ᛱᛸᛳᛵ;->ᲇᛱᛲ()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛵᲁᲈ(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public abstract ᛵᛵᛷᲀ(I)V
.end method

.method public abstract ᛵᛶᛲᲀ()Lyyds/ᲇᲁᛲᲀ;
.end method

.method public final ᛵᛸᛵᛶ(Lyyds/ᲈᲈᲁᛱ;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v1, v0, -0x1

    .line 8
    .line 9
    :goto_0
    iget-object v2, p1, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-ltz v1, :cond_3

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lyyds/ᛱᛸᛳᛵ;

    .line 18
    .line 19
    iget-object v2, v2, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 20
    .line 21
    invoke-static {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Lyyds/ᛱᛸᛳᛵ;->ᲇᛱᛲ()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v4, 0x0

    .line 33
    invoke-virtual {v3, v4}, Lyyds/ᛱᛸᛳᛵ;->ᛳᲁᲁᲇ(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    iget-object v5, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 43
    .line 44
    invoke-virtual {v5, v2, v4}, Lyyds/ᛵᲇᛲᛱ;->removeDetachedView(Landroid/view/View;Z)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v5, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 48
    .line 49
    iget-object v5, v5, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ:Lyyds/ᲇᛲᲇᲇ;

    .line 50
    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    invoke-virtual {v5, v3}, Lyyds/ᲇᛲᲇᲇ;->ᲇᲈᛵᛷ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    const/4 v5, 0x1

    .line 57
    invoke-virtual {v3, v5}, Lyyds/ᛱᛸᛳᛵ;->ᛳᲁᲁᲇ(Z)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const/4 v3, 0x0

    .line 65
    iput-object v3, v2, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 66
    .line 67
    iput-boolean v4, v2, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ:Z

    .line 68
    .line 69
    iget v3, v2, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 70
    .line 71
    and-int/lit8 v3, v3, -0x21

    .line 72
    .line 73
    iput v3, v2, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Lyyds/ᲈᲈᲁᛱ;->ᛲᛳᛶᲁ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 82
    .line 83
    .line 84
    iget-object p1, p1, Lyyds/ᲈᲈᲁᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 85
    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-lez v0, :cond_5

    .line 92
    .line 93
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 96
    .line 97
    .line 98
    :cond_5
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Landroid/view/View;IZ)V
    .locals 8

    .line 1
    invoke-static {p1}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez p3, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 16
    .line 17
    iget-object p3, p3, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Lyyds/ᛱᛵᛱᛱ;->ᛲᛱᲁᛳ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    iget-object p3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 24
    .line 25
    iget-object p3, p3, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 26
    .line 27
    iget-object p3, p3, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p3, Lyyds/ᛴᲈᛲᛷ;

    .line 30
    .line 31
    invoke-virtual {p3, v0}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lyyds/ᲁᛵᛳᛱ;

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    invoke-static {}, Lyyds/ᲁᛵᛳᛱ;->ᛲᲈᲁ()Lyyds/ᲁᛵᛳᛱ;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p3, v0, v2}, Lyyds/ᛴᲈᛲᛷ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_2
    iget p3, v2, Lyyds/ᲁᛵᛳᛱ;->ᛲᲈᲁ:I

    .line 47
    .line 48
    or-int/2addr p3, v1

    .line 49
    iput p3, v2, Lyyds/ᲁᛵᛳᛱ;->ᛲᲈᲁ:I

    .line 50
    .line 51
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    check-cast p3, Lyyds/ᲇᲁᛲᲀ;

    .line 56
    .line 57
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const-string v3, "RecyclerView"

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-nez v2, :cond_d

    .line 65
    .line 66
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object v5, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 79
    .line 80
    iget-object v6, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 81
    .line 82
    const/4 v7, -0x1

    .line 83
    if-ne v2, v5, :cond_b

    .line 84
    .line 85
    iget-object v2, v6, Lyyds/ᲈᲇᲀᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Lyyds/ᛷᲁᛷᛵ;

    .line 88
    .line 89
    iget-object v5, v6, Lyyds/ᲈᲇᲀᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v5, Lyyds/ᲇᛱᛳᛵ;

    .line 92
    .line 93
    iget-object v5, v5, Lyyds/ᲇᛱᛳᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 94
    .line 95
    invoke-virtual {v5, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-ne v5, v7, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    invoke-virtual {v2, v5}, Lyyds/ᛷᲁᛷᛵ;->ᲇᲈᛵᛷ(I)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_5

    .line 107
    .line 108
    :goto_2
    move v5, v7

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    invoke-virtual {v2, v5}, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ(I)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    sub-int/2addr v5, v2

    .line 115
    :goto_3
    if-ne p2, v7, :cond_6

    .line 116
    .line 117
    iget-object p2, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 118
    .line 119
    invoke-virtual {p2}, Lyyds/ᲈᲇᲀᛲ;->ᛷᛲᲈᛱ()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    :cond_6
    if-eq v5, v7, :cond_a

    .line 124
    .line 125
    if-eq v5, p2, :cond_f

    .line 126
    .line 127
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 128
    .line 129
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᲇᛱᛲ:Lyyds/ᲇᲇᛵᛲ;

    .line 130
    .line 131
    invoke-virtual {p0, v5}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_9

    .line 136
    .line 137
    invoke-virtual {p0, v5}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    iget-object v2, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 141
    .line 142
    invoke-virtual {v2, v5}, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Lyyds/ᲇᲁᛲᲀ;

    .line 150
    .line 151
    invoke-static {p1}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v5}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    iget-object v7, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 160
    .line 161
    if-eqz v6, :cond_8

    .line 162
    .line 163
    iget-object v6, v7, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 164
    .line 165
    iget-object v6, v6, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v6, Lyyds/ᛴᲈᛲᛷ;

    .line 168
    .line 169
    invoke-virtual {v6, v5}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    check-cast v7, Lyyds/ᲁᛵᛳᛱ;

    .line 174
    .line 175
    if-nez v7, :cond_7

    .line 176
    .line 177
    invoke-static {}, Lyyds/ᲁᛵᛳᛱ;->ᛲᲈᲁ()Lyyds/ᲁᛵᛳᛱ;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v6, v5, v7}, Lyyds/ᛴᲈᛲᛷ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    :cond_7
    iget v6, v7, Lyyds/ᲁᛵᛳᛱ;->ᛲᲈᲁ:I

    .line 185
    .line 186
    or-int/2addr v1, v6

    .line 187
    iput v1, v7, Lyyds/ᲁᛵᛳᛱ;->ᛲᲈᲁ:I

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    iget-object v1, v7, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 191
    .line 192
    invoke-virtual {v1, v5}, Lyyds/ᛱᛵᛱᛱ;->ᛲᛱᲁᛳ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 193
    .line 194
    .line 195
    :goto_4
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 196
    .line 197
    invoke-virtual {v5}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {p0, p1, p2, v2, v1}, Lyyds/ᲈᲇᲀᛲ;->ᛵᛸᛸᛷ(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_7

    .line 205
    .line 206
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 207
    .line 208
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 209
    .line 210
    new-instance p2, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string p3, "Cannot move a child from non-existing index:"

    .line 213
    .line 214
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw p1

    .line 235
    :cond_a
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 236
    .line 237
    iget-object p3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 238
    .line 239
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 244
    .line 245
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛸᲇᛶ()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    new-instance p3, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v0, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    .line 252
    .line 253
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    invoke-direct {p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p2

    .line 270
    :cond_b
    invoke-virtual {v6, p1, p2, v4}, Lyyds/ᲈᲇᲀᛲ;->ᛲᲈᲁ(Landroid/view/View;IZ)V

    .line 271
    .line 272
    .line 273
    iput-boolean v1, p3, Lyyds/ᲇᲁᛲᲀ;->ᲀᛲᛳᲀ:Z

    .line 274
    .line 275
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛱᛴᲁ;

    .line 276
    .line 277
    if-eqz p0, :cond_f

    .line 278
    .line 279
    iget-boolean p2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 280
    .line 281
    if-eqz p2, :cond_f

    .line 282
    .line 283
    iget-object p2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 284
    .line 285
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-static {p1}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    if-eqz p2, :cond_c

    .line 293
    .line 294
    invoke-virtual {p2}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    :cond_c
    iget p2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 299
    .line 300
    if-ne v7, p2, :cond_f

    .line 301
    .line 302
    iput-object p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 303
    .line 304
    sget-boolean p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 305
    .line 306
    if-eqz p0, :cond_f

    .line 307
    .line 308
    const-string p0, "smooth scroll target view has been attached"

    .line 309
    .line 310
    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 311
    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_d
    :goto_5
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ()Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-eqz v1, :cond_e

    .line 319
    .line 320
    iget-object v1, v0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 321
    .line 322
    invoke-virtual {v1, v0}, Lyyds/ᲈᲈᲁᛱ;->ᛷᛵᲇᲀ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_e
    iget v1, v0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 327
    .line 328
    and-int/lit8 v1, v1, -0x21

    .line 329
    .line 330
    iput v1, v0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 331
    .line 332
    :goto_6
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 333
    .line 334
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-virtual {p0, p1, p2, v1, v4}, Lyyds/ᲈᲇᲀᛲ;->ᛵᛸᛸᛷ(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 339
    .line 340
    .line 341
    :cond_f
    :goto_7
    iget-boolean p0, p3, Lyyds/ᲇᲁᛲᲀ;->ᲇᲈᛵᛷ:Z

    .line 342
    .line 343
    if-eqz p0, :cond_11

    .line 344
    .line 345
    sget-boolean p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 346
    .line 347
    if-eqz p0, :cond_10

    .line 348
    .line 349
    new-instance p0, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    const-string p1, "consuming pending invalidate on child "

    .line 352
    .line 353
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    iget-object p1, p3, Lyyds/ᲇᲁᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 357
    .line 358
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 366
    .line 367
    .line 368
    :cond_10
    iget-object p0, v0, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 369
    .line 370
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 371
    .line 372
    .line 373
    iput-boolean v4, p3, Lyyds/ᲇᲁᛲᲀ;->ᲇᲈᛵᛷ:Z

    .line 374
    .line 375
    :cond_11
    return-void
.end method

.method public ᛵᲈᲇᛵ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Lyyds/ᛱᛵᲈᛸ;)V
    .locals 4

    .line 1
    iget-object v0, p3, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-virtual {v1, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :cond_0
    const/16 v1, 0x2000

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Lyyds/ᛱᛵᲈᛸ;->ᛲᛴᛳᛲ()V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Landroid/view/View;->canScrollVertically(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    :cond_2
    const/16 v1, 0x1000

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3}, Lyyds/ᛱᛵᲈᛸ;->ᛲᛴᛳᛲ()V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p0, p1, p2}, Lyyds/ᲇᲇᛵᛲ;->ᛱᛸᲁᲇ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    invoke-virtual {p0, p1, p2}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛶᛱᲈ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    const/4 p1, 0x0

    .line 68
    invoke-static {p3, p0, p1, p1}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public ᛶᛳᛶᛵ(I)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v3}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ne v4, p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v3}, Lyyds/ᛱᛸᛳᛵ;->ᲇᛱᛲ()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_2

    .line 30
    .line 31
    iget-object v4, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 32
    .line 33
    iget-object v4, v4, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 34
    .line 35
    iget-boolean v4, v4, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 36
    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v3}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    :cond_1
    return-object v2

    .line 46
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public ᛶᛴᛱᛲ(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 6
    .line 7
    invoke-virtual {v0}, Lyyds/ᲈᲇᲀᛲ;->ᛷᛲᲈᛱ()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lyyds/ᲈᲇᲀᛲ;->ᛷᲈᲈᲁ(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final ᛶᛵᛸᛲ(Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 14
    .line 15
    iget-object v0, v0, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 16
    .line 17
    iget-object v1, v1, Lyyds/ᲈᲇᲀᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 28
    .line 29
    iget-object v1, v0, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 30
    .line 31
    iget-object v0, v0, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 32
    .line 33
    invoke-virtual {p0, v1, v0, p1, p2}, Lyyds/ᲇᲇᛵᛲ;->ᛳᛴᲇᛶ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public abstract ᛶᛵᛸᛳ(Lyyds/ᛵᲇᛲᛱ;I)V
.end method

.method public final ᛶᛵᲁᲈ(I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lyyds/ᲇᛱᛳᛵ;

    .line 12
    .line 13
    iget v1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq v1, v2, :cond_3

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-eq v1, v3, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    :try_start_0
    invoke-virtual {p0, p1}, Lyyds/ᲈᲇᲀᛲ;->ᛷᛵᲇᲀ(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v4, v0, Lyyds/ᲇᛱᛳᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 28
    .line 29
    invoke-virtual {v4, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    iput v3, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    iput-object v1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    :try_start_1
    iput v2, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 41
    .line 42
    iput-object v4, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v2, p0, Lyyds/ᲈᲇᲀᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lyyds/ᛷᲁᛷᛵ;

    .line 47
    .line 48
    invoke-virtual {v2, p1}, Lyyds/ᛷᲁᛷᛵ;->ᛶᛷᛲᲁ(I)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0, v4}, Lyyds/ᲈᲇᲀᛲ;->ᛵᛶᛲᲀ(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, Lyyds/ᲇᛱᛳᛵ;->ᛲᛳᛶᲁ(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    iput v3, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 64
    .line 65
    iput-object v1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 66
    .line 67
    return-void

    .line 68
    :goto_1
    iput v3, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 69
    .line 70
    iput-object v1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 71
    .line 72
    throw p1

    .line 73
    :cond_2
    const-string p0, "Cannot call removeView(At) within removeViewIfHidden"

    .line 74
    .line 75
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    const-string p0, "Cannot call removeView(At) within removeView(At)"

    .line 80
    .line 81
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public final ᛶᛷᛶᛲ(Lyyds/ᛱᛱᛴᲁ;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛱᛴᲁ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    iget-boolean v1, v0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lyyds/ᛱᛱᛴᲁ;->ᛶᛷᛲᲁ()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-object p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛱᛴᲁ;

    .line 15
    .line 16
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 17
    .line 18
    iget-object v1, v0, Lyyds/ᛵᲇᛲᛱ;->ᛴᛸᲁᛵ:Lyyds/ᛵᲀᛲᛲ;

    .line 19
    .line 20
    iget-object v2, v1, Lyyds/ᛵᲀᛲᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Lyyds/ᛵᲀᛲᛲ;->ᛲᛴᛳᛲ:Landroid/widget/OverScroller;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 28
    .line 29
    .line 30
    iget-boolean v1, p1, Lyyds/ᛱᛱᛴᲁ;->ᛱᲈᲁ:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "An instance of "

    .line 37
    .line 38
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v2, " was started more than once. Each instance of"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v2, " is intended to only be used once. You should create a new instance for each use."

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "RecyclerView"

    .line 78
    .line 79
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :cond_1
    iput-object v0, p1, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 83
    .line 84
    iput-object p0, p1, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲇᛵᛲ;

    .line 85
    .line 86
    iget p0, p1, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 87
    .line 88
    const/4 v1, -0x1

    .line 89
    if-eq p0, v1, :cond_2

    .line 90
    .line 91
    iget-object v1, v0, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 92
    .line 93
    iput p0, v1, Lyyds/ᲈᛳᲇᛲ;->ᛲᲈᲁ:I

    .line 94
    .line 95
    const/4 v1, 0x1

    .line 96
    iput-boolean v1, p1, Lyyds/ᛱᛱᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 97
    .line 98
    iput-boolean v1, p1, Lyyds/ᛱᛱᛴᲁ;->ᲇᲈᛵᛷ:Z

    .line 99
    .line 100
    iget-object v0, v0, Lyyds/ᛵᲇᛲᛱ;->ᲇᛱᛲ:Lyyds/ᲇᲇᛵᛲ;

    .line 101
    .line 102
    invoke-virtual {v0, p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛳᛶᛵ(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iput-object p0, p1, Lyyds/ᛱᛱᛴᲁ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 107
    .line 108
    iget-object p0, p1, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 109
    .line 110
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛴᛸᲁᛵ:Lyyds/ᛵᲀᛲᛲ;

    .line 111
    .line 112
    invoke-virtual {p0}, Lyyds/ᛵᲀᛲᛲ;->ᛵᛸᛸᛷ()V

    .line 113
    .line 114
    .line 115
    iput-boolean v1, p1, Lyyds/ᛱᛱᛴᲁ;->ᛱᲈᲁ:Z

    .line 116
    .line 117
    return-void

    .line 118
    :cond_2
    const-string p0, "Invalid target position"

    .line 119
    .line 120
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public ᛶᛸᛱᲁ(Landroid/graphics/Rect;II)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, p1

    .line 24
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/2addr p1, v1

    .line 29
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 30
    .line 31
    sget-object v2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getMinimumWidth()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {p2, v0, v1}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛷᛲᲁ(III)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p3, p1, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛷᛲᲁ(III)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 52
    .line 53
    invoke-static {p0, p2, p1}, Lyyds/ᛵᲇᛲᛱ;->ᲇᲇᲇᛱ(Lyyds/ᛵᲇᛲᛱ;II)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final ᛶᛸᲀᲁ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᲈᲇᲀᛲ;->ᛷᛲᲈᛱ()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public abstract ᛶᲀᲈᲇ()Z
.end method

.method public final ᛶᲈᛴᲈ(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᲈᲇᲀᛲ;->ᛷᲈᲈᲁ(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public abstract ᛷᛲᲈᛱ(Lyyds/ᲈᛳᲇᛲ;)I
.end method

.method public abstract ᛷᛵᲇᲀ(Lyyds/ᲈᛳᲇᛲ;)I
.end method

.method public final ᛷᛶᛷᲀ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final ᛷᲇᛲᛱ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public abstract ᛷᲈᛳᛲ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)V
.end method

.method public abstract ᛷᲈᲈᲁ(Lyyds/ᲈᛳᲇᛲ;)I
.end method

.method public final ᛸᛴᛵᛶ(Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lyyds/ᲇᲁᛲᲀ;

    .line 6
    .line 7
    iget-object v0, v0, Lyyds/ᲇᲁᛲᲀ;->ᛵᛸᛸᛷ:Landroid/graphics/Rect;

    .line 8
    .line 9
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 10
    .line 11
    neg-int v1, v1

    .line 12
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 13
    .line 14
    neg-int v2, v2

    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget v4, v0, Landroid/graphics/Rect;->right:I

    .line 20
    .line 21
    add-int/2addr v3, v4

    .line 22
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 27
    .line 28
    add-int/2addr v4, v0

    .line 29
    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p2}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 49
    .line 50
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛱᛳᲇ:Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 56
    .line 57
    .line 58
    iget v0, p0, Landroid/graphics/RectF;->left:F

    .line 59
    .line 60
    float-to-double v0, v0

    .line 61
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    double-to-int v0, v0

    .line 66
    iget v1, p0, Landroid/graphics/RectF;->top:F

    .line 67
    .line 68
    float-to-double v1, v1

    .line 69
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    double-to-int v1, v1

    .line 74
    iget v2, p0, Landroid/graphics/RectF;->right:F

    .line 75
    .line 76
    float-to-double v2, v2

    .line 77
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    double-to-int v2, v2

    .line 82
    iget p0, p0, Landroid/graphics/RectF;->bottom:F

    .line 83
    .line 84
    float-to-double v3, p0

    .line 85
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    double-to-int p0, v3

    .line 90
    invoke-virtual {p1, v0, v1, v2, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 91
    .line 92
    .line 93
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-virtual {p1, p0, p2}, Landroid/graphics/Rect;->offset(II)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final ᛸᛸᛷᛱ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->getAdapter()Lyyds/ᛲᛵᲇᛳ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public abstract ᛸᲀᛷᛲ(Landroid/os/Parcelable;)V
.end method

.method public abstract ᛸᲇᛱᲇ(ILyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;)I
.end method

.method public final ᛸᲇᛴᲀ(II)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛷᛵᲇᲀ:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    sget-boolean p1, Lyyds/ᛵᲇᛲᛱ;->ᲇᛳᛱ:Z

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    iput v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 21
    .line 22
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 27
    .line 28
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛲᲈᲈ:I

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    sget-boolean p1, Lyyds/ᛵᲇᛲᛱ;->ᲇᛳᛱ:Z

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    iput v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final ᲀᛲᛱᛱ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public ᲀᛲᛲᲇ(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲇᲁᛲᲀ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᲇᲁᛲᲀ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᲇᲁᛲᲀ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public abstract ᲀᛲᛳᲀ(Ljava/lang/String;)V
.end method

.method public ᲀᛳᛷᛷ(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲀᛴᲁᲈ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public abstract ᲀᛸᲈᲁ()Landroid/os/Parcelable;
.end method

.method public final ᲀᲇᛱᛲ(Landroid/view/View;IILyyds/ᲇᲁᛲᲀ;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᲈᲁ:Z

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 16
    .line 17
    invoke-static {p0, p2, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛲᲀᛵᛷ(III)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iget p1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 28
    .line 29
    invoke-static {p0, p3, p1}, Lyyds/ᲇᲇᛵᛲ;->ᛲᲀᛵᛷ(III)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0
.end method

.method public final ᲀᲇᛶᲈ(Landroid/view/View;IILyyds/ᲇᲁᛲᲀ;)Z
    .locals 1

    .line 1
    iget-boolean p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᲈᲁ:Z

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 10
    .line 11
    invoke-static {p0, p2, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛲᲀᛵᛷ(III)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    iget p1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 22
    .line 23
    invoke-static {p0, p3, p1}, Lyyds/ᲇᲇᛵᛲ;->ᛲᲀᛵᛷ(III)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public abstract ᲁᛵᲁᲁ(Lyyds/ᛵᲇᛲᛱ;)V
.end method

.method public abstract ᲁᛶᛴᛸ()Z
.end method

.method public final ᲁᲀᛱᛴ(Lyyds/ᛵᲇᛲᛱ;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0, v0, p1}, Lyyds/ᲇᲇᛵᛲ;->ᛸᲇᛴᲀ(II)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final ᲁᲁᛵ(II)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᲇᛲᛱ;->ᲇᛱᛲ(II)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/high16 v1, -0x80000000

    .line 14
    .line 15
    const v2, 0x7fffffff

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v2

    .line 20
    move v5, v3

    .line 21
    move v2, v1

    .line 22
    move v3, v4

    .line 23
    :goto_0
    if-ge v5, v0, :cond_5

    .line 24
    .line 25
    invoke-virtual {p0, v5}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    iget-object v7, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 30
    .line 31
    iget-object v7, v7, Lyyds/ᛵᲇᛲᛱ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-static {v7, v6}, Lyyds/ᛵᲇᛲᛱ;->ᲁᛶᛴᛸ(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    iget v6, v7, Landroid/graphics/Rect;->left:I

    .line 37
    .line 38
    if-ge v6, v3, :cond_1

    .line 39
    .line 40
    move v3, v6

    .line 41
    :cond_1
    iget v6, v7, Landroid/graphics/Rect;->right:I

    .line 42
    .line 43
    if-le v6, v1, :cond_2

    .line 44
    .line 45
    move v1, v6

    .line 46
    :cond_2
    iget v6, v7, Landroid/graphics/Rect;->top:I

    .line 47
    .line 48
    if-ge v6, v4, :cond_3

    .line 49
    .line 50
    move v4, v6

    .line 51
    :cond_3
    iget v6, v7, Landroid/graphics/Rect;->bottom:I

    .line 52
    .line 53
    if-le v6, v2, :cond_4

    .line 54
    .line 55
    move v2, v6

    .line 56
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 60
    .line 61
    iget-object v0, v0, Lyyds/ᛵᲇᛲᛱ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 67
    .line 68
    iget-object v0, v0, Lyyds/ᛵᲇᛲᛱ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 69
    .line 70
    invoke-virtual {p0, v0, p1, p2}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᛱᲁ(Landroid/graphics/Rect;II)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final ᲇᛱᛲ(Lyyds/ᲈᲈᲁᛱ;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lyyds/ᛱᛸᛳᛵ;->ᲇᛱᛲ()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    sget-boolean v1, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v3, "ignoring view "

    .line 30
    .line 31
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "RecyclerView"

    .line 42
    .line 43
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v2}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v2}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 60
    .line 61
    iget-object v1, v1, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛵᲁᲈ(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2}, Lyyds/ᲈᲈᲁᛱ;->ᛲᛳᛶᲁ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p0, v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    iget-object v3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 77
    .line 78
    invoke-virtual {v3, v0}, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v1}, Lyyds/ᲈᲈᲁᛱ;->ᛷᲈᲈᲁ(Landroid/view/View;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 85
    .line 86
    iget-object v1, v1, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Lyyds/ᛱᛵᛱᛱ;->ᛲᛱᲁᛳ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    return-void
.end method

.method public final ᲇᛶᲀᲇ(Landroid/view/View;Lyyds/ᲈᲈᲁᛱ;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lyyds/ᲇᛱᛳᛵ;

    .line 6
    .line 7
    iget v1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v1, v2, :cond_3

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    if-eq v1, v3, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    :try_start_0
    iput v2, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v2, v0, Lyyds/ᲇᛱᛳᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-gez v2, :cond_0

    .line 28
    .line 29
    :goto_0
    iput v3, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    iput-object v1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    :try_start_1
    iget-object v4, p0, Lyyds/ᲈᲇᲀᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Lyyds/ᛷᲁᛷᛵ;

    .line 37
    .line 38
    invoke-virtual {v4, v2}, Lyyds/ᛷᲁᛷᛵ;->ᛶᛷᛲᲁ(I)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lyyds/ᲈᲇᲀᛲ;->ᛵᛶᛲᲀ(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :cond_1
    :goto_1
    invoke-virtual {v0, v2}, Lyyds/ᲇᛱᛳᛵ;->ᛲᛳᛶᲁ(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_2
    invoke-virtual {p2, p1}, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :goto_3
    iput v3, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 59
    .line 60
    iput-object v1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    const-string p0, "Cannot call removeView(At) within removeViewIfHidden"

    .line 64
    .line 65
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    const-string p0, "Cannot call removeView(At) within removeView(At)"

    .line 70
    .line 71
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public ᲇᲇᲇᛱ(Lyyds/ᲇᲁᛲᲀ;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public ᲇᲇᲈᲀ(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract ᲇᲈᛵᛷ()Z
.end method

.method public final ᲈᛲᛳᛶ(Lyyds/ᛵᲇᛲᛱ;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    sub-int/2addr v2, v3

    .line 16
    iget v3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    sub-int/2addr v3, v4

    .line 23
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget v5, p3, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    add-int/2addr v4, v5

    .line 30
    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    sub-int/2addr v4, v5

    .line 35
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget v6, p3, Landroid/graphics/Rect;->top:I

    .line 40
    .line 41
    add-int/2addr v5, v6

    .line 42
    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    sub-int/2addr v5, p2

    .line 47
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    add-int/2addr p2, v4

    .line 52
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    add-int/2addr p3, v5

    .line 57
    sub-int/2addr v4, v0

    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    sub-int/2addr v5, v1

    .line 64
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    sub-int/2addr p2, v2

    .line 69
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    sub-int/2addr p3, v3

    .line 74
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    iget-object v3, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    const/4 v7, 0x1

    .line 85
    if-ne v3, v7, :cond_1

    .line 86
    .line 87
    if-eqz v2, :cond_0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_0
    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    if-eqz v6, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    :goto_0
    move v2, v6

    .line 103
    :goto_1
    if-eqz v1, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    invoke-static {v5, p3}, Ljava/lang/Math;->min(II)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    :goto_2
    filled-new-array {v2, v1}, [I

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    aget v2, p2, v0

    .line 115
    .line 116
    aget v3, p2, v7

    .line 117
    .line 118
    if-eqz p5, :cond_5

    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    if-nez p2, :cond_4

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 132
    .line 133
    .line 134
    move-result p5

    .line 135
    iget v1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 136
    .line 137
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    sub-int/2addr v1, v4

    .line 142
    iget v4, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 143
    .line 144
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    sub-int/2addr v4, v5

    .line 149
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 150
    .line 151
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 152
    .line 153
    invoke-static {p0, p2}, Lyyds/ᛵᲇᛲᛱ;->ᲁᛶᛴᛸ(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 154
    .line 155
    .line 156
    iget p2, p0, Landroid/graphics/Rect;->left:I

    .line 157
    .line 158
    sub-int/2addr p2, v2

    .line 159
    if-ge p2, v1, :cond_6

    .line 160
    .line 161
    iget p2, p0, Landroid/graphics/Rect;->right:I

    .line 162
    .line 163
    sub-int/2addr p2, v2

    .line 164
    if-le p2, p3, :cond_6

    .line 165
    .line 166
    iget p2, p0, Landroid/graphics/Rect;->top:I

    .line 167
    .line 168
    sub-int/2addr p2, v3

    .line 169
    if-ge p2, v4, :cond_6

    .line 170
    .line 171
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 172
    .line 173
    sub-int/2addr p0, v3

    .line 174
    if-gt p0, p5, :cond_5

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_5
    if-nez v2, :cond_7

    .line 178
    .line 179
    if-eqz v3, :cond_6

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_6
    :goto_3
    return v0

    .line 183
    :cond_7
    :goto_4
    if-eqz p4, :cond_8

    .line 184
    .line 185
    invoke-virtual {p1, v2, v3}, Lyyds/ᛵᲇᛲᛱ;->scrollBy(II)V

    .line 186
    .line 187
    .line 188
    return v7

    .line 189
    :cond_8
    const/high16 v5, -0x80000000

    .line 190
    .line 191
    const/4 v6, 0x0

    .line 192
    const/4 v4, 0x0

    .line 193
    move-object v1, p1

    .line 194
    invoke-virtual/range {v1 .. v6}, Lyyds/ᛵᲇᛲᛱ;->ᛴᛵᛷᛳ(IILandroid/view/animation/PathInterpolator;IZ)V

    .line 195
    .line 196
    .line 197
    return v7
.end method

.method public abstract ᲈᛳ(Lyyds/ᲈᛳᲇᛲ;)V
.end method

.method public ᲈᛳᛵᛴ(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲈᲁᛵᛶ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
