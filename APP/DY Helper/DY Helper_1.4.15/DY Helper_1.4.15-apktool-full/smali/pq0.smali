.class public final Lpq0;
.super Lxz1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final θ:Lop;


# direct methods
.method public constructor <init>(Lup;Le80;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lο;-><init>(Lup;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p0, p2}, Lxb;->ρ(Lop;Lop;Le80;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lpq0;->θ:Lop;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final Σ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lpq0;->θ:Lop;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lxb;->Θ(Lop;)Lop;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ls62;->α:Ls62;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljx0;->Ψ(Lop;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Leo1;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lο;->ζ(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method
