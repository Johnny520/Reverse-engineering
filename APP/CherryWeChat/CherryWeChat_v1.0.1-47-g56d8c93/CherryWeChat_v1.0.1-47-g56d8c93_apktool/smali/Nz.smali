.class public final LNz;
.super Lhi;
.source ""


# instance fields
.field public T:LK0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhi;-><init>()V

    return-void
.end method


# virtual methods
.method public final l()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    iget-object v0, p0, LNz;->T:LK0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhi;->y()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    invoke-virtual {v0}, LK0;->a()V

    :cond_0
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhi;->C:Z

    iget-object p1, p0, LNz;->T:LK0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LK0;->b()V

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    iget-object v0, p0, LNz;->T:LK0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LK0;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, LNz;->T:LK0;

    :cond_0
    return-void
.end method

.method public final s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    iget-object v0, p0, LNz;->T:LK0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LK0;->d()V

    :cond_0
    return-void
.end method
