.class public Landroidx/fragment/app/ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/fragment/app/\u06e5\u06df\u06df\u06df\u06e3$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:Landroidx/fragment/app/FragmentManager;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput-object p1, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public ۥ(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p3, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1, p2}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟(Landroidx/fragment/app/Fragment;Z)V
    .locals 4
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۦ()LYue/ۥ۠ۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۢۨ;->ۥ۟۟۟۠()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v3, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v2, v3, p1, v0}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p3, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1, p2}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟(Landroidx/fragment/app/Fragment;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟۟(Landroidx/fragment/app/Fragment;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟۟(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟۟(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟۠(Landroidx/fragment/app/Fragment;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟۠(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟۠(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroidx/fragment/app/Fragment;Z)V
    .locals 4
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۦ()LYue/ۥ۠ۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۢۨ;->ۥ۟۟۟۠()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟ۡ(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v3, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v2, v3, p1, v0}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟ۡ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟ۢ(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟ۢ(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p3, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1, p2}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟ۢ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥۣ۟۟۟(Landroidx/fragment/app/Fragment;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥۣ۟۟۟(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥۣ۟۟۟(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟ۤ(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟ۤ(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p3, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1, p2}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟ۤ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟ۥ(Landroidx/fragment/app/Fragment;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟ۥ(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟ۥ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟ۦ(Landroidx/fragment/app/Fragment;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟ۦ(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟ۦ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟ۧ(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, p3, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p4, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1, p2, p3}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟ۧ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۟ۨ(Landroidx/fragment/app/Fragment;Z)V
    .locals 3
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۨ()Landroidx/fragment/app/ۥۣ۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟۟۟ۨ(Landroidx/fragment/app/Fragment;Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    if-eqz p2, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ۟:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    iget-object v2, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v2, p1}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;->ۥ۟۟۟ۨ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public ۥ۟۟۠(Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;Z)V
    .locals 2
    .param p1    # Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    invoke-direct {v1, p1, p2}, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;-><init>(Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;Z)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟۠۟(Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;)V
    .locals 4
    .param p1    # Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;

    iget-object v3, v3, Landroidx/fragment/app/ۥۣ۟۟۟$ۥ;->ۥ:Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۧ;

    if-ne v3, p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/ۥۣ۟۟۟;->ۥ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
