.class public Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/adapter/FragmentStateAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FragmentMaxLifecycleEnforcer"
.end annotation


# instance fields
.field public ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

.field public ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

.field public ۥ۟۟:Landroidx/lifecycle/LifecycleEventObserver;

.field public ۥ۟۟۟:LYue/ۥۢۤۦۢ;

.field public ۥ۟۟۟۟:J

.field public final synthetic ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/adapter/FragmentStateAdapter;)V
    .locals 2

    iput-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۟:J

    return-void
.end method


# virtual methods
.method public final ۥ(Landroidx/recyclerview/widget/RecyclerView;)LYue/ۥۢۤۦۢ;
    .locals 3
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, LYue/ۥۢۤۦۢ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥۢۤۦۢ;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected ViewPager2 instance. Got: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ(Landroidx/recyclerview/widget/RecyclerView;)LYue/ۥۢۤۦۢ;

    move-result-object p1

    iput-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟:LYue/ۥۢۤۦۢ;

    new-instance p1, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ;

    invoke-direct {p1, p0}, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ;-><init>(Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;)V

    iput-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۨ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    new-instance p1, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ۟;

    invoke-direct {p1, p0}, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ۟;-><init>(Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;)V

    iput-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;)V

    new-instance p1, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;

    invoke-direct {p1, p0}, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;-><init>(Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;)V

    iput-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟:Landroidx/lifecycle/LifecycleEventObserver;

    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object v0, v0, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ:Landroidx/lifecycle/Lifecycle;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    return-void
.end method

.method public ۥ۟۟(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ(Landroidx/recyclerview/widget/RecyclerView;)LYue/ۥۢۤۦۢ;

    move-result-object p1

    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۧ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;)V

    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object p1, p1, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ:Landroidx/lifecycle/Lifecycle;

    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟:Landroidx/lifecycle/LifecycleEventObserver;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟:LYue/ۥۢۤۦۢ;

    return-void
.end method

.method public ۥ۟۟۟(Z)V
    .locals 8

    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    invoke-virtual {v0}, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟۠ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->getScrollState()I

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object v0, v0, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟ۨ()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_4

    :cond_2
    iget-object v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v1

    if-lt v0, v1, :cond_3

    return-void

    :cond_3
    iget-object v1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    invoke-virtual {v1, v0}, Landroidx/viewpager2/adapter/FragmentStateAdapter;->getItemId(I)J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۟:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_4

    if-nez p1, :cond_4

    return-void

    :cond_4
    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object p1, p1, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {p1, v0, v1}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟ۤ(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iput-wide v0, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۟:J

    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object p1, p1, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۤ()Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    :goto_0
    iget-object v3, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object v3, v3, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v3}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟ۡۢ()I

    move-result v3

    if-ge v2, v3, :cond_9

    iget-object v3, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object v3, v3, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v3, v2}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۠۟(I)J

    move-result-wide v3

    iget-object v5, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۠:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object v5, v5, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v5, v2}, LYue/ۥۣ۠ۨۢ;->ۥۣ۟۟ۡ(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/Fragment;

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v6, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۟:J

    cmp-long v6, v3, v6

    if-eqz v6, :cond_7

    sget-object v6, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {p1, v5, v6}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۢۢ(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;)Landroidx/fragment/app/ۥ۟۟۠۟;

    goto :goto_1

    :cond_7
    move-object v1, v5

    :goto_1
    iget-wide v6, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer;->ۥ۟۟۟۟:J

    cmp-long v3, v3, v6

    if-nez v3, :cond_8

    const/4 v3, 0x1

    goto :goto_2

    :cond_8
    move v3, v0

    :goto_2
    invoke-virtual {v5, v3}, Landroidx/fragment/app/Fragment;->setMenuVisibility(Z)V

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_9
    if-eqz v1, :cond_a

    sget-object v0, Landroidx/lifecycle/Lifecycle$State;->RESUMED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {p1, v1, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۢۢ(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;)Landroidx/fragment/app/ۥ۟۟۠۟;

    :cond_a
    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۡ۟()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۢ()V

    :cond_b
    :goto_4
    return-void
.end method
