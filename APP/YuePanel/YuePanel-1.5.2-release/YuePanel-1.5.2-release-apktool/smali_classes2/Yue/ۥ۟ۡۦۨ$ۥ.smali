.class public final LYue/ۥ۟ۡۦۨ$ۥ;
.super LYue/ۥ۟۟۠ۤ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۦۡۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۡۦۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
        "TE;>;",
        "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nArrayBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayBroadcastChannel.kt\nkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,385:1\n17#2:386\n17#2:388\n17#2:389\n1#3:387\n*S KotlinDebug\n*F\n+ 1 ArrayBroadcastChannel.kt\nkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber\n*L\n233#1:386\n283#1:388\n312#1:389\n*E\n"
.end annotation


# instance fields
.field private volatile synthetic _subHead:J
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e1\u06e6\u06e8<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۡۦۨ;)V
    .locals 2
    .param p1    # LYue/ۥ۟ۡۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e1\u06e6\u06e8<",
            "TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥ۟۟۠ۤ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    iput-object p1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->_subHead:J

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, p0, v1, v2}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤۢ(LYue/ۥ۟ۡۦۨ;LYue/ۥ۟ۡۦۨ$ۥ;LYue/ۥ۟ۡۦۨ$ۥ;ILjava/lang/Object;)V

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    invoke-static {v1}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟۟(LYue/ۥ۟ۡۦۨ;)J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۣ(J)V

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_0
    :goto_0
    return p1
.end method

.method public ۥ۟۟ۡۦ()Z
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should not be used"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۡۧ()Z
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should not be used"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥۣ۟۟ۨ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۤ()Z
    .locals 4

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۠()J

    move-result-wide v0

    iget-object v2, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    invoke-static {v2}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟۟(LYue/ۥ۟ۡۦۨ;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۤۤ()Ljava/lang/Object;
    .locals 8
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۢ()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LYue/ۥ۟ۥ;

    const/4 v3, 0x1

    if-nez v2, :cond_0

    sget-object v2, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۠()J

    move-result-wide v4

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    invoke-virtual {p0, v4, v5}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۣ(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v2, v3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    instance-of v0, v1, LYue/ۥ۟ۥ;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, LYue/ۥ۟ۥ;

    goto :goto_1

    :cond_1
    move-object v0, v4

    :goto_1
    if-eqz v0, :cond_2

    iget-object v0, v0, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    invoke-virtual {p0, v0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    :cond_2
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v3, v2

    :goto_2
    if-eqz v3, :cond_4

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    const/4 v2, 0x3

    invoke-static {v0, v4, v4, v2, v4}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤۢ(LYue/ۥ۟ۡۦۨ;LYue/ۥ۟ۡۦۨ$ۥ;LYue/ۥ۟ۡۦۨ$ۥ;ILjava/lang/Object;)V

    :cond_4
    return-object v1

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public ۥ۟۟ۤۥ(LYue/ۥۡۨ;)Ljava/lang/Object;
    .locals 8
    .param p1    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۢ()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LYue/ۥ۟ۥ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    sget-object v2, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    if-eq v1, v2, :cond_1

    invoke-interface {p1}, LYue/ۥۡۨ;->ۥ۟۟۠ۧ()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۠()J

    move-result-wide v4

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    invoke-virtual {p0, v4, v5}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۣ(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v4, v3

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    instance-of p1, v1, LYue/ۥ۟ۥ;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    move-object p1, v1

    check-cast p1, LYue/ۥ۟ۥ;

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_3

    iget-object p1, p1, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    :cond_3
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۟()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    move v3, v4

    :goto_2
    if-eqz v3, :cond_5

    iget-object p1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    const/4 v2, 0x3

    invoke-static {p1, v0, v0, v2, v0}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤۢ(LYue/ۥ۟ۡۦۨ;LYue/ۥ۟ۡۦۨ$ۥ;LYue/ۥ۟ۡۦۨ$ۥ;ILjava/lang/Object;)V

    :cond_5
    return-object v1

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final ۥ۟۟ۥ۟()Z
    .locals 8

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۡ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    iget-object v1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v1

    if-eqz v1, :cond_5

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۢ()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v3, :cond_0

    :goto_1
    iget-object v1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :cond_0
    :try_start_1
    instance-of v3, v1, LYue/ۥ۟ۥ;

    if-eqz v3, :cond_1

    move-object v2, v1

    check-cast v2, LYue/ۥ۟ۥ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    iget-object v1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :try_start_2
    invoke-virtual {p0}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟ۢۧ()LYue/ۥۡۦۡۢ;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    instance-of v4, v3, LYue/ۥ۟ۥ;

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v3, v1, v2}, LYue/ۥۡۦۡۢ;->ۥ۟۟۠ۤ(Ljava/lang/Object;LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۠()J

    move-result-wide v4

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    invoke-virtual {p0, v4, v5}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۣ(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    invoke-interface {v3, v1}, LYue/ۥۡۦۡۢ;->ۥ۟۟ۡۧ(Ljava/lang/Object;)V

    const/4 v0, 0x1

    goto :goto_0

    :goto_3
    iget-object v1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :cond_5
    :goto_4
    if-eqz v2, :cond_6

    iget-object v1, v2, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    invoke-virtual {p0, v1}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    :cond_6
    return v0
.end method

.method public final ۥ۟۟ۥ۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->_subHead:J

    return-wide v0
.end method

.method public final ۥ۟۟ۥۡ()Z
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۢ()LYue/ۥ۟ۥ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    invoke-virtual {v0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۢ()LYue/ۥ۟ۥ;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final ۥ۟۟ۥۢ()Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۠()J

    move-result-wide v0

    iget-object v2, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    invoke-virtual {v2}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۢ()LYue/ۥ۟ۥ;

    move-result-object v2

    iget-object v3, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    invoke-static {v3}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟۟(LYue/ۥ۟ۡۦۨ;)J

    move-result-wide v3

    cmp-long v3, v0, v3

    if-ltz v3, :cond_1

    if-nez v2, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۢ()LYue/ۥ۟ۥ;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    :cond_0
    return-object v2

    :cond_1
    iget-object v2, p0, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۦۨ;

    invoke-static {v2, v0, v1}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟(LYue/ۥ۟ۡۦۨ;J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۢ()LYue/ۥ۟ۥ;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    return-object v0
.end method

.method public final ۥ۟۟ۥۣ(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥ۟ۡۦۨ$ۥ;->_subHead:J

    return-void
.end method
