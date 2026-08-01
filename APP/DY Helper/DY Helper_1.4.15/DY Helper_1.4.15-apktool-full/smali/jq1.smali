.class public final Ljq1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lkq1;

.field public final β:Lη;

.field public final γ:Lzz1;

.field public final δ:Ljava/util/LinkedHashMap;

.field public ε:Z

.field public ζ:Landroid/os/Bundle;

.field public η:Z

.field public θ:Z


# direct methods
.method public constructor <init>(Lkq1;Lη;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljq1;->α:Lkq1;

    .line 5
    .line 6
    iput-object p2, p0, Ljq1;->β:Lη;

    .line 7
    .line 8
    new-instance p1, Lzz1;

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0}, Lzz1;-><init>(IZ)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ljq1;->γ:Lzz1;

    .line 16
    .line 17
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ljq1;->δ:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Ljq1;->θ:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljq1;->α:Lkq1;

    .line 2
    .line 3
    invoke-interface {v0}, Lhr0;->δ()Ljr0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Ljr0;->γ:Lcr0;

    .line 8
    .line 9
    sget-object v2, Lcr0;->ζ:Lcr0;

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, Ljq1;->ε:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Ljq1;->β:Lη;

    .line 18
    .line 19
    invoke-virtual {v1}, Lη;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Lhr0;->δ()Ljr0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Liq1;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Liq1;-><init>(Ljq1;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljr0;->α(Lgr0;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Ljq1;->ε:Z

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string p0, "SavedStateRegistry was already attached."

    .line 39
    .line 40
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    const-string p0, "Restarter must be created only during owner\'s initialization stage"

    .line 45
    .line 46
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
