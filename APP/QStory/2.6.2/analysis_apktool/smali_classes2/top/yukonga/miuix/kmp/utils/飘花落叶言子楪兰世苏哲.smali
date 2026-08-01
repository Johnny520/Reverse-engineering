.class final Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰世苏哲;
.super Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Ltop/yukonga/miuix/kmp/utils/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;",
        "Ltop/yukonga/miuix/kmp/utils/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "miuix"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰世苏哲;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    add-int/2addr p0, v0

    .line 13
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "OverscrollElement(isVertical=true, nestedScrollToParent=true)"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V
    .locals 2

    .line 1
    check-cast p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    move p0, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p0, v1

    .line 15
    :goto_0
    iput-boolean v0, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪兰哲:Z

    .line 16
    .line 17
    iput-boolean v0, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏哲楪兰:Z

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    iget-boolean p0, p1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪哲苏世()V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏世兰哲楪:Landroidx/compose/ui/node/飘花落叶言子世楪哲苏兰;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
    .locals 0

    .line 1
    new-instance p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-direct {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
