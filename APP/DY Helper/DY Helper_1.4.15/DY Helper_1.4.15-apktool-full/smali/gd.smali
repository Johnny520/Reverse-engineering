.class public final Lgd;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lc41;
.implements Lcd;
.implements Lbw;


# instance fields
.field public final τ:Lhd;

.field public υ:Z

.field public final φ:Lθ;


# direct methods
.method public constructor <init>(Lhd;Lθ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq01;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgd;->τ:Lhd;

    .line 5
    .line 6
    iput-object p2, p0, Lgd;->φ:Lθ;

    .line 7
    .line 8
    iput-object p0, p1, Lhd;->ε:Lcd;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getLayoutDirection()Lnp0;
    .locals 0

    .line 1
    invoke-static {p0}, Lh62;->ц(Lur;)Lyp0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lyp0;->Δ:Lnp0;

    .line 6
    .line 7
    return-object p0
.end method

.method public final Ζ()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgd;->В()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Μ(Laq0;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lgd;->υ:Z

    .line 2
    .line 3
    iget-object v1, p0, Lgd;->τ:Lhd;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, v1, Lhd;->ζ:Ln;

    .line 9
    .line 10
    new-instance v0, Ly0;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v0, p0, v2, v1}, Ly0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Lln0;->а(Lq01;Lp70;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lhd;->ζ:Ln;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lgd;->υ:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "DrawResult not defined, did you forget to call onDraw?"

    .line 28
    .line 29
    invoke-static {p0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    iget-object p0, v1, Lhd;->ζ:Ln;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La80;

    .line 42
    .line 43
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final α()J
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p0, v0}, Lh62;->ф(Lur;I)Lq31;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-wide v0, p0, Lch1;->η:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Ls1;->Ζ(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final β()Lyr;
    .locals 0

    .line 1
    invoke-static {p0}, Lh62;->ц(Lur;)Lyp0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lyp0;->Γ:Lyr;

    .line 6
    .line 7
    return-object p0
.end method

.method public final ζ()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgd;->В()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final В()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lgd;->υ:Z

    .line 3
    .line 4
    iget-object v0, p0, Lgd;->τ:Lhd;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lhd;->ζ:Ln;

    .line 8
    .line 9
    invoke-static {p0}, Lyh;->Σ(Lbw;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final м()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgd;->В()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final р()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgd;->В()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ш()V
    .locals 0

    .line 1
    return-void
.end method

.method public final щ()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgd;->В()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
