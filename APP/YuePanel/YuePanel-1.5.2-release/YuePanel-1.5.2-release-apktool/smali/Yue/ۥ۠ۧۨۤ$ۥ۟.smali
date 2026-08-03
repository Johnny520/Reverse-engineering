.class public LYue/ۥ۠ۧۨۤ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x18
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;)Z
    .locals 0
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/location/GnssMeasurementsEvent$Callback;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->registerGnssMeasurementsCallback(Landroid/location/GnssMeasurementsEvent$Callback;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;Landroid/os/Handler;)Z
    .locals 0
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
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/location/LocationManager;->registerGnssMeasurementsCallback(Landroid/location/GnssMeasurementsEvent$Callback;Landroid/os/Handler;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/location/LocationManager;Landroid/os/Handler;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z
    .locals 4
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, LYue/ۥۡۤۧ;->ۥ(Z)V

    sget-object v2, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2, p3}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

    if-nez v3, :cond_1

    new-instance v3, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

    invoke-direct {v3, p3}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;-><init>(LYue/ۥۣ۠ۦ۟$ۥ;)V

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۤ()V

    :goto_1
    invoke-virtual {v3, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥۣ۟۟۟(Ljava/util/concurrent/Executor;)V

    invoke-virtual {p0, v3, p1}, Landroid/location/LocationManager;->registerGnssStatusCallback(Landroid/location/GnssStatus$Callback;Landroid/os/Handler;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v2, p3, v3}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2

    return v1

    :cond_2
    monitor-exit v2

    return v0

    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۟(Landroid/location/LocationManager;Landroid/location/GnssMeasurementsEvent$Callback;)V
    .locals 0
    .param p0    # Landroid/location/LocationManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/location/GnssMeasurementsEvent$Callback;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->unregisterGnssMeasurementsCallback(Landroid/location/GnssMeasurementsEvent$Callback;)V

    return-void
.end method

.method public static ۥ۟۟۟۟(Landroid/location/LocationManager;Ljava/lang/Object;)V
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۤ()V

    :cond_0
    check-cast p1, Landroid/location/GnssStatus$Callback;

    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->unregisterGnssStatusCallback(Landroid/location/GnssStatus$Callback;)V

    return-void
.end method
