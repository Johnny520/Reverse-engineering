.class public final Lqt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lhr0;
.implements Lr92;
.implements Lkq1;


# instance fields
.field public final ε:Ljr0;

.field public final ζ:Ln5;

.field public final η:Lq92;

.field public θ:Z

.field public ι:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljr0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljr0;-><init>(Lhr0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lqt0;->ε:Ljr0;

    .line 10
    .line 11
    new-instance v1, Ljq1;

    .line 12
    .line 13
    new-instance v2, Lη;

    .line 14
    .line 15
    const/16 v3, 0xe

    .line 16
    .line 17
    invoke-direct {v2, v3, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0, v2}, Ljq1;-><init>(Lkq1;Lη;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Ln5;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Ln5;-><init>(Ljq1;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lqt0;->ζ:Ln5;

    .line 29
    .line 30
    new-instance v3, Lq92;

    .line 31
    .line 32
    invoke-direct {v3}, Lq92;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, Lqt0;->η:Lq92;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljq1;->α()V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    invoke-virtual {v2, p0}, Ln5;->Π(Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    const-string p0, "setCurrentState"

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljr0;->γ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lcr0;->ι:Lcr0;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljr0;->ε(Lcr0;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final α()Ln5;
    .locals 0

    .line 1
    iget-object p0, p0, Lqt0;->ζ:Ln5;

    .line 2
    .line 3
    iget-object p0, p0, Ln5;->η:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ln5;

    .line 6
    .line 7
    return-object p0
.end method

.method public final γ()Lq92;
    .locals 0

    .line 1
    iget-object p0, p0, Lqt0;->η:Lq92;

    .line 2
    .line 3
    return-object p0
.end method

.method public final δ()Ljr0;
    .locals 0

    .line 1
    iget-object p0, p0, Lqt0;->ε:Ljr0;

    .line 2
    .line 3
    return-object p0
.end method
