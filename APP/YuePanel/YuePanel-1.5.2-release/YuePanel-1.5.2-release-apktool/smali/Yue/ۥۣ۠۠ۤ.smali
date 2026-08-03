.class public final LYue/ۥۣ۠۠ۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"
.end annotation


# instance fields
.field public final ۥ:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣ۠۠ۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟:I
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "lock"
    .end annotation
.end field

.field public ۥ۟۟۟۟:Z
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "lock"
    .end annotation
.end field

.field public ۥ۟۟۟۠:Z
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "lock"
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:Ljava/util/List;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "lock"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟ۢ:Ljava/lang/Runnable;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;LYue/ۥۣ۠۠ۨ;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    const-string v0, "executor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportFullyDrawn"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۠ۤ;->ۥ:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟:LYue/ۥۣ۠۠ۨ;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۡ:Ljava/util/List;

    new-instance p1, LYue/ۥۣۣ۠۠;

    invoke-direct {p1, p0}, LYue/ۥۣۣ۠۠;-><init>(LYue/ۥۣ۠۠ۤ;)V

    iput-object p1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥۣ۠۠ۤ;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۣ۠۠ۤ;->ۥۣ۟۟۟(LYue/ۥۣ۠۠ۤ;)V

    return-void
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣ۠۠ۤ;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۟:Z

    iget v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟:I

    if-nez v1, :cond_0

    iget-boolean v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۠:Z

    if-nez v1, :cond_0

    iget-object v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟:LYue/ۥۣ۠۠ۨ;

    invoke-interface {v1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final ۥ۟(LYue/ۥۣ۠۠ۨ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۠:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۡ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    if-eqz v1, :cond_1

    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final ۥ۟۟()V
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۠:Z

    if-nez v1, :cond_0

    iget v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟:I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final ۥ۟۟۟()V
    .locals 3
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۠:Z

    iget-object v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۡ:Ljava/util/List;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣ۠۠ۨ;

    invoke-interface {v2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۡ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final ۥ۟۟۟۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۠:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ۥ۟۟۟۠()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_0

    iget v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۟:Z

    iget-object v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ:Ljava/util/concurrent/Executor;

    iget-object v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟ۡ(LYue/ۥۣ۠۠ۨ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۡ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final ۥ۟۟۟ۢ()V
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۠:Z

    if-nez v1, :cond_0

    iget v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟:I

    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟:I

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۠()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method
