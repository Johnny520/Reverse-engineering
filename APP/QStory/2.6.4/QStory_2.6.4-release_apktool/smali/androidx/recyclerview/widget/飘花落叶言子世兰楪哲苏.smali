.class public Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;
.super Landroidx/recyclerview/widget/飘花落叶言子苏世兰哲楪;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

.field public 飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子哲楪兰苏世;

.field public 飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰苏世;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪兰苏世;-><init>(Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子哲楪兰苏世;

    .line 10
    .line 11
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世苏兰()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世兰苏()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    div-int/lit8 v3, v3, 0x2

    .line 18
    .line 19
    add-int/2addr v3, v2

    .line 20
    const v2, 0x7fffffff

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    div-int/lit8 v7, v7, 0x2

    .line 39
    .line 40
    add-int/2addr v7, v6

    .line 41
    sub-int/2addr v7, v3

    .line 42
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-ge v6, v2, :cond_1

    .line 47
    .line 48
    move-object v1, v5

    .line 49
    move v2, v6

    .line 50
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-object v1
.end method

.method public static 飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;)I
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    div-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    add-int/2addr p0, v0

    .line 12
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世苏兰()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世兰苏()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    div-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    add-int/2addr p1, v0

    .line 23
    sub-int/2addr p0, p1

    .line 24
    return p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 8
    .line 9
    if-eq v0, p1, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;-><init>(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

    .line 18
    .line 19
    :cond_1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

    .line 20
    .line 21
    return-object p0
.end method

.method public 飘花落叶言子楪世兰苏哲(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1, p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p1, p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;Landroid/view/View;)[I
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p2, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    aput v1, v0, v2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    aput v2, v0, v2

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p2, p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    aput p0, v0, v3

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    aput v2, v0, v3

    .line 43
    .line 44
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子哲楪兰苏世;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeOnScrollListener(Landroidx/recyclerview/widget/飘花落叶言子苏哲楪兰世;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Landroidx/recyclerview/widget/飘花落叶言子苏世兰哲楪;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()Landroidx/recyclerview/widget/飘花落叶言子苏世兰哲楪;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/飘花落叶言子苏哲楪兰世;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Landroidx/recyclerview/widget/飘花落叶言子苏世兰哲楪;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Landroid/widget/Scroller;

    .line 40
    .line 41
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 48
    .line 49
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世兰哲()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string p0, "An instance of OnFlingListener already set."

    .line 60
    .line 61
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;Landroid/view/View;)[I

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    aget v2, v0, v1

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-nez v2, :cond_4

    .line 29
    .line 30
    aget v4, v0, v3

    .line 31
    .line 32
    if-eqz v4, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    :goto_0
    return-void

    .line 36
    :cond_4
    :goto_1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    aget v0, v0, v3

    .line 39
    .line 40
    invoke-virtual {p0, v2, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲兰世楪(IIZ)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 8
    .line 9
    if-eq v0, p1, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;-><init>(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

    .line 18
    .line 19
    :cond_1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰楪苏;

    .line 20
    .line 21
    return-object p0
.end method
