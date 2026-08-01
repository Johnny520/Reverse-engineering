.class public abstract Lc5;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public static α(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;
    .locals 0

    .line 1
    invoke-static {p0}, Lц;->μ(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static β(Ljava/lang/Object;Landroidx/appcompat/app/β;)Landroid/window/OnBackInvokedCallback;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1, p1}, Lb5;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lц;->ν(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0, v0}, Lц;->φ(Landroid/window/OnBackInvokedDispatcher;Lb5;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static γ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lц;->κ(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0}, Lц;->ν(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0, p1}, Lц;->χ(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
