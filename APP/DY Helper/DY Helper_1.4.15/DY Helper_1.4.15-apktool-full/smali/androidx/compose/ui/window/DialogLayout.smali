.class final Landroidx/compose/ui/window/DialogLayout;
.super Landroidx/compose/ui/platform/AbstractComposeView;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lv41;


# virtual methods
.method public final getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final α(Lv80;I)V
    .locals 4

    .line 1
    const v0, 0x6770d814

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lv80;->Χ(I)Lv80;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lv80;->η(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p2

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v2, v1, :cond_1

    .line 22
    .line 23
    move v1, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_1
    and-int/2addr v0, v3

    .line 27
    invoke-virtual {p1, v0, v1}, Lv80;->Ξ(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {p1}, Lv80;->Ρ()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lv80;->π()Lbl1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    new-instance v0, Landroidx/compose/ui/window/α;

    .line 43
    .line 44
    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/window/α;-><init>(Landroidx/compose/ui/window/DialogLayout;I)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p1, Lbl1;->δ:Le80;

    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :cond_3
    const/4 p0, 0x0

    .line 51
    throw p0
.end method

.method public final ζ(ZIIII)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    sub-int/2addr p4, p2

    .line 28
    sub-int/2addr p5, p3

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    sub-int/2addr p4, p2

    .line 38
    sub-int/2addr p4, v1

    .line 39
    sub-int/2addr p5, p3

    .line 40
    sub-int/2addr p5, v2

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    div-int/lit8 p4, p4, 0x2

    .line 46
    .line 47
    add-int/2addr p4, v0

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    div-int/lit8 p5, p5, 0x2

    .line 53
    .line 54
    add-int/2addr p5, p0

    .line 55
    add-int/2addr p2, p4

    .line 56
    add-int/2addr p3, p5

    .line 57
    invoke-virtual {p1, p4, p5, p2, p3}, Landroid/view/View;->layout(IIII)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final η(Landroid/view/View;Loc2;)Loc2;
    .locals 5

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    sub-int/2addr v3, v4

    .line 31
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sub-int/2addr p0, v0

    .line 44
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    if-nez v3, :cond_0

    .line 53
    .line 54
    if-nez p0, :cond_0

    .line 55
    .line 56
    return-object p2

    .line 57
    :cond_0
    iget-object p1, p2, Loc2;->α:Llc2;

    .line 58
    .line 59
    invoke-virtual {p1, v1, v2, v3, p0}, Llc2;->ξ(IIII)Loc2;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public final θ(II)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Landroidx/compose/ui/platform/AbstractComposeView;->θ(II)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v5, 0x0

    .line 25
    const/high16 v6, -0x80000000

    .line 26
    .line 27
    if-eq v4, v6, :cond_a

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    add-int/2addr v8, v7

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    add-int/2addr v9, v7

    .line 47
    sub-int v7, v2, v8

    .line 48
    .line 49
    if-gez v7, :cond_1

    .line 50
    .line 51
    move v7, v0

    .line 52
    :cond_1
    sub-int v10, v3, v9

    .line 53
    .line 54
    if-gez v10, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move v0, v10

    .line 58
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-nez v10, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {v7, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    :goto_1
    if-nez v4, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    :goto_2
    invoke-virtual {v1, p1, p2}, Landroid/view/View;->measure(II)V

    .line 77
    .line 78
    .line 79
    const/high16 p1, 0x40000000    # 2.0f

    .line 80
    .line 81
    if-eq v10, v6, :cond_5

    .line 82
    .line 83
    if-eq v10, p1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    add-int v2, p2, v8

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    add-int/2addr p2, v8

    .line 97
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    :cond_6
    :goto_3
    if-eq v4, v6, :cond_8

    .line 102
    .line 103
    if-eq v4, p1, :cond_7

    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    add-int/2addr p1, v9

    .line 110
    goto :goto_4

    .line 111
    :cond_7
    move p1, v3

    .line 112
    goto :goto_4

    .line 113
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    add-int/2addr p1, v9

    .line 118
    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    :goto_4
    invoke-virtual {p0, v2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    add-int/2addr p0, v9

    .line 130
    if-gt p0, v3, :cond_9

    .line 131
    .line 132
    return-void

    .line 133
    :cond_9
    throw v5

    .line 134
    :cond_a
    throw v5
.end method
