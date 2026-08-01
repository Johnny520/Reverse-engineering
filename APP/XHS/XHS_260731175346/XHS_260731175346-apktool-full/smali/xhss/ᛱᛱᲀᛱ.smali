.class public final Lxhss/ᛱᛱᲀᛱ;
.super Landroid/widget/ListView;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᛳᛶᛷ;


# instance fields
.field public ᛱᛱᛲᲇ:Z

.field public ᛷᛵᛵᲈ:Lxhss/ᛵᛷᛵᛱ;


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lxhss/ᛱᛱᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᛵᛱ;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lxhss/ᛵᛷᛵᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛸᛷᛱ;

    .line 15
    .line 16
    iget-object v1, v0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 17
    .line 18
    iget-object v1, v1, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, v0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛴᛲᛸ:F

    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public getBottomMenuListViewTouchEvent()Lxhss/ᲇᛳᛴᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛱᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᛵᛱ;

    .line 2
    .line 3
    return-object p0
.end method

.method public getScrollDistance()I
    .locals 2

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
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    neg-int v0, v0

    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    mul-int/2addr v1, p0

    .line 23
    add-int/2addr v1, v0

    .line 24
    return v1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᛱᛱᲀᛱ;->ᛱᛱᛲᲇ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᛱᛱᛲᲇ(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lxhss/ᛱᛱᲀᛱ;->ᛱᛱᛲᲇ:Z

    .line 2
    .line 3
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
