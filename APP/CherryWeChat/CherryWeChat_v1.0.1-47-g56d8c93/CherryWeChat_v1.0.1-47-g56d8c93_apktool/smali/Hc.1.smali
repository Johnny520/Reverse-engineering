.class public final LHc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Luc;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements LZg;


# static fields
.field public static final G:Lut;


# instance fields
.field public volatile A:Z

.field public volatile B:Z

.field public C:Z

.field public D:I

.field public E:I

.field public F:I

.field public final a:LFc;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lfz;

.field public final d:LBb;

.field public final e:LXt;

.field public final f:Lw4;

.field public final g:LGc;

.field public h:LRj;

.field public i:LSm;

.field public j:Lwu;

.field public k:Lkg;

.field public l:I

.field public m:I

.field public n:LVd;

.field public o:Lvt;

.field public p:Lig;

.field public q:I

.field public r:Ljava/lang/Object;

.field public s:LD2;

.field public t:Ljava/util/function/Supplier;

.field public u:Ljava/lang/Thread;

.field public v:LSm;

.field public w:LSm;

.field public x:Ljava/lang/Object;

.field public y:Ltc;

.field public volatile z:Lvc;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lut;

    const/4 v1, 0x0

    sget-object v2, Lut;->e:LPg;

    const-string v3, "glide_thread_priority_override"

    invoke-direct {v0, v3, v1, v2}, Lut;-><init>(Ljava/lang/String;Ljava/lang/Object;Ltt;)V

    sput-object v0, LHc;->G:Lut;

    return-void
.end method

.method public constructor <init>(LBb;Lw4;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LFc;

    invoke-direct {v0}, LFc;-><init>()V

    iput-object v0, p0, LHc;->a:LFc;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LHc;->b:Ljava/util/ArrayList;

    new-instance v0, Lfz;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LHc;->c:Lfz;

    new-instance v0, Lw4;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lw4;-><init>(I)V

    iput-object v0, p0, LHc;->f:Lw4;

    new-instance v0, LGc;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LHc;->g:LGc;

    iput-object p1, p0, LHc;->d:LBb;

    iput-object p2, p0, LHc;->e:LXt;

    return-void
.end method


# virtual methods
.method public final a(LSm;Ljava/lang/Exception;Ltc;I)V
    .locals 2

    invoke-interface {p3}, Ltc;->c()V

    new-instance v0, LTj;

    const-string v1, "Fetching data failed"

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, v1, p2}, LTj;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {p3}, Ltc;->a()Ljava/lang/Class;

    move-result-object p2

    iput-object p1, v0, LTj;->b:LSm;

    iput p4, v0, LTj;->c:I

    iput-object p2, v0, LTj;->d:Ljava/lang/Class;

    iget-object p1, p0, LHc;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, LHc;->u:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, LHc;->k(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, LHc;->m()V

    return-void
.end method

.method public final b(LSm;Ljava/lang/Object;Ltc;ILSm;)V
    .locals 0

    iput-object p1, p0, LHc;->v:LSm;

    iput-object p2, p0, LHc;->x:Ljava/lang/Object;

    iput-object p3, p0, LHc;->y:Ltc;

    iput p4, p0, LHc;->F:I

    iput-object p5, p0, LHc;->w:LSm;

    iget-object p2, p0, LHc;->a:LFc;

    invoke-virtual {p2}, LFc;->a()Ljava/util/ArrayList;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eq p1, p2, :cond_0

    const/4 p3, 0x1

    :cond_0
    iput-boolean p3, p0, LHc;->C:Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, LHc;->u:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, LHc;->k(I)V

    return-void

    :cond_1
    invoke-virtual {p0}, LHc;->f()V

    return-void
.end method

.method public final c()Lfz;
    .locals 1

    iget-object v0, p0, LHc;->c:Lfz;

    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, LHc;

    iget-object v0, p0, LHc;->j:Lwu;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p1, LHc;->j:Lwu;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LHc;->q:I

    iget p1, p1, LHc;->q:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final d(Ltc;Ljava/lang/Object;I)Lpw;
    .locals 1

    if-nez p2, :cond_0

    invoke-interface {p1}, Ltc;->c()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_0
    sget v0, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    invoke-virtual {p0, p3, p2}, LHc;->e(ILjava/lang/Object;)Lpw;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v0, 0x2

    invoke-static {p3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    iget-object p3, p0, LHc;->k:Lkg;

    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ltc;->c()V

    return-object p2

    :goto_1
    invoke-interface {p1}, Ltc;->c()V

    throw p2
.end method

.method public final e(ILjava/lang/Object;)Lpw;
    .locals 8

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, LHc;->a:LFc;

    invoke-virtual {v1, v0}, LFc;->c(Ljava/lang/Class;)LNo;

    move-result-object v2

    iget-object v0, p0, LHc;->o:Lvt;

    const/4 v3, 0x4

    if-eq p1, v3, :cond_1

    iget-boolean v1, v1, LFc;->r:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    sget-object v3, Lte;->i:Lut;

    invoke-virtual {v0, v3}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v1, :cond_3

    :cond_2
    :goto_2
    move-object v7, v0

    goto :goto_3

    :cond_3
    new-instance v0, Lvt;

    invoke-direct {v0}, Lvt;-><init>()V

    iget-object v4, p0, LHc;->o:Lvt;

    iget-object v4, v4, Lvt;->b:LA6;

    iget-object v5, v0, Lvt;->b:LA6;

    invoke-virtual {v5, v4}, LA6;->g(LM4;)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5, v3, v1}, LA6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :goto_3
    iget-object v0, p0, LHc;->h:LRj;

    invoke-virtual {v0}, LRj;->a()LPv;

    move-result-object v0

    invoke-virtual {v0, p2}, LPv;->g(Ljava/lang/Object;)Lxc;

    move-result-object v6

    :try_start_0
    iget v3, p0, LHc;->l:I

    iget v4, p0, LHc;->m:I

    new-instance v5, LH5;

    invoke-direct {v5, p1, p0}, LH5;-><init>(ILjava/lang/Object;)V

    invoke-virtual/range {v2 .. v7}, LNo;->a(IILH5;Lxc;Lvt;)Lpw;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v6}, Lxc;->c()V

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-interface {v6}, Lxc;->c()V

    throw p1
.end method

.method public final f()V
    .locals 13

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "data: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LHc;->x:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cache key: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHc;->v:LSm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fetcher: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHc;->y:Ltc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    iget-object v1, p0, LHc;->k:Lkg;

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, ", "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    :cond_1
    iget-object v0, p0, LHc;->s:LD2;

    const-class v1, LPj;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, LHc;->t:Ljava/util/function/Supplier;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v0

    iget-object v2, p0, LHc;->t:Ljava/util/function/Supplier;

    invoke-interface {v2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v2}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iput-object v1, p0, LHc;->t:Ljava/util/function/Supplier;

    :cond_2
    :goto_0
    :try_start_1
    iget-object v0, p0, LHc;->y:Ltc;

    iget-object v2, p0, LHc;->x:Ljava/lang/Object;

    iget v3, p0, LHc;->F:I

    invoke-virtual {p0, v0, v2, v3}, LHc;->d(Ltc;Ljava/lang/Object;I)Lpw;

    move-result-object v0
    :try_end_1
    .catch LTj; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    iget-object v2, p0, LHc;->w:LSm;

    iget v3, p0, LHc;->F:I

    iput-object v2, v0, LTj;->b:LSm;

    iput v3, v0, LTj;->c:I

    iput-object v1, v0, LTj;->d:Ljava/lang/Class;

    iget-object v2, p0, LHc;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_e

    iget v2, p0, LHc;->F:I

    iget-boolean v3, p0, LHc;->C:Z

    instance-of v4, v0, Lnl;

    if-eqz v4, :cond_3

    move-object v4, v0

    check-cast v4, Lnl;

    invoke-interface {v4}, Lnl;->a()V

    :cond_3
    iget-object v4, p0, LHc;->f:Lw4;

    iget-object v4, v4, Lw4;->d:Ljava/lang/Object;

    check-cast v4, Lgp;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_4

    sget-object v1, Lgp;->e:Lw4;

    invoke-virtual {v1}, Lw4;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgp;

    iput-boolean v5, v1, Lgp;->d:Z

    iput-boolean v6, v1, Lgp;->c:Z

    iput-object v0, v1, Lgp;->b:Lpw;

    move-object v0, v1

    :cond_4
    iget-object v4, p0, LHc;->s:LD2;

    const-class v7, LPj;

    iget-object v4, v4, LD2;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p0}, LHc;->l()V

    :cond_5
    invoke-virtual {p0}, LHc;->o()V

    iget-object v4, p0, LHc;->p:Lig;

    monitor-enter v4

    :try_start_2
    iput-object v0, v4, Lig;->n:Lpw;

    iput v2, v4, Lig;->o:I

    iput-boolean v3, v4, Lig;->v:Z

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    monitor-enter v4

    :try_start_3
    iget-object v0, v4, Lig;->b:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    iget-boolean v0, v4, Lig;->u:Z

    if-eqz v0, :cond_6

    iget-object v0, v4, Lig;->n:Lpw;

    invoke-interface {v0}, Lpw;->e()V

    invoke-virtual {v4}, Lig;->g()V

    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_6
    iget-object v0, v4, Lig;->a:Lhg;

    iget-object v0, v0, Lhg;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-boolean v0, v4, Lig;->p:Z

    if-nez v0, :cond_c

    iget-object v0, v4, Lig;->e:Lm6;

    iget-object v8, v4, Lig;->n:Lpw;

    iget-boolean v9, v4, Lig;->l:Z

    iget-object v11, v4, Lig;->k:Lkg;

    iget-object v12, v4, Lig;->c:Llg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lmg;

    const/4 v10, 0x1

    invoke-direct/range {v7 .. v12}, Lmg;-><init>(Lpw;ZZLSm;Llg;)V

    iput-object v7, v4, Lig;->s:Lmg;

    iput-boolean v6, v4, Lig;->p:Z

    iget-object v0, v4, Lig;->a:Lhg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, v0, Lhg;->a:Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v6

    invoke-virtual {v4, v0}, Lig;->e(I)V

    iget-object v0, v4, Lig;->k:Lkg;

    iget-object v3, v4, Lig;->s:Lmg;

    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v7, v4, Lig;->f:Ljg;

    check-cast v7, Lcg;

    invoke-virtual {v7, v4, v0, v3}, Lcg;->c(Lig;LSm;Lmg;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgg;

    iget-object v3, v2, Lgg;->b:Ljava/util/concurrent/Executor;

    new-instance v7, Lfg;

    iget-object v2, v2, Lgg;->a:Lty;

    invoke-direct {v7, v4, v2, v6}, Lfg;-><init>(Lig;Lty;I)V

    invoke-interface {v3, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v4}, Lig;->d()V

    :goto_3
    const/4 v0, 0x5

    iput v0, p0, LHc;->D:I

    :try_start_4
    iget-object v2, p0, LHc;->f:Lw4;

    iget-object v0, v2, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Lgp;

    if-eqz v0, :cond_8

    move v5, v6

    :cond_8
    if-eqz v5, :cond_9

    iget-object v0, p0, LHc;->d:LBb;

    iget-object v3, p0, LHc;->o:Lvt;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v0}, LBb;->a()LUd;

    move-result-object v0

    iget-object v4, v2, Lw4;->b:Ljava/lang/Object;

    check-cast v4, LSm;

    new-instance v5, Lw4;

    iget-object v7, v2, Lw4;->c:Ljava/lang/Object;

    check-cast v7, Lvw;

    iget-object v8, v2, Lw4;->d:Ljava/lang/Object;

    check-cast v8, Lgp;

    const/16 v9, 0x8

    invoke-direct {v5, v7, v8, v3, v9}, Lw4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v4, v5}, LUd;->d(LSm;Lw4;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    iget-object v0, v2, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Lgp;

    invoke-virtual {v0}, Lgp;->a()V

    goto :goto_4

    :catchall_1
    move-exception v0

    iget-object v2, v2, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Lgp;

    invoke-virtual {v2}, Lgp;->a()V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_5

    :cond_9
    :goto_4
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lgp;->a()V

    :cond_a
    iget-object v2, p0, LHc;->g:LGc;

    monitor-enter v2

    :try_start_7
    iput-boolean v6, v2, LGc;->b:Z

    invoke-virtual {v2}, LGc;->a()Z

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    monitor-exit v2

    if-eqz v0, :cond_f

    invoke-virtual {p0}, LHc;->j()V

    goto :goto_7

    :catchall_3
    move-exception v0

    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw v0

    :goto_5
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lgp;->a()V

    :cond_b
    throw v0

    :cond_c
    :try_start_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already have resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received a resource without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_6
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw v0

    :catchall_4
    move-exception v0

    :try_start_a
    monitor-exit v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    throw v0

    :cond_e
    invoke-virtual {p0}, LHc;->m()V

    :cond_f
    :goto_7
    return-void
.end method

.method public final g()Lvc;
    .locals 3

    iget v0, p0, LHc;->D:I

    invoke-static {v0}, LEy;->v(I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, LHc;->a:LFc;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v1, p0, LHc;->D:I

    invoke-static {v1}, LEy;->w(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, LHy;

    invoke-direct {v0, v2, p0}, LHy;-><init>(LFc;LHc;)V

    return-object v0

    :cond_2
    new-instance v0, Lqc;

    invoke-virtual {v2}, LFc;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lqc;-><init>(Ljava/util/List;LFc;Luc;)V

    return-object v0

    :cond_3
    new-instance v0, Lqw;

    invoke-direct {v0, v2, p0}, Lqw;-><init>(LFc;LHc;)V

    return-object v0
.end method

.method public final h(I)I
    .locals 4

    invoke-static {p1}, LEy;->v(I)I

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, LEy;->w(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Unrecognized stage: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 p1, 0x6

    return p1

    :cond_2
    const/4 p1, 0x4

    return p1

    :cond_3
    iget-object p1, p0, LHc;->n:LVd;

    iget p1, p1, LVd;->a:I

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const/4 p1, 0x1

    goto :goto_1

    :pswitch_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    return v3

    :cond_4
    invoke-virtual {p0, v3}, LHc;->h(I)I

    move-result p1

    return p1

    :cond_5
    iget-object p1, p0, LHc;->n:LVd;

    iget p1, p1, LVd;->a:I

    packed-switch p1, :pswitch_data_1

    :pswitch_2
    const/4 p1, 0x1

    goto :goto_2

    :pswitch_3
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_6

    return v1

    :cond_6
    invoke-virtual {p0, v1}, LHc;->h(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final i()V
    .locals 7

    iget-object v0, p0, LHc;->s:LD2;

    const-class v1, LPj;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LHc;->l()V

    :cond_0
    invoke-virtual {p0}, LHc;->o()V

    new-instance v0, LTj;

    const-string v1, "Failed to load resource"

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, LHc;->b:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v1, v2}, LTj;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, LHc;->p:Lig;

    monitor-enter v1

    :try_start_0
    iput-object v0, v1, Lig;->q:LTj;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-enter v1

    :try_start_1
    iget-object v0, v1, Lig;->b:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    iget-boolean v0, v1, Lig;->u:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lig;->g()V

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v0, v1, Lig;->a:Lhg;

    iget-object v0, v0, Lhg;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-boolean v0, v1, Lig;->r:Z

    if-nez v0, :cond_4

    iput-boolean v2, v1, Lig;->r:Z

    iget-object v0, v1, Lig;->k:Lkg;

    iget-object v3, v1, Lig;->a:Lhg;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v3, v3, Lhg;->a:Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Lig;->e(I)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v3, v1, Lig;->f:Ljg;

    const/4 v5, 0x0

    check-cast v3, Lcg;

    invoke-virtual {v3, v1, v0, v5}, Lcg;->c(Lig;LSm;Lmg;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgg;

    iget-object v4, v3, Lgg;->b:Ljava/util/concurrent/Executor;

    new-instance v5, Lfg;

    iget-object v3, v3, Lgg;->a:Lty;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v3, v6}, Lfg;-><init>(Lig;Lty;I)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lig;->d()V

    :goto_1
    iget-object v0, p0, LHc;->g:LGc;

    monitor-enter v0

    :try_start_2
    iput-boolean v2, v0, LGc;->c:Z

    invoke-virtual {v0}, LGc;->a()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LHc;->j()V

    :cond_3
    return-void

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    :cond_4
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Already failed once"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, LHc;->g:LGc;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, v0, LGc;->b:Z

    iput-boolean v1, v0, LGc;->a:Z

    iput-boolean v1, v0, LGc;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LHc;->f:Lw4;

    const/4 v2, 0x0

    iput-object v2, v0, Lw4;->b:Ljava/lang/Object;

    iput-object v2, v0, Lw4;->c:Ljava/lang/Object;

    iput-object v2, v0, Lw4;->d:Ljava/lang/Object;

    iget-object v0, p0, LHc;->a:LFc;

    iput-object v2, v0, LFc;->c:LRj;

    iput-object v2, v0, LFc;->d:Ljava/lang/Object;

    iput-object v2, v0, LFc;->n:LSm;

    iput-object v2, v0, LFc;->g:Ljava/lang/Class;

    iput-object v2, v0, LFc;->k:Ljava/lang/Class;

    iput-object v2, v0, LFc;->i:Lvt;

    iput-object v2, v0, LFc;->o:Lwu;

    iput-object v2, v0, LFc;->j:Ljava/util/Map;

    iput-object v2, v0, LFc;->p:LVd;

    iget-object v3, v0, LFc;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v1, v0, LFc;->l:Z

    iget-object v3, v0, LFc;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v1, v0, LFc;->m:Z

    iput-boolean v1, p0, LHc;->A:Z

    iput-object v2, p0, LHc;->h:LRj;

    iput-object v2, p0, LHc;->i:LSm;

    iput-object v2, p0, LHc;->o:Lvt;

    iput-object v2, p0, LHc;->j:Lwu;

    iput-object v2, p0, LHc;->k:Lkg;

    iput-object v2, p0, LHc;->p:Lig;

    iput v1, p0, LHc;->D:I

    iput-object v2, p0, LHc;->z:Lvc;

    iput-object v2, p0, LHc;->u:Ljava/lang/Thread;

    iput-object v2, p0, LHc;->v:LSm;

    iput-object v2, p0, LHc;->x:Ljava/lang/Object;

    iput v1, p0, LHc;->F:I

    iput-object v2, p0, LHc;->y:Ltc;

    iput-boolean v1, p0, LHc;->B:Z

    iput-object v2, p0, LHc;->r:Ljava/lang/Object;

    iget-object v0, p0, LHc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LHc;->e:LXt;

    invoke-interface {v0, p0}, LXt;->a(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final k(I)V
    .locals 1

    iput p1, p0, LHc;->E:I

    iget-object p1, p0, LHc;->p:Lig;

    iget-boolean v0, p1, Lig;->m:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lig;->i:LWj;

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lig;->h:LWj;

    :goto_0
    invoke-virtual {p1, p0}, LWj;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, LHc;->s:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    const-class v1, LPj;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LHc;->t:Ljava/util/function/Supplier;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v0

    const/16 v1, 0x9

    invoke-static {v0, v1}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, LHc;->t:Ljava/util/function/Supplier;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OverrideGlideThreadPriority experiment is not enabled."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, LHc;->u:Ljava/lang/Thread;

    sget v0, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    const/4 v0, 0x0

    :cond_0
    iget-boolean v1, p0, LHc;->B:Z

    if-nez v1, :cond_1

    iget-object v1, p0, LHc;->z:Lvc;

    if-eqz v1, :cond_1

    iget-object v0, p0, LHc;->z:Lvc;

    invoke-interface {v0}, Lvc;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget v1, p0, LHc;->D:I

    invoke-virtual {p0, v1}, LHc;->h(I)I

    move-result v1

    iput v1, p0, LHc;->D:I

    invoke-virtual {p0}, LHc;->g()Lvc;

    move-result-object v1

    iput-object v1, p0, LHc;->z:Lvc;

    iget v1, p0, LHc;->D:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LHc;->k(I)V

    return-void

    :cond_1
    iget v1, p0, LHc;->D:I

    const/4 v2, 0x6

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, LHc;->B:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, LHc;->i()V

    :cond_3
    return-void
.end method

.method public final n()V
    .locals 3

    iget v0, p0, LHc;->E:I

    invoke-static {v0}, LEy;->v(I)I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LHc;->f()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v1, p0, LHc;->E:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const-string v1, "null"

    goto :goto_0

    :cond_1
    const-string v1, "DECODE_DATA"

    goto :goto_0

    :cond_2
    const-string v1, "SWITCH_TO_SOURCE_SERVICE"

    goto :goto_0

    :cond_3
    const-string v1, "INITIALIZE"

    :goto_0
    const-string v2, "Unrecognized run reason: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {p0}, LHc;->m()V

    return-void

    :cond_5
    invoke-virtual {p0, v1}, LHc;->h(I)I

    move-result v0

    iput v0, p0, LHc;->D:I

    invoke-virtual {p0}, LHc;->g()Lvc;

    move-result-object v0

    iput-object v0, p0, LHc;->z:Lvc;

    invoke-virtual {p0}, LHc;->m()V

    return-void
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, LHc;->c:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    iget-boolean v0, p0, LHc;->A:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, LHc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LHc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iput-boolean v1, p0, LHc;->A:Z

    return-void
.end method

.method public final run()V
    .locals 4

    iget-object v0, p0, LHc;->y:Ltc;

    :try_start_0
    iget-boolean v1, p0, LHc;->B:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LHc;->i()V
    :try_end_0
    .catch LG6; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ltc;->c()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_2

    :cond_0
    :try_start_1
    invoke-virtual {p0}, LHc;->n()V
    :try_end_1
    .catch LG6; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ltc;->c()V

    :cond_1
    return-void

    :goto_0
    :try_start_2
    iget v2, p0, LHc;->D:I

    const/4 v3, 0x5

    if-eq v2, v3, :cond_2

    iget-object v2, p0, LHc;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LHc;->i()V

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_2
    :goto_1
    iget-boolean v2, p0, LHc;->B:Z

    if-nez v2, :cond_3

    throw v1

    :cond_3
    throw v1

    :goto_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, Ltc;->c()V

    :cond_4
    throw v1
.end method
