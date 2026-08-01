.class public final Lio/github/libxposed/service/XposedService;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/libxposed/service/XposedService$ServiceException;,
        Lio/github/libxposed/service/XposedService$OnScopeEventListener;
    }
.end annotation


# static fields
.field public static final PROP_CAP_REMOTE:J = 0x2L

.field public static final PROP_CAP_SYSTEM:J = 0x1L

.field public static final PROP_RT_API_PROTECTION:J = 0x4L

.field private static final scopeCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lio/github/libxposed/service/XposedService$OnScopeEventListener;",
            "Lio/github/libxposed/service/IXposedScopeCallback;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mRemotePrefs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/github/libxposed/service/RemotePreferences;",
            ">;"
        }
    .end annotation
.end field

.field private final mService:Lio/github/libxposed/service/IXposedService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/github/libxposed/service/XposedService;->scopeCallbacks:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lio/github/libxposed/service/IXposedService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/github/libxposed/service/XposedService;->mRemotePrefs:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(Lio/github/libxposed/service/XposedService;Ljava/lang/String;)Lio/github/libxposed/service/RemotePreferences;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/github/libxposed/service/XposedService;->lambda$getRemotePreferences$0(Ljava/lang/String;)Lio/github/libxposed/service/RemotePreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic b()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lio/github/libxposed/service/XposedService;->scopeCallbacks:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method private synthetic lambda$getRemotePreferences$0(Ljava/lang/String;)Lio/github/libxposed/service/RemotePreferences;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lio/github/libxposed/service/RemotePreferences;->newInstance(Lio/github/libxposed/service/XposedService;Ljava/lang/String;)Lio/github/libxposed/service/RemotePreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v0, p1, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    throw p1

    .line 18
    :cond_0
    new-instance p1, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method


# virtual methods
.method public asInterface()Lio/github/libxposed/service/IXposedService;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    return-object p0
.end method

.method public deleteRemoteFile(Ljava/lang/String;)Z
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lio/github/libxposed/service/IXposedService;->deleteRemoteFile(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    check-cast p1, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    throw p1

    .line 20
    :cond_0
    new-instance p1, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public declared-synchronized deleteRemotePreferences(Ljava/lang/String;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/github/libxposed/service/XposedService;->mRemotePrefs:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lio/github/libxposed/service/RemotePreferences;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/github/libxposed/service/RemotePreferences;->onDelete()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_2

    .line 18
    :catch_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Lio/github/libxposed/service/IXposedService;->deleteRemotePreferences(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v1, v0, Ljava/lang/UnsupportedOperationException;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    check-cast v0, Ljava/lang/UnsupportedOperationException;

    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    new-instance v0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public getApiVersion()I
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getApiVersion()I

    .line 4
    .line 5
    .line 6
    move-result p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public getFrameworkName()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getFrameworkName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public getFrameworkProperties()J
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getFrameworkProperties()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-wide v0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public getFrameworkVersion()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getFrameworkVersion()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public getFrameworkVersionCode()J
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getFrameworkVersionCode()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-wide v0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public declared-synchronized getRemotePreferences(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/github/libxposed/service/XposedService;->mRemotePrefs:Ljava/util/Map;

    .line 3
    .line 4
    new-instance v1, Lye;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-direct {v1, v2, p0}, Lye;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-object p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method

.method public getScope()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->getScope()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public listRemoteFiles()[Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/service/IXposedService;->listRemoteFiles()[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance p0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 11
    .line 12
    const-string v0, "Framework returns null"

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    move-exception p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, v0, Ljava/lang/UnsupportedOperationException;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    check-cast v0, Ljava/lang/UnsupportedOperationException;

    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    new-instance v0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public openRemoteFile(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lio/github/libxposed/service/IXposedService;->openRemoteFile(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance p0, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 11
    .line 12
    const-string p1, "Framework returns null"

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    move-exception p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of v0, p1, Ljava/lang/UnsupportedOperationException;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    check-cast p1, Ljava/lang/UnsupportedOperationException;

    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    new-instance p1, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public removeScope(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lio/github/libxposed/service/IXposedService;->removeScope(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    new-instance p1, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public requestScope(Ljava/util/List;Lio/github/libxposed/service/XposedService$OnScopeEventListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/github/libxposed/service/XposedService$OnScopeEventListener;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p0, p0, Lio/github/libxposed/service/XposedService;->mService:Lio/github/libxposed/service/IXposedService;

    .line 2
    .line 3
    invoke-static {p2}, Lio/github/libxposed/service/XposedService$OnScopeEventListener;->b(Lio/github/libxposed/service/XposedService$OnScopeEventListener;)Lio/github/libxposed/service/IXposedScopeCallback;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p0, p1, p2}, Lio/github/libxposed/service/IXposedService;->requestScope(Ljava/util/List;Lio/github/libxposed/service/IXposedScopeCallback;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception p0

    .line 12
    new-instance p1, Lio/github/libxposed/service/XposedService$ServiceException;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Lio/github/libxposed/service/XposedService$ServiceException;-><init>(Landroid/os/RemoteException;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method
