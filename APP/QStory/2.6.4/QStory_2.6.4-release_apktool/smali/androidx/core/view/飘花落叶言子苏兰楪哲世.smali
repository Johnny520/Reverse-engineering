.class public final Landroidx/core/view/飘花落叶言子苏兰楪哲世;
.super Landroidx/core/view/飘花落叶言子苏兰哲楪世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

.field public static final 飘花落叶言子楪世兰苏哲:Landroid/view/animation/PathInterpolator;

.field public static final 飘花落叶言子楪苏世兰哲:Landroid/view/animation/AccelerateInterpolator;

.field public static final 飘花落叶言子楪苏世哲兰:Landroid/view/animation/DecelerateInterpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/view/animation/PathInterpolator;

    .line 2
    .line 3
    const v1, 0x3f8ccccd    # 1.1f

    .line 4
    .line 5
    .line 6
    const/high16 v2, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v3, v1, v3, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世兰苏哲:Landroid/view/animation/PathInterpolator;

    .line 13
    .line 14
    new-instance v0, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世兰哲苏:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 21
    .line 22
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 23
    .line 24
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 25
    .line 26
    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏世哲兰:Landroid/view/animation/DecelerateInterpolator;

    .line 30
    .line 31
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏世兰哲:Landroid/view/animation/AccelerateInterpolator;

    .line 37
    .line 38
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏兰哲世楪;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏兰世哲(Landroid/view/View;)Landroidx/core/view/飘花落叶言子苏哲世楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子苏哲楪世兰(Landroidx/core/view/飘花落叶言子苏兰哲世楪;)V

    .line 8
    .line 9
    .line 10
    iget v0, v0, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ge v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1, p1}, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世兰哲苏(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏兰哲世楪;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    return-void
.end method

.method public static 飘花落叶言子楪苏世兰哲(Landroid/view/View;Landroidx/core/view/飘花落叶言子哲兰世苏楪;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏兰世哲(Landroid/view/View;)Landroidx/core/view/飘花落叶言子苏哲世楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子苏哲世楪兰(Landroidx/core/view/飘花落叶言子哲兰世苏楪;Ljava/util/List;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget v0, v0, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Landroid/view/ViewGroup;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ge v0, v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, p1, p2}, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏世兰哲(Landroid/view/View;Landroidx/core/view/飘花落叶言子哲兰世苏楪;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :goto_1
    return-void
.end method

.method public static 飘花落叶言子楪苏世哲兰(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏兰哲世楪;Landroidx/core/view/飘花落叶言子哲兰世苏楪;Z)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏兰世哲(Landroid/view/View;)Landroidx/core/view/飘花落叶言子苏哲世楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iput-object p2, v0, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 9
    .line 10
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子苏哲楪兰世(Landroidx/core/view/飘花落叶言子苏兰哲世楪;)V

    .line 13
    .line 14
    .line 15
    iget p3, v0, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 16
    .line 17
    if-nez p3, :cond_0

    .line 18
    .line 19
    const/4 p3, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p3, v1

    .line 22
    :cond_1
    :goto_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    check-cast p0, Landroid/view/ViewGroup;

    .line 27
    .line 28
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ge v1, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, p1, p2, p3}, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏世哲兰(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏兰哲世楪;Landroidx/core/view/飘花落叶言子哲兰世苏楪;Z)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    return-void
.end method

.method public static 飘花落叶言子楪苏兰世哲(Landroid/view/View;)Landroidx/core/view/飘花落叶言子苏哲世楪兰;
    .locals 1

    .line 1
    const v0, 0x24090347

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Landroidx/core/view/飘花落叶言子苏兰楪世哲;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Landroidx/core/view/飘花落叶言子苏兰楪世哲;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏哲世楪兰;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static 飘花落叶言子楪苏哲世兰(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏兰哲世楪;Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏兰世哲(Landroid/view/View;)Landroidx/core/view/飘花落叶言子苏哲世楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子苏哲世兰楪(Landroidx/core/view/飘花落叶言子苏兰哲世楪;Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 8
    .line 9
    .line 10
    iget v0, v0, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ge v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1, p1, p2}, Landroidx/core/view/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏哲世兰(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏兰哲世楪;Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    return-void
.end method

.method public static 飘花落叶言子楪苏哲兰世(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    .line 1
    const v0, 0x2409033c

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
