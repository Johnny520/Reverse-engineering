.class public final Led2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lx91;

.field public final β:Lx91;

.field public final γ:Lt91;

.field public final δ:Lv91;

.field public final ε:Lt91;

.field public final ζ:Lhm0;

.field public final η:Lhm0;

.field public θ:J

.field public ι:J

.field public κ:J

.field public λ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {v0}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Led2;->α:Lx91;

    .line 11
    .line 12
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-static {v0}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Led2;->β:Lx91;

    .line 19
    .line 20
    new-instance v0, Lt91;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Lt91;-><init>(F)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Led2;->γ:Lt91;

    .line 27
    .line 28
    new-instance v0, Lv91;

    .line 29
    .line 30
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Lv91;-><init>(J)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Led2;->δ:Lv91;

    .line 36
    .line 37
    new-instance v0, Lt91;

    .line 38
    .line 39
    const/high16 v1, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lt91;-><init>(F)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Led2;->ε:Lt91;

    .line 45
    .line 46
    const-string v0, " source"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Lhm0;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Lhm0;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Led2;->ζ:Lhm0;

    .line 58
    .line 59
    const-string v0, " target"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, Lhm0;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lhm0;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Led2;->η:Lhm0;

    .line 71
    .line 72
    const-wide/16 v0, -0x1

    .line 73
    .line 74
    iput-wide v0, p0, Led2;->θ:J

    .line 75
    .line 76
    iput-wide v0, p0, Led2;->ι:J

    .line 77
    .line 78
    iput-wide v0, p0, Led2;->κ:J

    .line 79
    .line 80
    iput-wide v0, p0, Led2;->λ:J

    .line 81
    .line 82
    return-void
.end method
