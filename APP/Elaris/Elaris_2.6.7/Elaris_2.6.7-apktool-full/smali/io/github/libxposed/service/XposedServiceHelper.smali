.class public final Lio/github/libxposed/service/XposedServiceHelper;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "XposedServiceHelper"

.field private static final mCache:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/github/libxposed/service/XposedService;",
            ">;"
        }
    .end annotation
.end field

.field private static mListener:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/github/libxposed/service/XposedServiceHelper;->mCache:Ljava/util/Set;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lio/github/libxposed/service/XposedServiceHelper;->mListener:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lio/github/libxposed/service/XposedService;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/github/libxposed/service/XposedServiceHelper;->lambda$registerListener$1(Lio/github/libxposed/service/XposedService;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lio/github/libxposed/service/XposedService;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/github/libxposed/service/XposedServiceHelper;->lambda$onBinderReceived$0(Lio/github/libxposed/service/XposedService;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$onBinderReceived$0(Lio/github/libxposed/service/XposedService;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/libxposed/service/XposedServiceHelper;->mListener:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;->onServiceDied(Lio/github/libxposed/service/XposedService;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$registerListener$1(Lio/github/libxposed/service/XposedService;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/libxposed/service/XposedServiceHelper;->mListener:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;->onServiceDied(Lio/github/libxposed/service/XposedService;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static onBinderReceived(Landroid/os/IBinder;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    sget-object v0, Lio/github/libxposed/service/XposedServiceHelper;->mCache:Ljava/util/Set;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    new-instance v1, Lio/github/libxposed/service/XposedService;

    .line 8
    .line 9
    invoke-static {p0}, Lio/github/libxposed/service/IXposedService$Stub;->asInterface(Landroid/os/IBinder;)Lio/github/libxposed/service/IXposedService;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Lio/github/libxposed/service/XposedService;-><init>(Lio/github/libxposed/service/IXposedService;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Lio/github/libxposed/service/XposedServiceHelper;->mListener:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance v2, Lze;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {v2, v1, v3}, Lze;-><init>(Lio/github/libxposed/service/XposedService;I)V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-interface {p0, v2, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lio/github/libxposed/service/XposedServiceHelper;->mListener:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 37
    .line 38
    invoke-interface {p0, v1}, Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;->onServiceBind(Lio/github/libxposed/service/XposedService;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :goto_0
    :try_start_1
    const-string v1, "XposedServiceHelper"

    .line 43
    .line 44
    const-string v2, "onBinderReceived"

    .line 45
    .line 46
    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    :goto_1
    monitor-exit v0

    .line 50
    :goto_2
    return-void

    .line 51
    :catchall_1
    move-exception p0

    .line 52
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    throw p0
.end method

.method public static registerListener(Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;)V
    .locals 5

    .line 1
    sget-object v0, Lio/github/libxposed/service/XposedServiceHelper;->mCache:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sput-object p0, Lio/github/libxposed/service/XposedServiceHelper;->mListener:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lio/github/libxposed/service/XposedService;

    .line 27
    .line 28
    invoke-virtual {v1}, Lio/github/libxposed/service/XposedService;->asInterface()Lio/github/libxposed/service/IXposedService;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, Lze;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v3, v1, v4}, Lze;-><init>(Lio/github/libxposed/service/XposedService;I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v2, v3, v4}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 43
    .line 44
    .line 45
    sget-object v2, Lio/github/libxposed/service/XposedServiceHelper;->mListener:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 46
    .line 47
    invoke-interface {v2, v1}, Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;->onServiceBind(Lio/github/libxposed/service/XposedService;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    :try_start_2
    const-string v2, "XposedServiceHelper"

    .line 53
    .line 54
    const-string v3, "registerListener"

    .line 55
    .line 56
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_1
    move-exception p0

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    sget-object p0, Lio/github/libxposed/service/XposedServiceHelper;->mCache:Ljava/util/Set;

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Set;->clear()V

    .line 68
    .line 69
    .line 70
    :cond_1
    monitor-exit v0

    .line 71
    return-void

    .line 72
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    throw p0
.end method
