.class public final Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;
.super L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/core/content/飘花落叶言子楪世哲兰苏;
.implements Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;
.implements Landroidx/activity/飘花落叶言子世哲兰楪苏;
.implements L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰哲苏;
.implements Landroidx/fragment/app/飘花落叶言子世兰楪哲苏;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

.field public final 飘花落叶言子楪兰世苏哲:Landroid/os/Handler;

.field public final synthetic 飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

.field public final 飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/FragmentActivity;

.field public final 飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/FragmentActivity;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 12
    .line 13
    invoke-direct {v1}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世哲苏:Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/FragmentActivity;

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/FragmentActivity;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final addOnConfigurationChangedListener(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->addOnConfigurationChangedListener(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getOnBackPressedDispatcher()Landroidx/activity/飘花落叶言子世哲苏楪兰;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/飘花落叶言子世哲苏楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getSavedStateRegistry()L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getViewModelStore()Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final removeOnConfigurationChangedListener(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->removeOnConfigurationChangedListener(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onAttachFragment(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪兰世哲苏()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final 飘花落叶言子楪哲兰世苏(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
