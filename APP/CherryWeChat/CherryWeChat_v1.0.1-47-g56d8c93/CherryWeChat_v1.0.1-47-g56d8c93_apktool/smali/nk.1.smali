.class public final Lnk;
.super Lbc;
.source ""

# interfaces
.implements Lqd;


# instance fields
.field public final b:Landroid/os/Handler;

.field public final c:Z

.field public final d:Lnk;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Z)V
    .locals 1

    invoke-direct {p0}, Lbc;-><init>()V

    iput-object p1, p0, Lnk;->b:Landroid/os/Handler;

    iput-boolean p2, p0, Lnk;->c:Z

    if-eqz p2, :cond_0

    move-object p2, p0

    goto :goto_0

    :cond_0
    new-instance p2, Lnk;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Lnk;-><init>(Landroid/os/Handler;Z)V

    :goto_0
    iput-object p2, p0, Lnk;->d:Lnk;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lnk;

    if-eqz v0, :cond_0

    check-cast p1, Lnk;

    iget-object v0, p1, Lnk;->b:Landroid/os/Handler;

    iget-object v1, p0, Lnk;->b:Landroid/os/Handler;

    if-ne v0, v1, :cond_0

    iget-boolean p1, p1, Lnk;->c:Z

    iget-boolean v0, p0, Lnk;->c:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(JLM6;)V
    .locals 4

    new-instance v0, Ln3;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p3, p0}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v3, p1, v1

    if-lez v3, :cond_0

    move-wide p1, v1

    :cond_0
    iget-object v1, p0, Lnk;->b:Landroid/os/Handler;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lmk;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0, v0}, Lmk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, LJ6;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p1}, LJ6;-><init>(ILjava/lang/Object;)V

    invoke-static {p3, p2}, LTB;->r(LM6;LJ6;)V

    return-void

    :cond_1
    iget-object p1, p3, LM6;->e:Lac;

    invoke-virtual {p0, p1, v0}, Lnk;->w(Lac;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lnk;->b:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lnk;->c:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public final t(Lac;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lnk;->b:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lnk;->w(Lac;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    iget-object v0, v0, Lnk;->d:Lnk;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lnk;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lnk;->c:Z

    if-eqz v1, :cond_2

    const-string v1, ".immediate"

    invoke-static {v0, v1}, LEy;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final u(Lac;)Z
    .locals 1

    iget-boolean p1, p0, Lnk;->c:Z

    if-eqz p1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, Lnk;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final w(Lac;Ljava/lang/Runnable;)V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lgf;->f:Lgf;

    invoke-interface {p1, v1}, Lac;->m(LZb;)LYb;

    move-result-object v1

    check-cast v1, Ldm;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ldm;->r(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LVc;->b:LVc;

    invoke-virtual {v0, p1, p2}, LVc;->t(Lac;Ljava/lang/Runnable;)V

    return-void
.end method
