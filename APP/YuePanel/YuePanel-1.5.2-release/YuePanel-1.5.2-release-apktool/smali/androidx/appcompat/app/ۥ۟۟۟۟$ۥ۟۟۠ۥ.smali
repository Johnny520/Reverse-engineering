.class public final Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06e0\u06e5"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCloseMenu(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Z)V
    .locals 4
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getRootMenu()Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    if-eqz v2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v3, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۦ۠(Landroid/view/Menu;)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget v2, p1, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ;->ۥ:I

    invoke-virtual {p2, v2, p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥ(ILandroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ;Landroid/view/Menu;)V

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {p2, p1, v1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥۢ(Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ;Z)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥۢ(Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ;Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)Z
    .locals 2
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getRootMenu()Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-boolean v1, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۤۤ:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۧ۠()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-boolean v1, v1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥۤ:Z

    if-nez v1, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
