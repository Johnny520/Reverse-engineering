.class public final LYue/ۥ۟ۦۥۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/lang/reflect/Method;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    const-class v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const-string v1, "setRemoveOnCancelPolicy"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, LYue/ۥ۟ۦۥۦ;->ۥ:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static synthetic ۥ()V
    .locals 0

    return-void
.end method

.method public static final ۥ۟(I)Ljava/util/Set;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I)",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0, p0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(Ljava/util/concurrent/Executor;)Z
    .locals 3
    .param p0    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    instance-of v1, p0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v1, :cond_0

    check-cast p0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    return v0

    :cond_1
    sget-object v1, LYue/ۥ۟ۦۥۦ;->ۥ:Ljava/lang/reflect/Method;

    if-nez v1, :cond_2

    return v0

    :cond_2
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    return v0
.end method

.method public static final ۥ۟۟۟()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    return-object v0
.end method

.method public static final ۥ۟۟۟۟(Ljava/util/concurrent/locks/ReentrantLock;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/util/concurrent/locks/ReentrantLock;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/locks/ReentrantLock;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method
