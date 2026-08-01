.class public Llin/xposed/hook/view/main/MainLayoutManager;
.super Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子世苏楪兰哲:I

.field public 飘花落叶言子世苏楪哲兰:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Llin/xposed/hook/view/main/MainLayoutManager;->飘花落叶言子世苏楪兰哲:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪兰哲苏()Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;
    .locals 1

    .line 1
    new-instance p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    const/4 v0, -0x2

    .line 4
    invoke-direct {p0, v0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子哲苏楪世兰(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 2

    .line 1
    iget p2, p0, Llin/xposed/hook/view/main/MainLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    add-int p3, p2, p1

    .line 4
    .line 5
    if-gez p3, :cond_0

    .line 6
    .line 7
    neg-int p2, p2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget p2, p0, Llin/xposed/hook/view/main/MainLayoutManager;->飘花落叶言子世苏楪兰哲:I

    .line 10
    .line 11
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪兰哲苏:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingBottom()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sub-int/2addr v0, v1

    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingTop()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-int/2addr v0, v1

    .line 23
    sub-int/2addr p2, v0

    .line 24
    if-le p3, p2, :cond_1

    .line 25
    .line 26
    iget p2, p0, Llin/xposed/hook/view/main/MainLayoutManager;->飘花落叶言子世苏楪兰哲:I

    .line 27
    .line 28
    iget p3, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪兰哲苏:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingBottom()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sub-int/2addr p3, v0

    .line 35
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingTop()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    sub-int/2addr p3, v0

    .line 40
    sub-int/2addr p2, p3

    .line 41
    iget p3, p0, Llin/xposed/hook/view/main/MainLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 42
    .line 43
    sub-int/2addr p2, p3

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move p2, p1

    .line 46
    :goto_0
    iget p3, p0, Llin/xposed/hook/view/main/MainLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 47
    .line 48
    add-int/2addr p3, p2

    .line 49
    iput p3, p0, Llin/xposed/hook/view/main/MainLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 50
    .line 51
    neg-int p2, p2

    .line 52
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏世楪哲兰(I)V

    .line 53
    .line 54
    .line 55
    return p1
.end method

.method public final 飘花落叶言子楪哲兰世苏()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子苏兰世哲楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V
    .locals 7

    .line 1
    const/4 p2, 0x0

    .line 2
    move v0, p2

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰楪哲苏()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge p2, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲兰苏(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏楪兰世哲(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世哲苏兰楪(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v0

    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 33
    .line 34
    iget-object v4, v4, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:Landroid/graphics/Rect;

    .line 35
    .line 36
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 37
    .line 38
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 39
    .line 40
    add-int/2addr v0, v6

    .line 41
    iget v6, v4, Landroid/graphics/Rect;->right:I

    .line 42
    .line 43
    sub-int/2addr v2, v6

    .line 44
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 45
    .line 46
    sub-int v4, v3, v4

    .line 47
    .line 48
    invoke-virtual {v1, v5, v0, v2, v4}, Landroid/view/View;->layout(IIII)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 p2, p2, 0x1

    .line 52
    .line 53
    move v0, v3

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪兰哲苏:I

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingBottom()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    sub-int/2addr p1, p2

    .line 62
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingTop()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    sub-int/2addr p1, p2

    .line 67
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, p0, Llin/xposed/hook/view/main/MainLayoutManager;->飘花落叶言子世苏楪兰哲:I

    .line 72
    .line 73
    return-void
.end method
