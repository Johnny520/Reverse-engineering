.class public Landroidx/appcompat/widget/Toolbar$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/Toolbar;->ۥ۟۟۟۠()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemSelected(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)Z
    .locals 1
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->mMenuBuilderCallback:Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;->onMenuItemSelected(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onMenuModeChange(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V
    .locals 1
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->mMenuView:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->ۥ۟۟۠()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {v0, p1}, LYue/ۥۡ۠ۦۢ;->ۥ۟۟۟ۥ(Landroid/view/Menu;)V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->mMenuBuilderCallback:Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;->onMenuModeChange(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V

    :cond_1
    return-void
.end method
