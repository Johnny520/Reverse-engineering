.class public final LYue/ۥۢۡ۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۡ۟ۡ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۢۡ۟ۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:LYue/ۥۢ۠ۨۦ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e0\u06e8\u06e6;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۠:Z


# direct methods
.method public constructor <init>(LYue/ۥۢۡ۟ۢ;Ljava/lang/String;)V
    .locals 1
    .param p1    # LYue/ۥۢۡ۟ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    iput-object p2, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    return-void
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥۢۡ۟ۡ;Ljava/lang/String;JZLYue/ۥۣ۠۠ۨ;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_1

    const/4 p4, 0x1

    :cond_1
    const-string p6, "name"

    invoke-static {p1, p6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "block"

    invoke-static {p5, p6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p6, LYue/ۥۢۡ۟ۡ$ۥ۟;

    invoke-direct {p6, p1, p4, p5}, LYue/ۥۢۡ۟ۡ$ۥ۟;-><init>(Ljava/lang/String;ZLYue/ۥۣ۠۠ۨ;)V

    invoke-virtual {p0, p6, p2, p3}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V

    return-void
.end method

.method public static synthetic ۥ۟۟۠(LYue/ۥۢۡ۟ۡ;LYue/ۥۢ۠ۨۦ;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V

    return-void
.end method

.method public static synthetic ۥ۟۟۠۟(LYue/ۥۢۡ۟ۡ;Ljava/lang/String;JLYue/ۥۣ۠۠ۨ;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    const-string p5, "name"

    invoke-static {p1, p5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "block"

    invoke-static {p4, p5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p5, LYue/ۥۢۡ۟ۡ$ۥ۟۟;

    invoke-direct {p5, p1, p4}, LYue/ۥۢۡ۟ۡ$ۥ۟۟;-><init>(Ljava/lang/String;LYue/ۥۣ۠۠ۨ;)V

    invoke-virtual {p0, p5, p2, p3}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ()V
    .locals 3

    sget-boolean v0, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

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

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۢۡ۟ۡ;->ۥ۟()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    invoke-virtual {v1, p0}, LYue/ۥۢۡ۟ۢ;->ۥۣ۟۟۟(LYue/ۥۢۡ۟ۡ;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public final ۥ۟()Z
    .locals 5

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۨۦ;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥۢ۠ۨۦ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۠:Z

    :cond_0
    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v0, :cond_3

    iget-object v3, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۢ۠ۨۦ;

    invoke-virtual {v3}, LYue/ۥۢ۠ۨۦ;->ۥ()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v2, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢ۠ۨۦ;

    sget-object v3, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    invoke-virtual {v3}, LYue/ۥۢۡ۟ۢ$ۥ۟;->ۥ()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "canceled"

    invoke-static {v2, p0, v3}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    :cond_1
    iget-object v2, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v2, v1

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    return v2
.end method

.method public final ۥ۟۟(Ljava/lang/String;JZLYue/ۥۣ۠۠ۨ;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JZ",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p5, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢۡ۟ۡ$ۥ۟;

    invoke-direct {v0, p1, p4, p5}, LYue/ۥۢۡ۟ۡ$ۥ۟;-><init>(Ljava/lang/String;ZLYue/ۥۣ۠۠ۨ;)V

    invoke-virtual {p0, v0, p2, p3}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V

    return-void
.end method

.method public final ۥ۟۟۟۟()LYue/ۥۢ۠ۨۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۨۦ;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۠:Z

    return v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e0\u06e8\u06e6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()Ljava/util/List;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e0\u06e8\u06e6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-static {v1}, LYue/ۥ۟ۥۢ۠;->ۥ۟ۢ۠ۧ(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ۥ۟۟۟ۤ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟:Z

    return v0
.end method

.method public final ۥ۟۟۟ۥ()LYue/ۥۢۡ۟ۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ()Ljava/util/concurrent/CountDownLatch;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۨۦ;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۨۦ;

    instance-of v3, v1, LYue/ۥۢۡ۟ۡ$ۥ;

    if-eqz v3, :cond_1

    check-cast v1, LYue/ۥۢۡ۟ۡ$ۥ;

    invoke-virtual {v1}, LYue/ۥۢۡ۟ۡ$ۥ;->ۥۣ۟۟۟()Ljava/util/concurrent/CountDownLatch;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :cond_1
    :try_start_2
    iget-object v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۢ۠ۨۦ;

    instance-of v4, v3, LYue/ۥۢۡ۟ۡ$ۥ;

    if-eqz v4, :cond_2

    check-cast v3, LYue/ۥۢۡ۟ۡ$ۥ;

    invoke-virtual {v3}, LYue/ۥۢۡ۟ۡ$ۥ;->ۥۣ۟۟۟()Ljava/util/concurrent/CountDownLatch;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v1

    :cond_3
    :try_start_3
    new-instance v1, LYue/ۥۢۡ۟ۡ$ۥ;

    invoke-direct {v1}, LYue/ۥۢۡ۟ۡ$ۥ;-><init>()V

    const-wide/16 v3, 0x0

    invoke-virtual {p0, v1, v3, v4, v2}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۠۠(LYue/ۥۢ۠ۨۦ;JZ)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    invoke-virtual {v2, p0}, LYue/ۥۢۡ۟ۢ;->ۥۣ۟۟۟(LYue/ۥۢۡ۟ۡ;)V

    :cond_4
    invoke-virtual {v1}, LYue/ۥۢۡ۟ۡ$ۥ;->ۥۣ۟۟۟()Ljava/util/concurrent/CountDownLatch;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0

    throw v1
.end method

.method public final ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V
    .locals 2
    .param p1    # LYue/ۥۢ۠ۨۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "task"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟:Z

    if-eqz v1, :cond_3

    invoke-virtual {p1}, LYue/ۥۢ۠ۨۦ;->ۥ()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    invoke-virtual {p2}, LYue/ۥۢۡ۟ۢ$ۥ۟;->ۥ()Ljava/util/logging/Logger;

    move-result-object p2

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "schedule canceled (queue is shutdown)"

    invoke-static {p1, p0, p2}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    sget-object p2, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    invoke-virtual {p2}, LYue/ۥۢۡ۟ۢ$ۥ۟;->ۥ()Ljava/util/logging/Logger;

    move-result-object p2

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "schedule failed (queue is shutdown)"

    invoke-static {p1, p0, p2}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    :cond_2
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    invoke-direct {p1}, Ljava/util/concurrent/RejectedExecutionException;-><init>()V

    throw p1

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۠۠(LYue/ۥۢ۠ۨۦ;JZ)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    invoke-virtual {p1, p0}, LYue/ۥۢۡ۟ۢ;->ۥۣ۟۟۟(LYue/ۥۢۡ۟ۡ;)V

    :cond_4
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final ۥ۟۟۟ۨ(Ljava/lang/String;JLYue/ۥۣ۠۠ۨ;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢۡ۟ۡ$ۥ۟۟;

    invoke-direct {v0, p1, p4}, LYue/ۥۢۡ۟ۡ$ۥ۟۟;-><init>(Ljava/lang/String;LYue/ۥۣ۠۠ۨ;)V

    invoke-virtual {p0, v0, p2, p3}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۧ(LYue/ۥۢ۠ۨۦ;J)V

    return-void
.end method

.method public final ۥ۟۟۠۠(LYue/ۥۢ۠ۨۦ;JZ)Z
    .locals 9
    .param p1    # LYue/ۥۢ۠ۨۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "task"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟۟(LYue/ۥۢۡ۟ۡ;)V

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ()LYue/ۥۢۡ۟ۢ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۢۡ۟ۢ$ۥ;->ۥ۟۟()J

    move-result-wide v0

    add-long v2, v0, p2

    iget-object v4, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, -0x1

    if-eq v4, v6, :cond_2

    invoke-virtual {p1}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟()J

    move-result-wide v7

    cmp-long v7, v7, v2

    if-gtz v7, :cond_1

    sget-object p2, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    invoke-virtual {p2}, LYue/ۥۢۡ۟ۢ$ۥ۟;->ۥ()Ljava/util/logging/Logger;

    move-result-object p2

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "already scheduled"

    invoke-static {p1, p0, p2}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    :cond_0
    return v5

    :cond_1
    iget-object v7, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1, v2, v3}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟ۡ(J)V

    sget-object v4, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    invoke-virtual {v4}, LYue/ۥۢۡ۟ۢ$ۥ۟;->ۥ()Ljava/util/logging/Logger;

    move-result-object v4

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v4, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_4

    if-eqz p4, :cond_3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "run again after "

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, LYue/ۥۢۡ۟۠;->ۥ۟(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    goto :goto_0

    :cond_3
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "scheduled after "

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, LYue/ۥۢۡ۟۠;->ۥ۟(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :goto_0
    invoke-static {p1, p0, p4}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    :cond_4
    iget-object p4, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    move v2, v5

    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۢ۠ۨۦ;

    invoke-virtual {v3}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟()J

    move-result-wide v3

    sub-long/2addr v3, v0

    cmp-long v3, v3, p2

    if-lez v3, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    move v2, v6

    :goto_2
    if-ne v2, v6, :cond_7

    iget-object p2, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    :cond_7
    iget-object p2, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {p2, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    if-nez v2, :cond_8

    const/4 v5, 0x1

    :cond_8
    return v5
.end method

.method public final ۥ۟۟۠ۡ(LYue/ۥۢ۠ۨۦ;)V
    .locals 0
    .param p1    # LYue/ۥۢ۠ۨۦ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۨۦ;

    return-void
.end method

.method public final ۥ۟۟۠ۢ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۠:Z

    return-void
.end method

.method public final ۥۣ۟۟۠(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟:Z

    return-void
.end method

.method public final ۥ۟۟۠ۤ()V
    .locals 3

    sget-boolean v0, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

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

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ۟۟:Z

    invoke-virtual {p0}, LYue/ۥۢۡ۟ۡ;->ۥ۟()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LYue/ۥۢۡ۟ۡ;->ۥ:LYue/ۥۢۡ۟ۢ;

    invoke-virtual {v1, p0}, LYue/ۥۢۡ۟ۢ;->ۥۣ۟۟۟(LYue/ۥۢۡ۟ۡ;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw v1
.end method
