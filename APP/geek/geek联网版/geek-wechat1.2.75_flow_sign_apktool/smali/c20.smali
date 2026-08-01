.class public abstract Lc20;
.super Lnj;


# instance fields
.field public c:Loe;


# virtual methods
.method public final d(Lhe;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc20;->c:Loe;

    .line 2
    .line 3
    sget-object v0, Loe;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 4
    .line 5
    sget-object v0, Ld60;->g:Lb60;

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Loe;->b(Ljava/lang/Runnable;Lb60;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
