.class public final LYue/ۥ۟ۢۨ;
.super LYue/ۥ۟۟۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e7<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۥ:Ljava/lang/Thread;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:LYue/ۥ۠ۡۡ۠;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;Ljava/lang/Thread;LYue/ۥ۠ۡۡ۠;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Thread;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۠ۡۡ۠;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, LYue/ۥ۟۟۠ۧ;-><init>(LYue/ۥ۟ۧۦۥ;ZZ)V

    iput-object p2, p0, LYue/ۥ۟ۢۨ;->ۥ۟۟۠ۥ:Ljava/lang/Thread;

    iput-object p3, p0, LYue/ۥ۟ۢۨ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۡ۠;

    return-void
.end method


# virtual methods
.method public ۥۣ۟۟ۢ(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۟ۢۨ;->ۥ۟۟۠ۥ:Ljava/lang/Thread;

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LYue/ۥ۟ۢۨ;->ۥ۟۟۠ۥ:Ljava/lang/Thread;

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟ۡ(Ljava/lang/Thread;)V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_1
    return-void
.end method

.method public ۥ۟۟ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۥ۟۠۠ۡ()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟()V

    :cond_0
    :try_start_0
    iget-object v0, p0, LYue/ۥ۟ۢۨ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۡ۠;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0, v2, v1, v3}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧۥ(LYue/ۥ۠ۡۡ۠;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, LYue/ۥ۟ۢۨ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۡ۠;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۨ()J

    move-result-wide v4

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_2
    const-wide v4, 0x7fffffffffffffffL

    :goto_1
    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟۟ۢ()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0, p0, v4, v5}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟(Ljava/lang/Object;J)V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_2

    :cond_3
    move-object v0, v3

    :goto_2
    if-nez v0, :cond_1

    invoke-static {p0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :cond_4
    :try_start_2
    iget-object v0, p0, LYue/ۥ۟ۢۨ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۡ۠;

    if-eqz v0, :cond_5

    invoke-static {v0, v2, v1, v3}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧ۠(LYue/ۥ۠ۡۡ۠;ZILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟ۢ()V

    :cond_6
    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۣ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۦ۠۠;->ۥ۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LYue/ۥ۟ۦۣۢ;

    if-eqz v1, :cond_7

    move-object v3, v0

    check-cast v3, LYue/ۥ۟ۦۣۢ;

    :cond_7
    if-nez v3, :cond_8

    return-object v0

    :cond_8
    iget-object v0, v3, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    throw v0

    :cond_9
    :try_start_3
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    invoke-virtual {p0, v0}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۥ(Ljava/lang/Throwable;)Z

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    :try_start_4
    iget-object v4, p0, LYue/ۥ۟ۢۨ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۡ۠;

    if-eqz v4, :cond_a

    invoke-static {v4, v2, v1, v3}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧ۠(LYue/ۥ۠ۡۡ۠;ZILjava/lang/Object;)V

    :cond_a
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_4
    invoke-static {}, LYue/ۥ۟۟ۢۨ;->ۥ۟()LYue/ۥ۟۟ۢۧ;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, LYue/ۥ۟۟ۢۧ;->ۥ۟۟۟ۢ()V

    :cond_b
    throw v0
.end method
