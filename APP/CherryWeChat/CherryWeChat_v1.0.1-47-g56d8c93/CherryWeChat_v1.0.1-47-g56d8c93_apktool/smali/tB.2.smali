.class public final LtB;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LrB;
.implements Ljr;


# instance fields
.field public final synthetic a:LuB;


# direct methods
.method public synthetic constructor <init>(LuB;)V
    .locals 0

    iput-object p1, p0, LtB;->a:LuB;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Llr;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public n(Llr;)V
    .locals 4

    iget-object v0, p0, LtB;->a:LuB;

    iget-object v1, v0, LuB;->b:Landroid/view/Window$Callback;

    iget-object v0, v0, LuB;->a:LwB;

    iget-object v0, v0, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->o()Z

    move-result v0

    const/16 v2, 0x6c

    if-eqz v0, :cond_0

    invoke-interface {v1, v2, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v3, 0x0

    invoke-interface {v1, v0, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    return-void
.end method
