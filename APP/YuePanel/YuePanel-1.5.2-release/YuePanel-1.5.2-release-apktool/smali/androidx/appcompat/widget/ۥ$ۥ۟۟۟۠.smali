.class public Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCloseMenu(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Z)V
    .locals 2
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    instance-of v0, p1, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getRootMenu()Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->close(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ;->ۥ۟۟۟۠()Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;->onCloseMenu(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Z)V

    :cond_1
    return-void
.end method

.method public ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)Z
    .locals 3
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;

    invoke-static {v0}, Landroidx/appcompat/widget/ۥ;->ۥ۟۟۟ۧ(Landroidx/appcompat/widget/ۥ;)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;

    move-object v2, p1

    check-cast v2, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    iput v2, v0, Landroidx/appcompat/widget/ۥ;->ۥۣ۟۟۟:I

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ;->ۥ۟۟۟۠()Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;->ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)Z

    move-result v1

    :cond_1
    return v1
.end method
