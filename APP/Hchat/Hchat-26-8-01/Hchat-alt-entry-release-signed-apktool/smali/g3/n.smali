.class public abstract Lg3/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static a(Landroid/view/View;)Lg3/r0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {v0, v1}, Lg3/r0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Lg3/r0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, Lg3/r0;->a:Lg3/n0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lg3/n0;->t(Lg3/r0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v1, p0}, Lg3/n0;->d(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method
