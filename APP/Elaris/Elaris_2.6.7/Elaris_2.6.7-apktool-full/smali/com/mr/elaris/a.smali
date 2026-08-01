.class public final Lcom/mr/elaris/a;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;


# virtual methods
.method public final onServiceBind(Lio/github/libxposed/service/XposedService;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/FrameworkActivationStatus;->c(Lio/github/libxposed/service/XposedService;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/mr/elaris/FrameworkActivationStatus;->d()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onServiceDied(Lio/github/libxposed/service/XposedService;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/mr/elaris/FrameworkActivationStatus;->b()Lio/github/libxposed/service/XposedService;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-static {p0}, Lcom/mr/elaris/FrameworkActivationStatus;->c(Lio/github/libxposed/service/XposedService;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lcom/mr/elaris/FrameworkActivationStatus;->d()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
