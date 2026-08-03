.class public final Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۤ;
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
    name = "\u06e5\u06df\u06df\u06df\u06e4"
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

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCloseMenu(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Z)V
    .locals 0
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {p2, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥ۟(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V

    return-void
.end method

.method public ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)Z
    .locals 2
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۧ۠()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
