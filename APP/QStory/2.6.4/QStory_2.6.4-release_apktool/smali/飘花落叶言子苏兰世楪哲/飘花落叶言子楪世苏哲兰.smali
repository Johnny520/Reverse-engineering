.class public final L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子世楪苏哲兰:L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪兰哲世苏:I

.field public 飘花落叶言子楪兰哲苏世:I


# virtual methods
.method public getAllowsGoneWidget()Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-boolean p0, p0, L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏兰哲世楪:Z

    .line 4
    .line 5
    return p0
.end method

.method public getMargin()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲楪世苏兰:I

    .line 4
    .line 5
    return p0
.end method

.method public getType()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:I

    .line 2
    .line 3
    return p0
.end method

.method public setAllowsGoneWidget(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iput-boolean p1, p0, L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏兰哲世楪:Z

    .line 4
    .line 5
    return-void
.end method

.method public setDpMargin(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    int-to-float p1, p1

    .line 12
    mul-float/2addr p1, v0

    .line 13
    const/high16 v0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, v0

    .line 16
    float-to-int p1, p1

    .line 17
    iget-object p0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    iput p1, p0, L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲楪世苏兰:I

    .line 20
    .line 21
    return-void
.end method

.method public setMargin(I)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iput p1, p0, L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲楪世苏兰:I

    .line 4
    .line 5
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:I

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世兰苏哲;Z)V
    .locals 5

    .line 1
    iget v0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:I

    .line 2
    .line 3
    iput v0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x6

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x5

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    if-ne v0, v4, :cond_0

    .line 12
    .line 13
    iput v3, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-ne v0, v2, :cond_3

    .line 17
    .line 18
    iput v1, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-ne v0, v4, :cond_2

    .line 22
    .line 23
    iput v1, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    if-ne v0, v2, :cond_3

    .line 27
    .line 28
    iput v3, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:I

    .line 29
    .line 30
    :cond_3
    :goto_0
    instance-of p2, p1, L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;

    .line 31
    .line 32
    if-eqz p2, :cond_4

    .line 33
    .line 34
    check-cast p1, L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;

    .line 35
    .line 36
    iget p0, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:I

    .line 37
    .line 38
    iput p0, p1, L飘花落叶言子苏兰楪哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏兰哲楪世:I

    .line 39
    .line 40
    :cond_4
    return-void
.end method
