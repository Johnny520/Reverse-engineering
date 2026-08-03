.class public LWv;
.super Landroid/app/Fragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWv$a;
    }
.end annotation


# static fields
.field public static final synthetic b:I


# instance fields
.field public a:LXm;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOn;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, p1}, LUv;->a(Landroid/app/Activity;LOn;)V

    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, LOn;->ON_CREATE:LOn;

    invoke-virtual {p0, p1}, LWv;->a(LOn;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, LOn;->ON_DESTROY:LOn;

    invoke-virtual {p0, v0}, LWv;->a(LOn;)V

    const/4 v0, 0x0

    iput-object v0, p0, LWv;->a:LXm;

    return-void
.end method

.method public final onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, LOn;->ON_PAUSE:LOn;

    invoke-virtual {p0, v0}, LWv;->a(LOn;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, LWv;->a:LXm;

    if-eqz v0, :cond_0

    iget-object v0, v0, LXm;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-virtual {v0}, Landroidx/lifecycle/ProcessLifecycleOwner;->a()V

    :cond_0
    sget-object v0, LOn;->ON_RESUME:LOn;

    invoke-virtual {p0, v0}, LWv;->a(LOn;)V

    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, LWv;->a:LXm;

    if-eqz v0, :cond_0

    iget-object v0, v0, LXm;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    iget v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->a:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->a:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->d:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Lao;

    sget-object v2, LOn;->ON_START:LOn;

    invoke-virtual {v1, v2}, Lao;->e(LOn;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->d:Z

    :cond_0
    sget-object v0, LOn;->ON_START:LOn;

    invoke-virtual {p0, v0}, LWv;->a(LOn;)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, LOn;->ON_STOP:LOn;

    invoke-virtual {p0, v0}, LWv;->a(LOn;)V

    return-void
.end method
