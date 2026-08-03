.class public abstract L۟/a9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/a9$a;,
        L۟/a9$b;
    }
.end annotation


# instance fields
.field public volatile ۥ:L۟/ab;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public ۥ۟:Ljava/util/concurrent/Executor;

.field public ۥ۟۟:L۟/bb;

.field public final ۥ۟۠:L۟/k4;

.field public ۥ۟ۡ:Z

.field public ۥ۟ۢ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u06df/a9$a;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public ۥۣ۟:Ljava/util/HashMap;

.field public final ۥ۟ۤ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final ۥ۟ۥ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟ۦ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, L۟/a9;->ۥ۟ۤ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, L۟/a9;->ۥ۟ۥ:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    invoke-virtual {p0}, L۟/a9;->ۥ۟۟()L۟/k4;

    move-result-object v0

    iput-object v0, p0, L۟/a9;->ۥ۟۠:L۟/k4;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, L۟/a9;->ۥ۟ۦ:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, L۟/a9;->ۥۣ۟:Ljava/util/HashMap;

    return-void
.end method

.method public static ۥ۟ۦ(Ljava/lang/Class;L۟/bb;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, L۟/j1;

    if-eqz v0, :cond_1

    check-cast p1, L۟/j1;

    invoke-interface {p1}, L۟/j1;->ۥ۟۟()L۟/bb;

    move-result-object p1

    invoke-static {p0, p1}, L۟/a9;->ۥ۟ۦ(Ljava/lang/Class;L۟/bb;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ۥ()V
    .locals 2

    .line 1
    iget-boolean v0, p0, L۟/a9;->ۥ۟ۡ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    if-nez v0, :cond_2

    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v1, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final ۥ۟()V
    .locals 2

    .line 1
    iget-object v0, p0, L۟/a9;->ۥ۟۟:L۟/bb;

    .line 2
    .line 3
    invoke-interface {v0}, L۟/bb;->ۥ۠ۡ()L۟/ab;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, L۟/ab;->ۥ۟ۧ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, L۟/a9;->ۥ۟ۥ:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v1, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public abstract ۥ۟۟()L۟/k4;
.end method

.method public abstract ۥ۟۠(L۟/f1;)L۟/bb;
.end method

.method public ۥ۟ۡ()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟ۢ()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "L\u06df/z;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟ۤ()V
    .locals 4

    .line 1
    iget-object v0, p0, L۟/a9;->ۥ۟۟:L۟/bb;

    .line 2
    .line 3
    invoke-interface {v0}, L۟/bb;->ۥ۠ۡ()L۟/ab;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, L۟/ab;->ۥ()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, L۟/a9;->ۥ۟۟:L۟/bb;

    .line 11
    .line 12
    invoke-interface {v0}, L۟/bb;->ۥ۠ۡ()L۟/ab;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, L۟/ab;->ۥ۟ۧ()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, L۟/a9;->ۥ۟۠:L۟/k4;

    .line 23
    .line 24
    iget-object v1, v0, L۟/k4;->ۥ۟۠:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, v0, L۟/k4;->ۥ۟۟:L۟/a9;

    .line 35
    .line 36
    iget-object v1, v1, L۟/a9;->ۥ۟:Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    iget-object v0, v0, L۟/k4;->ۥ۟ۦ:L۟/k4$a;

    .line 39
    .line 40
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public final ۥ۟ۥ(L۟/db;)Landroid/database/Cursor;
    .locals 1

    invoke-virtual {p0}, L۟/a9;->ۥ()V

    invoke-virtual {p0}, L۟/a9;->ۥ۟()V

    iget-object v0, p0, L۟/a9;->ۥ۟۟:L۟/bb;

    invoke-interface {v0}, L۟/bb;->ۥ۠ۡ()L۟/ab;

    move-result-object v0

    invoke-interface {v0, p1}, L۟/ab;->ۥ۟ۢ(L۟/db;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method
