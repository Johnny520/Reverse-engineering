.class public final Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟ۡ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟ۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    const/4 p1, 0x0

    return p1
.end method

.method public onMenuModeChange(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V
    .locals 4
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥۣ۟۟۟:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟()Z

    move-result v0

    const/16 v1, 0x6c

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Landroid/view/Window$Callback;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    :goto_0
    return-void
.end method
