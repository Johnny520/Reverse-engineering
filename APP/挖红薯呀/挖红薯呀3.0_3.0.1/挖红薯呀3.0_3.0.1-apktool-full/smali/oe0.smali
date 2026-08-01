.class public abstract Loe0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lrm;


# instance fields
.field public d:Loe0;

.field public e:Lhk;

.field public f:I

.field public g:I

.field public h:Loe0;

.field public i:Loe0;

.field public j:Lnk0;

.field public k:Lqj0;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Lm3;

.field public q:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Loe0;->d:Loe0;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Loe0;->g:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final k0()Lyk;
    .locals 3

    .line 1
    iget-object v0, p0, Loe0;->e:Lhk;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lpf1;->R(Lrm;)Ldn0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lw3;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw3;->getCoroutineContext()Lpk;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0}, Lpf1;->R(Lrm;)Ldn0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lw3;

    .line 20
    .line 21
    invoke-virtual {v1}, Lw3;->getCoroutineContext()Lpk;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Ln2;->I:Ln2;

    .line 26
    .line 27
    invoke-interface {v1, v2}, Lpk;->l(Lok;)Lnk;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lc40;

    .line 32
    .line 33
    new-instance v2, Le40;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Le40;-><init>(Lc40;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v2}, Lpk;->h(Lpk;)Lpk;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lp30;->e(Lpk;)Lhk;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Loe0;->e:Lhk;

    .line 47
    .line 48
    :cond_0
    return-object v0
.end method

.method public l0()Z
    .locals 0

    .line 1
    instance-of p0, p0, Lt9;

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public m0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "node attached multiple times"

    .line 6
    .line 7
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Loe0;->k:Lqj0;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "attach invoked on a node without a coordinator"

    .line 16
    .line 17
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Loe0;->q:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Loe0;->n:Z

    .line 24
    .line 25
    return-void
.end method

.method public n0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot detach a node that is not attached"

    .line 6
    .line 7
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Loe0;->n:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Must run runAttachLifecycle() before markAsDetached()"

    .line 15
    .line 16
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-boolean v0, p0, Loe0;->o:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "Must run runDetachLifecycle() before markAsDetached()"

    .line 24
    .line 25
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Loe0;->q:Z

    .line 30
    .line 31
    iget-object v0, p0, Loe0;->e:Lhk;

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    new-instance v1, Lse0;

    .line 36
    .line 37
    const-string v2, "The Modifier.Node was detached"

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-direct {v1, v2, v3}, Ldr0;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v0, Lhk;->d:Lpk;

    .line 44
    .line 45
    sget-object v3, Ln2;->I:Ln2;

    .line 46
    .line 47
    invoke-interface {v2, v3}, Lpk;->l(Lok;)Lnk;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lc40;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-interface {v2, v1}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Loe0;->e:Lhk;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    const-string p0, "Scope cannot be cancelled because it does not have a job: "

    .line 63
    .line 64
    invoke-static {v0, p0}, Lxc;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method public o0()V
    .locals 0

    .line 1
    return-void
.end method

.method public p0()V
    .locals 0

    .line 1
    return-void
.end method

.method public q0()V
    .locals 0

    .line 1
    return-void
.end method

.method public r0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "reset() called on an unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Loe0;->q0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public s0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Must run markAsAttached() prior to runAttachLifecycle"

    .line 6
    .line 7
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Loe0;->n:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Must run runAttachLifecycle() only once after markAsAttached()"

    .line 15
    .line 16
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Loe0;->n:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Loe0;->o0()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Loe0;->o:Z

    .line 27
    .line 28
    return-void
.end method

.method public t0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "node detached multiple times"

    .line 6
    .line 7
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Loe0;->k:Lqj0;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "detach invoked on a node without a coordinator"

    .line 16
    .line 17
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-boolean v0, p0, Loe0;->o:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    .line 25
    .line 26
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Loe0;->o:Z

    .line 31
    .line 32
    iget-object v0, p0, Loe0;->p:Lm3;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Lm3;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_3
    invoke-virtual {p0}, Loe0;->p0()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public u0(Loe0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Loe0;->d:Loe0;

    .line 2
    .line 3
    return-void
.end method

.method public v0(Lqj0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Loe0;->k:Lqj0;

    .line 2
    .line 3
    return-void
.end method
