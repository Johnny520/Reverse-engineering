.class public final Lsg/o;
.super Lqg/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lsg/g;
.implements Lsg/p;


# instance fields
.field public final j:Lsg/c;


# direct methods
.method public constructor <init>(Lwf/g;Lsg/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lqg/a;-><init>(Lwf/g;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lsg/o;->j:Lsg/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    sget-object v0, Lqg/y0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lqg/n;

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    instance-of v1, v0, Lqg/x0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Lqg/x0;

    .line 16
    .line 17
    invoke-virtual {v0}, Lqg/x0;->e()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-nez p1, :cond_1

    .line 25
    .line 26
    new-instance p1, Lqg/s0;

    .line 27
    .line 28
    invoke-virtual {p0}, Lqg/a;->z()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {p1, v0, v1, p0}, Lqg/s0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lqg/y0;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, p1}, Lsg/o;->x(Ljava/util/concurrent/CancellationException;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
.end method

.method public final a0(Ljava/lang/Throwable;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsg/o;->j:Lsg/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lsg/c;->h(Ljava/lang/Throwable;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Lqg/a;->i:Lwf/g;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lqg/v;->m(Ljava/lang/Throwable;Lwf/g;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final b0(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lsf/n;

    .line 2
    .line 3
    iget-object p1, p0, Lsg/o;->j:Lsg/c;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v1, v0}, Lsg/c;->h(Ljava/lang/Throwable;Z)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/o;->j:Lsg/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsg/c;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f(Lwf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/o;->j:Lsg/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lsg/c;->f(Lwf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final iterator()Lsg/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lsg/o;->j:Lsg/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lsg/b;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lsg/b;-><init>(Lsg/c;)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/o;->j:Lsg/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final q(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/o;->j:Lsg/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lsg/p;->q(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final x(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsg/o;->j:Lsg/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lsg/c;->h(Ljava/lang/Throwable;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lqg/y0;->v(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
