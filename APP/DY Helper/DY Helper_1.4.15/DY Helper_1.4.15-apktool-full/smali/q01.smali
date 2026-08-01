.class public abstract Lq01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lur;


# instance fields
.field public ε:Lq01;

.field public ζ:Lmp;

.field public η:I

.field public θ:I

.field public ι:Lq01;

.field public κ:Lq01;

.field public λ:Ld41;

.field public μ:Lq31;

.field public ν:Z

.field public ξ:Z

.field public ο:Z

.field public π:Z

.field public ρ:Ly0;

.field public σ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lq01;->ε:Lq01;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lq01;->θ:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public А(Lq01;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq01;->ε:Lq01;

    .line 2
    .line 3
    return-void
.end method

.method public Б(Lq31;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq01;->μ:Lq31;

    .line 2
    .line 3
    return-void
.end method

.method public final у()Lbq;
    .locals 3

    .line 1
    iget-object v0, p0, Lq01;->ζ:Lmp;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getCoroutineContext()Lup;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getCoroutineContext()Lup;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lxn0;->ζ:Lxn0;

    .line 22
    .line 23
    invoke-interface {v1, v2}, Lup;->θ(Ltp;)Lsp;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lfo0;

    .line 28
    .line 29
    new-instance v2, Lzn0;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Lzn0;-><init>(Lfo0;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v2}, Lup;->η(Lup;)Lup;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lyh;->β(Lup;)Lmp;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lq01;->ζ:Lmp;

    .line 43
    .line 44
    :cond_0
    return-object v0
.end method

.method public ф()Z
    .locals 0

    .line 1
    instance-of p0, p0, Lo8;

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public х()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq01;->σ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "node attached multiple times"

    .line 6
    .line 7
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lq01;->μ:Lq31;

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
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lq01;->σ:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lq01;->ο:Z

    .line 24
    .line 25
    return-void
.end method

.method public ц()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lq01;->σ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot detach a node that is not attached"

    .line 6
    .line 7
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lq01;->ο:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Must run runAttachLifecycle() before markAsDetached()"

    .line 15
    .line 16
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-boolean v0, p0, Lq01;->π:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "Must run runDetachLifecycle() before markAsDetached()"

    .line 24
    .line 25
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lq01;->σ:Z

    .line 30
    .line 31
    iget-object v0, p0, Lq01;->ζ:Lmp;

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    new-instance v1, Lu01;

    .line 36
    .line 37
    const-string v2, "The Modifier.Node was detached"

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v0, Lmp;->ε:Lup;

    .line 43
    .line 44
    sget-object v3, Lxn0;->ζ:Lxn0;

    .line 45
    .line 46
    invoke-interface {v2, v3}, Lup;->θ(Ltp;)Lsp;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lfo0;

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Lfo0;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lq01;->ζ:Lmp;

    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    const-string p0, "Scope cannot be cancelled because it does not have a job: "

    .line 62
    .line 63
    invoke-static {v0, p0}, Lγ;->π(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void
.end method

.method public ч()V
    .locals 0

    .line 1
    return-void
.end method

.method public ш()V
    .locals 0

    .line 1
    return-void
.end method

.method public щ()V
    .locals 0

    .line 1
    return-void
.end method

.method public э()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq01;->σ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "reset() called on an unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lq01;->щ()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public ю()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq01;->σ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Must run markAsAttached() prior to runAttachLifecycle"

    .line 6
    .line 7
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lq01;->ο:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Must run runAttachLifecycle() only once after markAsAttached()"

    .line 15
    .line 16
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lq01;->ο:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Lq01;->ч()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lq01;->π:Z

    .line 27
    .line 28
    return-void
.end method

.method public я()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq01;->σ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "node detached multiple times"

    .line 6
    .line 7
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lq01;->μ:Lq31;

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
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-boolean v0, p0, Lq01;->π:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    .line 25
    .line 26
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lq01;->π:Z

    .line 31
    .line 32
    iget-object v0, p0, Lq01;->ρ:Ly0;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Ly0;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_3
    invoke-virtual {p0}, Lq01;->ш()V

    .line 40
    .line 41
    .line 42
    return-void
.end method
