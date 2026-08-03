.class public final L۟/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object v0, L۟/s;->ۥ۟:L۟/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :goto_0
    sget-object v0, L۟/s;->ۥ۟:L۟/s;

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const-class v0, L۟/s;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, L۟/s;->ۥ۟:L۟/s;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, L۟/s;

    .line 16
    .line 17
    invoke-direct {v1}, L۟/s;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v1, L۟/s;->ۥ۟:L۟/s;

    .line 21
    .line 22
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    iget-object v0, v0, L۟/s;->ۥ:L۟/h1;

    .line 25
    .line 26
    iget-object v0, v0, L۟/h1;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p1
.end method
