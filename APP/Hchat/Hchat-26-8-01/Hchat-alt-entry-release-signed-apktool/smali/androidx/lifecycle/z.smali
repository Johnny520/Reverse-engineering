.class public abstract Landroidx/lifecycle/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static a(Landroid/app/Activity;Landroidx/lifecycle/k;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Landroidx/lifecycle/q;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Landroidx/lifecycle/q;

    .line 9
    .line 10
    invoke-interface {p0}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/k;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
