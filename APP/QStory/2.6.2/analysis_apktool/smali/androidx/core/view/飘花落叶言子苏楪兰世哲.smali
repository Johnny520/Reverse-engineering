.class public abstract Landroidx/core/view/飘花落叶言子苏楪兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public static 飘花落叶言子楪世苏兰哲(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪苏世兰哲;)Landroidx/core/view/飘花落叶言子楪苏世兰哲;
    .locals 1

    .line 1
    iget-object v0, p1, Landroidx/core/view/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/core/view/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰()Landroid/view/ContentInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->performReceiveContent(Landroid/view/ContentInfo;)Landroid/view/ContentInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_0
    if-ne p0, v0, :cond_1

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    new-instance p1, Landroidx/core/view/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    new-instance v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Landroid/view/ContentInfo;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0}, Landroidx/core/view/飘花落叶言子楪苏世兰哲;-><init>(Landroidx/core/view/飘花落叶言子楪苏世哲兰;)V

    .line 29
    .line 30
    .line 31
    return-object p1
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/view/View;)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getReceiveContentMimeTypes()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
