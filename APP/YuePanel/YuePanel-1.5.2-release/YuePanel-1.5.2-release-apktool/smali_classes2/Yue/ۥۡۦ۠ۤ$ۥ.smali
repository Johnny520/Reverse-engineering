.class public final LYue/ۥۡۦ۠ۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣ۟ۦۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public volatile ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦ۠ۤ;LYue/ۥۣ۟ۦۧ;)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e6\u06e7;",
            ")V"
        }
    .end annotation

    const-string v0, "responseCallback"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۦۧ;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OkHttp "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟ۡ۠()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟(LYue/ۥۡۦ۠ۤ;)LYue/ۥۡۦ۠ۤ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۠ۤ()LYue/ۥۡۦۧ;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x1

    :try_start_2
    iget-object v5, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۦۧ;

    invoke-interface {v5, v1, v0}, LYue/ۥۣ۟ۦۧ;->ۥ۟(LYue/ۥۣ۟ۦۣ;LYue/ۥۡۦۧ;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۟ۦ()LYue/ۥۣۡۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣۡۢۨ;->ۥۣ۟۟()LYue/ۥ۠۟ۢۤ;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۢ(LYue/ۥۡۦ۠ۤ$ۥ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :catchall_1
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v4

    move-object v7, v4

    move v4, v0

    move-object v0, v7

    :goto_1
    :try_start_4
    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->cancel()V

    if-nez v4, :cond_0

    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "canceled due to "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v0}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iget-object v5, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۦۧ;

    invoke-interface {v5, v1, v4}, LYue/ۥۣ۟ۦۧ;->ۥ(LYue/ۥۣ۟ۦۣ;Ljava/io/IOException;)V

    goto :goto_2

    :catchall_3
    move-exception v0

    goto :goto_6

    :cond_0
    :goto_2
    throw v0

    :catch_1
    move-exception v4

    move-object v7, v4

    move v4, v0

    move-object v0, v7

    :goto_3
    if-eqz v4, :cond_1

    sget-object v4, LYue/ۥۡۤۡۢ;->ۥ:LYue/ۥۡۤۡۢ$ۥ;

    invoke-virtual {v4}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۡ()LYue/ۥۡۤۡۢ;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Callback failure for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۟(LYue/ۥۡۦ۠ۤ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    invoke-virtual {v4, v5, v6, v0}, LYue/ۥۡۤۡۢ;->ۥ۟۟۟ۧ(Ljava/lang/String;ILjava/lang/Throwable;)V

    goto :goto_4

    :cond_1
    iget-object v4, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۦۧ;

    invoke-interface {v4, v1, v0}, LYue/ۥۣ۟ۦۧ;->ۥ(LYue/ۥۣ۟ۦۣ;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_4
    :try_start_5
    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۟ۦ()LYue/ۥۣۡۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣۡۢۨ;->ۥۣ۟۟()LYue/ۥ۠۟ۢۤ;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :goto_5
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :goto_6
    :try_start_6
    invoke-virtual {v1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۟ۦ()LYue/ۥۣۡۢۨ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣۡۢۨ;->ۥۣ۟۟()LYue/ۥ۠۟ۢۤ;

    move-result-object v1

    invoke-virtual {v1, p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۢ(LYue/ۥۡۦ۠ۤ$ۥ;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_7
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ(Ljava/util/concurrent/ExecutorService;)V
    .locals 3
    .param p1    # Ljava/util/concurrent/ExecutorService;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "executorService"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۟ۦ()LYue/ۥۣۡۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣۡۢۨ;->ۥۣ۟۟()LYue/ۥ۠۟ۢۤ;

    move-result-object v0

    sget-boolean v1, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "executor rejected"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object p1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-virtual {p1, v0}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟ۡ۟(Ljava/io/IOException;)Ljava/io/IOException;

    iget-object p1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۦۧ;

    iget-object v1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-interface {p1, v1, v0}, LYue/ۥۣ۟ۦۧ;->ۥ(LYue/ۥۣ۟ۦۣ;Ljava/io/IOException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۟ۦ()LYue/ۥۣۡۢۨ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۣۡۢۨ;->ۥۣ۟۟()LYue/ۥ۠۟ۢۤ;

    move-result-object p1

    invoke-virtual {p1, p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۢ(LYue/ۥۡۦ۠ۤ$ۥ;)V

    :goto_1
    return-void

    :goto_2
    iget-object v0, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۟ۦ()LYue/ۥۣۡۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣۡۢۨ;->ۥۣ۟۟()LYue/ۥ۠۟ۢۤ;

    move-result-object v0

    invoke-virtual {v0, p0}, LYue/ۥ۠۟ۢۤ;->ۥ۟۟۟ۢ(LYue/ۥۡۦ۠ۤ$ۥ;)V

    throw p1
.end method

.method public final ۥ۟()LYue/ۥۡۦ۠ۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method public final ۥ۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۤ;->ۥۣ۟۟۠()LYue/ۥۡۦۤۧ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۡۤ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟۟()LYue/ۥۡۦۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۤ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۤ;->ۥۣ۟۟۠()LYue/ۥۡۦۤۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟۠(LYue/ۥۡۦ۠ۤ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۤ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, LYue/ۥۡۦ۠ۤ$ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method
