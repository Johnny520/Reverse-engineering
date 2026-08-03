.class public Landroidx/appcompat/widget/ActionMenuView$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/widget/ActionMenuView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ActionMenuView;

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

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ActionMenuView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->ۥۣ۟۟ۡ:Landroidx/appcompat/widget/ActionMenuView$ۥ۟۟۟۟;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Landroidx/appcompat/widget/ActionMenuView$ۥ۟۟۟۟;->onMenuItemClick(Landroid/view/MenuItem;)Z

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

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->ۥ۟۟ۡ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;->onMenuModeChange(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V

    :cond_0
    return-void
.end method
