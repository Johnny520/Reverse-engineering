.class public final Lio/github/cherrywechat/application/MainApplication;
.super Landroid/app/Application;
.source ""


# static fields
.field public static a:Lio/github/cherrywechat/application/MainApplication;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate()V
    .locals 4

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    sput-object p0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    sget v0, Lq3;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    sput v1, Lq3;->b:I

    sget-object v0, Lq3;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lq3;->g:LO4;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, LI4;

    invoke-direct {v2, v1}, LI4;-><init>(LO4;)V

    :cond_0
    :goto_0
    invoke-virtual {v2}, LI4;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v2}, LI4;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq3;

    if-eqz v1, :cond_0

    check-cast v1, LE3;

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v3}, LE3;->m(ZZ)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_2
    sget-object v0, LWe;->a:[I

    new-instance v0, Lgf;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    new-instance v0, LVe;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
