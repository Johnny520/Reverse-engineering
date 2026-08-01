.class final Lcom/mr/elaris/FrameworkActivationStatus;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final MAIN:Landroid/os/Handler;

.field static final QQ_PACKAGE:Ljava/lang/String; = "com.tencent.mobileqq"

.field private static final SERVICE_LISTENER:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

.field private static volatile sInitialized:Z

.field private static volatile sListener:Ljava/lang/Runnable;

.field private static volatile sService:Lio/github/libxposed/service/XposedService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->MAIN:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Lcom/mr/elaris/a;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->SERVICE_LISTENER:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic a()Ljava/lang/Runnable;
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->sListener:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static apiVersion()I
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->sService:Lio/github/libxposed/service/XposedService;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/github/libxposed/service/XposedService;->getApiVersion()I

    .line 8
    .line 9
    .line 10
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return v0

    .line 12
    :catchall_0
    return v1
.end method

.method public static bridge synthetic b()Lio/github/libxposed/service/XposedService;
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->sService:Lio/github/libxposed/service/XposedService;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic c(Lio/github/libxposed/service/XposedService;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/mr/elaris/FrameworkActivationStatus;->sService:Lio/github/libxposed/service/XposedService;

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic d()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/mr/elaris/FrameworkActivationStatus;->notifyChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static frameworkName()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->sService:Lio/github/libxposed/service/XposedService;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/github/libxposed/service/XposedService;->getFrameworkName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/mr/elaris/FrameworkActivationStatus;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    return-object v0

    .line 17
    :catchall_0
    return-object v1
.end method

.method public static frameworkVersion()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->sService:Lio/github/libxposed/service/XposedService;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/github/libxposed/service/XposedService;->getFrameworkVersion()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/mr/elaris/FrameworkActivationStatus;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    return-object v0

    .line 17
    :catchall_0
    return-object v1
.end method

.method public static init(Landroid/content/Context;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    sget-boolean v0, Lcom/mr/elaris/FrameworkActivationStatus;->sInitialized:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    const-string v0, "com.mr.elaris"

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, Lcom/mr/elaris/FrameworkActivationStatus;->SERVICE_LISTENER:Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;

    .line 22
    .line 23
    invoke-static {p0}, Lio/github/libxposed/service/XposedServiceHelper;->registerListener(Lio/github/libxposed/service/XposedServiceHelper$OnServiceListener;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    sput-boolean p0, Lcom/mr/elaris/FrameworkActivationStatus;->sInitialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public static isActiveForQq()Z
    .locals 3

    .line 1
    sget-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->sService:Lio/github/libxposed/service/XposedService;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/github/libxposed/service/XposedService;->getScope()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-string v2, "com.tencent.mobileqq"

    .line 14
    .line 15
    invoke-interface {v0, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :catchall_0
    :cond_1
    return v1
.end method

.method private static notifyChanged()V
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->sListener:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    sget-object v0, Lcom/mr/elaris/FrameworkActivationStatus;->MAIN:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v1, Lcom/mr/elaris/b;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    :catchall_0
    :goto_0
    return-void
.end method

.method private static safe(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method

.method public static setListener(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/mr/elaris/FrameworkActivationStatus;->sListener:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-void
.end method
