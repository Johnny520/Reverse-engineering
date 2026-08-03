.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟۟ۧ۟$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e5"
.end annotation


# instance fields
.field public ۥ:LYue/ۥ۟۟ۧ۟$ۥ;

.field public final synthetic ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟۟;LYue/ۥ۟۟ۧ۟$ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ:LYue/ۥ۟۟ۧ۟$ۥ;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ:LYue/ۥ۟۟ۧ۟$ۥ;

    invoke-interface {v0, p1, p2}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۤ۟:Landroid/view/ViewGroup;

    invoke-static {v0}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ:LYue/ۥ۟۟ۧ۟$ۥ;

    invoke-interface {v0, p1, p2}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟(LYue/ۥ۟۟ۧ۟;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ:LYue/ۥ۟۟ۧ۟$ۥ;

    invoke-interface {v0, p1}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟۟(LYue/ۥ۟۟ۧ۟;)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۥ:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۢۥ:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۦ:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥۨ()V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, LYue/ۥۢۤۤۦ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥۢۤۦۦ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۢۤۦۦ;->ۥ۟(F)LYue/ۥۢۤۦۦ;

    move-result-object v0

    iput-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۧ:LYue/ۥۢۤۦۦ;

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۧ:LYue/ۥۢۤۦۦ;

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ$ۥ;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ$ۥ;-><init>(Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;)V

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۤ(LYue/ۥۢۤۦۨ;)LYue/ۥۢۤۦۦ;

    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۢۧ:LYue/ۥ۟ۡ۟ۦ;

    if-eqz v0, :cond_2

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣۣ۟۟:LYue/ۥ۟۟ۧ۟;

    invoke-interface {v0, p1}, LYue/ۥ۟ۡ۟ۦ;->onSupportActionModeFinished(LYue/ۥ۟۟ۧ۟;)V

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣۣ۟۟:LYue/ۥ۟۟ۧ۟;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۤ۟:Landroid/view/ViewGroup;

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۠۠()V

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥ۟۟ۧ۟;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۥ;->ۥ:LYue/ۥ۟۟ۧ۟$ۥ;

    invoke-interface {v0, p1, p2}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟۟۟(LYue/ۥ۟۟ۧ۟;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
