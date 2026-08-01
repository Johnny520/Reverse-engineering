.class public final Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

.field public final 飘花落叶言子楪世兰苏哲:I

.field public 飘花落叶言子楪世哲兰苏:I

.field public 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/high16 p1, -0x80000000

    .line 14
    .line 15
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 16
    .line 17
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 21
    .line 22
    iput p2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世哲兰(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世哲兰(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世哲兰(II)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世哲兰(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 17
    .line 18
    iget-object v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 19
    .line 20
    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 25
    .line 26
    iget-boolean v0, v2, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪兰苏世哲:Z

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世兰楪苏哲:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪苏哲世兰(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->飘花落叶言子楪哲兰世苏:I

    .line 45
    .line 46
    const/4 v3, -0x1

    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    iget v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 50
    .line 51
    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->飘花落叶言子楪哲兰苏世:[I

    .line 52
    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 57
    .line 58
    aget v1, v0, v1

    .line 59
    .line 60
    :goto_0
    sub-int/2addr v2, v1

    .line 61
    iput v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-static {v0, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 17
    .line 18
    iget-object v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 19
    .line 20
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 25
    .line 26
    iget-boolean v1, v2, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪兰苏世哲:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世兰楪苏哲:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪苏哲世兰(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->飘花落叶言子楪哲兰世苏:I

    .line 45
    .line 46
    if-ne v2, v0, :cond_1

    .line 47
    .line 48
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 49
    .line 50
    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->飘花落叶言子楪哲兰苏世:[I

    .line 51
    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 57
    .line 58
    aget v1, v1, v2

    .line 59
    .line 60
    :goto_0
    add-int/2addr v0, v1

    .line 61
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;

    .line 6
    .line 7
    iput-object p0, v0, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    const/high16 v2, -0x80000000

    .line 15
    .line 16
    iput v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v3, 0x1

    .line 23
    if-ne v1, v3, :cond_0

    .line 24
    .line 25
    iput v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 26
    .line 27
    :cond_0
    iget-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isUpdated()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void

    .line 45
    :cond_2
    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 46
    .line 47
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 48
    .line 49
    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    add-int/2addr p1, v0

    .line 56
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 57
    .line 58
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;

    .line 6
    .line 7
    iput-object p0, v0, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v2, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/high16 v1, -0x80000000

    .line 16
    .line 17
    iput v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x1

    .line 24
    if-ne v2, v3, :cond_0

    .line 25
    .line 26
    iput v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 27
    .line 28
    :cond_0
    iget-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isUpdated()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void

    .line 46
    :cond_2
    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 49
    .line 50
    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    add-int/2addr p1, v0

    .line 57
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(I)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲()V

    .line 18
    .line 19
    .line 20
    iget p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 21
    .line 22
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(II)I
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世苏兰()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲世兰()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, -0x1

    .line 16
    const/4 v4, 0x1

    .line 17
    if-le p2, p1, :cond_0

    .line 18
    .line 19
    move v5, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v5, v3

    .line 22
    :goto_0
    if-eq p1, p2, :cond_5

    .line 23
    .line 24
    iget-object v6, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, Landroid/view/View;

    .line 31
    .line 32
    iget-object v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 33
    .line 34
    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    iget-object v8, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 39
    .line 40
    invoke-virtual {v8, v6}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    const/4 v9, 0x0

    .line 45
    if-gt v7, v2, :cond_1

    .line 46
    .line 47
    move v10, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v10, v9

    .line 50
    :goto_1
    if-lt v8, v1, :cond_2

    .line 51
    .line 52
    move v9, v4

    .line 53
    :cond_2
    if-eqz v10, :cond_4

    .line 54
    .line 55
    if-eqz v9, :cond_4

    .line 56
    .line 57
    if-lt v7, v1, :cond_3

    .line 58
    .line 59
    if-le v8, v2, :cond_4

    .line 60
    .line 61
    :cond_3
    invoke-static {v6}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0

    .line 66
    :cond_4
    add-int/2addr p1, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_5
    return v3
.end method

.method public final 飘花落叶言子楪苏兰世哲()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v2, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    iput-object v3, v2, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;

    .line 23
    .line 24
    iget-object v3, v2, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isUpdated()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    :cond_0
    iget v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 43
    .line 44
    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 45
    .line 46
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    sub-int/2addr v2, v0

    .line 51
    iput v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 52
    .line 53
    :cond_1
    const/high16 v0, -0x80000000

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    if-ne v1, v2, :cond_2

    .line 57
    .line 58
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 59
    .line 60
    :cond_2
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 61
    .line 62
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iput-object v3, v2, Landroidx/recyclerview/widget/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪兰世哲苏:Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/high16 v3, -0x80000000

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iput v3, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 28
    .line 29
    :cond_0
    iget-object v1, v2, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    iget-object v1, v2, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isUpdated()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    :cond_1
    iget v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 48
    .line 49
    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sub-int/2addr v1, v0

    .line 56
    iput v1, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 57
    .line 58
    :cond_2
    iput v3, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 59
    .line 60
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(II)Landroid/view/View;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-ne p2, v2, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, p2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Landroid/view/View;

    .line 21
    .line 22
    iget-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-static {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-le v4, p1, :cond_2

    .line 31
    .line 32
    :cond_0
    iget-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 33
    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    invoke-static {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-lt v4, p1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->hasFocusable()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    move-object v1, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    :goto_1
    return-object v1

    .line 54
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    add-int/lit8 p2, p2, -0x1

    .line 59
    .line 60
    :goto_2
    if-ltz p2, :cond_6

    .line 61
    .line 62
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Landroid/view/View;

    .line 67
    .line 68
    iget-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    invoke-static {v2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-ge v3, p1, :cond_6

    .line 77
    .line 78
    :cond_4
    iget-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 79
    .line 80
    if-nez v3, :cond_5

    .line 81
    .line 82
    invoke-static {v2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-gt v3, p1, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->hasFocusable()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    add-int/lit8 p2, p2, -0x1

    .line 96
    .line 97
    move-object v1, v2

    .line 98
    goto :goto_2

    .line 99
    :cond_6
    :goto_3
    return-object v1
.end method

.method public final 飘花落叶言子楪苏哲兰世(I)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰()V

    .line 18
    .line 19
    .line 20
    iget p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    return p0
.end method
