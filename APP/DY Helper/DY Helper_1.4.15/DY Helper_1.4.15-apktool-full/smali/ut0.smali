.class public final synthetic Lut0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lrm1;

.field public final synthetic ζ:Ld22;

.field public final synthetic η:F

.field public final synthetic θ:I

.field public final synthetic ι:Z

.field public final synthetic κ:I

.field public final synthetic λ:Lqm1;

.field public final synthetic μ:Lg21;


# direct methods
.method public synthetic constructor <init>(Lrm1;Ld22;FIZILqm1;Lg21;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lut0;->ε:Lrm1;

    .line 5
    .line 6
    iput-object p2, p0, Lut0;->ζ:Ld22;

    .line 7
    .line 8
    iput p3, p0, Lut0;->η:F

    .line 9
    .line 10
    iput p4, p0, Lut0;->θ:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lut0;->ι:Z

    .line 13
    .line 14
    iput p6, p0, Lut0;->κ:I

    .line 15
    .line 16
    iput-object p7, p0, Lut0;->λ:Lqm1;

    .line 17
    .line 18
    iput-object p8, p0, Lut0;->μ:Lg21;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lai1;

    .line 2
    .line 3
    iget-wide v0, p1, Lai1;->γ:J

    .line 4
    .line 5
    iget-object v2, p0, Lut0;->ζ:Ld22;

    .line 6
    .line 7
    iget-object v2, v2, Ld22;->κ:Le22;

    .line 8
    .line 9
    iget-wide v2, v2, Le22;->Δ:J

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    shr-long/2addr v2, v4

    .line 14
    long-to-int v2, v2

    .line 15
    int-to-float v2, v2

    .line 16
    iget v3, p0, Lut0;->η:F

    .line 17
    .line 18
    iget v4, p0, Lut0;->θ:I

    .line 19
    .line 20
    iget-boolean v5, p0, Lut0;->ι:Z

    .line 21
    .line 22
    invoke-static/range {v0 .. v5}, Ls1;->χ(JFFIZ)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lut0;->ε:Lrm1;

    .line 27
    .line 28
    iput v0, v1, Lrm1;->ε:F

    .line 29
    .line 30
    invoke-static {v0}, Ljx0;->в(F)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x1

    .line 35
    sub-int/2addr v4, v2

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static {v0, v3, v4}, Lj81;->μ(III)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget v4, p0, Lut0;->κ:I

    .line 42
    .line 43
    if-eq v0, v4, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lut0;->λ:Lqm1;

    .line 46
    .line 47
    iput-boolean v2, v0, Lqm1;->ε:Z

    .line 48
    .line 49
    :cond_0
    iget-object p0, p0, Lut0;->μ:Lg21;

    .line 50
    .line 51
    invoke-interface {p0}, Lc02;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, La80;

    .line 56
    .line 57
    iget v0, v1, Lrm1;->ε:F

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v3}, Lj81;->Ι(Lai1;Z)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    const-wide/16 v2, 0x0

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, Lo41;->α(JJ)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_1

    .line 77
    .line 78
    invoke-virtual {p1}, Lai1;->α()V

    .line 79
    .line 80
    .line 81
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 82
    .line 83
    return-object p0
.end method
