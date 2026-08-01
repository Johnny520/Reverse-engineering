.class public abstract L飘花落叶言子楪苏兰世哲/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪苏兰哲;
.implements L飘花落叶言子楪苏兰世哲/飘花落叶言子楪兰苏哲世;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public 飘花落叶言子楪哲苏兰世:Landroid/graphics/Rect;


# direct methods
.method public static 飘花落叶言子楪苏兰哲世(Landroid/widget/ListAdapter;Landroid/content/Context;I)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x0

    .line 15
    move v5, v0

    .line 16
    move v6, v5

    .line 17
    move-object v7, v4

    .line 18
    move-object v8, v7

    .line 19
    :goto_0
    if-ge v0, v3, :cond_4

    .line 20
    .line 21
    invoke-interface {p0, v0}, Landroid/widget/Adapter;->getItemViewType(I)I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    if-eq v9, v6, :cond_0

    .line 26
    .line 27
    move-object v8, v4

    .line 28
    move v6, v9

    .line 29
    :cond_0
    if-nez v7, :cond_1

    .line 30
    .line 31
    new-instance v7, Landroid/widget/FrameLayout;

    .line 32
    .line 33
    invoke-direct {v7, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-interface {p0, v0, v8, v7}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v8, v1, v2}, Landroid/view/View;->measure(II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-lt v9, p2, :cond_2

    .line 48
    .line 49
    return p2

    .line 50
    :cond_2
    if-le v9, v5, :cond_3

    .line 51
    .line 52
    move v5, v9

    .line 53
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    return v5
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/widget/ListAdapter;

    .line 6
    .line 7
    instance-of p2, p1, Landroid/widget/HeaderViewListAdapter;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    move-object p2, p1

    .line 12
    check-cast p2, Landroid/widget/HeaderViewListAdapter;

    .line 13
    .line 14
    invoke-virtual {p2}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏世哲兰;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p2, p1

    .line 22
    check-cast p2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏世哲兰;

    .line 23
    .line 24
    :goto_0
    iget-object p2, p2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;

    .line 25
    .line 26
    invoke-interface {p1, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroid/view/MenuItem;

    .line 31
    .line 32
    instance-of p3, p0, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    if-nez p3, :cond_1

    .line 35
    .line 36
    const/4 p3, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 p3, 0x4

    .line 39
    :goto_1
    invoke-virtual {p2, p1, p0, p3}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏(Landroid/view/MenuItem;L飘花落叶言子楪苏兰世哲/飘花落叶言子楪兰苏哲世;I)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public abstract setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
.end method

.method public final 飘花落叶言子楪世兰苏哲(L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏兰哲世;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Landroid/content/Context;L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract 飘花落叶言子楪哲世兰苏(Z)V
.end method

.method public abstract 飘花落叶言子楪哲世苏兰(Landroid/view/View;)V
.end method

.method public abstract 飘花落叶言子楪哲兰世苏(Z)V
.end method

.method public abstract 飘花落叶言子楪哲兰苏世(I)V
.end method

.method public abstract 飘花落叶言子楪哲苏世兰(I)V
.end method

.method public abstract 飘花落叶言子楪哲苏兰世(I)V
.end method

.method public abstract 飘花落叶言子楪苏兰世哲(L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;)V
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏兰哲世;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
