.class public final Ldp0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfn1;
.implements Lwp;


# instance fields
.field public final ε:Lup;

.field public final ζ:Le80;

.field public final η:Lmp;

.field public θ:Lxz1;


# direct methods
.method public constructor <init>(Lup;Le80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldp0;->ε:Lup;

    .line 5
    .line 6
    iput-object p2, p0, Ldp0;->ζ:Le80;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lup;->η(Lup;)Lup;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lyh;->β(Lup;)Lmp;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Ldp0;->η:Lmp;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final getKey()Ltp;
    .locals 0

    .line 1
    sget-object p0, Lx;->Ε:Lx;

    .line 2
    .line 3
    return-object p0
.end method

.method public final α()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldp0;->θ:Lxz1;

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
    invoke-virtual {v0, v2}, Lfo0;->σ(Ljava/util/concurrent/CancellationException;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ldp0;->ζ:Le80;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    iget-object v3, p0, Ldp0;->η:Lmp;

    .line 23
    .line 24
    invoke-static {v3, v1, v0, v2}, Lln0;->Ρ(Lbq;Lup;Le80;I)Lxz1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Ldp0;->θ:Lxz1;

    .line 29
    .line 30
    return-void
.end method

.method public final β()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldp0;->θ:Lxz1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lnf;

    .line 6
    .line 7
    invoke-direct {v1}, Lnf;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lfo0;->σ(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Ldp0;->θ:Lxz1;

    .line 15
    .line 16
    return-void
.end method

.method public final γ()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldp0;->θ:Lxz1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lnf;

    .line 6
    .line 7
    invoke-direct {v1}, Lnf;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lfo0;->σ(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Ldp0;->θ:Lxz1;

    .line 15
    .line 16
    return-void
.end method

.method public final η(Lup;)Lup;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->Θ(Lsp;Lup;)Lup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final θ(Ltp;)Lsp;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->υ(Lsp;Ltp;)Lsp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final κ(Lup;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object v0, Lxn;->ζ:Li2;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lup;->θ(Ltp;)Lsp;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lxn;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lp3;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v1, v0, v2, p0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2, v1}, Ljx0;->д(Ljava/lang/Throwable;Lp70;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Ldp0;->ε:Lup;

    .line 21
    .line 22
    sget-object v0, Lx;->Ε:Lx;

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lup;->θ(Ltp;)Lsp;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lwp;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, Lwp;->κ(Lup;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    throw p2
.end method

.method public final λ(Le80;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ξ(Ltp;)Lup;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->Δ(Lsp;Ltp;)Lup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
