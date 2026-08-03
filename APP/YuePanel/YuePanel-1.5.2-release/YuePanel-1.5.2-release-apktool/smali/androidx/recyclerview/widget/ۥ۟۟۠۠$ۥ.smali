.class public final Landroidx/recyclerview/widget/ۥ۟۟۠۠$ۥ;
.super Landroidx/recyclerview/widget/ۥ۟۟۠۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroidx/recyclerview/widget/ۥ۟۟۠۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;Landroidx/recyclerview/widget/ۥ۟۟۠۠$ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getDecoratedRight(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public ۥ۟۟۟۟(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getDecoratedMeasuredWidth(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public ۥ۟۟۟۠(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getDecoratedMeasuredHeight(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public ۥ۟۟۟ۡ(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getDecoratedLeft(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public ۥ۟۟۟ۢ()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidth()I

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۟()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public ۥ۟۟۟ۤ()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingRight()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۦ()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidthMode()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۧ()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getHeightMode()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۨ()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingLeft()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public ۥ۟۟۠۠(Landroid/view/View;)I
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    return p1
.end method

.method public ۥ۟۟۠ۡ(Landroid/view/View;)I
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    return p1
.end method

.method public ۥ۟۟۠ۢ(Landroid/view/View;I)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/view/View;->offsetLeftAndRight(I)V

    return-void
.end method

.method public ۥۣ۟۟۠(I)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->offsetChildrenHorizontal(I)V

    return-void
.end method
