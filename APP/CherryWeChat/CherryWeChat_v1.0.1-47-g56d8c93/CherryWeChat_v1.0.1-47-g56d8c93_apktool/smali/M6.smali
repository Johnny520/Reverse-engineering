.class public final LM6;
.super Lge;
.source ""

# interfaces
.implements LEb;
.implements Lhc;


# static fields
.field public static final synthetic f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decisionAndIndex$volatile:I

.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public final d:LEb;

.field public final e:Lac;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_decisionAndIndex$volatile"

    const-class v1, LM6;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LM6;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "_state$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LM6;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LM6;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LEb;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lge;-><init>(I)V

    iput-object p1, p0, LM6;->d:LEb;

    invoke-interface {p1}, LEb;->e()Lac;

    move-result-object p1

    iput-object p1, p0, LM6;->e:Lac;

    const p1, 0x1fffffff

    iput p1, p0, LM6;->_decisionAndIndex$volatile:I

    sget-object p1, LJ0;->a:LJ0;

    iput-object p1, p0, LM6;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method public static o(LJ6;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", already has "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static q(LM6;Ljava/lang/Object;I)V
    .locals 6

    :goto_0
    sget-object v0, LM6;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LWs;

    const/4 v3, 0x1

    if-eqz v2, :cond_9

    move-object v2, v1

    check-cast v2, LWs;

    instance-of v4, p1, LEa;

    if-eqz v4, :cond_1

    :cond_0
    :goto_1
    move-object v2, p1

    goto :goto_3

    :cond_1
    if-eq p2, v3, :cond_2

    const/4 v3, 0x2

    if-ne p2, v3, :cond_0

    :cond_2
    instance-of v3, v2, LJ6;

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    new-instance v3, LCa;

    instance-of v4, v2, LJ6;

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    check-cast v2, LJ6;

    goto :goto_2

    :cond_4
    move-object v2, v5

    :goto_2
    const/16 v4, 0x10

    invoke-direct {v3, p1, v2, v5, v4}, LCa;-><init>(Ljava/lang/Object;LJ6;Ljava/lang/Throwable;I)V

    move-object v2, v3

    :cond_5
    :goto_3
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p0}, LM6;->n()Z

    move-result p1

    if-nez p1, :cond_7

    sget-object p1, LM6;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje;

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v0}, Lje;->a()V

    sget-object v0, LVs;->a:LVs;

    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    :goto_4
    invoke-virtual {p0, p2}, LM6;->l(I)V

    return-void

    :cond_8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_5

    goto :goto_0

    :cond_9
    instance-of p0, v1, LP6;

    if-eqz p0, :cond_a

    check-cast v1, LP6;

    sget-object p0, LP6;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 p2, 0x0

    invoke-virtual {p0, v1, p2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result p0

    if-eqz p0, :cond_a

    return-void

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Already resumed, but proposed with update "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 5

    :goto_0
    sget-object v0, LM6;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LWs;

    if-nez v2, :cond_9

    instance-of v2, v1, LEa;

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v2, v1, LCa;

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    move-object v2, v1

    check-cast v2, LCa;

    iget-object v4, v2, LCa;->e:Ljava/lang/Throwable;

    if-nez v4, :cond_4

    const/16 v4, 0xf

    invoke-static {v2, v3, p1, v4}, LCa;->a(LCa;LJ6;Ljava/lang/Throwable;I)LCa;

    move-result-object v3

    :cond_1
    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v0, v2, LCa;->b:LJ6;

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0, p1}, LM6;->j(LJ6;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v0, v2, LCa;->c:LIm;

    if-eqz v0, :cond_7

    iget-object v1, v2, LCa;->a:Ljava/lang/Object;

    iget-object v2, p0, LM6;->e:Lac;

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, LMc;

    check-cast v1, LTC;

    move-object v1, v2

    check-cast v1, LEb;

    new-instance v3, LIm;

    iget-object v0, v0, LIm;->e:Ln;

    invoke-direct {v3, v0, v1}, LIm;-><init>(Ln;LEb;)V

    iput-object p1, v3, LIm;->d:LMc;

    sget-object p1, LTC;->a:LTC;

    invoke-virtual {v3, p1}, LIm;->i(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    new-instance v0, LFa;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Exception in resume onCancellation handler for "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v2, v0}, LOj;->B(Lac;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v1, :cond_1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called at most once"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance v2, LCa;

    const/16 v4, 0xe

    invoke-direct {v2, v1, v3, p1, v4}, LCa;-><init>(Ljava/lang/Object;LJ6;Ljava/lang/Throwable;I)V

    :cond_6
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    return-void

    :cond_8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_6

    goto/16 :goto_0

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not completed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()LEb;
    .locals 1

    iget-object v0, p0, LM6;->d:LEb;

    return-object v0
.end method

.method public final c()Lhc;
    .locals 2

    iget-object v0, p0, LM6;->d:LEb;

    instance-of v1, v0, Lhc;

    if-eqz v1, :cond_0

    check-cast v0, Lhc;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    invoke-super {p0, p1}, Lge;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e()Lac;
    .locals 1

    iget-object v0, p0, LM6;->e:Lac;

    return-object v0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LEa;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LEa;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    iget v0, p0, Lge;->c:I

    invoke-static {p0, p1, v0}, LM6;->q(LM6;Ljava/lang/Object;I)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LCa;

    if-eqz v0, :cond_0

    check-cast p1, LCa;

    iget-object p1, p1, LCa;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    sget-object v0, LM6;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final j(LJ6;Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget v0, p1, LJ6;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, LJ6;->b:Ljava/lang/Object;

    check-cast p1, Lqg;

    invoke-virtual {p1}, Lrg;->a()V

    goto :goto_0

    :pswitch_0
    iget-object p1, p1, LJ6;->b:Ljava/lang/Object;

    check-cast p1, Lmk;

    invoke-virtual {p1, p2}, Lmk;->g(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    new-instance p2, LFa;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception in invokeOnCancellation handler for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, LM6;->e:Lac;

    invoke-static {p1, p2}, LOj;->B(Lac;Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/lang/Throwable;)V
    .locals 7

    :goto_0
    sget-object v0, LM6;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LWs;

    if-nez v2, :cond_0

    return-void

    :cond_0
    new-instance v2, LP6;

    instance-of v3, v1, LJ6;

    if-nez p1, :cond_1

    new-instance v4, Ljava/util/concurrent/CancellationException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Continuation "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " was cancelled normally"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v4, p1

    :goto_1
    invoke-direct {v2, v4, v3}, LEa;-><init>(Ljava/lang/Throwable;Z)V

    :cond_2
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object v0, v1

    check-cast v0, LWs;

    instance-of v0, v0, LJ6;

    if-eqz v0, :cond_3

    check-cast v1, LJ6;

    invoke-virtual {p0, v1, p1}, LM6;->j(LJ6;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p0}, LM6;->n()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, LM6;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Lje;->a()V

    sget-object v0, LVs;->a:LVs;

    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_2
    iget p1, p0, Lge;->c:I

    invoke-virtual {p0, p1}, LM6;->l(I)V

    return-void

    :cond_6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_2

    goto :goto_0
.end method

.method public final l(I)V
    .locals 6

    :cond_0
    sget-object v0, LM6;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    if-eqz v2, :cond_c

    const/4 v0, 0x1

    if-ne v2, v0, :cond_b

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-ne p1, v1, :cond_1

    move v1, v0

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    iget-object v3, p0, LM6;->d:LEb;

    if-nez v1, :cond_a

    instance-of v4, v3, Lee;

    if-eqz v4, :cond_a

    const/4 v4, 0x2

    if-eq p1, v0, :cond_3

    if-ne p1, v4, :cond_2

    goto :goto_1

    :cond_2
    move p1, v2

    goto :goto_2

    :cond_3
    :goto_1
    move p1, v0

    :goto_2
    iget v5, p0, Lge;->c:I

    if-eq v5, v0, :cond_4

    if-ne v5, v4, :cond_5

    :cond_4
    move v2, v0

    :cond_5
    if-ne p1, v2, :cond_a

    move-object p1, v3

    check-cast p1, Lee;

    iget-object v1, p1, Lee;->d:Lbc;

    iget-object p1, p1, Lee;->e:LFb;

    iget-object p1, p1, LFb;->b:Lac;

    :try_start_0
    invoke-virtual {v1, p1}, Lbc;->u(Lac;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v2, :cond_6

    invoke-static {v1, p1, p0}, LfG;->m0(Lbc;Lac;Ljava/lang/Runnable;)V

    return-void

    :cond_6
    invoke-static {}, LaB;->a()Lug;

    move-result-object p1

    iget-wide v1, p1, Lug;->b:J

    const-wide v4, 0x100000000L

    cmp-long v1, v1, v4

    if-ltz v1, :cond_8

    iget-object v0, p1, Lug;->d:LD4;

    if-nez v0, :cond_7

    new-instance v0, LD4;

    invoke-direct {v0}, LD4;-><init>()V

    iput-object v0, p1, Lug;->d:LD4;

    :cond_7
    invoke-virtual {v0, p0}, LD4;->addLast(Ljava/lang/Object;)V

    return-void

    :cond_8
    invoke-virtual {p1, v0}, Lug;->y(Z)V

    :try_start_1
    invoke-static {p0, v3, v0}, LTB;->A(LM6;LEb;Z)V

    :cond_9
    invoke-virtual {p1}, Lug;->z()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_9

    :goto_3
    invoke-virtual {p1}, Lug;->w()V

    goto :goto_4

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-virtual {p0, v0}, Lge;->h(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1}, Lug;->w()V

    throw v0

    :catchall_2
    move-exception v0

    new-instance v2, Lde;

    invoke-direct {v2, v0, v1, p1}, Lde;-><init>(Ljava/lang/Throwable;Lbc;Lac;)V

    throw v2

    :cond_a
    invoke-static {p0, v3, v1}, LTB;->A(LM6;LEb;Z)V

    return-void

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    const v2, 0x1fffffff

    and-int/2addr v2, v1

    const/high16 v3, 0x40000000    # 2.0f

    add-int/2addr v3, v2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_4
    return-void
.end method

.method public final m()Lje;
    .locals 4

    iget-object v0, p0, LM6;->e:Lac;

    sget-object v1, Lgf;->f:Lgf;

    invoke-interface {v0, v1}, Lac;->m(LZb;)LYb;

    move-result-object v0

    check-cast v0, Ldm;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Lg9;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Lg9;-><init>(ILjava/lang/Object;)V

    const/4 v3, 0x1

    invoke-static {v0, v3, v2}, LPj;->r(Ldm;ZLhm;)Lje;

    move-result-object v0

    :cond_1
    sget-object v2, LM6;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    return-object v0
.end method

.method public final n()Z
    .locals 2

    iget v0, p0, Lge;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LM6;->d:LEb;

    check-cast v0, Lee;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lee;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p()V
    .locals 5

    iget-object v0, p0, LM6;->d:LEb;

    instance-of v1, v0, Lee;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lee;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_9

    sget-object v1, Lee;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LfG;->c:Lv1;

    if-ne v3, v4, :cond_3

    :cond_1
    invoke-virtual {v1, v0, v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_3
    instance-of v4, v3, Ljava/lang/Throwable;

    if-eqz v4, :cond_8

    :goto_2
    invoke-virtual {v1, v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object v2, v3

    check-cast v2, Ljava/lang/Throwable;

    :goto_3
    if-nez v2, :cond_4

    goto :goto_5

    :cond_4
    sget-object v0, LM6;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lje;

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v1}, Lje;->a()V

    sget-object v1, LVs;->a:LVs;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    invoke-virtual {p0, v2}, LM6;->k(Ljava/lang/Throwable;)V

    return-void

    :cond_6
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_7

    goto :goto_2

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Inconsistent state "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_5
    return-void
.end method

.method public final r(Lbc;)V
    .locals 3

    iget-object v0, p0, LM6;->d:LEb;

    instance-of v1, v0, Lee;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lee;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, v0, Lee;->d:Lbc;

    :cond_1
    if-ne v2, p1, :cond_2

    const/4 p1, 0x4

    goto :goto_1

    :cond_2
    iget p1, p0, Lge;->c:I

    :goto_1
    sget-object v0, LTC;->a:LTC;

    invoke-static {p0, v0, p1}, LM6;->q(LM6;Ljava/lang/Object;I)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CancellableContinuation("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LM6;->d:LEb;

    invoke-static {v1}, LDc;->u(LEb;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LM6;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LWs;

    if-eqz v2, :cond_0

    const-string v1, "Active"

    goto :goto_0

    :cond_0
    instance-of v1, v1, LP6;

    if-eqz v1, :cond_1

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v1, "Completed"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LDc;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
