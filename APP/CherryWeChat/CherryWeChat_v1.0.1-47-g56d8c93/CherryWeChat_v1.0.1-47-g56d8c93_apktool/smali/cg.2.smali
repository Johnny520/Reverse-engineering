.class public final Lcg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljg;
.implements Llg;


# static fields
.field public static final h:Z


# instance fields
.field public final a:Lyc;

.field public final b:Lm6;

.field public final c:LEp;

.field public final d:LC2;

.field public final e:LY5;

.field public final f:LL3;

.field public final g:Lqs;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "Engine"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lcg;->h:Z

    return-void
.end method

.method public constructor <init>(LEp;LD2;LWj;LWj;LWj;LWj;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcg;->c:LEp;

    new-instance v0, LBb;

    invoke-direct {v0, p2}, LBb;-><init>(Ljava/lang/Object;)V

    new-instance p2, Lqs;

    const/4 v1, 0x2

    invoke-direct {p2, v1}, Lqs;-><init>(I)V

    iput-object p2, p0, Lcg;->g:Lqs;

    monitor-enter p0

    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object p0, p2, Lqs;->d:Ljava/lang/Object;

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    new-instance p2, Lm6;

    const/16 v1, 0x16

    invoke-direct {p2, v1}, Lm6;-><init>(I)V

    iput-object p2, p0, Lcg;->b:Lm6;

    new-instance p2, Lyc;

    const/4 v1, 0x2

    invoke-direct {p2, v1}, Lyc;-><init>(I)V

    iput-object p2, p0, Lcg;->a:Lyc;

    new-instance v2, LC2;

    move-object v8, p0

    move-object v7, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v2 .. v8}, LC2;-><init>(LWj;LWj;LWj;LWj;Lcg;Lcg;)V

    iput-object v2, v7, Lcg;->d:LC2;

    new-instance p2, LL3;

    invoke-direct {p2, v0}, LL3;-><init>(LBb;)V

    iput-object p2, v7, Lcg;->f:LL3;

    new-instance p2, LY5;

    invoke-direct {p2}, LY5;-><init>()V

    iput-object p2, v7, Lcg;->e:LY5;

    iput-object v7, p1, LEp;->d:Lcg;

    return-void

    :catchall_0
    move-exception v0

    move-object v7, p0

    :goto_0
    move-object p1, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v7, p0

    :goto_1
    move-object p1, v0

    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    throw p1

    :catchall_2
    move-exception v0

    goto :goto_0

    :catchall_3
    move-exception v0

    goto :goto_1

    :goto_2
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public static e(Lpw;)V
    .locals 1

    instance-of v0, p0, Lmg;

    if-eqz v0, :cond_0

    check-cast p0, Lmg;

    invoke-virtual {p0}, Lmg;->c()V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot release anything but an EngineResource"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(LRj;Ljava/lang/Object;LSm;IILjava/lang/Class;Ljava/lang/Class;Lwu;LVd;LA6;ZZLvt;ZZLty;Lp3;)Lw4;
    .locals 23

    move-object/from16 v2, p0

    sget-boolean v0, Lcg;->h:Z

    if-eqz v0, :cond_0

    sget v0, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    iget-object v3, v2, Lcg;->b:Lm6;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lkg;

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v9, p10

    move-object/from16 v12, p13

    invoke-direct/range {v4 .. v12}, Lkg;-><init>(Ljava/lang/Object;LSm;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Lvt;)V

    monitor-enter p0

    move/from16 v3, p14

    :try_start_0
    invoke-virtual {v2, v4, v3, v0, v1}, Lcg;->b(Lkg;ZJ)Lmg;

    move-result-object v5

    if-nez v5, :cond_1

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    move/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move-wide/from16 v21, v0

    move/from16 v16, v3

    move-object/from16 v20, v4

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    invoke-virtual/range {v2 .. v22}, Lcg;->f(LRj;Ljava/lang/Object;LSm;IILjava/lang/Class;Ljava/lang/Class;Lwu;LVd;Ljava/util/Map;ZZLvt;ZZLty;Ljava/util/concurrent/Executor;Lkg;J)Lw4;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v0, v5

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x5

    const/4 v2, 0x0

    move-object/from16 v3, p16

    invoke-virtual {v3, v0, v1, v2}, Lty;->g(Lpw;IZ)V

    const/4 v0, 0x0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b(Lkg;ZJ)Lmg;
    .locals 6

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object v5, p0

    goto/16 :goto_4

    :cond_0
    iget-object p2, p0, Lcg;->g:Lqs;

    monitor-enter p2

    :try_start_0
    iget-object p4, p2, Lqs;->b:Ljava/lang/Object;

    check-cast p4, Ljava/util/HashMap;

    invoke-virtual {p4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LM0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez p4, :cond_1

    monitor-exit p2

    move-object v0, p3

    goto :goto_1

    :cond_1
    :try_start_1
    invoke-virtual {p4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmg;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-nez v0, :cond_2

    :try_start_2
    invoke-virtual {p2, p4}, Lqs;->l(LM0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v5, p0

    goto/16 :goto_7

    :cond_2
    :goto_0
    monitor-exit p2

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lmg;->a()V

    :cond_3
    if-eqz v0, :cond_5

    sget-boolean p2, Lcg;->h:Z

    if-eqz p2, :cond_4

    sget p2, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_4
    return-object v0

    :cond_5
    iget-object p4, p0, Lcg;->c:LEp;

    monitor-enter p4

    :try_start_3
    iget-object p2, p4, LCp;->c:Ljava/lang/Object;

    check-cast p2, Ljava/util/LinkedHashMap;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LBp;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez p2, :cond_6

    monitor-exit p4

    move-object p2, p3

    goto :goto_2

    :cond_6
    :try_start_4
    iget-wide v0, p4, LCp;->b:J

    iget v2, p2, LBp;->b:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iput-wide v0, p4, LCp;->b:J

    iget-object p2, p2, LBp;->a:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p4

    :goto_2
    move-object v1, p2

    check-cast v1, Lpw;

    if-nez v1, :cond_7

    move-object v5, p0

    move-object v4, p1

    move-object v1, p3

    goto :goto_3

    :cond_7
    instance-of p2, v1, Lmg;

    if-eqz p2, :cond_8

    check-cast v1, Lmg;

    move-object v5, p0

    move-object v4, p1

    goto :goto_3

    :cond_8
    new-instance v0, Lmg;

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object v5, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lmg;-><init>(Lpw;ZZLSm;Llg;)V

    move-object v1, v0

    :goto_3
    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lmg;->a()V

    iget-object p1, v5, Lcg;->g:Lqs;

    invoke-virtual {p1, v4, v1}, Lqs;->a(LSm;Lmg;)V

    :cond_9
    if-eqz v1, :cond_b

    sget-boolean p1, Lcg;->h:Z

    if-eqz p1, :cond_a

    sget p1, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_a
    return-object v1

    :cond_b
    :goto_4
    return-object p3

    :catchall_1
    move-exception v0

    move-object v5, p0

    :goto_5
    move-object p1, v0

    :try_start_5
    monitor-exit p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :catchall_2
    move-exception v0

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v5, p0

    :goto_6
    move-object p1, v0

    :goto_7
    :try_start_6
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    throw p1

    :catchall_4
    move-exception v0

    goto :goto_6
.end method

.method public final declared-synchronized c(Lig;LSm;Lmg;)V
    .locals 1

    monitor-enter p0

    if-eqz p3, :cond_0

    :try_start_0
    iget-boolean v0, p3, Lmg;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcg;->g:Lqs;

    invoke-virtual {v0, p2, p3}, Lqs;->a(LSm;Lmg;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p3, p0, Lcg;->a:Lyc;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p3, Lyc;->a:Ljava/util/HashMap;

    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
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

.method public final d(LSm;Lmg;)V
    .locals 3

    iget-object v0, p0, Lcg;->g:Lqs;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lqs;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM0;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    iput-object v2, v1, LM0;->c:Lpw;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    iget-boolean v0, p2, Lmg;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcg;->c:LEp;

    invoke-virtual {v0, p1, p2}, LCp;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpw;

    return-void

    :cond_1
    iget-object p1, p0, Lcg;->e:LY5;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, LY5;->d(Lpw;Z)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final f(LRj;Ljava/lang/Object;LSm;IILjava/lang/Class;Ljava/lang/Class;Lwu;LVd;Ljava/util/Map;ZZLvt;ZZLty;Ljava/util/concurrent/Executor;Lkg;J)Lw4;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p13

    move-object/from16 v9, p16

    move-object/from16 v10, p17

    move-object/from16 v11, p18

    iget-object v12, v1, Lcg;->a:Lyc;

    iget-object v12, v12, Lyc;->a:Ljava/util/HashMap;

    invoke-virtual {v12, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lig;

    if-eqz v12, :cond_1

    invoke-virtual {v12, v9, v10}, Lig;->a(Lty;Ljava/util/concurrent/Executor;)V

    sget-boolean v0, Lcg;->h:Z

    if-eqz v0, :cond_0

    sget v0, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    new-instance v0, Lw4;

    invoke-direct {v0, v1, v9, v12}, Lw4;-><init>(Lcg;Lty;Lig;)V

    return-object v0

    :cond_1
    iget-object v12, v1, Lcg;->d:LC2;

    iget-object v12, v12, LC2;->h:Ljava/lang/Object;

    check-cast v12, Lw4;

    invoke-virtual {v12}, Lw4;->c()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lig;

    monitor-enter v12

    :try_start_0
    iput-object v11, v12, Lig;->k:Lkg;

    move/from16 v13, p14

    iput-boolean v13, v12, Lig;->l:Z

    move/from16 v13, p15

    iput-boolean v13, v12, Lig;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v12

    iget-object v13, v1, Lcg;->f:LL3;

    iget-object v14, v13, LL3;->d:Ljava/lang/Object;

    check-cast v14, Lw4;

    invoke-virtual {v14}, Lw4;->c()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LHc;

    iget v15, v13, LL3;->b:I

    add-int/lit8 v9, v15, 0x1

    iput v9, v13, LL3;->b:I

    iget-object v9, v14, LHc;->a:LFc;

    iget-object v13, v14, LHc;->d:LBb;

    iput-object v0, v9, LFc;->c:LRj;

    iput-object v2, v9, LFc;->d:Ljava/lang/Object;

    iput-object v3, v9, LFc;->n:LSm;

    iput v4, v9, LFc;->e:I

    iput v5, v9, LFc;->f:I

    iput-object v7, v9, LFc;->p:LVd;

    move-object/from16 v10, p6

    iput-object v10, v9, LFc;->g:Ljava/lang/Class;

    iput-object v13, v9, LFc;->h:LBb;

    move-object/from16 v10, p7

    iput-object v10, v9, LFc;->k:Ljava/lang/Class;

    iput-object v6, v9, LFc;->o:Lwu;

    iput-object v8, v9, LFc;->i:Lvt;

    move-object/from16 v10, p10

    iput-object v10, v9, LFc;->j:Ljava/util/Map;

    move/from16 v10, p11

    iput-boolean v10, v9, LFc;->q:Z

    move/from16 v10, p12

    iput-boolean v10, v9, LFc;->r:Z

    iput-object v0, v14, LHc;->h:LRj;

    iput-object v3, v14, LHc;->i:LSm;

    iput-object v6, v14, LHc;->j:Lwu;

    iput-object v11, v14, LHc;->k:Lkg;

    iput v4, v14, LHc;->l:I

    iput v5, v14, LHc;->m:I

    iput-object v7, v14, LHc;->n:LVd;

    iput-object v8, v14, LHc;->o:Lvt;

    iput-object v12, v14, LHc;->p:Lig;

    iput v15, v14, LHc;->q:I

    const/4 v3, 0x1

    iput v3, v14, LHc;->E:I

    iput-object v2, v14, LHc;->r:Ljava/lang/Object;

    iget-object v0, v0, LRj;->h:LD2;

    iput-object v0, v14, LHc;->s:LD2;

    sget-object v0, LHc;->G:Lut;

    invoke-virtual {v8, v0}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/function/Supplier;

    iput-object v0, v14, LHc;->t:Ljava/util/function/Supplier;

    iget-object v0, v1, Lcg;->a:Lyc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lyc;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v9, p16

    move-object/from16 v10, p17

    invoke-virtual {v12, v9, v10}, Lig;->a(Lty;Ljava/util/concurrent/Executor;)V

    monitor-enter v12

    :try_start_1
    iput-object v14, v12, Lig;->t:LHc;

    invoke-virtual {v14, v3}, LHc;->h(I)I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, v12, Lig;->m:Z

    if-eqz v0, :cond_3

    iget-object v0, v12, Lig;->i:LWj;

    goto :goto_1

    :cond_3
    iget-object v0, v12, Lig;->h:LWj;

    goto :goto_1

    :cond_4
    :goto_0
    iget-object v0, v12, Lig;->g:LWj;

    :goto_1
    invoke-virtual {v0, v14}, LWj;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v12

    sget-boolean v0, Lcg;->h:Z

    if-eqz v0, :cond_5

    sget v0, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    new-instance v0, Lw4;

    invoke-direct {v0, v1, v9, v12}, Lw4;-><init>(Lcg;Lty;Lig;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method
