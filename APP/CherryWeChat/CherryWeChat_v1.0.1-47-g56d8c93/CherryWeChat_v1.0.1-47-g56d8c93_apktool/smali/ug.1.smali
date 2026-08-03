.class public abstract Lug;
.super Lbc;
.source ""


# instance fields
.field public b:J

.field public c:Z

.field public d:LD4;


# virtual methods
.method public A(JLrg;)V
    .locals 1

    sget-object v0, LPc;->h:LPc;

    invoke-virtual {v0, p1, p2, p3}, Ltg;->G(JLrg;)V

    return-void
.end method

.method public abstract shutdown()V
.end method

.method public final w()V
    .locals 4

    iget-wide v0, p0, Lug;->b:J

    const-wide v2, 0x100000000L

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lug;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lug;->c:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lug;->shutdown()V

    :cond_1
    :goto_0
    return-void
.end method

.method public abstract x()Ljava/lang/Thread;
.end method

.method public final y(Z)V
    .locals 4

    iget-wide v0, p0, Lug;->b:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Lug;->b:J

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lug;->c:Z

    :cond_1
    return-void
.end method

.method public final z()Z
    .locals 3

    iget-object v0, p0, Lug;->d:LD4;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LD4;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LD4;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Lge;

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {v0}, Lge;->run()V

    const/4 v0, 0x1

    return v0
.end method
