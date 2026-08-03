.class public LYue/ۥۢ۟ۧۧ;
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


# instance fields
.field public ۥ۟۟۠ۥ:Landroid/content/Context;

.field public ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

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

.field public ۥ۟۟ۡ:Z

.field public ۥ۟۟ۡ۟:Z

.field public ۥ۟۟ۡ۠:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;LYue/ۥ۟۟ۧ۟$ۥ;Z)V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟۟ۧ۟;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۥ:Landroid/content/Context;

    iput-object p2, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    iput-object p3, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    new-instance p1, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setDefaultShowAsAction(I)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟ۡ۠:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setCallback(Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;)V

    iput-boolean p4, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟ۡ۟:Z

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

    iget-object p1, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    invoke-interface {p1, p0, p2}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟۟۟(LYue/ۥ۟۟ۧ۟;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMenuModeChange(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V
    .locals 0
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥۢ۟ۧۧ;->ۥۣ۟۟۟()V

    iget-object p1, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->ۥ۟۟۠()Z

    return-void
.end method

.method public ۥ()V
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟ۡ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟ۡ:Z

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    invoke-interface {v0, p0}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟۟(LYue/ۥ۟۟ۧ۟;)V

    return-void
.end method

.method public ۥ۟()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۨ:Ljava/lang/ref/WeakReference;

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

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟ۡ۠:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    return-object v0
.end method

.method public ۥ۟۟۟()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۥۢ;

    iget-object v1, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۥۢ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟۟()V
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    iget-object v1, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟ۡ۠:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-interface {v0, p0, v1}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z

    return-void
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->ۥ۟۟۠ۢ()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۥ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟ۡ۟:Z

    return v0
.end method

.method public ۥ۟۟۟ۦ(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۨ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public ۥ۟۟۟ۧ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۥ:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۟ۨ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۠۟(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۥ:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠۠(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۠۠(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(Z)V
    .locals 1

    invoke-super {p0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۠ۡ(Z)V

    iget-object v0, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public ۥ۟۟۠ۢ(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Z)V
    .locals 0

    return-void
.end method

.method public ۥۣ۟۟۠(Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۠ۤ(Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;)Z
    .locals 3

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    iget-object v2, p0, LYue/ۥۢ۟ۧۧ;->ۥ۟۟۠ۦ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, p1}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۦ()V

    return v1
.end method
