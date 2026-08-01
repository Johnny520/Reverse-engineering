.class public final Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;
.super L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪哲兰苏()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final 飘花落叶言子世楪苏哲兰(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p1, "Fragment "

    .line 13
    .line 14
    const-string v0, " does not have a view"

    .line 15
    .line 16
    invoke-static {p0, p1, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method
