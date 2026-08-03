.class public final LNc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lab;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lfw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lfw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LNc;->a:Landroid/content/Context;

    iput-object p2, p0, LNc;->b:Lfw;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, LNc;->a:Landroid/content/Context;

    invoke-static {v0}, Lwy;->b(Landroid/content/Context;)Lwy;

    move-result-object v0

    iget-object v1, p0, LNc;->b:Lfw;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-boolean v1, v0, Lwy;->b:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lwy;->c:Ljava/lang/Object;

    check-cast v1, LZd;

    iget-object v2, v1, LZd;->c:Ljava/lang/Object;

    check-cast v2, LBb;

    invoke-virtual {v2}, LBb;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    iget-object v1, v1, LZd;->d:Ljava/lang/Object;

    check-cast v1, Lvy;

    invoke-virtual {v2, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lwy;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final k()V
    .locals 6

    iget-object v0, p0, LNc;->a:Landroid/content/Context;

    invoke-static {v0}, Lwy;->b(Landroid/content/Context;)Lwy;

    move-result-object v0

    iget-object v1, p0, LNc;->b:Lfw;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-boolean v1, v0, Lwy;->b:Z

    if-nez v1, :cond_2

    iget-object v1, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lwy;->c:Ljava/lang/Object;

    check-cast v1, LZd;

    iget-object v2, v1, LZd;->c:Ljava/lang/Object;

    check-cast v2, LBb;

    invoke-virtual {v2}, LBb;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/ConnectivityManager;

    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    iput-boolean v3, v1, LZd;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, LBb;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    iget-object v1, v1, LZd;->d:Ljava/lang/Object;

    check-cast v1, Lvy;

    invoke-virtual {v2, v1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v4, v5

    :catch_0
    :try_start_2
    iput-boolean v4, v0, Lwy;->b:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method
