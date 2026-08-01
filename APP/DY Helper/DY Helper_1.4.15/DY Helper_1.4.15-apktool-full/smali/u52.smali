.class public final Lu52;
.super Lf21;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ο:Lf21;

.field public final π:Z

.field public final ρ:Z

.field public σ:La80;

.field public τ:La80;

.field public final υ:J


# direct methods
.method public constructor <init>(Lf21;La80;La80;ZZ)V
    .locals 7

    .line 1
    sget-object v0, Lax1;->α:Leu1;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lf21;->Α()La80;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lax1;->κ:Lsa0;

    .line 12
    .line 13
    iget-object v0, v0, Lf21;->ε:La80;

    .line 14
    .line 15
    :cond_1
    invoke-static {p2, v0, p4}, Lax1;->λ(La80;La80;Z)La80;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lf21;->ι()La80;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-nez p2, :cond_3

    .line 26
    .line 27
    :cond_2
    sget-object p2, Lax1;->κ:Lsa0;

    .line 28
    .line 29
    iget-object p2, p2, Lf21;->ζ:La80;

    .line 30
    .line 31
    :cond_3
    invoke-static {p3, p2}, Lax1;->μ(La80;La80;)La80;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    sget-object v4, Lyw1;->ι:Lyw1;

    .line 38
    .line 39
    move-object v1, p0

    .line 40
    invoke-direct/range {v1 .. v6}, Lf21;-><init>(JLyw1;La80;La80;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, v1, Lu52;->ο:Lf21;

    .line 44
    .line 45
    iput-boolean p4, v1, Lu52;->π:Z

    .line 46
    .line 47
    iput-boolean p5, v1, Lu52;->ρ:Z

    .line 48
    .line 49
    iget-object p0, v1, Lf21;->ε:La80;

    .line 50
    .line 51
    iput-object p0, v1, Lu52;->σ:La80;

    .line 52
    .line 53
    iget-object p0, v1, Lf21;->ζ:La80;

    .line 54
    .line 55
    iput-object p0, v1, Lu52;->τ:La80;

    .line 56
    .line 57
    invoke-static {}, Li91;->θ()J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    iput-wide p0, v1, Lu52;->υ:J

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final Α()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Lu52;->σ:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Δ(Lc21;)V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final Ε(La80;La80;)Lf21;
    .locals 8

    .line 1
    iget-object v0, p0, Lu52;->σ:La80;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lax1;->λ(La80;La80;Z)La80;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    iget-object p1, p0, Lu52;->τ:La80;

    .line 9
    .line 10
    invoke-static {p2, p1}, Lax1;->μ(La80;La80;)La80;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget-boolean p1, p0, Lu52;->π:Z

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1, v5}, Lf21;->Ε(La80;La80;)Lf21;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v2, Lu52;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x1

    .line 31
    invoke-direct/range {v2 .. v7}, Lu52;-><init>(Lf21;La80;La80;ZZ)V

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_0
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v4, v5}, Lf21;->Ε(La80;La80;)Lf21;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final Ζ()Lf21;
    .locals 0

    .line 1
    iget-object p0, p0, Lu52;->ο:Lf21;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lax1;->κ:Lsa0;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method

.method public final γ()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ltw1;->γ:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lu52;->ρ:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lu52;->ο:Lf21;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lf21;->γ()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final δ()Lyw1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ltw1;->δ()Lyw1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ε()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Lu52;->σ:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lf21;->ζ()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final η()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ltw1;->η()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final θ()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lf21;->θ()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ι()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Lu52;->τ:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final λ()V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final μ()V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final ν()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lf21;->ν()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ξ(Li02;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lf21;->ξ(Li02;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final σ(Lyw1;)V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final τ(J)V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final υ(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lf21;->υ(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final φ(La80;)Ltw1;
    .locals 2

    .line 1
    iget-object v0, p0, Lu52;->σ:La80;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lax1;->λ(La80;La80;Z)La80;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-boolean v0, p0, Lu52;->π:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lf21;->φ(La80;)Ltw1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, p1, v1}, Lax1;->η(Ltw1;La80;Z)Ltw1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, Lf21;->φ(La80;)Ltw1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final ψ()Lg81;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lf21;->ψ()Lg81;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ω()Lc21;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu52;->Ζ()Lf21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lf21;->ω()Lc21;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
