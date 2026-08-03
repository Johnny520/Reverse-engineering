.class public final Lvg/g;
.super Lqg/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqg/y;


# static fields
.field public static final synthetic n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final synthetic i:Lqg/y;

.field public final j:Lqg/p;

.field public final k:I

.field public final l:Lvg/j;

.field public final m:Ljava/lang/Object;

.field private volatile synthetic runningWorkers$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lvg/g;

    .line 2
    .line 3
    const-string v1, "runningWorkers$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lvg/g;->n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lqg/p;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lqg/p;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lqg/y;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lqg/y;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Lqg/x;->a:Lqg/y;

    .line 16
    .line 17
    :cond_1
    iput-object v0, p0, Lvg/g;->i:Lqg/y;

    .line 18
    .line 19
    iput-object p1, p0, Lvg/g;->j:Lqg/p;

    .line 20
    .line 21
    iput p2, p0, Lvg/g;->k:I

    .line 22
    .line 23
    new-instance p1, Lvg/j;

    .line 24
    .line 25
    invoke-direct {p1}, Lvg/j;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lvg/g;->l:Lvg/j;

    .line 29
    .line 30
    new-instance p1, Ljava/lang/Object;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lvg/g;->m:Ljava/lang/Object;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final q(JLqg/j1;Lwf/g;)Lqg/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lvg/g;->i:Lqg/y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lqg/y;->q(JLqg/j1;Lwf/g;)Lqg/d0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lvg/g;->j:Lqg/p;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ".limitedParallelism("

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lvg/g;->k:I

    .line 17
    .line 18
    const/16 v2, 0x29

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, Lp/a;->n(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final u(JLqg/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvg/g;->i:Lqg/y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lqg/y;->u(JLqg/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w(Lwf/g;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lvg/g;->l:Lvg/j;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lvg/j;->a(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    sget-object p1, Lvg/g;->n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget p2, p0, Lvg/g;->k:I

    .line 13
    .line 14
    if-ge p1, p2, :cond_2

    .line 15
    .line 16
    iget-object p1, p0, Lvg/g;->m:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter p1

    .line 19
    :try_start_0
    sget-object p2, Lvg/g;->n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 20
    .line 21
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget v1, p0, Lvg/g;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    if-lt v0, v1, :cond_0

    .line 28
    .line 29
    monitor-exit p1

    .line 30
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :try_start_1
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    monitor-exit p1

    .line 36
    const/4 p1, 0x1

    .line 37
    :goto_0
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Lvg/g;->z()Ljava/lang/Runnable;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p2, Lrg/d;

    .line 47
    .line 48
    invoke-direct {p2, p0, p1}, Lrg/d;-><init>(Lvg/g;Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lvg/g;->j:Lqg/p;

    .line 52
    .line 53
    invoke-virtual {p1, p0, p2}, Lqg/p;->w(Lwf/g;Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p2

    .line 58
    monitor-exit p1

    .line 59
    throw p2

    .line 60
    :cond_2
    :goto_1
    return-void
.end method

.method public final z()Ljava/lang/Runnable;
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lvg/g;->l:Lvg/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvg/j;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Runnable;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lvg/g;->m:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    sget-object v1, Lvg/g;->n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lvg/g;->l:Lvg/j;

    .line 20
    .line 21
    invoke-virtual {v2}, Lvg/j;->c()I

    .line 22
    .line 23
    .line 24
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    const/4 v0, 0x0

    .line 29
    return-object v0

    .line 30
    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit v0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    monitor-exit v0

    .line 37
    throw v1

    .line 38
    :cond_1
    return-object v0
.end method
