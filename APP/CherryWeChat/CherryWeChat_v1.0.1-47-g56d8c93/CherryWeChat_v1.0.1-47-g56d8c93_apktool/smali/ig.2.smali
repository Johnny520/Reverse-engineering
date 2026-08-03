.class public final Lig;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LZg;


# static fields
.field public static final w:Lm6;


# instance fields
.field public final a:Lhg;

.field public final b:Lfz;

.field public final c:Llg;

.field public final d:LXt;

.field public final e:Lm6;

.field public final f:Ljg;

.field public final g:LWj;

.field public final h:LWj;

.field public final i:LWj;

.field public final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public k:Lkg;

.field public l:Z

.field public m:Z

.field public n:Lpw;

.field public o:I

.field public p:Z

.field public q:LTj;

.field public r:Z

.field public s:Lmg;

.field public t:LHc;

.field public volatile u:Z

.field public v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm6;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lm6;-><init>(I)V

    sput-object v0, Lig;->w:Lm6;

    return-void
.end method

.method public constructor <init>(LWj;LWj;LWj;LWj;Lcg;Lcg;Lw4;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Lhg;

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p3, v0}, Lhg;-><init>(Ljava/util/ArrayList;)V

    iput-object p3, p0, Lig;->a:Lhg;

    new-instance p3, Lfz;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lig;->b:Lfz;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p3, p0, Lig;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lig;->g:LWj;

    iput-object p2, p0, Lig;->h:LWj;

    iput-object p4, p0, Lig;->i:LWj;

    iput-object p5, p0, Lig;->f:Ljg;

    iput-object p6, p0, Lig;->c:Llg;

    iput-object p7, p0, Lig;->d:LXt;

    sget-object p1, Lig;->w:Lm6;

    iput-object p1, p0, Lig;->e:Lm6;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lty;Ljava/util/concurrent/Executor;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lig;->b:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    iget-object v0, p0, Lig;->a:Lhg;

    iget-object v0, v0, Lhg;->a:Ljava/util/ArrayList;

    new-instance v1, Lgg;

    invoke-direct {v1, p1, p2}, Lgg;-><init>(Lty;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lig;->p:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lig;->e(I)V

    new-instance v0, Lfg;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lfg;-><init>(Lig;Lty;I)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lig;->r:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lig;->e(I)V

    new-instance v0, Lfg;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lfg;-><init>(Lig;Lty;I)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lig;->u:Z

    xor-int/2addr p1, v1

    const-string p2, "Cannot add callbacks to a cancelled EngineJob"

    invoke-static {p2, p1}, LQj;->f(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 4

    invoke-virtual {p0}, Lig;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lig;->u:Z

    iget-object v1, p0, Lig;->t:LHc;

    iput-boolean v0, v1, LHc;->B:Z

    iget-object v0, v1, LHc;->z:Lvc;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lvc;->cancel()V

    :cond_1
    iget-object v0, p0, Lig;->f:Ljg;

    iget-object v1, p0, Lig;->k:Lkg;

    check-cast v0, Lcg;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lcg;->a:Lyc;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lyc;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final c()Lfz;
    .locals 1

    iget-object v0, p0, Lig;->b:Lfz;

    return-object v0
.end method

.method public final d()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lig;->b:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    invoke-virtual {p0}, Lig;->f()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v1, v0}, LQj;->f(Ljava/lang/String;Z)V

    iget-object v0, p0, Lig;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Can\'t decrement below 0"

    invoke-static {v2, v1}, LQj;->f(Ljava/lang/String;Z)V

    if-nez v0, :cond_1

    iget-object v0, p0, Lig;->s:Lmg;

    invoke-virtual {p0}, Lig;->g()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lmg;->c()V

    :cond_2
    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized e(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lig;->f()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v1, v0}, LQj;->f(Ljava/lang/String;Z)V

    iget-object v0, p0, Lig;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lig;->s:Lmg;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lmg;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lig;->r:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lig;->p:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lig;->u:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final declared-synchronized g()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lig;->k:Lkg;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lig;->a:Lhg;

    iget-object v0, v0, Lhg;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lig;->k:Lkg;

    iput-object v0, p0, Lig;->s:Lmg;

    iput-object v0, p0, Lig;->n:Lpw;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lig;->r:Z

    iput-boolean v1, p0, Lig;->u:Z

    iput-boolean v1, p0, Lig;->p:Z

    iput-boolean v1, p0, Lig;->v:Z

    iget-object v2, p0, Lig;->t:LHc;

    iget-object v3, v2, LHc;->g:LGc;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x1

    :try_start_1
    iput-boolean v4, v3, LGc;->a:Z

    invoke-virtual {v3}, LGc;->a()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v3

    if-eqz v4, :cond_0

    invoke-virtual {v2}, LHc;->j()V

    :cond_0
    iput-object v0, p0, Lig;->t:LHc;

    iput-object v0, p0, Lig;->q:LTj;

    iput v1, p0, Lig;->o:I

    iget-object v0, p0, Lig;->d:LXt;

    invoke-interface {v0, p0}, LXt;->a(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final declared-synchronized h(Lty;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lig;->b:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    iget-object v0, p0, Lig;->a:Lhg;

    iget-object v0, v0, Lhg;->a:Ljava/util/ArrayList;

    new-instance v1, Lgg;

    sget-object v2, LPj;->c:Lp3;

    invoke-direct {v1, p1, v2}, Lgg;-><init>(Lty;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lig;->a:Lhg;

    iget-object p1, p1, Lhg;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lig;->b()V

    iget-boolean p1, p0, Lig;->p:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lig;->r:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lig;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lig;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
