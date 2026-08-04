.class public abstract Lyyds/ᛶᲁᛲᲀ;
.super Landroid/view/ViewGroup;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:I

.field public ᛱᲈᲁ:I

.field public ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

.field public ᛲᛳᛶᲁ:F

.field public ᛲᛴᛳᛲ:I

.field public ᛳᲁᲁᲇ:I

.field public ᛶᛳᛶᛵ:I

.field public ᛶᛷᛲᲁ:I

.field public ᛷᛲᲈᛱ:[I

.field public ᛷᛵᲇᲀ:[I

.field public ᛷᲈᲈᲁ:Z

.field public ᲀᛲᛳᲀ:Z

.field public ᲇᛱᛲ:I

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲀᛲᛳᲀ:Z

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput v2, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛴᛳᛲ:I

    .line 12
    .line 13
    const v3, 0x800033

    .line 14
    .line 15
    .line 16
    iput v3, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 17
    .line 18
    sget-object v6, Lyyds/ᛷᛷᛴᛳ;->ᛱᛳᲇ:[I

    .line 19
    .line 20
    invoke-static {p1, p2, v6, p3}, Lyyds/ᛳᛷᲀᛴ;->ᛱᛳᛶᛳ(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lyyds/ᛳᛷᲀᛴ;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, v3, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v8, v4

    .line 27
    check-cast v8, Landroid/content/res/TypedArray;

    .line 28
    .line 29
    sget-object v4, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    move-object v4, p0

    .line 33
    move-object v5, p1

    .line 34
    move-object v7, p2

    .line 35
    move v9, p3

    .line 36
    invoke-static/range {v4 .. v10}, Lyyds/ᛵᲈᲈᛸ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 37
    .line 38
    .line 39
    iget-object p0, v3, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Landroid/content/res/TypedArray;

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-ltz p1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v4, p1}, Lyyds/ᛶᲁᛲᲀ;->setOrientation(I)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p0, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ltz p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v4, p1}, Lyyds/ᛶᲁᛲᲀ;->setGravity(I)V

    .line 59
    .line 60
    .line 61
    :cond_1
    const/4 p1, 0x2

    .line 62
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {v4, p1}, Lyyds/ᛶᲁᛲᲀ;->setBaselineAligned(Z)V

    .line 69
    .line 70
    .line 71
    :cond_2
    const/4 p1, 0x4

    .line 72
    const/high16 p2, -0x40800000    # -1.0f

    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iput p1, v4, Lyyds/ᛶᲁᛲᲀ;->ᛲᛳᛶᲁ:F

    .line 79
    .line 80
    const/4 p1, 0x3

    .line 81
    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iput p1, v4, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 86
    .line 87
    const/4 p1, 0x7

    .line 88
    invoke-virtual {p0, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput-boolean p1, v4, Lyyds/ᛶᲁᛲᲀ;->ᛷᲈᲈᲁ:Z

    .line 93
    .line 94
    const/4 p1, 0x5

    .line 95
    invoke-virtual {v3, p1}, Lyyds/ᛳᛷᲀᛴ;->ᛳᛸᛴᛶ(I)Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v4, p1}, Lyyds/ᛶᲁᛲᲀ;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 100
    .line 101
    .line 102
    const/16 p1, 0x8

    .line 103
    .line 104
    invoke-virtual {p0, p1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iput p1, v4, Lyyds/ᛶᲁᛲᲀ;->ᲇᛱᛲ:I

    .line 109
    .line 110
    const/4 p1, 0x6

    .line 111
    invoke-virtual {p0, p1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    iput p0, v4, Lyyds/ᛶᲁᛲᲀ;->ᛶᛳᛶᛵ:I

    .line 116
    .line 117
    invoke-virtual {v3}, Lyyds/ᛳᛷᲀᛴ;->ᛸᛴᛵᛶ()V

    .line 118
    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lyyds/ᛳᛳᛴᲇ;

    .line 2
    .line 3
    return p0
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛶᲁᛲᲀ;->ᛲᛴᛳᛲ()Lyyds/ᛳᛳᛴᲇ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ(Landroid/util/AttributeSet;)Lyyds/ᛳᛳᛴᲇ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ(Landroid/view/ViewGroup$LayoutParams;)Lyyds/ᛳᛳᛴᲇ;

    move-result-object p0

    return-object p0
.end method

.method public getBaseline()I
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroid/view/View;->getBaseline()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 15
    .line 16
    if-le v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    const-string v0, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    .line 37
    .line 38
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    :cond_2
    iget v2, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛴᛳᛲ:I

    .line 43
    .line 44
    iget v3, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    if-ne v3, v4, :cond_5

    .line 48
    .line 49
    iget v3, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 50
    .line 51
    and-int/lit8 v3, v3, 0x70

    .line 52
    .line 53
    const/16 v4, 0x30

    .line 54
    .line 55
    if-eq v3, v4, :cond_5

    .line 56
    .line 57
    const/16 v4, 0x10

    .line 58
    .line 59
    if-eq v3, v4, :cond_4

    .line 60
    .line 61
    const/16 v4, 0x50

    .line 62
    .line 63
    if-eq v3, v4, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    sub-int/2addr v2, v3

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sub-int/2addr v2, v3

    .line 80
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 81
    .line 82
    sub-int/2addr v2, p0

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v3, v4

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    sub-int/2addr v3, v4

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    sub-int/2addr v3, v4

    .line 103
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 104
    .line 105
    sub-int/2addr v3, p0

    .line 106
    div-int/lit8 v3, v3, 0x2

    .line 107
    .line 108
    add-int/2addr v2, v3

    .line 109
    :cond_5
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, Lyyds/ᛳᛳᛴᲇ;

    .line 114
    .line 115
    iget p0, p0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 116
    .line 117
    add-int/2addr v2, p0

    .line 118
    add-int/2addr v2, v1

    .line 119
    return v2

    .line 120
    :cond_6
    new-instance p0, Ljava/lang/RuntimeException;

    .line 121
    .line 122
    const-string v0, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    .line 123
    .line 124
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public getBaselineAlignedChildIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    return p0
.end method

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDividerPadding()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛳᛶᛵ:I

    .line 2
    .line 3
    return p0
.end method

.method public getDividerWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    .line 2
    .line 3
    return p0
.end method

.method public getGravity()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    return p0
.end method

.method public getOrientation()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    return p0
.end method

.method public getShowDividers()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᛱᛲ:I

    .line 2
    .line 3
    return p0
.end method

.method public getVirtualChildCount()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public getWeightSum()F
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛳᛶᲁ:F

    .line 2
    .line 3
    return p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_6

    .line 6
    .line 7
    :cond_0
    iget v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ:I

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v3, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛶᲁᛲᲀ;->getVirtualChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    if-ge v2, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eq v5, v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Lyyds/ᛳᛳᛴᲇ;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 50
    .line 51
    sub-int/2addr v4, v5

    .line 52
    iget v5, p0, Lyyds/ᛶᲁᛲᲀ;->ᛳᲁᲁᲇ:I

    .line 53
    .line 54
    sub-int/2addr v4, v5

    .line 55
    invoke-virtual {p0, v4, p1}, Lyyds/ᛶᲁᛲᲀ;->ᲀᛲᛳᲀ(ILandroid/graphics/Canvas;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-virtual {p0, v0}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_b

    .line 66
    .line 67
    sub-int/2addr v0, v3

    .line 68
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    sub-int/2addr v0, v1

    .line 83
    iget v1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛳᲁᲁᲇ:I

    .line 84
    .line 85
    sub-int/2addr v0, v1

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lyyds/ᛳᛳᛴᲇ;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 98
    .line 99
    add-int/2addr v0, v1

    .line 100
    :goto_1
    invoke-virtual {p0, v0, p1}, Lyyds/ᛶᲁᛲᲀ;->ᲀᛲᛳᲀ(ILandroid/graphics/Canvas;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    invoke-virtual {p0}, Lyyds/ᛶᲁᛲᲀ;->getVirtualChildCount()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {p0}, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ(Landroid/view/View;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    :goto_2
    if-ge v2, v0, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    if-eqz v5, :cond_6

    .line 119
    .line 120
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eq v6, v1, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v2}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_6

    .line 131
    .line 132
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    check-cast v6, Lyyds/ᛳᛳᛴᲇ;

    .line 137
    .line 138
    if-eqz v4, :cond_5

    .line 139
    .line 140
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 145
    .line 146
    add-int/2addr v5, v6

    .line 147
    goto :goto_3

    .line 148
    :cond_5
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 153
    .line 154
    sub-int/2addr v5, v6

    .line 155
    iget v6, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    .line 156
    .line 157
    sub-int/2addr v5, v6

    .line 158
    :goto_3
    invoke-virtual {p0, v5, p1}, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ(ILandroid/graphics/Canvas;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    invoke-virtual {p0, v0}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_b

    .line 169
    .line 170
    sub-int/2addr v0, v3

    .line 171
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-nez v0, :cond_9

    .line 176
    .line 177
    if-eqz v4, :cond_8

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    goto :goto_5

    .line 184
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    sub-int/2addr v0, v1

    .line 193
    iget v1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    .line 194
    .line 195
    :goto_4
    sub-int/2addr v0, v1

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Lyyds/ᛳᛳᛴᲇ;

    .line 202
    .line 203
    if-eqz v4, :cond_a

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 210
    .line 211
    sub-int/2addr v0, v1

    .line 212
    iget v1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 220
    .line 221
    add-int/2addr v0, v1

    .line 222
    :goto_5
    invoke-virtual {p0, v0, p1}, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ(ILandroid/graphics/Canvas;)V

    .line 223
    .line 224
    .line 225
    :cond_b
    :goto_6
    return-void
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-string p0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-string p0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/16 v5, 0x50

    .line 9
    .line 10
    const/16 v6, 0x10

    .line 11
    .line 12
    const v7, 0x800007

    .line 13
    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x1

    .line 17
    if-ne v1, v9, :cond_8

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sub-int v10, p4, p2

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    sub-int v11, v10, v11

    .line 30
    .line 31
    sub-int/2addr v10, v1

    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    sub-int/2addr v10, v12

    .line 37
    invoke-virtual {v0}, Lyyds/ᛶᲁᛲᲀ;->getVirtualChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    iget v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 42
    .line 43
    and-int/lit8 v14, v13, 0x70

    .line 44
    .line 45
    and-int/2addr v7, v13

    .line 46
    if-eq v14, v6, :cond_1

    .line 47
    .line 48
    if-eq v14, v5, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-int v5, v5, p5

    .line 60
    .line 61
    sub-int v5, v5, p3

    .line 62
    .line 63
    iget v6, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 64
    .line 65
    sub-int/2addr v5, v6

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    sub-int v6, p5, p3

    .line 72
    .line 73
    iget v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 74
    .line 75
    sub-int/2addr v6, v13

    .line 76
    div-int/2addr v6, v8

    .line 77
    add-int/2addr v5, v6

    .line 78
    :goto_0
    const/4 v4, 0x0

    .line 79
    :goto_1
    if-ge v4, v12, :cond_16

    .line 80
    .line 81
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-nez v6, :cond_3

    .line 86
    .line 87
    :cond_2
    move/from16 p1, v8

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-eq v13, v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 105
    .line 106
    .line 107
    move-result-object v15

    .line 108
    check-cast v15, Lyyds/ᛳᛳᛴᲇ;

    .line 109
    .line 110
    move/from16 p1, v8

    .line 111
    .line 112
    iget v8, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 113
    .line 114
    if-gez v8, :cond_4

    .line 115
    .line 116
    move v8, v7

    .line 117
    :cond_4
    sget-object v16, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-static {v8, v3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    and-int/lit8 v3, v3, 0x7

    .line 128
    .line 129
    if-eq v3, v9, :cond_6

    .line 130
    .line 131
    if-eq v3, v2, :cond_5

    .line 132
    .line 133
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 134
    .line 135
    add-int/2addr v3, v1

    .line 136
    goto :goto_3

    .line 137
    :cond_5
    sub-int v3, v11, v13

    .line 138
    .line 139
    iget v8, v15, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 140
    .line 141
    :goto_2
    sub-int/2addr v3, v8

    .line 142
    goto :goto_3

    .line 143
    :cond_6
    sub-int v3, v10, v13

    .line 144
    .line 145
    div-int/lit8 v3, v3, 0x2

    .line 146
    .line 147
    add-int/2addr v3, v1

    .line 148
    iget v8, v15, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 149
    .line 150
    add-int/2addr v3, v8

    .line 151
    iget v8, v15, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :goto_3
    invoke-virtual {v0, v4}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-eqz v8, :cond_7

    .line 159
    .line 160
    iget v8, v0, Lyyds/ᛶᲁᛲᲀ;->ᛳᲁᲁᲇ:I

    .line 161
    .line 162
    add-int/2addr v5, v8

    .line 163
    :cond_7
    iget v8, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 164
    .line 165
    add-int/2addr v5, v8

    .line 166
    add-int/2addr v13, v3

    .line 167
    add-int v8, v5, v14

    .line 168
    .line 169
    invoke-virtual {v6, v3, v5, v13, v8}, Landroid/view/View;->layout(IIII)V

    .line 170
    .line 171
    .line 172
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 173
    .line 174
    add-int/2addr v14, v3

    .line 175
    add-int/2addr v14, v5

    .line 176
    move v5, v14

    .line 177
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 178
    .line 179
    move/from16 v8, p1

    .line 180
    .line 181
    const/16 v3, 0x8

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_8
    move/from16 p1, v8

    .line 185
    .line 186
    invoke-static {v0}, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ(Landroid/view/View;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    sub-int v8, p5, p3

    .line 195
    .line 196
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    sub-int v10, v8, v10

    .line 201
    .line 202
    sub-int/2addr v8, v3

    .line 203
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    sub-int/2addr v8, v11

    .line 208
    invoke-virtual {v0}, Lyyds/ᛶᲁᛲᲀ;->getVirtualChildCount()I

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    iget v12, v0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 213
    .line 214
    and-int/2addr v7, v12

    .line 215
    and-int/lit8 v12, v12, 0x70

    .line 216
    .line 217
    iget-boolean v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᲀᛲᛳᲀ:Z

    .line 218
    .line 219
    iget-object v14, v0, Lyyds/ᛶᲁᛲᲀ;->ᛷᛲᲈᛱ:[I

    .line 220
    .line 221
    iget-object v15, v0, Lyyds/ᛶᲁᛲᲀ;->ᛷᛵᲇᲀ:[I

    .line 222
    .line 223
    sget-object v17, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 224
    .line 225
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    invoke-static {v7, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    if-eq v4, v9, :cond_a

    .line 234
    .line 235
    if-eq v4, v2, :cond_9

    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    add-int v2, v2, p4

    .line 247
    .line 248
    sub-int v2, v2, p2

    .line 249
    .line 250
    iget v4, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 251
    .line 252
    sub-int/2addr v2, v4

    .line 253
    goto :goto_5

    .line 254
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    sub-int v4, p4, p2

    .line 259
    .line 260
    iget v7, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 261
    .line 262
    sub-int/2addr v4, v7

    .line 263
    div-int/lit8 v4, v4, 0x2

    .line 264
    .line 265
    add-int/2addr v2, v4

    .line 266
    :goto_5
    if-eqz v1, :cond_b

    .line 267
    .line 268
    add-int/lit8 v1, v11, -0x1

    .line 269
    .line 270
    const/4 v7, -0x1

    .line 271
    goto :goto_6

    .line 272
    :cond_b
    move v7, v9

    .line 273
    const/4 v1, 0x0

    .line 274
    :goto_6
    move/from16 v17, v9

    .line 275
    .line 276
    const/4 v9, 0x0

    .line 277
    :goto_7
    if-ge v9, v11, :cond_16

    .line 278
    .line 279
    mul-int v18, v7, v9

    .line 280
    .line 281
    add-int v5, v18, v1

    .line 282
    .line 283
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    if-nez v6, :cond_c

    .line 288
    .line 289
    move/from16 p3, v1

    .line 290
    .line 291
    :goto_8
    move/from16 v19, v3

    .line 292
    .line 293
    goto/16 :goto_d

    .line 294
    .line 295
    :cond_c
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    move/from16 p3, v1

    .line 300
    .line 301
    const/16 v1, 0x8

    .line 302
    .line 303
    if-eq v4, v1, :cond_15

    .line 304
    .line 305
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 310
    .line 311
    .line 312
    move-result v16

    .line 313
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 314
    .line 315
    .line 316
    move-result-object v19

    .line 317
    move-object/from16 v1, v19

    .line 318
    .line 319
    check-cast v1, Lyyds/ᛳᛳᛴᲇ;

    .line 320
    .line 321
    move/from16 p5, v2

    .line 322
    .line 323
    if-eqz v13, :cond_d

    .line 324
    .line 325
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 326
    .line 327
    move/from16 v19, v3

    .line 328
    .line 329
    const/4 v3, -0x1

    .line 330
    if-eq v2, v3, :cond_e

    .line 331
    .line 332
    invoke-virtual {v6}, Landroid/view/View;->getBaseline()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    goto :goto_9

    .line 337
    :cond_d
    move/from16 v19, v3

    .line 338
    .line 339
    :cond_e
    const/4 v3, -0x1

    .line 340
    :goto_9
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 341
    .line 342
    if-gez v2, :cond_f

    .line 343
    .line 344
    move v2, v12

    .line 345
    :cond_f
    and-int/lit8 v2, v2, 0x70

    .line 346
    .line 347
    move/from16 v20, v4

    .line 348
    .line 349
    const/16 v4, 0x10

    .line 350
    .line 351
    if-eq v2, v4, :cond_12

    .line 352
    .line 353
    const/16 v4, 0x30

    .line 354
    .line 355
    if-eq v2, v4, :cond_11

    .line 356
    .line 357
    const/16 v4, 0x50

    .line 358
    .line 359
    if-eq v2, v4, :cond_10

    .line 360
    .line 361
    move/from16 v2, v19

    .line 362
    .line 363
    const/4 v4, -0x1

    .line 364
    goto :goto_b

    .line 365
    :cond_10
    sub-int v2, v10, v16

    .line 366
    .line 367
    iget v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 368
    .line 369
    sub-int/2addr v2, v4

    .line 370
    const/4 v4, -0x1

    .line 371
    if-eq v3, v4, :cond_13

    .line 372
    .line 373
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 374
    .line 375
    .line 376
    move-result v21

    .line 377
    sub-int v21, v21, v3

    .line 378
    .line 379
    aget v3, v15, p1

    .line 380
    .line 381
    sub-int v3, v3, v21

    .line 382
    .line 383
    :goto_a
    sub-int/2addr v2, v3

    .line 384
    goto :goto_b

    .line 385
    :cond_11
    const/4 v4, -0x1

    .line 386
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 387
    .line 388
    add-int v2, v19, v2

    .line 389
    .line 390
    if-eq v3, v4, :cond_13

    .line 391
    .line 392
    aget v21, v14, v17

    .line 393
    .line 394
    sub-int v21, v21, v3

    .line 395
    .line 396
    add-int v2, v21, v2

    .line 397
    .line 398
    goto :goto_b

    .line 399
    :cond_12
    const/4 v4, -0x1

    .line 400
    sub-int v2, v8, v16

    .line 401
    .line 402
    div-int/lit8 v2, v2, 0x2

    .line 403
    .line 404
    add-int v2, v2, v19

    .line 405
    .line 406
    iget v3, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 407
    .line 408
    add-int/2addr v2, v3

    .line 409
    iget v3, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_13
    :goto_b
    invoke-virtual {v0, v5}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    if-eqz v3, :cond_14

    .line 417
    .line 418
    iget v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    .line 419
    .line 420
    add-int v3, p5, v3

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_14
    move/from16 v3, p5

    .line 424
    .line 425
    :goto_c
    iget v5, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 426
    .line 427
    add-int/2addr v3, v5

    .line 428
    add-int v5, v3, v20

    .line 429
    .line 430
    add-int v4, v2, v16

    .line 431
    .line 432
    invoke-virtual {v6, v3, v2, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 433
    .line 434
    .line 435
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 436
    .line 437
    add-int v4, v20, v1

    .line 438
    .line 439
    add-int/2addr v4, v3

    .line 440
    move v2, v4

    .line 441
    goto :goto_d

    .line 442
    :cond_15
    move/from16 p5, v2

    .line 443
    .line 444
    goto/16 :goto_8

    .line 445
    .line 446
    :goto_d
    add-int/lit8 v9, v9, 0x1

    .line 447
    .line 448
    move/from16 v1, p3

    .line 449
    .line 450
    move/from16 v3, v19

    .line 451
    .line 452
    const/16 v5, 0x50

    .line 453
    .line 454
    const/16 v6, 0x10

    .line 455
    .line 456
    goto/16 :goto_7

    .line 457
    .line 458
    :cond_16
    return-void
.end method

.method public onMeasure(II)V
    .locals 38

    move-object/from16 v0, p0

    .line 1
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ:I

    const/4 v7, -0x2

    const/4 v9, 0x0

    const/high16 v10, 0x40000000    # 2.0f

    const/16 v11, 0x8

    const/4 v14, 0x1

    if-ne v1, v14, :cond_29

    .line 2
    iput v9, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 3
    invoke-virtual {v0}, Lyyds/ᛶᲁᛲᲀ;->getVirtualChildCount()I

    move-result v15

    .line 4
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 5
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 6
    iget v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 7
    iget-boolean v4, v0, Lyyds/ᛶᲁᛲᲀ;->ᛷᲈᲈᲁ:Z

    move v5, v9

    move v6, v5

    move v8, v6

    move/from16 v19, v8

    move/from16 v22, v19

    move/from16 v23, v22

    move/from16 v20, v14

    move/from16 v24, v20

    const/16 v16, 0x0

    const v17, 0xffffff

    const/16 v18, 0x0

    move/from16 v14, v23

    :goto_0
    if-ge v5, v15, :cond_11

    move/from16 v25, v1

    .line 8
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    .line 9
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iput v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    :goto_1
    move/from16 v29, v2

    move v7, v3

    move/from16 v28, v4

    move v13, v5

    move/from16 v12, v25

    move/from16 v2, p1

    move/from16 v4, p2

    goto/16 :goto_c

    .line 10
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v12

    if-ne v12, v11, :cond_1

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {v0, v5}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 12
    iget v12, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iget v11, v0, Lyyds/ᛶᲁᛲᲀ;->ᛳᲁᲁᲇ:I

    add-int/2addr v12, v11

    iput v12, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 13
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Lyyds/ᛳᛳᛴᲇ;

    .line 14
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-float v16, v16, v12

    if-ne v2, v10, :cond_3

    .line 15
    iget v10, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v10, :cond_3

    cmpl-float v10, v12, v18

    if-lez v10, :cond_3

    .line 16
    iget v10, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 17
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v12, v10

    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v12, v13

    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    iput v10, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    move-object/from16 v30, v1

    move/from16 v29, v2

    move v7, v3

    move/from16 v28, v4

    move v13, v5

    move/from16 v19, v20

    move/from16 v12, v25

    move/from16 v2, p1

    move/from16 v4, p2

    goto :goto_5

    .line 18
    :cond_3
    iget v10, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v10, :cond_4

    cmpl-float v10, v12, v18

    if-lez v10, :cond_4

    .line 19
    iput v7, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v10, 0x0

    goto :goto_2

    :cond_4
    const/high16 v10, -0x80000000

    :goto_2
    cmpl-float v12, v16, v18

    if-nez v12, :cond_5

    .line 20
    iget v12, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    move v13, v12

    move v12, v5

    move v5, v13

    :goto_3
    move v13, v3

    goto :goto_4

    :cond_5
    move v12, v5

    const/4 v5, 0x0

    goto :goto_3

    :goto_4
    const/4 v3, 0x0

    move/from16 v29, v2

    move/from16 v28, v4

    move v7, v13

    move/from16 v2, p1

    move/from16 v4, p2

    move v13, v12

    move/from16 v12, v25

    .line 21
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    const/high16 v3, -0x80000000

    if-eq v10, v3, :cond_6

    .line 22
    iput v10, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 23
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 24
    iget v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    add-int v10, v5, v3

    move-object/from16 v30, v1

    .line 25
    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v10, v1

    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v10, v1

    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    if-eqz v28, :cond_7

    .line 26
    invoke-static {v3, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    :cond_7
    :goto_5
    if-ltz v7, :cond_8

    add-int/lit8 v5, v13, 0x1

    if-ne v7, v5, :cond_8

    .line 27
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iput v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛴᛳᛲ:I

    :cond_8
    if-ge v13, v7, :cond_9

    .line 28
    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v1, v1, v18

    if-gtz v1, :cond_a

    :cond_9
    const/high16 v1, 0x40000000    # 2.0f

    goto :goto_6

    .line 29
    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_6
    if-eq v12, v1, :cond_b

    .line 30
    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_b

    move/from16 v1, v20

    move/from16 v23, v1

    goto :goto_7

    :cond_b
    const/4 v1, 0x0

    .line 31
    :goto_7
    iget v3, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v5, v11, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v5

    .line 32
    invoke-virtual/range {v30 .. v30}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    add-int/2addr v5, v3

    .line 33
    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 34
    invoke-virtual/range {v30 .. v30}, Landroid/view/View;->getMeasuredState()I

    move-result v10

    move/from16 v30, v1

    move/from16 v1, v22

    .line 35
    invoke-static {v1, v10}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v1

    if-eqz v24, :cond_c

    .line 36
    iget v10, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    move/from16 v22, v1

    const/4 v1, -0x1

    if-ne v10, v1, :cond_d

    move/from16 v1, v20

    goto :goto_8

    :cond_c
    move/from16 v22, v1

    :cond_d
    const/4 v1, 0x0

    .line 37
    :goto_8
    iget v10, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v10, v10, v18

    if-lez v10, :cond_f

    if-eqz v30, :cond_e

    goto :goto_9

    :cond_e
    move v3, v5

    .line 38
    :goto_9
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    move-result v8

    goto :goto_b

    :cond_f
    if-eqz v30, :cond_10

    goto :goto_a

    :cond_10
    move v3, v5

    .line 39
    :goto_a
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    :goto_b
    move/from16 v24, v1

    :goto_c
    add-int/lit8 v5, v13, 0x1

    move v3, v7

    move v1, v12

    move/from16 v4, v28

    move/from16 v2, v29

    const/4 v7, -0x2

    const/high16 v10, 0x40000000    # 2.0f

    const/16 v11, 0x8

    goto/16 :goto_0

    :cond_11
    move v12, v1

    move/from16 v29, v2

    move/from16 v28, v4

    move/from16 v1, v22

    move/from16 v2, p1

    move/from16 v4, p2

    .line 40
    iget v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    if-lez v3, :cond_12

    invoke-virtual {v0, v15}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 41
    iget v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iget v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛳᲁᲁᲇ:I

    add-int/2addr v3, v5

    iput v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    :cond_12
    move/from16 v3, v29

    if-eqz v28, :cond_16

    const/high16 v5, -0x80000000

    if-eq v3, v5, :cond_13

    if-nez v3, :cond_16

    :cond_13
    const/4 v5, 0x0

    .line 42
    iput v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    const/4 v5, 0x0

    :goto_d
    if-ge v5, v15, :cond_16

    .line 43
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    if-nez v7, :cond_14

    .line 44
    iget v7, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iput v7, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    goto :goto_e

    .line 45
    :cond_14
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v10

    const/16 v11, 0x8

    if-ne v10, v11, :cond_15

    goto :goto_e

    .line 46
    :cond_15
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Lyyds/ᛳᛳᛴᲇ;

    .line 47
    iget v10, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    add-int v11, v10, v14

    .line 48
    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v11, v13

    iget v7, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v11, v7

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v7

    iput v7, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    :goto_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    .line 49
    :cond_16
    iget v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v10

    add-int/2addr v10, v7

    add-int/2addr v10, v5

    iput v10, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v5

    invoke-static {v10, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v7, 0x0

    .line 51
    invoke-static {v5, v4, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v5

    and-int v7, v5, v17

    .line 52
    iget v10, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    sub-int/2addr v7, v10

    if-nez v19, :cond_1a

    if-eqz v7, :cond_17

    cmpl-float v10, v16, v18

    if-lez v10, :cond_17

    goto :goto_11

    .line 53
    :cond_17
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-eqz v28, :cond_26

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v3, v7, :cond_26

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v15, :cond_26

    .line 54
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_19

    .line 55
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v8

    const/16 v11, 0x8

    if-ne v8, v11, :cond_18

    goto :goto_10

    .line 56
    :cond_18
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Lyyds/ᛳᛳᛴᲇ;

    .line 57
    iget v8, v8, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v8, v8, v18

    if-lez v8, :cond_19

    .line 58
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    const/high16 v10, 0x40000000    # 2.0f

    invoke-static {v8, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 59
    invoke-static {v14, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 60
    invoke-virtual {v7, v8, v11}, Landroid/view/View;->measure(II)V

    :cond_19
    :goto_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    .line 61
    :cond_1a
    :goto_11
    iget v8, v0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛳᛶᲁ:F

    cmpl-float v10, v8, v18

    if-lez v10, :cond_1b

    move/from16 v16, v8

    :cond_1b
    const/4 v8, 0x0

    .line 62
    iput v8, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    move v8, v1

    const/4 v1, 0x0

    :goto_12
    if-ge v1, v15, :cond_25

    .line 63
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 64
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v11

    const/16 v13, 0x8

    if-ne v11, v13, :cond_1c

    move/from16 v17, v1

    goto/16 :goto_19

    .line 65
    :cond_1c
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Lyyds/ᛳᛳᛴᲇ;

    .line 66
    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v14, v13, v18

    if-lez v14, :cond_21

    int-to-float v14, v7

    mul-float/2addr v14, v13

    div-float v14, v14, v16

    float-to-int v14, v14

    sub-float v16, v16, v13

    sub-int/2addr v7, v14

    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v17

    add-int v17, v17, v13

    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int v17, v17, v13

    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v13, v17, v13

    move/from16 v17, v1

    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 68
    invoke-static {v2, v13, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    .line 69
    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v13, :cond_1f

    const/high16 v13, 0x40000000    # 2.0f

    if-eq v3, v13, :cond_1d

    goto :goto_14

    :cond_1d
    if-lez v14, :cond_1e

    goto :goto_13

    :cond_1e
    const/4 v14, 0x0

    .line 70
    :goto_13
    invoke-static {v14, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 71
    invoke-virtual {v10, v1, v14}, Landroid/view/View;->measure(II)V

    goto :goto_15

    :cond_1f
    const/high16 v13, 0x40000000    # 2.0f

    .line 72
    :goto_14
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v19

    add-int v14, v19, v14

    if-gez v14, :cond_20

    const/4 v14, 0x0

    .line 73
    :cond_20
    invoke-static {v14, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 74
    invoke-virtual {v10, v1, v14}, Landroid/view/View;->measure(II)V

    .line 75
    :goto_15
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredState()I

    move-result v1

    and-int/lit16 v1, v1, -0x100

    .line 76
    invoke-static {v8, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    goto :goto_16

    :cond_21
    move/from16 v17, v1

    .line 77
    :goto_16
    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v1, v13

    .line 78
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    add-int/2addr v13, v1

    .line 79
    invoke-static {v9, v13}, Ljava/lang/Math;->max(II)I

    move-result v9

    const/high16 v14, 0x40000000    # 2.0f

    if-eq v12, v14, :cond_22

    .line 80
    iget v14, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    move/from16 v19, v1

    const/4 v1, -0x1

    if-ne v14, v1, :cond_23

    move/from16 v13, v19

    goto :goto_17

    :cond_22
    const/4 v1, -0x1

    .line 81
    :cond_23
    :goto_17
    invoke-static {v6, v13}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-eqz v24, :cond_24

    .line 82
    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-ne v13, v1, :cond_24

    move/from16 v1, v20

    goto :goto_18

    :cond_24
    const/4 v1, 0x0

    .line 83
    :goto_18
    iget v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 84
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    add-int/2addr v10, v13

    iget v14, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v10, v14

    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v10, v11

    invoke-static {v13, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    iput v10, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    move/from16 v24, v1

    :goto_19
    add-int/lit8 v1, v17, 0x1

    goto/16 :goto_12

    .line 85
    :cond_25
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    add-int/2addr v7, v3

    add-int/2addr v7, v1

    iput v7, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    move v1, v8

    :cond_26
    if-nez v24, :cond_27

    const/high16 v13, 0x40000000    # 2.0f

    if-eq v12, v13, :cond_27

    goto :goto_1a

    :cond_27
    move v6, v9

    .line 86
    :goto_1a
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    add-int/2addr v7, v3

    add-int/2addr v7, v6

    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 88
    invoke-static {v3, v2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-virtual {v0, v1, v5}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v23, :cond_63

    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v1, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    const/4 v9, 0x0

    :goto_1b
    if-ge v9, v15, :cond_63

    .line 90
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 91
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v11, 0x8

    if-eq v3, v11, :cond_28

    .line 92
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lyyds/ᛳᛳᛴᲇ;

    .line 93
    iget v3, v6, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v5, -0x1

    if-ne v3, v5, :cond_28

    .line 94
    iget v7, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 95
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    iput v3, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 96
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 97
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    :cond_28
    add-int/lit8 v9, v9, 0x1

    move/from16 v4, p2

    goto :goto_1b

    :cond_29
    move/from16 v2, p1

    move v5, v9

    move/from16 v20, v14

    const v17, 0xffffff

    const/16 v18, 0x0

    .line 98
    iput v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 99
    invoke-virtual {v0}, Lyyds/ᛶᲁᛲᲀ;->getVirtualChildCount()I

    move-result v6

    .line 100
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v7

    .line 101
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v8

    .line 102
    iget-object v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛷᛲᲈᛱ:[I

    const/4 v9, 0x4

    if-eqz v1, :cond_2b

    iget-object v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛷᛵᲇᲀ:[I

    if-nez v3, :cond_2a

    goto :goto_1d

    :cond_2a
    :goto_1c
    move-object v10, v1

    move-object v11, v3

    goto :goto_1e

    .line 103
    :cond_2b
    :goto_1d
    new-array v1, v9, [I

    iput-object v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛷᛲᲈᛱ:[I

    .line 104
    new-array v3, v9, [I

    iput-object v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛷᛵᲇᲀ:[I

    goto :goto_1c

    :goto_1e
    const/4 v12, 0x3

    const/16 v26, -0x1

    .line 105
    aput v26, v10, v12

    const/4 v13, 0x2

    aput v26, v10, v13

    aput v26, v10, v20

    const/16 v21, 0x0

    aput v26, v10, v21

    .line 106
    aput v26, v11, v12

    aput v26, v11, v13

    aput v26, v11, v20

    aput v26, v11, v21

    .line 107
    iget-boolean v14, v0, Lyyds/ᛶᲁᛲᲀ;->ᲀᛲᛳᲀ:Z

    .line 108
    iget-boolean v15, v0, Lyyds/ᛶᲁᛲᲀ;->ᛷᲈᲈᲁ:Z

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v7, v1, :cond_2c

    move/from16 v16, v20

    goto :goto_1f

    :cond_2c
    const/16 v16, 0x0

    :goto_1f
    move/from16 v23, v9

    move/from16 v24, v12

    move/from16 v28, v18

    move/from16 v29, v20

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    :goto_20
    if-ge v1, v6, :cond_40

    move/from16 v30, v13

    .line 109
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    if-nez v13, :cond_2d

    .line 110
    iget v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iput v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    move/from16 v33, v1

    move v1, v4

    move-object/from16 v31, v10

    move-object/from16 v32, v11

    move/from16 v34, v14

    move/from16 v35, v15

    move/from16 v4, p2

    goto/16 :goto_2e

    .line 111
    :cond_2d
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v2

    move/from16 v31, v3

    const/16 v3, 0x8

    if-ne v2, v3, :cond_2e

    move/from16 v2, p1

    move/from16 v33, v1

    move v1, v4

    move-object/from16 v32, v11

    move/from16 v34, v14

    move/from16 v35, v15

    move/from16 v3, v31

    move/from16 v4, p2

    move-object/from16 v31, v10

    goto/16 :goto_2e

    .line 112
    :cond_2e
    invoke-virtual {v0, v1}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    move-result v2

    if-eqz v2, :cond_2f

    .line 113
    iget v2, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iget v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    add-int/2addr v2, v3

    iput v2, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 114
    :cond_2f
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lyyds/ᛳᛳᛴᲇ;

    .line 115
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-float v28, v28, v3

    move/from16 v32, v1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v7, v1, :cond_32

    .line 116
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v1, :cond_32

    cmpl-float v1, v3, v18

    if-lez v1, :cond_32

    .line 117
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 118
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    if-eqz v16, :cond_30

    move/from16 v33, v3

    .line 119
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v3, v33, v3

    add-int/2addr v3, v1

    iput v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    goto :goto_21

    :cond_30
    move/from16 v33, v3

    add-int v3, v1, v33

    move/from16 v33, v3

    .line 120
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v3, v33, v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    :goto_21
    if-eqz v14, :cond_31

    const/4 v1, 0x0

    .line 121
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 122
    invoke-virtual {v13, v3, v3}, Landroid/view/View;->measure(II)V

    move-object/from16 v36, v13

    move/from16 v34, v14

    move/from16 v35, v15

    move/from16 v13, v31

    move/from16 v33, v32

    move-object v14, v2

    move-object/from16 v31, v10

    move-object/from16 v32, v11

    move/from16 v2, p1

    move v10, v4

    move v11, v5

    move/from16 v4, p2

    goto/16 :goto_26

    :cond_31
    move-object/from16 v36, v13

    move/from16 v34, v14

    move/from16 v35, v15

    move/from16 v22, v20

    move/from16 v13, v31

    move/from16 v33, v32

    const/high16 v1, 0x40000000    # 2.0f

    move-object v14, v2

    move-object/from16 v31, v10

    move-object/from16 v32, v11

    move/from16 v2, p1

    move v10, v4

    move v11, v5

    move/from16 v4, p2

    goto/16 :goto_27

    .line 123
    :cond_32
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v1, :cond_33

    cmpl-float v1, v3, v18

    if-lez v1, :cond_33

    const/4 v1, -0x2

    .line 124
    iput v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v1, 0x0

    goto :goto_22

    :cond_33
    const/high16 v1, -0x80000000

    :goto_22
    cmpl-float v3, v28, v18

    if-nez v3, :cond_34

    .line 125
    iget v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    :goto_23
    move/from16 v33, v5

    goto :goto_24

    :cond_34
    const/4 v3, 0x0

    goto :goto_23

    :goto_24
    const/4 v5, 0x0

    move/from16 v34, v32

    move-object/from16 v32, v11

    move/from16 v11, v33

    move/from16 v33, v34

    move/from16 v34, v14

    move/from16 v35, v15

    move v15, v1

    move-object v14, v2

    move-object v1, v13

    move/from16 v13, v31

    move/from16 v2, p1

    move-object/from16 v31, v10

    move v10, v4

    move/from16 v4, p2

    .line 126
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    const/high16 v3, -0x80000000

    if-eq v15, v3, :cond_35

    .line 127
    iput v15, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 128
    :cond_35
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 129
    iget v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 130
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    if-eqz v16, :cond_36

    add-int/2addr v15, v3

    move-object/from16 v36, v1

    .line 131
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v15, v1

    add-int/2addr v15, v5

    .line 132
    iput v15, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    goto :goto_25

    :cond_36
    move-object/from16 v36, v1

    add-int v1, v5, v3

    add-int/2addr v1, v15

    .line 133
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v1, v15

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    :goto_25
    if-eqz v35, :cond_37

    .line 134
    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_37
    :goto_26
    const/high16 v1, 0x40000000    # 2.0f

    :goto_27
    if-eq v8, v1, :cond_38

    .line 135
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_38

    move/from16 v1, v20

    move/from16 v19, v1

    goto :goto_28

    :cond_38
    const/4 v1, 0x0

    .line 136
    :goto_28
    iget v3, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget v5, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v3, v5

    .line 137
    invoke-virtual/range {v36 .. v36}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v5, v3

    .line 138
    invoke-virtual/range {v36 .. v36}, Landroid/view/View;->getMeasuredState()I

    move-result v15

    invoke-static {v12, v15}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v12

    if-eqz v34, :cond_3a

    .line 139
    invoke-virtual/range {v36 .. v36}, Landroid/view/View;->getBaseline()I

    move-result v15

    move/from16 v36, v1

    const/4 v1, -0x1

    if-eq v15, v1, :cond_3b

    .line 140
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v1, :cond_39

    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    :cond_39
    and-int/lit8 v1, v1, 0x70

    shr-int/lit8 v1, v1, 0x4

    const/16 v25, -0x2

    and-int/lit8 v1, v1, -0x2

    shr-int/lit8 v1, v1, 0x1

    move/from16 v37, v1

    .line 141
    aget v1, v31, v37

    invoke-static {v1, v15}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, v31, v37

    .line 142
    aget v1, v32, v37

    sub-int v15, v5, v15

    invoke-static {v1, v15}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, v32, v37

    goto :goto_29

    :cond_3a
    move/from16 v36, v1

    .line 143
    :cond_3b
    :goto_29
    invoke-static {v13, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eqz v29, :cond_3c

    .line 144
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v15, -0x1

    if-ne v13, v15, :cond_3c

    move/from16 v13, v20

    goto :goto_2a

    :cond_3c
    const/4 v13, 0x0

    .line 145
    :goto_2a
    iget v14, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v14, v14, v18

    if-lez v14, :cond_3e

    if-eqz v36, :cond_3d

    goto :goto_2b

    :cond_3d
    move v3, v5

    .line 146
    :goto_2b
    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v3, v10

    goto :goto_2d

    :cond_3e
    if-eqz v36, :cond_3f

    goto :goto_2c

    :cond_3f
    move v3, v5

    .line 147
    :goto_2c
    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v5, v11

    :goto_2d
    move/from16 v29, v3

    move v3, v1

    move/from16 v1, v29

    move/from16 v29, v13

    :goto_2e
    add-int/lit8 v10, v33, 0x1

    move v4, v1

    move v1, v10

    move/from16 v13, v30

    move-object/from16 v10, v31

    move-object/from16 v11, v32

    move/from16 v14, v34

    move/from16 v15, v35

    goto/16 :goto_20

    :cond_40
    move-object/from16 v31, v10

    move-object/from16 v32, v11

    move/from16 v30, v13

    move/from16 v34, v14

    move/from16 v35, v15

    move v13, v3

    move v10, v4

    move v11, v5

    move/from16 v4, p2

    .line 148
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    if-lez v1, :cond_41

    invoke-virtual {v0, v6}, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ(I)Z

    move-result v1

    if-eqz v1, :cond_41

    .line 149
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iget v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    add-int/2addr v1, v3

    iput v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 150
    :cond_41
    aget v1, v31, v20

    const/4 v3, -0x1

    if-ne v1, v3, :cond_43

    const/16 v21, 0x0

    aget v5, v31, v21

    if-ne v5, v3, :cond_43

    aget v5, v31, v30

    if-ne v5, v3, :cond_43

    aget v5, v31, v24

    if-eq v5, v3, :cond_42

    goto :goto_2f

    :cond_42
    move v3, v13

    goto :goto_30

    .line 151
    :cond_43
    :goto_2f
    aget v3, v31, v24

    const/16 v21, 0x0

    aget v5, v31, v21

    aget v14, v31, v30

    .line 152
    invoke-static {v1, v14}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 153
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 154
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 155
    aget v3, v32, v24

    aget v5, v32, v21

    aget v14, v32, v20

    aget v15, v32, v30

    .line 156
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 157
    invoke-static {v5, v14}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 158
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v1

    .line 159
    invoke-static {v13, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :goto_30
    if-eqz v35, :cond_48

    const/high16 v5, -0x80000000

    if-eq v7, v5, :cond_44

    if-nez v7, :cond_48

    :cond_44
    const/4 v5, 0x0

    .line 160
    iput v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    const/4 v1, 0x0

    :goto_31
    if-ge v1, v6, :cond_48

    .line 161
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_45

    .line 162
    iget v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    iput v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    goto :goto_32

    .line 163
    :cond_45
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v13

    const/16 v14, 0x8

    if-ne v13, v14, :cond_46

    goto :goto_32

    .line 164
    :cond_46
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lyyds/ᛳᛳᛴᲇ;

    .line 165
    iget v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    if-eqz v16, :cond_47

    .line 166
    iget v14, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v14, v9

    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v14, v5

    add-int/2addr v14, v13

    .line 167
    iput v14, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    goto :goto_32

    :cond_47
    add-int v14, v13, v9

    .line 168
    iget v15, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v14, v15

    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v14, v5

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    :goto_32
    add-int/lit8 v1, v1, 0x1

    goto :goto_31

    .line 169
    :cond_48
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v13

    add-int/2addr v13, v5

    add-int/2addr v13, v1

    iput v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 170
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/4 v5, 0x0

    .line 171
    invoke-static {v1, v2, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    and-int v5, v1, v17

    .line 172
    iget v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    sub-int/2addr v5, v13

    if-nez v22, :cond_4d

    if-eqz v5, :cond_49

    cmpl-float v14, v28, v18

    if-lez v14, :cond_49

    goto :goto_35

    .line 173
    :cond_49
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-eqz v35, :cond_4c

    const/high16 v14, 0x40000000    # 2.0f

    if-eq v7, v14, :cond_4c

    const/4 v7, 0x0

    :goto_33
    if-ge v7, v6, :cond_4c

    .line 174
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    if-eqz v10, :cond_4b

    .line 175
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v11

    const/16 v14, 0x8

    if-ne v11, v14, :cond_4a

    goto :goto_34

    .line 176
    :cond_4a
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Lyyds/ᛳᛳᛴᲇ;

    .line 177
    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v11, v11, v18

    if-lez v11, :cond_4b

    const/high16 v14, 0x40000000    # 2.0f

    .line 178
    invoke-static {v9, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 179
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    .line 180
    invoke-virtual {v10, v11, v15}, Landroid/view/View;->measure(II)V

    :cond_4b
    :goto_34
    add-int/lit8 v7, v7, 0x1

    goto :goto_33

    :cond_4c
    move/from16 v22, v1

    const/high16 v17, -0x1000000

    const/16 v21, 0x0

    goto/16 :goto_44

    .line 181
    :cond_4d
    :goto_35
    iget v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛳᛶᲁ:F

    cmpl-float v9, v3, v18

    if-lez v9, :cond_4e

    move/from16 v28, v3

    :cond_4e
    const/16 v26, -0x1

    .line 182
    aput v26, v31, v24

    aput v26, v31, v30

    aput v26, v31, v20

    const/4 v3, 0x0

    aput v26, v31, v3

    .line 183
    aput v26, v32, v24

    aput v26, v32, v30

    aput v26, v32, v20

    aput v26, v32, v3

    .line 184
    iput v3, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    const/4 v3, -0x1

    const/4 v9, 0x0

    :goto_36
    if-ge v9, v6, :cond_5d

    .line 185
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_4f

    .line 186
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-ne v14, v15, :cond_50

    :cond_4f
    move/from16 v22, v1

    const/high16 v17, -0x1000000

    const/16 v25, -0x2

    goto/16 :goto_41

    .line 187
    :cond_50
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Lyyds/ᛳᛳᛴᲇ;

    .line 188
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v17, v15, v18

    if-lez v17, :cond_55

    const/high16 v17, -0x1000000

    int-to-float v13, v5

    mul-float/2addr v13, v15

    div-float v13, v13, v28

    float-to-int v13, v13

    sub-float v28, v28, v15

    sub-int/2addr v5, v13

    .line 189
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v22

    add-int v22, v22, v15

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v22, v22, v15

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v15, v22, v15

    move/from16 v22, v1

    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 190
    invoke-static {v4, v15, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    .line 191
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v15, :cond_53

    const/high16 v15, 0x40000000    # 2.0f

    if-eq v7, v15, :cond_51

    goto :goto_38

    :cond_51
    if-lez v13, :cond_52

    goto :goto_37

    :cond_52
    const/4 v13, 0x0

    .line 192
    :goto_37
    invoke-static {v13, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    invoke-virtual {v11, v13, v1}, Landroid/view/View;->measure(II)V

    goto :goto_39

    :cond_53
    const/high16 v15, 0x40000000    # 2.0f

    .line 193
    :goto_38
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v27

    add-int v13, v27, v13

    if-gez v13, :cond_54

    const/4 v13, 0x0

    .line 194
    :cond_54
    invoke-static {v13, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    .line 195
    invoke-virtual {v11, v13, v1}, Landroid/view/View;->measure(II)V

    .line 196
    :goto_39
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredState()I

    move-result v1

    and-int v1, v1, v17

    .line 197
    invoke-static {v12, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v12

    goto :goto_3a

    :cond_55
    move/from16 v22, v1

    const/high16 v17, -0x1000000

    .line 198
    :goto_3a
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    if-eqz v16, :cond_56

    .line 199
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v13, v15

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v13, v15

    add-int/2addr v13, v1

    .line 200
    iput v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    :goto_3b
    const/high16 v1, 0x40000000    # 2.0f

    goto :goto_3c

    .line 201
    :cond_56
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    add-int/2addr v13, v1

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v13, v15

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v13, v15

    invoke-static {v1, v13}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    goto :goto_3b

    :goto_3c
    if-eq v8, v1, :cond_57

    .line 202
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v15, -0x1

    if-ne v1, v15, :cond_57

    move/from16 v1, v20

    goto :goto_3d

    :cond_57
    const/4 v1, 0x0

    .line 203
    :goto_3d
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v13, v15

    .line 204
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v15, v13

    .line 205
    invoke-static {v3, v15}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-eqz v1, :cond_58

    goto :goto_3e

    :cond_58
    move v13, v15

    .line 206
    :goto_3e
    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eqz v29, :cond_59

    .line 207
    iget v10, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v13, -0x1

    if-ne v10, v13, :cond_5a

    move/from16 v10, v20

    goto :goto_3f

    :cond_59
    const/4 v13, -0x1

    :cond_5a
    const/4 v10, 0x0

    :goto_3f
    if-eqz v34, :cond_5c

    .line 208
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    move-result v11

    if-eq v11, v13, :cond_5c

    .line 209
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v13, :cond_5b

    iget v13, v0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    :cond_5b
    and-int/lit8 v13, v13, 0x70

    shr-int/lit8 v13, v13, 0x4

    const/16 v25, -0x2

    and-int/lit8 v13, v13, -0x2

    shr-int/lit8 v13, v13, 0x1

    .line 210
    aget v14, v31, v13

    invoke-static {v14, v11}, Ljava/lang/Math;->max(II)I

    move-result v14

    aput v14, v31, v13

    .line 211
    aget v14, v32, v13

    sub-int/2addr v15, v11

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v11

    aput v11, v32, v13

    goto :goto_40

    :cond_5c
    const/16 v25, -0x2

    :goto_40
    move/from16 v29, v10

    move v10, v1

    :goto_41
    add-int/lit8 v9, v9, 0x1

    move/from16 v1, v22

    goto/16 :goto_36

    :cond_5d
    move/from16 v22, v1

    const/high16 v17, -0x1000000

    .line 212
    iget v1, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    add-int/2addr v7, v5

    add-int/2addr v7, v1

    iput v7, v0, Lyyds/ᛶᲁᛲᲀ;->ᛱᲈᲁ:I

    .line 213
    aget v1, v31, v20

    const/4 v15, -0x1

    if-ne v1, v15, :cond_5f

    const/16 v21, 0x0

    aget v5, v31, v21

    if-ne v5, v15, :cond_5f

    aget v5, v31, v30

    if-ne v5, v15, :cond_5f

    aget v5, v31, v24

    if-eq v5, v15, :cond_5e

    goto :goto_42

    :cond_5e
    const/16 v21, 0x0

    goto :goto_43

    .line 214
    :cond_5f
    :goto_42
    aget v5, v31, v24

    const/16 v21, 0x0

    aget v7, v31, v21

    aget v9, v31, v30

    .line 215
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 216
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 217
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 218
    aget v5, v32, v24

    aget v7, v32, v21

    aget v9, v32, v20

    aget v11, v32, v30

    .line 219
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 220
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 221
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/2addr v5, v1

    .line 222
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v3, v1

    :goto_43
    move v5, v10

    :goto_44
    if-nez v29, :cond_60

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v8, v1, :cond_60

    move v3, v5

    .line 223
    :cond_60
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    add-int/2addr v5, v1

    add-int/2addr v5, v3

    .line 224
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    and-int v3, v12, v17

    or-int v3, v22, v3

    shl-int/lit8 v5, v12, 0x10

    .line 225
    invoke-static {v1, v4, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    .line 226
    invoke-virtual {v0, v3, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v19, :cond_63

    .line 227
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v1, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    move/from16 v9, v21

    :goto_45
    if-ge v9, v6, :cond_63

    .line 228
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 229
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v11, 0x8

    if-eq v3, v11, :cond_61

    .line 230
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lyyds/ᛳᛳᛴᲇ;

    .line 231
    iget v3, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v15, -0x1

    if-ne v3, v15, :cond_62

    .line 232
    iget v8, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 233
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    iput v3, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 234
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 235
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    goto :goto_46

    :cond_61
    const/4 v15, -0x1

    :cond_62
    :goto_46
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    move/from16 v2, p1

    goto :goto_45

    :cond_63
    return-void
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᲀᛲᛳᲀ:Z

    .line 2
    .line 3
    return-void
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲈᛵᛷ:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "base aligned child index out of range (0, "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ")"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛳᲁᲁᲇ:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iput v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    .line 25
    .line 26
    iput v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛳᲁᲁᲇ:I

    .line 27
    .line 28
    :goto_0
    if-nez p1, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛳᛶᛵ:I

    .line 2
    .line 3
    return-void
.end method

.method public setGravity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    const v0, 0x800007

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const v0, 0x800003

    .line 12
    .line 13
    .line 14
    or-int/2addr p1, v0

    .line 15
    :cond_0
    and-int/lit8 v0, p1, 0x70

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x30

    .line 20
    .line 21
    :cond_1
    iput p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public setHorizontalGravity(I)V
    .locals 2

    .line 1
    const v0, 0x800007

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget v1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    const v0, -0x800008

    .line 11
    .line 12
    .line 13
    and-int/2addr v0, v1

    .line 14
    or-int/2addr p1, v0

    .line 15
    iput p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛷᲈᲈᲁ:Z

    .line 2
    .line 3
    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setShowDividers(I)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᛱᛲ:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᛱᛲ:I

    .line 9
    .line 10
    return-void
.end method

.method public setVerticalGravity(I)V
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0x70

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x70

    .line 6
    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    and-int/lit8 v0, v0, -0x71

    .line 10
    .line 11
    or-int/2addr p1, v0

    .line 12
    iput p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setWeightSum(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    iput p1, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛳᛶᲁ:F

    .line 7
    .line 8
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᛱᲈᲁ(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᛱᛲ:I

    .line 6
    .line 7
    and-int/2addr p0, v1

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    return v0

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᛱᛲ:I

    .line 17
    .line 18
    if-ne p1, v2, :cond_3

    .line 19
    .line 20
    and-int/lit8 p0, v3, 0x4

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_2
    return v0

    .line 26
    :cond_3
    and-int/lit8 v2, v3, 0x2

    .line 27
    .line 28
    if-eqz v2, :cond_5

    .line 29
    .line 30
    sub-int/2addr p1, v1

    .line 31
    :goto_0
    if-ltz p1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/16 v3, 0x8

    .line 42
    .line 43
    if-eq v2, v3, :cond_4

    .line 44
    .line 45
    return v1

    .line 46
    :cond_4
    add-int/lit8 p1, p1, -0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    return v0
.end method

.method public ᛲᛴᛳᛲ()Lyyds/ᛳᛳᛴᲇ;
    .locals 2

    .line 1
    iget p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    const/4 v0, -0x2

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lyyds/ᛳᛳᛴᲇ;

    .line 7
    .line 8
    invoke-direct {p0, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    if-ne p0, v1, :cond_1

    .line 14
    .line 15
    new-instance p0, Lyyds/ᛳᛳᛴᲇ;

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    invoke-direct {p0, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public ᛶᛷᛲᲁ(Landroid/view/ViewGroup$LayoutParams;)Lyyds/ᛳᛳᛴᲇ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛳᛳᛴᲇ;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ(ILandroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛳᛶᛵ:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    sub-int/2addr v2, v3

    .line 19
    iget v3, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛳᛶᛵ:I

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iget v3, p0, Lyyds/ᛶᲁᛲᲀ;->ᛳᲁᲁᲇ:I

    .line 23
    .line 24
    add-int/2addr v3, p1

    .line 25
    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public ᲇᲇᲇᛱ(Landroid/util/AttributeSet;)Lyyds/ᛳᛳᛴᲇ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛳᛳᛴᲇ;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final ᲇᲈᛵᛷ(ILandroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛳᛶᛵ:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    iget v2, p0, Lyyds/ᛶᲁᛲᲀ;->ᛱᛳᲇ:I

    .line 11
    .line 12
    add-int/2addr v2, p1

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sub-int/2addr v3, v4

    .line 22
    iget v4, p0, Lyyds/ᛶᲁᛲᲀ;->ᛶᛳᛶᛵ:I

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᛶᲁᛲᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
