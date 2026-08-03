.class public Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;
.super LYue/ۥ۟۟ۧ۟;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۥ:Landroid/content/Context;

.field public final ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

.field public ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

.field public ۥ۟۟۠ۨ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;Landroid/content/Context;LYue/ۥ۟۟ۧ۟$ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0,
            0x0
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    invoke-direct {p0}, LYue/ۥ۟۟ۧ۟;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroid/content/Context;

    iput-object p3, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    new-instance p1, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-direct {p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setDefaultShowAsAction(I)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setCallback(Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;)V

    return-void
.end method


# virtual methods
.method public onMenuItemSelected(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)Z
    .locals 0
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟۟۟(LYue/ۥ۟۟ۧ۟;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuModeChange(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V
    .locals 0
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥۣ۟۟۟()V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->ۥ۟۟۠()Z

    return-void
.end method

.method public ۥ()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v1, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;

    if-eq v1, p0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۢ:Z

    iget-boolean v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۡ:Z

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۡ(ZZZ)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iput-object p0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۦ:LYue/ۥ۟۟ۧ۟;

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    iput-object v1, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    invoke-interface {v0, p0}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟۟(LYue/ۥ۟۟ۧ۟;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦ۠(Z)V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v1, v1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->ۥ۟۟۠۟()V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v2, v1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v1, v1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۨ:Z

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iput-object v0, v1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;

    return-void
.end method

.method public ۥ۟()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    return-object v0
.end method

.method public ۥ۟۟۟()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۥۢ;

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Landroid/content/Context;

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۥۢ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟۟()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->stopDispatchingItemsChanged()V

    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-interface {v0, p0, v1}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->startDispatchingItemsChanged()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->startDispatchingItemsChanged()V

    throw v0
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->ۥ۟۟۠ۢ()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۦ(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public ۥ۟۟۟ۧ(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۟ۨ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۠۟(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠۠(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۠۠(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(Z)V
    .locals 1

    invoke-super {p0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۠ۡ(Z)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public ۥ۟۟۠ۢ()Z
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->stopDispatchingItemsChanged()V

    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-interface {v0, p0, v1}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->startDispatchingItemsChanged()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->startDispatchingItemsChanged()V

    throw v0
.end method

.method public ۥۣ۟۟۠(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Z)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۠ۤ(Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۠ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;)Z
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    return v1

    :cond_1
    new-instance v0, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟ۡ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    invoke-virtual {v2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, p1}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۦ()V

    return v1
.end method
