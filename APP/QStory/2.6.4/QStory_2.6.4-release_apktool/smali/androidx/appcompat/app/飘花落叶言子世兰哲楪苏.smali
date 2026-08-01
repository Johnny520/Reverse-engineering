.class public final Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;
.super Landroidx/appcompat/app/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Z

.field public 飘花落叶言子楪世兰苏哲:Z

.field public 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;

.field public final 飘花落叶言子楪世苏兰哲:Landroid/view/Window$Callback;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

.field public final 飘花落叶言子楪苏世兰哲:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroidx/appcompat/app/飘花落叶言子世苏楪哲兰;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 18
    .line 19
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;-><init>(Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 25
    .line 26
    invoke-direct {v2, p1, v1}, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 30
    .line 31
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iput-object p3, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Landroid/view/Window$Callback;

    .line 35
    .line 36
    iput-object p3, v2, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪苏兰世哲:Landroid/view/Window$Callback;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/飘花落叶言子兰苏世楪哲;)V

    .line 39
    .line 40
    .line 41
    iget-boolean p3, v2, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪苏世哲兰:Z

    .line 42
    .line 43
    if-nez p3, :cond_0

    .line 44
    .line 45
    iput-object p2, v2, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/CharSequence;

    .line 46
    .line 47
    iget v0, v2, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏兰哲:I

    .line 48
    .line 49
    and-int/lit8 v0, v0, 0x8

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    if-eqz p3, :cond_0

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1, p2}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;-><init>(Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public addOnMenuVisibilityListener(Landroidx/appcompat/app/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnMenuVisibilityListener(Landroidx/appcompat/app/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    sget-object v1, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 2
    .line 3
    iget p0, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰哲苏:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰哲苏:Z

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-gtz p1, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->飘花落叶言子苏楪兰哲世:Landroidx/appcompat/widget/飘花落叶言子兰苏楪世哲;

    .line 6
    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏兰哲世;->collapseActionView()Z

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_2
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/ActionMenuView;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->飘花落叶言子世苏兰楪哲:Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final 飘花落叶言子楪哲世兰苏(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 2
    .line 3
    iget-boolean v0, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪苏世哲兰:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget v1, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏兰哲:I

    .line 12
    .line 13
    and-int/lit8 v1, v1, 0x8

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p0, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪苏世哲兰:Z

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0, p1}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪哲苏兰世()Landroid/view/Menu;
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰苏哲:Z

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, p0, v2}, Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;-><init>(Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v1, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 19
    .line 20
    iput-object v0, v3, Landroidx/appcompat/widget/Toolbar;->飘花落叶言子苏世楪哲兰:Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 21
    .line 22
    iput-object v2, v3, Landroidx/appcompat/widget/Toolbar;->飘花落叶言子苏世楪兰哲:Landroidx/appcompat/app/飘花落叶言子世兰苏楪哲;

    .line 23
    .line 24
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/ActionMenuView;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    iput-object v0, v3, Landroidx/appcompat/widget/ActionMenuView;->飘花落叶言子世苏兰哲楪:Landroidx/appcompat/app/飘花落叶言子世兰苏哲楪;

    .line 29
    .line 30
    iput-object v2, v3, Landroidx/appcompat/widget/ActionMenuView;->飘花落叶言子世哲楪苏兰:L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏世兰哲;

    .line 31
    .line 32
    :cond_0
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰苏哲:Z

    .line 34
    .line 35
    :cond_1
    iget-object p0, v1, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子兰哲楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->飘花落叶言子楪兰苏世哲()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪苏兰哲世(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世()Landroid/view/Menu;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v0

    .line 25
    :goto_0
    invoke-interface {p0, v2}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p1, p2, v0}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_1
    return v0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏兰世哲()Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return v0
.end method
