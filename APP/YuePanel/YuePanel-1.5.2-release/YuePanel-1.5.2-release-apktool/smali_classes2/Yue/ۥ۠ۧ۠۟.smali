.class public final LYue/ۥ۠ۧ۠۟;
.super LYue/ۥ۟ۧۦۨ;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements LYue/ۥ۟ۨۨ;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,107:1\n80#1,10:109\n80#1,10:119\n20#2:108\n20#2:129\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n66#1:109,10\n73#1:119,10\n56#1:108\n92#1:129\n*E\n"
.end annotation


# instance fields
.field private volatile runningWorkers:I

.field public final ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:I

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۟ۨۨ;

.field public final ۥ۟۟۠ۦ:LYue/ۥ۠ۨ۠ۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e7<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۨ;I)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۟ۧۦۨ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    iput p2, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۤ:I

    instance-of p2, p1, LYue/ۥ۟ۨۨ;

    if-eqz p2, :cond_0

    check-cast p1, LYue/ۥ۟ۨۨ;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, LYue/ۥ۟ۨۥۥ;->ۥ()LYue/ۥ۟ۨۨ;

    move-result-object p1

    :cond_1
    iput-object p1, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۨ;

    new-instance p1, LYue/ۥ۠ۨ۠ۧ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LYue/ۥ۠ۨ۠ۧ;-><init>(Z)V

    iput-object p1, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۨ۠ۧ;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p2}, LYue/ۥ۠ۧ۠۟;->ۥ۟۟ۧ۟(Ljava/lang/Runnable;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۧ۠۟;->ۥ۟۟ۧۡ()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۧ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    invoke-virtual {p1, p0, p0}, LYue/ۥ۟ۧۦۨ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public dispatchYield(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    invoke-virtual {p0, p2}, LYue/ۥ۠ۧ۠۟;->ۥ۟۟ۧ۟(Ljava/lang/Runnable;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۧ۠۟;->ۥ۟۟ۧۡ()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۧ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    invoke-virtual {p1, p0, p0}, LYue/ۥ۟ۧۦۨ;->dispatchYield(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public limitedParallelism(I)LYue/ۥ۟ۧۦۨ;
    .locals 1
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p1}, LYue/ۥ۠ۧ۠۠;->ۥ(I)V

    iget v0, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۤ:I

    if-lt p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥ۟ۧۦۨ;->limitedParallelism(I)LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    return-object p1
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :cond_0
    iget-object v2, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۨ۠ۧ;

    invoke-virtual {v2}, LYue/ۥ۠ۨ۠ۧ;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    if-eqz v2, :cond_1

    :try_start_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    sget-object v3, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    invoke-static {v3, v2}, LYue/ۥ۟ۧۧ۠;->ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    iget-object v2, p0, LYue/ۥ۠ۧ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    invoke-virtual {v2, p0}, LYue/ۥ۟ۧۦۨ;->isDispatchNeeded(LYue/ۥ۟ۧۦۥ;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۧ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    invoke-virtual {v0, p0, p0}, LYue/ۥ۟ۧۦۨ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    iget-object v1, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget v2, p0, LYue/ۥ۠ۧ۠۟;->runningWorkers:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, LYue/ۥ۠ۧ۠۟;->runningWorkers:I

    iget-object v2, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۨ۠ۧ;

    invoke-virtual {v2}, LYue/ۥ۠ۨ۠ۧ;->ۥ۟۟()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v2, :cond_2

    monitor-exit v1

    return-void

    :cond_2
    :try_start_2
    iget v2, p0, LYue/ۥ۠ۧ۠۟;->runningWorkers:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, LYue/ۥ۠ۧ۠۟;->runningWorkers:I

    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public ۥ۟۟ۡ۠(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated without replacement as an internal method never intended for public use"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۨ;

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۟ۨۨ;->ۥ۟۟ۡ۠(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;
    .locals 1
    .param p3    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۨ;

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥ۟ۨۨ;->ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V
    .locals 1
    .param p3    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۨ;

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۟ۨۨ;->ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V

    return-void
.end method

.method public final ۥ۟۟ۧ۟(Ljava/lang/Runnable;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۨ۠ۧ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨ۠ۧ;->ۥ(Ljava/lang/Object;)Z

    iget p1, p0, LYue/ۥ۠ۧ۠۟;->runningWorkers:I

    iget v0, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۤ:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟۟ۧ۠(Ljava/lang/Runnable;LYue/ۥۣ۠۠ۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧ۠۟;->ۥ۟۟ۧ۟(Ljava/lang/Runnable;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۧ۠۟;->ۥ۟۟ۧۡ()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final ۥ۟۟ۧۡ()Z
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LYue/ۥ۠ۧ۠۟;->runningWorkers:I

    iget v2, p0, LYue/ۥ۠ۧ۠۟;->ۥ۟۟۠ۤ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v1, v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    iget v1, p0, LYue/ۥ۠ۧ۠۟;->runningWorkers:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, LYue/ۥ۠ۧ۠۟;->runningWorkers:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
