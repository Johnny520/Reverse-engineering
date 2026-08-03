.class public Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟;->ۥ۟۟(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/view/MenuItem;

.field public final synthetic ۥ۟۟۠ۥ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

.field public final synthetic ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟;Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;Landroid/view/MenuItem;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟;

    iput-object p2, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;

    iput-object p3, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroid/view/MenuItem;

    iput-object p4, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۥ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟;

    iget-object v1, v1, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟;

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroidx/appcompat/view/menu/ۥ۟;->ۥ۟۟ۢۧ:Z

    iget-object v0, v0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;->ۥ۟:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->close(Z)V

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟;

    iput-boolean v1, v0, Landroidx/appcompat/view/menu/ۥ۟;->ۥ۟۟ۢۧ:Z

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۥ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    iget-object v1, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroid/view/MenuItem;

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->performItemAction(Landroid/view/MenuItem;I)Z

    :cond_1
    return-void
.end method
