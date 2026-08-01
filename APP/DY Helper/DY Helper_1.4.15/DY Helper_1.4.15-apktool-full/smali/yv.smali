.class public final Lyv;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljp1;
.implements Lyr;


# instance fields
.field public Α:F

.field public Β:F

.field public Γ:La3;

.field public Δ:I

.field public Ε:I

.field public Ζ:I

.field public Η:F

.field public final synthetic Θ:Law;

.field public ε:F

.field public ζ:F

.field public η:J

.field public θ:Lnp0;

.field public ι:F

.field public κ:Lin;

.field public λ:I

.field public μ:Ljp1;

.field public final ν:[D

.field public final ξ:[F

.field public final ο:[F

.field public final π:[[F

.field public final ρ:[[F

.field public σ:F

.field public τ:F

.field public υ:F

.field public φ:F

.field public χ:I

.field public ψ:Lin;

.field public ω:F


# direct methods
.method public constructor <init>(Law;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyv;->Θ:Law;

    .line 5
    .line 6
    const/high16 p1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput p1, p0, Lyv;->ε:F

    .line 9
    .line 10
    iput p1, p0, Lyv;->ζ:F

    .line 11
    .line 12
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iput-wide v0, p0, Lyv;->η:J

    .line 18
    .line 19
    sget-object p1, Lnp0;->ε:Lnp0;

    .line 20
    .line 21
    iput-object p1, p0, Lyv;->θ:Lnp0;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput p1, p0, Lyv;->λ:I

    .line 25
    .line 26
    new-instance p1, Lkp1;

    .line 27
    .line 28
    invoke-direct {p1}, Lkp1;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lyv;->μ:Ljp1;

    .line 32
    .line 33
    const/16 p1, 0xe

    .line 34
    .line 35
    new-array p1, p1, [D

    .line 36
    .line 37
    iput-object p1, p0, Lyv;->ν:[D

    .line 38
    .line 39
    const/4 p1, 0x7

    .line 40
    new-array v0, p1, [F

    .line 41
    .line 42
    iput-object v0, p0, Lyv;->ξ:[F

    .line 43
    .line 44
    new-array p1, p1, [F

    .line 45
    .line 46
    iput-object p1, p0, Lyv;->ο:[F

    .line 47
    .line 48
    const/16 p1, 0x8

    .line 49
    .line 50
    new-array v0, p1, [[F

    .line 51
    .line 52
    iput-object v0, p0, Lyv;->π:[[F

    .line 53
    .line 54
    new-array p1, p1, [[F

    .line 55
    .line 56
    iput-object p1, p0, Lyv;->ρ:[[F

    .line 57
    .line 58
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 59
    .line 60
    iput p1, p0, Lyv;->σ:F

    .line 61
    .line 62
    iput p1, p0, Lyv;->τ:F

    .line 63
    .line 64
    iput p1, p0, Lyv;->υ:F

    .line 65
    .line 66
    iput p1, p0, Lyv;->φ:F

    .line 67
    .line 68
    const/4 v0, -0x1

    .line 69
    iput v0, p0, Lyv;->χ:I

    .line 70
    .line 71
    iput p1, p0, Lyv;->ω:F

    .line 72
    .line 73
    iput p1, p0, Lyv;->Α:F

    .line 74
    .line 75
    iput p1, p0, Lyv;->Β:F

    .line 76
    .line 77
    iput v0, p0, Lyv;->Δ:I

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final β()F
    .locals 0

    .line 1
    iget p0, p0, Lyv;->ε:F

    .line 2
    .line 3
    return p0
.end method

.method public final γ(Ljava/lang/String;Ljava/lang/String;)Lb3;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lyv;->μ:Ljp1;

    .line 8
    .line 9
    invoke-interface {p0, p1, p2}, Ljp1;->γ(Ljava/lang/String;Ljava/lang/String;)Lb3;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget p0, p0, Lyv;->ζ:F

    .line 2
    .line 3
    return p0
.end method
