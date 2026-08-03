.class public final Li0/r0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/a2;
.implements Lqg/r;


# instance fields
.field public final g:Lwf/g;

.field public final h:Lfg/p;

.field public final i:Lvg/c;

.field public j:Lqg/e1;


# direct methods
.method public constructor <init>(Lwf/g;Lfg/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/r0;->g:Lwf/g;

    .line 5
    .line 6
    iput-object p2, p0, Li0/r0;->h:Lfg/p;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lqg/v;->a(Lwf/g;)Lvg/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Li0/r0;->i:Lvg/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/r0;->j:Lqg/e1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Li0/c0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Li0/c0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lqg/y0;->x(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Li0/r0;->j:Lqg/e1;

    .line 16
    .line 17
    return-void
.end method

.method public final e(Lwf/g;)Lwf/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/r0;->j:Lqg/e1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Li0/c0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Li0/c0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lqg/y0;->x(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Li0/r0;->j:Lqg/e1;

    .line 16
    .line 17
    return-void
.end method

.method public final getKey()Lwf/f;
    .locals 1

    .line 1
    sget-object v0, Lqg/q;->g:Lqg/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Li0/r0;->j:Lqg/e1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 7
    .line 8
    const-string v3, "Old job was still running!"

    .line 9
    .line 10
    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Li0/r0;->h:Lfg/p;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    iget-object v3, p0, Li0/r0;->i:Lvg/c;

    .line 23
    .line 24
    invoke-static {v3, v1, v0, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Li0/r0;->j:Lqg/e1;

    .line 29
    .line 30
    return-void
.end method

.method public final k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final m(Ljava/lang/Throwable;Lwf/g;)V
    .locals 3

    .line 1
    sget-object v0, Lx0/d;->h:Luf/d;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx0/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lwb/xi;

    .line 12
    .line 13
    const/16 v2, 0x18

    .line 14
    .line 15
    invoke-direct {v1, v0, v2, p0}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1}, Lig/a;->b0(Ljava/lang/Throwable;Lfg/a;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Li0/r0;->g:Lwf/g;

    .line 22
    .line 23
    sget-object v1, Lqg/q;->g:Lqg/q;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lqg/r;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-interface {v0, p1, p2}, Lqg/r;->m(Ljava/lang/Throwable;Lwf/g;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    throw p1
.end method

.method public final s(Lwf/f;)Lwf/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->w(Lwf/e;Lwf/f;)Lwf/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final t(Lwf/f;)Lwf/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->l0(Lwf/e;Lwf/f;)Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
