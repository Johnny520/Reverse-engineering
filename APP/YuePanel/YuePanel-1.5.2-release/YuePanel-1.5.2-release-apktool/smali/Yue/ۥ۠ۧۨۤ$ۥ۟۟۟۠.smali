.class public final LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# instance fields
.field public final ۥ:Landroid/location/LocationManager;

.field public final ۥ۟:Ljava/util/concurrent/Executor;

.field public final ۥ۟۟:Landroid/os/Handler;

.field public ۥ۟۟۟:LYue/ۥ۟ۧ۠ۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:Z
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "this"
    .end annotation
.end field

.field public ۥ۟۟۟۠:Ljava/lang/Runnable;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;LYue/ۥ۟ۧ۠ۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/LocationManager;",
            "Ljava/util/concurrent/Executor;",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ:Landroid/location/LocationManager;

    iput-object p2, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟:Landroid/os/Handler;

    iput-object p3, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۠ۧ;

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;)V
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۠()V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥ۟ۧ۠ۧ;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۟(LYue/ۥ۟ۧ۠ۧ;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥ۟ۧ۠ۧ;Landroid/location/Location;)V
    .locals 0

    invoke-interface {p0, p1}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 3
    .param p1    # Landroid/location/Location;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۟:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۟:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۠ۧ;

    iget-object v1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance v2, LYue/ۥ۠ۧۨۧ;

    invoke-direct {v2, v0, p1}, LYue/ۥ۠ۧۨۧ;-><init>(LYue/ۥ۟ۧ۠ۧ;Landroid/location/Location;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟()V
    .locals 1
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۟:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۟:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ۥ۟۟۟()V
    .locals 3
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۠ۧ;

    iget-object v1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ:Landroid/location/LocationManager;

    invoke-virtual {v1, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    iget-object v1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۠:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    iget-object v2, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۠:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method public final synthetic ۥ۟۟۟۠()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۠:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(J)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۟:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۧۨۦ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۧۨۦ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;)V

    iput-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟۠:Ljava/lang/Runnable;

    iget-object v1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟:Landroid/os/Handler;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
