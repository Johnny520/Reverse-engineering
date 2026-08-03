.class public final LYue/ۥ۟ۢ۟ۤ$ۥ۟;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢ۟ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Okio Watchdog"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :catch_0
    :cond_0
    :goto_0
    :try_start_0
    sget-object v0, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟۟:LYue/ۥ۟ۢ۟ۤ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ$ۥ;->ۥ۟۟۟۠()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ$ۥ;->ۥ۟۟()LYue/ۥ۟ۢ۟ۤ;

    move-result-object v0

    invoke-static {}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۟ۨ()LYue/ۥ۟ۢ۟ۤ;

    move-result-object v2

    if-ne v0, v2, :cond_1

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟۠ۥ(LYue/ۥ۟ۢ۟ۤ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :try_start_3
    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡۤ()V

    goto :goto_0

    :goto_1
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
.end method
