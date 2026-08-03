.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;
.super LYue/ۥۢۥۣۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06e0\u06df"
.end annotation


# instance fields
.field public ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:Z

.field public final synthetic ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟۟;Landroid/view/Window$Callback;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0, p2}, LYue/ۥۢۥۣۢ;-><init>(Landroid/view/Window$Callback;)V

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۦ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۥۣۢ;->ۥ()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥۦ(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-super {p0, p1}, LYue/ۥۢۥۣۢ;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-super {p0, p1}, LYue/ۥۢۥۣۢ;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۨ۟(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onContentChanged()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۥۣۢ;->ۥ()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    :cond_0
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    if-nez p1, :cond_0

    instance-of v0, p2, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۢۥۣۢ;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۥۣۢ;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥۢۥۣۢ;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {p2, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۨۢ(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۥۣۢ;->ۥ()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۢۥۣۢ;->onPanelClosed(ILandroid/view/Menu;)V

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {p2, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۨ(I)V

    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 4

    instance-of v0, p3, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0, v2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setOverrideVisibleItems(Z)V

    :cond_2
    iget-object v3, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;

    if-eqz v3, :cond_3

    invoke-interface {v3, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;->ۥ(I)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    move v2, v1

    :goto_1
    if-nez v2, :cond_4

    invoke-super {p0, p1, p2, p3}, LYue/ۥۢۥۣۢ;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    :cond_4
    if-eqz v0, :cond_5

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setOverrideVisibleItems(Z)V

    :cond_5
    return v2
.end method

.method public onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 3
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x18
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/KeyboardShortcutGroup;",
            ">;",
            "Landroid/view/Menu;",
            "I)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۦۨ(IZ)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ;->ۥ۟۟۟ۤ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    invoke-super {p0, p1, v0, p3}, LYue/ۥۢۥۣۢ;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2, p3}, LYue/ۥۢۥۣۢ;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    :goto_0
    return-void
.end method

.method public onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۡۥ()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۟۠(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, LYue/ۥۢۥۣۢ;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟(Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۦ:Z

    invoke-interface {p1, p2}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۦ:Z

    return p1

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۦ:Z

    throw p1
.end method

.method public ۥ۟۟(Landroid/view/Window$Callback;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Z

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Z

    throw p1
.end method

.method public ۥ۟۟۟(Landroid/view/Window$Callback;ILandroid/view/Menu;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:Z

    invoke-interface {p1, p2, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:Z

    throw p1
.end method

.method public ۥ۟۟۟۟(Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;)V
    .locals 0
    .param p1    # Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;

    return-void
.end method

.method public final ۥ۟۟۟۠(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۥ۠$ۥ;

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v1, v1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۢۤ:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LYue/ۥۢ۠ۥ۠$ۥ;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠۟;->ۥ۟۟۠ۨ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۤ۠(LYue/ۥ۟۟ۧ۟$ۥ;)LYue/ۥ۟۟ۧ۟;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟۟(LYue/ۥ۟۟ۧ۟;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
