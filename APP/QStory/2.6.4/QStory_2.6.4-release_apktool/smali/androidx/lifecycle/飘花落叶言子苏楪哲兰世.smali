.class public abstract Landroidx/lifecycle/飘花落叶言子苏楪哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static 飘花落叶言子楪世苏兰哲(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;->Companion:Landroidx/lifecycle/飘花落叶言子苏楪兰世哲;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {v0}, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Landroidx/core/view/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏兰世哲(Landroid/app/Activity;Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v2, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;

    .line 37
    .line 38
    invoke-direct {v2}, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 9
    .line 10
    invoke-interface {p0}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    instance-of v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
