.class public abstract LYue/ۥ۠ۦ۟ۥ;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;,
        LYue/ۥ۠ۦ۟ۥ$ۥ۟;,
        LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;,
        LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;,
        LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۡ;,
        LYue/ۥ۠ۦ۟ۥ$ۥ۟۟;,
        LYue/ۥ۠ۦ۟ۥ$ۥ;,
        LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۟;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final ۥ۟۟ۡ۟:Ljava/lang/String; = "JobIntentService"

.field public static final ۥ۟۟ۡ۠:Z

.field public static final ۥ۟۟ۡۡ:Ljava/lang/Object;

.field public static final ۥ۟۟ۡۢ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e5$\u06e5\u06df\u06df\u06df\u06e2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۥ$ۥ۟;

.field public ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;

.field public ۥ۟۟۠ۥ:LYue/ۥ۠ۦ۟ۥ$ۥ;

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:Z

.field public final ۥ۟۟ۡ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e5$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡۡ:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡۢ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۦ:Z

    iput-boolean v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۧ:Z

    iput-boolean v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۨ:Z

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ۥ۟۟(Landroid/content/Context;Landroid/content/ComponentName;ILandroid/content/Intent;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/ComponentName;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    if-eqz p3, :cond_0

    sget-object v0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡۡ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    invoke-static {p0, p1, v1, p2}, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۟۠(Landroid/content/Context;Landroid/content/ComponentName;ZI)LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;

    move-result-object p0

    invoke-virtual {p0, p2}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;->ۥ۟(I)V

    invoke-virtual {p0, p3}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;->ۥ(Landroid/content/Intent;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "work must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;I",
            "Landroid/content/Intent;",
            ")V"
        }
    .end annotation

    new-instance v0, Landroid/content/ComponentName;

    invoke-direct {v0, p0, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p0, v0, p2, p3}, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟(Landroid/content/Context;Landroid/content/ComponentName;ILandroid/content/Intent;)V

    return-void
.end method

.method public static ۥ۟۟۟۠(Landroid/content/Context;Landroid/content/ComponentName;ZI)LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;
    .locals 2

    sget-object v0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡۢ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;

    if-nez v1, :cond_1

    if-eqz p2, :cond_0

    new-instance v1, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۡ;

    invoke-direct {v1, p0, p1, p3}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۡ;-><init>(Landroid/content/Context;Landroid/content/ComponentName;I)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t be here without a job id"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-object v1
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۥ$ۥ۟;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LYue/ۥ۠ۦ۟ۥ$ۥ۟;->ۥ()Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;

    invoke-direct {v0, p0}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;-><init>(LYue/ۥ۠ۦ۟ۥ;)V

    iput-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۥ$ۥ۟;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۨ:Z

    iget-object v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;

    invoke-virtual {v1}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟()V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object p2, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    iget-object p2, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;

    invoke-virtual {p2}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟()V

    iget-object p2, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    new-instance v1, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    :goto_0
    invoke-direct {v1, p0, p1, p3}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟;-><init>(LYue/ۥ۠ۦ۟ۥ;Landroid/content/Intent;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۟۟(Z)V

    monitor-exit p2

    const/4 p1, 0x3

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    const/4 p1, 0x2

    return p1
.end method

.method public ۥ()LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۟;
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۥ$ۥ۟;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥ۠ۦ۟ۥ$ۥ۟;->ۥ۟()LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۟;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۟;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۥ۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۦ۟ۥ$ۥ;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۦ:Z

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۧ:Z

    invoke-virtual {p0}, LYue/ۥ۠ۦ۟ۥ;->ۥۣ۟۟۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟(Z)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۦ۟ۥ$ۥ;

    if-nez v0, :cond_1

    new-instance v0, LYue/ۥ۠ۦ۟ۥ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۦ۟ۥ$ۥ;-><init>(LYue/ۥ۠ۦ۟ۥ;)V

    iput-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۦ۟ۥ$ۥ;

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟()V

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۦ۟ۥ$ۥ;

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p1, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟ۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۧ:Z

    return v0
.end method

.method public abstract ۥ۟۟۟ۢ(Landroid/content/Intent;)V
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۦ۟ۥ$ۥ;

    iget-object v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۟۟(Z)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-boolean v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۨ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;

    invoke-virtual {v1}, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟()V

    :cond_1
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_2
    return-void
.end method

.method public ۥ۟۟۟ۥ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠ۦ۟ۥ;->ۥ۟۟۠ۦ:Z

    return-void
.end method
