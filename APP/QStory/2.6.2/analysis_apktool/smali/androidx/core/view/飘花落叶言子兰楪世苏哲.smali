.class public Landroidx/core/view/飘花落叶言子兰楪世苏哲;
.super Landroidx/core/view/飘花落叶言子兰楪苏世哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Landroid/view/Window;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子苏世哲兰楪;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/view/WindowInsetsController;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroidx/core/view/飘花落叶言子兰楪哲世苏;Landroidx/core/view/飘花落叶言子楪世兰哲苏;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世兰哲(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance p3, Landroidx/collection/飘花落叶言子苏世哲兰楪;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p3, v0}, Landroidx/collection/飘花落叶言子苏世哲兰楪;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子苏世哲兰楪;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世苏哲兰:Landroid/view/WindowInsetsController;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世哲苏兰:Landroid/view/Window;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public addOnControllableInsetsChangedListener(Landroidx/core/view/飘花落叶言子兰楪苏哲世;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Landroidx/core/view/飘花落叶言子世苏哲兰楪;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, v2}, Landroidx/core/view/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世苏哲兰:Landroid/view/WindowInsetsController;

    .line 20
    .line 21
    invoke-static {p0, v1}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪哲兰苏世(Landroid/view/WindowInsetsController;Landroidx/core/view/飘花落叶言子世苏哲兰楪;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public removeOnControllableInsetsChangedListener(Landroidx/core/view/飘花落叶言子兰楪苏哲世;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世苏哲兰:Landroid/view/WindowInsetsController;

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪哲兰世苏(Landroid/view/WindowInsetsController;Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(IIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世哲苏兰:Landroid/view/Window;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    or-int/2addr p1, p2

    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    not-int p1, p1

    .line 29
    and-int/2addr p1, p2

    .line 30
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世苏哲兰:Landroid/view/WindowInsetsController;

    .line 35
    .line 36
    if-eqz p3, :cond_2

    .line 37
    .line 38
    invoke-static {p0, p2, p2}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪哲苏兰世(Landroid/view/WindowInsetsController;II)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-static {p0, p2}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪哲苏世兰(Landroid/view/WindowInsetsController;I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public 飘花落叶言子楪世苏兰哲(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, p1}, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世哲苏兰(IIZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(Z)V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0, v0, p1}, Landroidx/core/view/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世哲苏兰(IIZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
