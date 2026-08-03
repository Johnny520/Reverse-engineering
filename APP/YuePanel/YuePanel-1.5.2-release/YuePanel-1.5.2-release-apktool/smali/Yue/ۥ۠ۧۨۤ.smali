.class public final LYue/ۥ۠ۧۨۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۧۨۤ$ۥ۟۟;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۟;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;,
        LYue/ۥ۠ۧۨۤ$ۥ;,
        LYue/ۥ۠ۧۨۤ$ۥ۟;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۢ;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۥ;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;,
        LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;,
        LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ:J = 0x7530L

.field public static final ۥ۟:J = 0x2710L

.field public static final ۥ۟۟:J = 0x5L

.field public static ۥ۟۟۟:Ljava/lang/reflect/Field;

.field public static ۥ۟۟۟۟:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static ۥ۟۟۟۠:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

.field public static final ۥ۟۟۟ۢ:Ljava/util/WeakHashMap;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "sLocationListeners"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "LYue/\u06e5\u06e0\u06e7\u06e8\u06e4$\u06e5\u06df\u06df\u06df\u06e6;",
            "Ljava/lang/ref/WeakReference<",
            "LYue/\u06e5\u06e0\u06e7\u06e8\u06e4$\u06e5\u06df\u06df\u06df\u06e7;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۢ:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۟ۧ۠ۧ;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨۤ;->ۥۣ۟۟۟(LYue/ۥ۟ۧ۠ۧ;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic ۥ۟(Landroid/location/LocationManager;LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۤ(Landroid/location/LocationManager;LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/location/LocationManager;Ljava/lang/String;LYue/ۥۣ۟ۨۧ;Ljava/util/concurrent/Executor;LYue/ۥ۟ۧ۠ۧ;)V
    .locals 0
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۨۧ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/LocationManager;",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06e7;",
            "Ljava/util/concurrent/Executor;",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LYue/ۥۣ۟ۨۧ;->ۥ۟()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/CancellationSignal;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟(Landroid/location/LocationManager;Ljava/lang/String;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public static ۥ۟۟۟(Landroid/location/LocationManager;Ljava/lang/String;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LYue/ۥ۟ۧ۠ۧ;)V
    .locals 8
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/CancellationSignal;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/LocationManager;",
            "Ljava/lang/String;",
            "Landroid/os/CancellationSignal;",
            "Ljava/util/concurrent/Executor;",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ(Landroid/location/LocationManager;Ljava/lang/String;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LYue/ۥ۟ۧ۠ۧ;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/os/CancellationSignal;->throwIfCanceled()V

    :cond_1
    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-static {v0}, LYue/ۥ۠ۧۨ;->ۥ۟۟(Landroid/location/Location;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x2710

    cmp-long v1, v1, v3

    if-gez v1, :cond_2

    new-instance p0, LYue/ۥ۠ۧۨۡ;

    invoke-direct {p0, p4, v0}, LYue/ۥ۠ۧۨۡ;-><init>(LYue/ۥ۟ۧ۠ۧ;Landroid/location/Location;)V

    invoke-interface {p3, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    new-instance v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;

    invoke-direct {v0, p0, p3, p4}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;-><init>(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;LYue/ۥ۟ۧ۠ۧ;)V

    const/4 v5, 0x0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v7

    const-wide/16 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v6, v0

    invoke-virtual/range {v1 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    if-eqz p2, :cond_3

    new-instance p0, LYue/ۥ۠ۧۨۢ;

    invoke-direct {p0, v0}, LYue/ۥ۠ۧۨۢ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;)V

    invoke-virtual {p2, p0}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    :cond_3
    const-wide/16 p0, 0x7530

    invoke-virtual {v0, p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۠;->ۥ۟۟۟ۡ(J)V

    return-void
.end method

.method public static ۥ۟۟۟۟(Landroid/location/LocationManager;)Ljava/lang/String;
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨۤ$ۥ۟۟;->ۥ(Landroid/location/LocationManager;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(Landroid/location/LocationManager;)I
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨۤ$ۥ۟۟;->ۥ۟(Landroid/location/LocationManager;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/location/LocationManager;Ljava/lang/String;)Z
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۟;->ۥ(Landroid/location/LocationManager;Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/location/LocationManager;->getAllProviders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_0
    return v1

    :catch_0
    return v0
.end method

.method public static ۥ۟۟۟ۢ(Landroid/location/LocationManager;)Z
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨۤ$ۥ۟۟;->ۥ۟۟(Landroid/location/LocationManager;)Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "network"

    invoke-virtual {p0, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "gps"

    invoke-virtual {p0, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static synthetic ۥۣ۟۟۟(LYue/ۥ۟ۧ۠ۧ;Landroid/location/Location;)V
    .locals 0

    invoke-interface {p0, p1}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۤ(Landroid/location/LocationManager;LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->addGpsStatusListener(Landroid/location/GpsStatus$Listener;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۥ(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;Landroid/os/Handler;)Z
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/location/GnssMeasurementsEvent$Callback;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Handler;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x18
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-le v0, v1, :cond_0

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟;->ۥ۟(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;Landroid/os/Handler;)Z

    move-result p0

    return p0

    :cond_0
    if-ne v0, v1, :cond_1

    invoke-static {p2}, LYue/ۥۣ۠ۡۢ;->ۥ(Landroid/os/Handler;)Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-static {p0, p2, p1}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۧ(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;Landroid/location/GnssMeasurementsEvent$Callback;)Z

    move-result p0

    return p0

    :cond_1
    sget-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;->ۥ۟:LYue/ۥۢ۟ۡ;

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p1}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۠ۤ(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;)V

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟;->ۥ۟(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;Landroid/os/Handler;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v0, p1, p1}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_2
    monitor-exit v0

    const/4 p0, 0x0

    return p0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۟ۦ(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;Landroid/location/GnssMeasurementsEvent$Callback;)Z
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/location/GnssMeasurementsEvent$Callback;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x18
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-le v0, v1, :cond_0

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۟;->ۥ۟(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;Landroid/location/GnssMeasurementsEvent$Callback;)Z

    move-result p0

    return p0

    :cond_0
    if-ne v0, v1, :cond_1

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۧ(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;Landroid/location/GnssMeasurementsEvent$Callback;)Z

    move-result p0

    return p0

    :cond_1
    sget-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;->ۥ۟:LYue/ۥۢ۟ۡ;

    monitor-enter v0

    :try_start_0
    new-instance v1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۢ;

    invoke-direct {v1, p2, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۢ;-><init>(Landroid/location/GnssMeasurementsEvent$Callback;Ljava/util/concurrent/Executor;)V

    invoke-static {p0, p2}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۠ۤ(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;)V

    invoke-static {p0, v1}, LYue/ۥ۠ۧۨۤ$ۥ۟;->ۥ(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v0, p2, v1}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_2
    monitor-exit v0

    const/4 p0, 0x0

    return p0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۟ۧ(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;Landroid/location/GnssMeasurementsEvent$Callback;)Z
    .locals 8
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/location/GnssMeasurementsEvent$Callback;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟۟:Ljava/lang/Class;

    if-nez v1, :cond_0

    const-string v1, "android.location.GnssRequest$Builder"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟۟:Ljava/lang/Class;

    :cond_0
    sget-object v1, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    sget-object v1, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟۟:Ljava/lang/Class;

    const-string v4, "build"

    invoke-virtual {v1, v4, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_1
    sget-object v1, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    if-nez v1, :cond_2

    const-class v1, Landroid/location/LocationManager;

    const-string v4, "registerGnssMeasurementsCallback"

    const-string v5, "android.location.GnssRequest"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ljava/util/concurrent/Executor;

    const-class v7, Landroid/location/GnssMeasurementsEvent$Callback;

    filled-new-array {v5, v6, v7}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_2
    sget-object v1, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    sget-object v4, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    sget-object v5, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟۟:Ljava/lang/Class;

    invoke-virtual {v5, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    filled-new-array {v3, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_3

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_3

    move v0, v2

    :catch_0
    :cond_3
    return v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public static ۥ۟۟۟ۨ(Landroid/location/LocationManager;LYue/ۥۣ۠ۦ۟$ۥ;Landroid/os/Handler;)Z
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۦ۟$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Handler;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p2}, LYue/ۥۣ۠ۡۢ;->ۥ(Landroid/os/Handler;)Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-static {p0, p2, p1}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۠۟(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z

    move-result p0

    return p0

    :cond_0
    new-instance v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۥ;

    invoke-direct {v0, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۥ;-><init>(Landroid/os/Handler;)V

    invoke-static {p0, v0, p1}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۠۟(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠(Landroid/location/LocationManager;Landroid/os/Handler;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z
    .locals 2
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ۟(Landroid/location/LocationManager;Landroid/os/Handler;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z

    move-result p0

    return p0

    :cond_0
    invoke-static {p0, p1, p2, p3}, LYue/ۥ۠ۧۨۤ$ۥ۟;->ۥ۟۟(Landroid/location/LocationManager;Landroid/os/Handler;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠۟(Landroid/location/LocationManager;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۦ۟$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, p2}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۠(Landroid/location/LocationManager;Landroid/os/Handler;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z

    move-result p0

    return p0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :cond_1
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-static {p0, v1, p1, p2}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۠(Landroid/location/LocationManager;Landroid/os/Handler;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠۠(Landroid/location/LocationManager;LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;)V
    .locals 3
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "sLocationListeners"
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۢ:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۡ()LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    move-result-object v1

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۨ()V

    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۠ۡ(Landroid/location/LocationManager;LYue/ۥ۠ۧۨ۠;)V
    .locals 6
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۧۨ۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۢ:Ljava/util/WeakHashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۡ()LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    move-result-object v4

    iget-object v5, v4, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    if-ne v5, p1, :cond_0

    if-nez v2, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    :goto_1
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۨ()V

    invoke-virtual {p0, v3}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    sget-object v3, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۢ:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    return-void

    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۠ۢ(Landroid/location/LocationManager;Ljava/lang/String;LYue/ۥ۠ۨ۠ۢ;LYue/ۥ۠ۧۨ۠;Landroid/os/Looper;)V
    .locals 8
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۠ۧۨ۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroid/os/Looper;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۢ()Landroid/location/LocationRequest;

    move-result-object p2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-static {v0}, LYue/ۥۣ۠ۡۢ;->ۥ(Landroid/os/Handler;)Ljava/util/concurrent/Executor;

    move-result-object p4

    invoke-static {p0, p1, p2, p4, p3}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۟;->ۥ۟۟(Landroid/location/LocationManager;Ljava/lang/String;Landroid/location/LocationRequest;Ljava/util/concurrent/Executor;Landroid/location/LocationListener;)V

    return-void

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥ۠ۧۨۤ$ۥ;->ۥ(Landroid/location/LocationManager;Ljava/lang/String;LYue/ۥ۠ۨ۠ۢ;LYue/ۥ۠ۧۨ۠;Landroid/os/Looper;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟()J

    move-result-wide v3

    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟()F

    move-result v5

    move-object v1, p0

    move-object v2, p1

    move-object v6, p3

    move-object v7, p4

    invoke-virtual/range {v1 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    return-void
.end method

.method public static ۥۣ۟۟۠(Landroid/location/LocationManager;Ljava/lang/String;LYue/ۥ۠ۨ۠ۢ;Ljava/util/concurrent/Executor;LYue/ۥ۠ۧۨ۠;)V
    .locals 8
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۠ۧۨ۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۢ()Landroid/location/LocationRequest;

    move-result-object p2

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟۟;->ۥ۟۟(Landroid/location/LocationManager;Ljava/lang/String;Landroid/location/LocationRequest;Ljava/util/concurrent/Executor;Landroid/location/LocationListener;)V

    return-void

    :cond_0
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ۟۟(Landroid/location/LocationManager;Ljava/lang/String;LYue/ۥ۠ۨ۠ۢ;Ljava/util/concurrent/Executor;LYue/ۥ۠ۧۨ۠;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;

    new-instance v1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    invoke-direct {v1, p1, p4}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;-><init>(Ljava/lang/String;LYue/ۥ۠ۧۨ۠;)V

    invoke-direct {v0, v1, p3}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;Ljava/util/concurrent/Executor;)V

    invoke-static {p0, p1, p2, v0}, LYue/ۥ۠ۧۨۤ$ۥ;->ۥ۟(Landroid/location/LocationManager;Ljava/lang/String;LYue/ۥ۠ۨ۠ۢ;LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;)Z

    move-result p3

    if-eqz p3, :cond_2

    return-void

    :cond_2
    sget-object p3, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۟ۢ:Ljava/util/WeakHashMap;

    monitor-enter p3

    :try_start_0
    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟()J

    move-result-wide v3

    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟()F

    move-result v5

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    move-object v6, v0

    invoke-virtual/range {v1 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    invoke-static {p0, v0}, LYue/ۥ۠ۧۨۤ;->ۥ۟۟۠۠(Landroid/location/LocationManager;LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;)V

    monitor-exit p3

    return-void

    :catchall_0
    move-exception p0

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۠ۤ(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;)V
    .locals 2
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/location/GnssMeasurementsEvent$Callback;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x18
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟;->ۥ۟۟۟(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;)V

    goto :goto_1

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;->ۥ۟:LYue/ۥۢ۟ۡ;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/GnssMeasurementsEvent$Callback;

    if-eqz p1, :cond_2

    instance-of v1, p1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۢ;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۢ;

    invoke-virtual {v1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟;->ۥ۟۟۟(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;)V

    :cond_2
    monitor-exit v0

    :goto_1
    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۠ۥ(Landroid/location/LocationManager;LYue/ۥۣ۠ۦ۟$ۥ;)V
    .locals 1
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۦ۟$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟;->ۥ۟۟۟۟(Landroid/location/LocationManager;Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
