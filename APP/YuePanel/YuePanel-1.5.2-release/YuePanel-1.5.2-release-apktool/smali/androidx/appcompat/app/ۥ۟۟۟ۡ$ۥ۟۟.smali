.class public final Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Z

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;


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

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCloseMenu(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Z)V
    .locals 1
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean p2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟;->ۥۣ۟۟۠:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟;->ۥۣ۟۟۠:Z

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-object p2, p2, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥۣ۟۟۟:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p2}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۟ۥ()V

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-object p2, p2, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Landroid/view/Window$Callback;

    const/16 v0, 0x6c

    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟;->ۥۣ۟۟۠:Z

    return-void
.end method

.method public ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)Z
    .locals 2
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Landroid/view/Window$Callback;

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    const/4 p1, 0x1

    return p1
.end method
