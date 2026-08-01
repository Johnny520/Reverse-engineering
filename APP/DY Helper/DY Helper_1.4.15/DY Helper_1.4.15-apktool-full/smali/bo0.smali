.class public final Lbo0;
.super Landroid/app/job/JobServiceEngine;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroidx/core/app/JobIntentService;

.field public final β:Ljava/lang/Object;

.field public γ:Landroid/app/job/JobParameters;


# direct methods
.method public constructor <init>(Landroidx/core/app/JobIntentService;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/app/job/JobServiceEngine;-><init>(Landroid/app/Service;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbo0;->β:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lbo0;->α:Landroidx/core/app/JobIntentService;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    .line 1
    iput-object p1, p0, Lbo0;->γ:Landroid/app/job/JobParameters;

    .line 2
    .line 3
    iget-object p0, p0, Lbo0;->α:Landroidx/core/app/JobIntentService;

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/core/app/JobIntentService;->ζ:Lao0;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lao0;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lao0;-><init>(Landroidx/core/app/JobIntentService;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/core/app/JobIntentService;->ζ:Lao0;

    .line 15
    .line 16
    sget-object p0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    new-array v0, v0, [Ljava/lang/Void;

    .line 20
    .line 21
    invoke-virtual {p1, p0, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public final onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lbo0;->α:Landroidx/core/app/JobIntentService;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/core/app/JobIntentService;->ζ:Lao0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lbo0;->β:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    const/4 v0, 0x0

    .line 15
    :try_start_0
    iput-object v0, p0, Lbo0;->γ:Landroid/app/job/JobParameters;

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    monitor-exit p1

    .line 19
    return p0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
.end method
