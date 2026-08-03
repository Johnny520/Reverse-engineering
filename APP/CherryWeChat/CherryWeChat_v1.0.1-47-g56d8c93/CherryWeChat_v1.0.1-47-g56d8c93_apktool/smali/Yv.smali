.class public final LYv;
.super Landroid/app/Fragment;
.source ""


# instance fields
.field public a:LK0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    iget-object p1, p0, LYv;->a:LK0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    invoke-virtual {p1}, LK0;->a()V

    :cond_0
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object p1, p0, LYv;->a:LK0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LK0;->b()V

    :cond_0
    return-void
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroyView()V

    iget-object v0, p0, LYv;->a:LK0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LK0;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, LYv;->a:LK0;

    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, LYv;->a:LK0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LK0;->d()V

    :cond_0
    return-void
.end method
