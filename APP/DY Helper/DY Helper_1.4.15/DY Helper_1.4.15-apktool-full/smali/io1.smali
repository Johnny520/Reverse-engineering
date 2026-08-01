.class public final Lio1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lza0;


# instance fields
.field public ε:I

.field public ζ:F

.field public η:F

.field public θ:F

.field public ι:F

.field public κ:J

.field public λ:J

.field public μ:F

.field public ν:J

.field public ξ:Liv1;

.field public ο:Z

.field public π:I

.field public ρ:J

.field public σ:Lyr;

.field public τ:Lnp0;

.field public υ:Lin;

.field public φ:I

.field public χ:Lu81;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lio1;->ζ:F

    .line 7
    .line 8
    iput v0, p0, Lio1;->η:F

    .line 9
    .line 10
    iput v0, p0, Lio1;->θ:F

    .line 11
    .line 12
    sget-wide v1, Lab0;->α:J

    .line 13
    .line 14
    iput-wide v1, p0, Lio1;->κ:J

    .line 15
    .line 16
    iput-wide v1, p0, Lio1;->λ:J

    .line 17
    .line 18
    const/high16 v1, 0x41000000    # 8.0f

    .line 19
    .line 20
    iput v1, p0, Lio1;->μ:F

    .line 21
    .line 22
    sget-wide v1, Lr52;->α:J

    .line 23
    .line 24
    iput-wide v1, p0, Lio1;->ν:J

    .line 25
    .line 26
    sget-object v1, Lkn0;->ξ:Lpl1;

    .line 27
    .line 28
    iput-object v1, p0, Lio1;->ξ:Liv1;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput v1, p0, Lio1;->π:I

    .line 32
    .line 33
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v1, p0, Lio1;->ρ:J

    .line 39
    .line 40
    new-instance v1, Lzr;

    .line 41
    .line 42
    invoke-direct {v1, v0, v0}, Lzr;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lio1;->σ:Lyr;

    .line 46
    .line 47
    sget-object v0, Lnp0;->ε:Lnp0;

    .line 48
    .line 49
    iput-object v0, p0, Lio1;->τ:Lnp0;

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    iput v0, p0, Lio1;->φ:I

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final Γ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Δ(F)V
    .locals 1

    .line 1
    iget v0, p0, Lio1;->ζ:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lio1;->ε:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lio1;->ε:I

    .line 13
    .line 14
    iput p1, p0, Lio1;->ζ:F

    .line 15
    .line 16
    return-void
.end method

.method public final Ε(I)V
    .locals 2

    .line 1
    iget v0, p0, Lio1;->φ:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lio1;->ε:I

    .line 7
    .line 8
    const/high16 v1, 0x80000

    .line 9
    .line 10
    or-int/2addr v0, v1

    .line 11
    iput v0, p0, Lio1;->ε:I

    .line 12
    .line 13
    iput p1, p0, Lio1;->φ:I

    .line 14
    .line 15
    return-void
.end method

.method public final Ι()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Κ(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio1;->ο:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lio1;->ε:I

    .line 6
    .line 7
    or-int/lit16 v0, v0, 0x4000

    .line 8
    .line 9
    iput v0, p0, Lio1;->ε:I

    .line 10
    .line 11
    iput-boolean p1, p0, Lio1;->ο:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final Ο()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Π(J)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lio1;->ν:J

    .line 2
    .line 3
    sget v2, Lr52;->β:I

    .line 4
    .line 5
    cmp-long v0, v0, p1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v0, p0, Lio1;->ε:I

    .line 11
    .line 12
    or-int/lit16 v0, v0, 0x1000

    .line 13
    .line 14
    iput v0, p0, Lio1;->ε:I

    .line 15
    .line 16
    iput-wide p1, p0, Lio1;->ν:J

    .line 17
    .line 18
    return-void
.end method

.method public final Ρ(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lio1;->λ:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lci;->γ(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lio1;->ε:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    iput v0, p0, Lio1;->ε:I

    .line 14
    .line 15
    iput-wide p1, p0, Lio1;->λ:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final Σ(Lin;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio1;->υ:Lin;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lio1;->ε:I

    .line 10
    .line 11
    const/high16 v1, 0x20000

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    iput v0, p0, Lio1;->ε:I

    .line 15
    .line 16
    iput-object p1, p0, Lio1;->υ:Lin;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final Τ(F)V
    .locals 1

    .line 1
    iget v0, p0, Lio1;->η:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lio1;->ε:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Lio1;->ε:I

    .line 13
    .line 14
    iput p1, p0, Lio1;->η:F

    .line 15
    .line 16
    return-void
.end method

.method public final α()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio1;->ρ:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Lio1;->σ:Lyr;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final γ()V
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio1;->Δ(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lio1;->Τ(F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lio1;->η(F)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lio1;->κ(F)V

    .line 14
    .line 15
    .line 16
    sget-wide v0, Lab0;->α:J

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Lio1;->ω(J)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Lio1;->Ρ(J)V

    .line 22
    .line 23
    .line 24
    const/high16 v0, 0x41000000    # 8.0f

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lio1;->и(F)V

    .line 27
    .line 28
    .line 29
    sget-wide v0, Lr52;->α:J

    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, Lio1;->Π(J)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkn0;->ξ:Lpl1;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lio1;->π(Liv1;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, v0}, Lio1;->Κ(Z)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {p0, v1}, Lio1;->Σ(Lin;)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-virtual {p0, v2}, Lio1;->Ε(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lio1;->б(I)V

    .line 52
    .line 53
    .line 54
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    iput-wide v2, p0, Lio1;->ρ:J

    .line 60
    .line 61
    iput-object v1, p0, Lio1;->χ:Lu81;

    .line 62
    .line 63
    iput v0, p0, Lio1;->ε:I

    .line 64
    .line 65
    return-void
.end method

.method public final ε()V
    .locals 0

    .line 1
    return-void
.end method

.method public final η(F)V
    .locals 1

    .line 1
    iget v0, p0, Lio1;->θ:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lio1;->ε:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iput v0, p0, Lio1;->ε:I

    .line 13
    .line 14
    iput p1, p0, Lio1;->θ:F

    .line 15
    .line 16
    return-void
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget-object p0, p0, Lio1;->σ:Lyr;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr;->θ()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final κ(F)V
    .locals 1

    .line 1
    iget v0, p0, Lio1;->ι:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lio1;->ε:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x20

    .line 11
    .line 12
    iput v0, p0, Lio1;->ε:I

    .line 13
    .line 14
    iput p1, p0, Lio1;->ι:F

    .line 15
    .line 16
    return-void
.end method

.method public final ο()V
    .locals 0

    .line 1
    return-void
.end method

.method public final π(Liv1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio1;->ξ:Liv1;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lio1;->ε:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x2000

    .line 12
    .line 13
    iput v0, p0, Lio1;->ε:I

    .line 14
    .line 15
    iput-object p1, p0, Lio1;->ξ:Liv1;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final ψ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ω(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lio1;->κ:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lci;->γ(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lio1;->ε:I

    .line 10
    .line 11
    or-int/lit8 v0, v0, 0x40

    .line 12
    .line 13
    iput v0, p0, Lio1;->ε:I

    .line 14
    .line 15
    iput-wide p1, p0, Lio1;->κ:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final б(I)V
    .locals 2

    .line 1
    iget v0, p0, Lio1;->π:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lio1;->ε:I

    .line 7
    .line 8
    const v1, 0x8000

    .line 9
    .line 10
    .line 11
    or-int/2addr v0, v1

    .line 12
    iput v0, p0, Lio1;->ε:I

    .line 13
    .line 14
    iput p1, p0, Lio1;->π:I

    .line 15
    .line 16
    return-void
.end method

.method public final и(F)V
    .locals 1

    .line 1
    iget v0, p0, Lio1;->μ:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lio1;->ε:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x800

    .line 11
    .line 12
    iput v0, p0, Lio1;->ε:I

    .line 13
    .line 14
    iput p1, p0, Lio1;->μ:F

    .line 15
    .line 16
    return-void
.end method
