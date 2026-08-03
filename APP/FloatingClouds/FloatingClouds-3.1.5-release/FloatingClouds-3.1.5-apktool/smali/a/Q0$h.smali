.class public final La/Q0$h;
.super La/jh;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public b:La/uf$e;

.field public c:Z

.field public d:Z

.field public e:Z

.field public final synthetic f:La/Q0;


# direct methods
.method public constructor <init>(La/Q0;Landroid/view/Window$Callback;)V
    .locals 0

    iput-object p1, p0, La/Q0$h;->f:La/Q0;

    invoke-direct {p0, p2}, La/jh;-><init>(Landroid/view/Window$Callback;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/Window$Callback;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, La/Q0$h;->c:Z

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, La/Q0$h;->c:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, La/Q0$h;->c:Z

    throw p1
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    iget-boolean v0, p0, La/Q0$h;->d:Z

    iget-object v1, p0, La/jh;->a:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, La/Q0$h;->f:La/Q0;

    invoke-virtual {v0, p1}, La/Q0;->K(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    iget-object v0, p0, La/jh;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    iget-object v2, p0, La/Q0$h;->f:La/Q0;

    invoke-virtual {v2}, La/Q0;->Q()V

    iget-object v3, v2, La/Q0;->o:La/L;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v0, p1}, La/L;->i(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v2, La/Q0;->N:La/Q0$m;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-virtual {v2, v0, v3, p1}, La/Q0;->V(La/Q0$m;ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, v2, La/Q0;->N:La/Q0$m;

    if-eqz p1, :cond_3

    iput-boolean v1, p1, La/Q0$m;->l:Z

    return v1

    :cond_1
    iget-object v0, v2, La/Q0;->N:La/Q0$m;

    const/4 v3, 0x0

    if-nez v0, :cond_2

    invoke-virtual {v2, v3}, La/Q0;->P(I)La/Q0$m;

    move-result-object v0

    invoke-virtual {v2, v0, p1}, La/Q0;->W(La/Q0$m;Landroid/view/KeyEvent;)Z

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    invoke-virtual {v2, v0, v4, p1}, La/Q0;->V(La/Q0$m;ILandroid/view/KeyEvent;)Z

    move-result p1

    iput-boolean v3, v0, La/Q0$m;->k:Z

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    return v3

    :cond_3
    :goto_0
    return v1
.end method

.method public final onContentChanged()V
    .locals 1

    iget-boolean v0, p0, La/Q0$h;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, La/jh;->a:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    if-nez p1, :cond_0

    instance-of v0, p2, Landroidx/appcompat/view/menu/f;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, La/jh;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, La/Q0$h;->b:La/uf$e;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    new-instance v1, Landroid/view/View;

    iget-object v0, v0, La/uf$e;->a:La/uf;

    iget-object v0, v0, La/uf;->a:Landroidx/appcompat/widget/d;

    iget-object v0, v0, Landroidx/appcompat/widget/d;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, La/jh;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 2

    invoke-super {p0, p1, p2}, La/jh;->onMenuOpened(ILandroid/view/Menu;)Z

    const/16 p2, 0x6c

    const/4 v0, 0x1

    iget-object v1, p0, La/Q0$h;->f:La/Q0;

    if-ne p1, p2, :cond_0

    invoke-virtual {v1}, La/Q0;->Q()V

    iget-object p1, v1, La/Q0;->o:La/L;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, La/L;->c(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    iget-boolean v0, p0, La/Q0$h;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, La/jh;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, La/jh;->onPanelClosed(ILandroid/view/Menu;)V

    iget-object p2, p0, La/Q0$h;->f:La/Q0;

    const/16 v0, 0x6c

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    invoke-virtual {p2}, La/Q0;->Q()V

    iget-object p1, p2, La/Q0;->o:La/L;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v1}, La/L;->c(Z)V

    return-void

    :cond_1
    if-nez p1, :cond_3

    invoke-virtual {p2, p1}, La/Q0;->P(I)La/Q0$m;

    move-result-object p1

    iget-boolean v0, p1, La/Q0$m;->m:Z

    if-eqz v0, :cond_2

    invoke-virtual {p2, p1, v1}, La/Q0;->I(La/Q0$m;Z)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 5

    instance-of v0, p3, Landroidx/appcompat/view/menu/f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Landroidx/appcompat/view/menu/f;

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

    iput-boolean v2, v0, Landroidx/appcompat/view/menu/f;->x:Z

    :cond_2
    iget-object v3, p0, La/Q0$h;->b:La/uf$e;

    if-eqz v3, :cond_3

    if-nez p1, :cond_3

    iget-object v3, v3, La/uf$e;->a:La/uf;

    iget-boolean v4, v3, La/uf;->d:Z

    if-nez v4, :cond_3

    iget-object v4, v3, La/uf;->a:Landroidx/appcompat/widget/d;

    iput-boolean v2, v4, Landroidx/appcompat/widget/d;->l:Z

    iput-boolean v2, v3, La/uf;->d:Z

    :cond_3
    iget-object v2, p0, La/jh;->a:Landroid/view/Window$Callback;

    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz v0, :cond_4

    iput-boolean v1, v0, Landroidx/appcompat/view/menu/f;->x:Z

    :cond_4
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2
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

    const/4 v0, 0x0

    iget-object v1, p0, La/Q0$h;->f:La/Q0;

    invoke-virtual {v1, v0}, La/Q0;->P(I)La/Q0$m;

    move-result-object v0

    iget-object v0, v0, La/Q0$m;->h:Landroidx/appcompat/view/menu/f;

    if-eqz v0, :cond_0

    invoke-super {p0, p1, v0, p3}, La/jh;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, La/jh;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 6
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 2

    .line 1
    iget-object v0, p0, La/Q0$h;->f:La/Q0;

    iget-boolean v1, v0, La/Q0;->z:Z

    if-eqz v1, :cond_2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p2, La/Ge$a;

    iget-object v1, v0, La/Q0;->k:Landroid/content/Context;

    invoke-direct {p2, v1, p1}, La/Ge$a;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 3
    invoke-virtual {v0, p2}, La/Q0;->C(La/P$a;)La/P;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p2, p1}, La/Ge$a;->e(La/P;)La/Ge;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_2
    :goto_0
    iget-object v0, p0, La/jh;->a:Landroid/view/Window$Callback;

    invoke-static {v0, p1, p2}, La/jh$a;->b(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method
