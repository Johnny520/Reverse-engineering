.class public final Leo;
.super Lbc;
.source ""

# interfaces
.implements Lqd;


# static fields
.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final synthetic b:Lqd;

.field public final c:Lbc;

.field public final d:I

.field public final e:Ldp;

.field public final f:Ljava/lang/Object;

.field private volatile synthetic runningWorkers$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Leo;

    const-string v1, "runningWorkers$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Leo;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lbc;I)V
    .locals 1

    invoke-direct {p0}, Lbc;-><init>()V

    instance-of v0, p1, Lqd;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lqd;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, LQc;->a:Lqd;

    :cond_1
    iput-object v0, p0, Leo;->b:Lqd;

    iput-object p1, p0, Leo;->c:Lbc;

    iput p2, p0, Leo;->d:I

    new-instance p1, Ldp;

    invoke-direct {p1}, Ldp;-><init>()V

    iput-object p1, p0, Leo;->e:Ldp;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leo;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final f(JLM6;)V
    .locals 1

    iget-object v0, p0, Leo;->b:Lqd;

    invoke-interface {v0, p1, p2, p3}, Lqd;->f(JLM6;)V

    return-void
.end method

.method public final t(Lac;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Leo;->e:Ldp;

    invoke-virtual {p1, p2}, Ldp;->a(Ljava/lang/Runnable;)Z

    sget-object p1, Leo;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p2

    iget v0, p0, Leo;->d:I

    if-ge p2, v0, :cond_2

    iget-object p2, p0, Leo;->f:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Leo;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-lt v0, v1, :cond_0

    monitor-exit p2

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p2

    invoke-virtual {p0}, Leo;->w()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    :try_start_2
    new-instance p2, LB0;

    const/4 v0, 0x5

    invoke-direct {p2, v0, p0, p1}, LB0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Leo;->c:Lbc;

    invoke-static {p1, p0, p2}, LfG;->m0(Lbc;Lac;Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    sget-object p2, Leo;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Leo;->c:Lbc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".limitedParallelism("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Leo;->d:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, LEy;->f(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w()Ljava/lang/Runnable;
    .locals 3

    :goto_0
    iget-object v0, p0, Leo;->e:Ldp;

    invoke-virtual {v0}, Ldp;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, Leo;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Leo;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v2, p0, Leo;->e:Ldp;

    invoke-virtual {v2}, Ldp;->c()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method
