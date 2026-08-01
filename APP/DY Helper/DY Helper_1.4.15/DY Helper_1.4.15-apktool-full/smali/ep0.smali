.class public final Lep0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lwa0;

.field public final β:Lhp0;

.field public final γ:Lx91;

.field public δ:F

.field public ε:F

.field public ζ:Ltn0;


# direct methods
.method public constructor <init>(Lwa0;Lhp0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lep0;->α:Lwa0;

    .line 8
    .line 9
    iput-object p2, p0, Lep0;->β:Lhp0;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-static {p1}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lep0;->γ:Lx91;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final α()Ltn0;
    .locals 4

    .line 1
    iget-object v0, p0, Lep0;->ζ:Ltn0;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-wide v2, v0, Ltn0;->ε:J

    .line 13
    .line 14
    iput v1, v0, Ltn0;->ζ:F

    .line 15
    .line 16
    iput v1, v0, Ltn0;->η:F

    .line 17
    .line 18
    iput v1, v0, Ltn0;->θ:F

    .line 19
    .line 20
    iput v1, v0, Ltn0;->ι:F

    .line 21
    .line 22
    sget p0, Lab0;->β:I

    .line 23
    .line 24
    sget-wide v1, Lr52;->α:J

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance v0, Ltn0;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-wide v2, v0, Ltn0;->ε:J

    .line 33
    .line 34
    iput v1, v0, Ltn0;->ζ:F

    .line 35
    .line 36
    iput v1, v0, Ltn0;->η:F

    .line 37
    .line 38
    iput v1, v0, Ltn0;->θ:F

    .line 39
    .line 40
    iput v1, v0, Ltn0;->ι:F

    .line 41
    .line 42
    sget v1, Lab0;->β:I

    .line 43
    .line 44
    sget-wide v1, Lr52;->α:J

    .line 45
    .line 46
    iput-object v0, p0, Lep0;->ζ:Ltn0;

    .line 47
    .line 48
    return-object v0
.end method
