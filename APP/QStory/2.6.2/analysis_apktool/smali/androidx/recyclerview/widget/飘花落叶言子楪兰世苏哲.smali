.class public final Landroidx/recyclerview/widget/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    check-cast p2, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    iget-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    move v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v0

    .line 14
    :goto_0
    iget-object v3, p2, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    move v3, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v3, v0

    .line 21
    :goto_1
    if-eq v2, v3, :cond_2

    .line 22
    .line 23
    if-nez p0, :cond_3

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    iget-boolean p0, p1, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 27
    .line 28
    iget-boolean v2, p2, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 29
    .line 30
    if-eq p0, v2, :cond_5

    .line 31
    .line 32
    if-eqz p0, :cond_4

    .line 33
    .line 34
    :cond_3
    const/4 p0, -0x1

    .line 35
    return p0

    .line 36
    :cond_4
    :goto_2
    return v1

    .line 37
    :cond_5
    iget p0, p2, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 38
    .line 39
    iget v1, p1, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 40
    .line 41
    sub-int/2addr p0, v1

    .line 42
    if-eqz p0, :cond_6

    .line 43
    .line 44
    return p0

    .line 45
    :cond_6
    iget p0, p1, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 46
    .line 47
    iget p1, p2, Landroidx/recyclerview/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 48
    .line 49
    sub-int/2addr p0, p1

    .line 50
    if-eqz p0, :cond_7

    .line 51
    .line 52
    return p0

    .line 53
    :cond_7
    return v0
.end method
