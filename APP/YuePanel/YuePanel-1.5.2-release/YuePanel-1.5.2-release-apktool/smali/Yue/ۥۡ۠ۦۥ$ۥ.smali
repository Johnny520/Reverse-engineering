.class public LYue/ۥۡ۠ۦۥ$ۥ;
.super LYue/ۥ۟۟ۧ۠;
.source "SourceFile"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡ۠ۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ۟۟۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;

.field public final ۥ۟۟۟۠:Landroid/view/ActionProvider;

.field public final synthetic ۥ۟۟۟ۡ:LYue/ۥۡ۠ۦۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡ۠ۦۥ;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0,
            0x0
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۡ۠ۦۥ;

    invoke-direct {p0, p2}, LYue/ۥ۟۟ۧ۠;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۨ(LYue/ۥۡ۠ۦۥ$ۥ;)Landroid/view/ActionProvider;
    .locals 0

    iget-object p0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    return-object p0
.end method


# virtual methods
.method public onActionProviderVisibilityChanged(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LYue/ۥ۟۟ۧ۠$ۥ۟;->onActionProviderVisibilityChanged(Z)V

    :cond_0
    return-void
.end method

.method public ۥ۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->hasSubMenu()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->isVisible()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()Landroid/view/View;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onCreateActionView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onPerformDefaultAction()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۡ(Landroid/view/SubMenu;)V
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    iget-object v1, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۡ۠ۦۥ;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟۠(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V

    return-void
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->refreshVisibility()V

    return-void
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥ۟۟ۧ۠$ۥ۟;)V
    .locals 1

    iput-object p1, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟۠:Landroid/view/ActionProvider;

    if-eqz p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V

    return-void
.end method
