.class public final L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;
.super Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪世兰苏子哲/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世兰苏哲:Landroidx/recyclerview/widget/RecyclerView;

.field public 飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪苏世兰哲:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪苏世哲兰:Z

.field public final 飘花落叶言子楪苏哲世兰:Z

.field public 飘花落叶言子楪苏哲兰世:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iput-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:Z

    .line 18
    .line 19
    iput-boolean v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Z

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "\n            TrailingLoadStateAdapter ->\n            [isLoadEndDisplay: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v2, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:Z

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, "],\n            [isAutoLoadMore: "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-boolean p0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Z

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "],\n            [preloadSize: 0],\n            [loadState: "

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, "]\n        "

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲楪苏兰(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(I)I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x240c0031

    .line 7
    .line 8
    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()I
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子楪兰世哲苏(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;)V
    .locals 5

    .line 1
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0, p1}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    iget-object v3, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3, v4, v2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰哲苏(II)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3, v4, v2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰苏哲(II)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    if-eqz v0, :cond_2

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    iput-object p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 47
    .line 48
    iget-object p0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    throw p0

    .line 66
    :cond_4
    :goto_1
    return-void
.end method

.method public final 飘花落叶言子楪兰世苏哲(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 5
    .line 6
    instance-of v1, p1, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    if-nez v1, :cond_3

    .line 9
    .line 10
    instance-of v1, p1, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p1, p1, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世哲兰苏;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    :cond_1
    iget-boolean p0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:Z

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public final 飘花落叶言子楪哲世兰苏(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 1

    .line 1
    iget-object p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p1, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    invoke-direct {p1, p2}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;-><init>(Landroid/view/ViewGroup;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p2, p0, v0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    new-instance p2, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p2, p0, v0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;I)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p1, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public final 飘花落叶言子楪哲苏兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 2

    .line 1
    iget-boolean p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Z

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    iget-object p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    iget-boolean v0, p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲世兰苏:Z

    .line 14
    .line 15
    if-nez v0, :cond_4

    .line 16
    .line 17
    iget v0, p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:I

    .line 18
    .line 19
    iget p1, p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰哲世:I

    .line 20
    .line 21
    if-ge v0, p1, :cond_4

    .line 22
    .line 23
    :cond_0
    iget-boolean p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Z

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 29
    .line 30
    instance-of v0, p1, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世哲兰苏;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    iget-boolean p1, p1, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 35
    .line 36
    if-nez p1, :cond_4

    .line 37
    .line 38
    iget-object p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世兰苏楪哲()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Z

    .line 51
    .line 52
    new-instance v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 53
    .line 54
    const/16 v1, 0x18

    .line 55
    .line 56
    invoke-direct {v0, p0, v1}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    sget-object p1, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 69
    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    iget-object p0, p0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;

    .line 75
    .line 76
    invoke-static {p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V
    .locals 5

    .line 1
    iget-object p0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    check-cast p1, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    iget-object p2, p1, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 6
    .line 7
    iget-object v0, p1, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Landroid/view/View;

    .line 8
    .line 9
    iget-object v1, p1, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/View;

    .line 10
    .line 11
    iget-object p1, p1, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of v2, p0, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世哲兰苏;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/16 v4, 0x8

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-boolean p0, p0, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    instance-of v2, p0, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    instance-of v2, p0, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    invoke-virtual {p2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    instance-of p0, p0, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世哲苏兰;

    .line 88
    .line 89
    if-eqz p0, :cond_4

    .line 90
    .line 91
    invoke-virtual {p2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    return-void
.end method
