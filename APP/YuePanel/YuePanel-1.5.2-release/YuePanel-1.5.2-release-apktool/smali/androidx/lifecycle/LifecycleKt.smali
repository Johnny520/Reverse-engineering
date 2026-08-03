.class public final Landroidx/lifecycle/LifecycleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "coroutineScope",
        "Landroidx/lifecycle/LifecycleCoroutineScope;",
        "Landroidx/lifecycle/Lifecycle;",
        "getCoroutineScope",
        "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;",
        "lifecycle-common"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getCoroutineScope(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;
    .locals 4
    .param p0    # Landroidx/lifecycle/Lifecycle;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/lifecycle/Lifecycle;->getInternalScopeRef()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, LYue/ۥۢ۠ۥ;->ۥ۟۟(LYue/ۥ۠ۦ۟ۡ;ILjava/lang/Object;)LYue/ۥ۟ۦۣ۟;

    move-result-object v1

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟۟()LYue/ۥ۠ۨۥۥ;

    move-result-object v3

    invoke-virtual {v3}, LYue/ۥ۠ۨۥۥ;->ۥ۟۟ۧ۟()LYue/ۥ۠ۨۥۥ;

    move-result-object v3

    invoke-interface {v1, v3}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;-><init>(Landroidx/lifecycle/Lifecycle;LYue/ۥ۟ۧۦۥ;)V

    invoke-virtual {p0}, Landroidx/lifecycle/Lifecycle;->getInternalScopeRef()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {v1, v2, v0}, LYue/ۥ۠ۧ۟ۨ;->ۥ(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;->register()V

    return-object v0
.end method
