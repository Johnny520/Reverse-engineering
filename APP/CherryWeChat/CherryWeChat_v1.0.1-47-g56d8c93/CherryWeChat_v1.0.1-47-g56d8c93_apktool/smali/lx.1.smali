.class public abstract Llx;
.super Lyg;
.source ""


# instance fields
.field public b:Lec;


# virtual methods
.method public final t(Lac;Ljava/lang/Runnable;)V
    .locals 1

    iget-object p1, p0, Llx;->b:Lec;

    sget-object v0, Lec;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lec;->f(Ljava/lang/Runnable;Z)V

    return-void
.end method
