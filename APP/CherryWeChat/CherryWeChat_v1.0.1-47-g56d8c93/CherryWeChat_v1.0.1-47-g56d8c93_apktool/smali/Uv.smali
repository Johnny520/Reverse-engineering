.class public abstract LUv;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/app/Activity;LOn;)V
    .locals 1

    instance-of v0, p0, LYn;

    if-eqz v0, :cond_0

    check-cast p0, LYn;

    invoke-interface {p0}, LYn;->getLifecycle()LRn;

    move-result-object p0

    instance-of v0, p0, Lao;

    if-eqz v0, :cond_0

    check-cast p0, Lao;

    invoke-virtual {p0, p1}, Lao;->e(LOn;)V

    :cond_0
    return-void
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    sget-object v0, LWv$a;->Companion:LVv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, LWv$a;

    invoke-direct {v0}, LWv$a;-><init>()V

    invoke-static {p0, v0}, LQ;->n(Landroid/app/Activity;LWv$a;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, LWv;

    invoke-direct {v2}, Landroid/app/Fragment;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_1
    return-void
.end method
