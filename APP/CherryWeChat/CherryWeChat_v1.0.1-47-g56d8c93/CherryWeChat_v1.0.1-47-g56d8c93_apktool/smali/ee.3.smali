.class public final Lee;
.super Lge;
.source ""

# interfaces
.implements Lhc;
.implements LEb;


# static fields
.field public static final synthetic h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _reusableCancellableContinuation$volatile:Ljava/lang/Object;

.field public final d:Lbc;

.field public final e:LFb;

.field public f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation$volatile"

    const-class v2, Lee;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lee;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lbc;LFb;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lge;-><init>(I)V

    iput-object p1, p0, Lee;->d:Lbc;

    iput-object p2, p0, Lee;->e:LFb;

    sget-object p1, LfG;->b:Lv1;

    iput-object p1, p0, Lee;->f:Ljava/lang/Object;

    iget-object p1, p2, LFb;->b:Lac;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v0, LGu;->k:LH7;

    invoke-interface {p1, p2, v0}, Lac;->q(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lee;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()LEb;
    .locals 0

    return-object p0
.end method

.method public final c()Lhc;
    .locals 1

    iget-object v0, p0, Lee;->e:LFb;

    return-object v0
.end method

.method public final e()Lac;
    .locals 1

    iget-object v0, p0, Lee;->e:LFb;

    iget-object v0, v0, LFb;->b:Lac;

    return-object v0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 9

    invoke-static {p1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v2, p1

    goto :goto_0

    :cond_0
    new-instance v2, LEa;

    invoke-direct {v2, v0, v1}, LEa;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    iget-object v0, p0, Lee;->d:Lbc;

    iget-object v3, p0, Lee;->e:LFb;

    iget-object v4, v3, LFb;->b:Lac;

    :try_start_0
    invoke-virtual {v0, v4}, Lbc;->u(Lac;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v5, :cond_1

    iput-object v2, p0, Lee;->f:Ljava/lang/Object;

    iput v1, p0, Lge;->c:I

    invoke-static {v0, v4, p0}, LfG;->m0(Lbc;Lac;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-static {}, LaB;->a()Lug;

    move-result-object v0

    iget-wide v5, v0, Lug;->b:J

    const-wide v7, 0x100000000L

    cmp-long v5, v5, v7

    if-ltz v5, :cond_3

    iput-object v2, p0, Lee;->f:Ljava/lang/Object;

    iput v1, p0, Lge;->c:I

    iget-object p1, v0, Lug;->d:LD4;

    if-nez p1, :cond_2

    new-instance p1, LD4;

    invoke-direct {p1}, LD4;-><init>()V

    iput-object p1, v0, Lug;->d:LD4;

    :cond_2
    invoke-virtual {p1, p0}, LD4;->addLast(Ljava/lang/Object;)V

    return-void

    :cond_3
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lug;->y(Z)V

    :try_start_1
    iget-object v1, p0, Lee;->g:Ljava/lang/Object;

    invoke-static {v4, v1}, LGu;->E(Lac;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v3, p1}, Lu5;->f(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {v4, v1}, LGu;->B(Lac;Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v0}, Lug;->z()Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p1, :cond_4

    :goto_1
    invoke-virtual {v0}, Lug;->w()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-static {v4, v1}, LGu;->B(Lac;Ljava/lang/Object;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    :try_start_5
    invoke-virtual {p0, p1}, Lge;->h(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :goto_3
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lug;->w()V

    throw p1

    :catchall_3
    move-exception p1

    new-instance v1, Lde;

    invoke-direct {v1, p1, v0, v4}, Lde;-><init>(Ljava/lang/Throwable;Lbc;Lac;)V

    throw v1
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lee;->f:Ljava/lang/Object;

    sget-object v1, LfG;->b:Lv1;

    iput-object v1, p0, Lee;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DispatchedContinuation["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lee;->d:Lbc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lee;->e:LFb;

    invoke-static {v1}, LDc;->u(LEb;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
