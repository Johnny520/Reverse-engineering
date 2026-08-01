.class public abstract L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public static final 飘花落叶言子楪世兰苏哲(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p0, v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroid/view/KeyEvent;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    return v0

    .line 13
    :cond_1
    const/4 p0, 0x2

    .line 14
    return p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroid/view/KeyEvent;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(I)J
    .locals 2

    .line 1
    int-to-long v0, p0

    .line 2
    const/16 p0, 0x20

    .line 3
    .line 4
    shl-long/2addr v0, p0

    .line 5
    sget p0, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏:I

    .line 6
    .line 7
    return-wide v0
.end method
