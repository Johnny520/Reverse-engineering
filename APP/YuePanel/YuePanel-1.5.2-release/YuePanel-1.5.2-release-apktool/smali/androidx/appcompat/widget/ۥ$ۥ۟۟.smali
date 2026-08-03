.class public Landroidx/appcompat/widget/ۥ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/appcompat/widget/ۥ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ;Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/widget/ۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/widget/ۥ;

    invoke-static {v0}, Landroidx/appcompat/widget/ۥ;->ۥ۟۟۟ۨ(Landroidx/appcompat/widget/ۥ;)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/widget/ۥ;

    invoke-static {v0}, Landroidx/appcompat/widget/ۥ;->ۥ۟۟۠(Landroidx/appcompat/widget/ۥ;)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->changeMenuMode()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/widget/ۥ;

    invoke-static {v0}, Landroidx/appcompat/widget/ۥ;->ۥ۟۟۠۟(Landroidx/appcompat/widget/ۥ;)Landroidx/appcompat/view/menu/ۥ۟۟۟ۥ;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/widget/ۥ;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;

    iput-object v1, v0, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۢۥ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroidx/appcompat/widget/ۥ;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۢۧ:Landroidx/appcompat/widget/ۥ$ۥ۟۟;

    return-void
.end method
