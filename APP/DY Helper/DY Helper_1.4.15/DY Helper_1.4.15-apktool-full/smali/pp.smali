.class public abstract Lpp;
.super Lq8;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ζ:Lup;

.field public transient η:Lop;


# direct methods
.method public constructor <init>(Lop;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lop;->γ()Lup;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, v0}, Lpp;-><init>(Lop;Lup;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lop;Lup;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lq8;-><init>(Lop;)V

    .line 14
    iput-object p2, p0, Lpp;->ζ:Lup;

    return-void
.end method


# virtual methods
.method public γ()Lup;
    .locals 0

    .line 1
    iget-object p0, p0, Lpp;->ζ:Lup;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public λ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lpp;->η:Lop;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eq v0, p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lpp;->γ()Lup;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lx;->Γ:Lx;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lup;->θ(Ltp;)Lsp;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Lkotlinx/coroutines/α;

    .line 21
    .line 22
    check-cast v0, Lgt;

    .line 23
    .line 24
    sget-object v1, Lgt;->μ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Ljx0;->ζ:Luy;

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v1, v0, Lae;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, Lae;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lae;->π()V

    .line 49
    .line 50
    .line 51
    :cond_2
    sget-object v0, Lnm;->ζ:Lnm;

    .line 52
    .line 53
    iput-object v0, p0, Lpp;->η:Lop;

    .line 54
    .line 55
    return-void
.end method
