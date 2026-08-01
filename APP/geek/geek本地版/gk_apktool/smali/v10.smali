.class public abstract Lv10;
.super Llj;


# instance fields
.field public c:Lne;


# virtual methods
.method public final d(Lge;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lv10;->c:Lne;

    .line 2
    .line 3
    sget-object v0, Lne;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 4
    .line 5
    sget-object v0, Lx50;->g:Lv50;

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Lne;->b(Ljava/lang/Runnable;Lv50;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
