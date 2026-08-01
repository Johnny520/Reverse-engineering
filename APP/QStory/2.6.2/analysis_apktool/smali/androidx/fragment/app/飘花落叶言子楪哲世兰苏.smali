.class public final Landroidx/fragment/app/飘花落叶言子楪哲世兰苏;
.super L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰世哲苏()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世哲苏()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;

    .line 10
    .line 11
    iget-boolean p0, p0, Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪苏兰世:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final 飘花落叶言子楪哲兰世苏(I)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世哲苏()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪世苏兰:Landroid/app/Dialog;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method
