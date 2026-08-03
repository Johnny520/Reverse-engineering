.class public LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# static fields
.field public static ۥ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static ۥ۟:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/location/LocationManager;Ljava/lang/String;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
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
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

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

    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LYue/ۥ۠ۧۨۥ;

    invoke-direct {v0, p4}, LYue/ۥ۠ۧۨۥ;-><init>(LYue/ۥ۟ۧ۠ۧ;)V

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/location/LocationManager;->getCurrentLocation(Ljava/lang/String;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static ۥ۟(Landroid/location/LocationManager;Landroid/os/Handler;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟$ۥ;)Z
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        anyOf = {
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION"
        }
    .end annotation

    sget-object p1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, p3}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;

    invoke-direct {v0, p3}, LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;-><init>(LYue/ۥۣ۠ۦ۟$ۥ;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0, p2, v0}, Landroid/location/LocationManager;->registerGnssStatusCallback(Ljava/util/concurrent/Executor;Landroid/location/GnssStatus$Callback;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1, p3, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p1

    const/4 p0, 0x1

    return p0

    :cond_1
    monitor-exit p1

    const/4 p0, 0x0

    return p0

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟(Landroid/location/LocationManager;Ljava/lang/String;LYue/ۥ۠ۨ۠ۢ;Ljava/util/concurrent/Executor;LYue/ۥ۠ۧۨ۠;)Z
    .locals 6
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    :try_start_0
    sget-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "android.location.LocationRequest"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ:Ljava/lang/Class;

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ۟:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    const-class v0, Landroid/location/LocationManager;

    const-string v2, "requestLocationUpdates"

    sget-object v3, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ:Ljava/lang/Class;

    const-class v4, Ljava/util/concurrent/Executor;

    const-class v5, Landroid/location/LocationListener;

    filled-new-array {v3, v4, v5}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ۟:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_1
    invoke-virtual {p2, p1}, LYue/ۥ۠ۨ۠ۢ;->ۥۣ۟۟۟(Ljava/lang/String;)Landroid/location/LocationRequest;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object p2, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟;->ۥ۟:Ljava/lang/reflect/Method;

    filled-new-array {p1, p3, p4}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_2
    const/4 p0, 0x0

    return p0
.end method
