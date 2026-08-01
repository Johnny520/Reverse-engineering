.class public final Lo3;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lg62;

.field public final β:Ljava/lang/Object;

.field public final γ:Lx3;

.field public final δ:Lx91;

.field public final ε:Lx91;

.field public final ζ:Lp21;

.field public final η:Lc4;

.field public final θ:Lc4;

.field public final ι:Lc4;

.field public final κ:Lc4;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lg62;Ljava/lang/Object;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lo3;->α:Lg62;

    .line 5
    .line 6
    iput-object p3, p0, Lo3;->β:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Lx3;

    .line 9
    .line 10
    const-wide/high16 v6, -0x8000000000000000L

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const-wide/high16 v4, -0x8000000000000000L

    .line 15
    .line 16
    move-object v2, p1

    .line 17
    move-object v1, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lx3;-><init>(Lg62;Ljava/lang/Object;Lc4;JJZ)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lo3;->γ:Lx3;

    .line 22
    .line 23
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {p1}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lo3;->δ:Lx91;

    .line 30
    .line 31
    invoke-static {v2}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lo3;->ε:Lx91;

    .line 36
    .line 37
    new-instance p1, Lp21;

    .line 38
    .line 39
    invoke-direct {p1}, Lp21;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lo3;->ζ:Lp21;

    .line 43
    .line 44
    iget-object p1, v0, Lx3;->η:Lc4;

    .line 45
    .line 46
    instance-of p2, p1, Ly3;

    .line 47
    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    sget-object p3, Lbd;->ε:Ly3;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    instance-of p3, p1, Lz3;

    .line 54
    .line 55
    if-eqz p3, :cond_1

    .line 56
    .line 57
    sget-object p3, Lbd;->ζ:Lz3;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    instance-of p3, p1, La4;

    .line 61
    .line 62
    if-eqz p3, :cond_2

    .line 63
    .line 64
    sget-object p3, Lbd;->η:La4;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sget-object p3, Lbd;->θ:Lb4;

    .line 68
    .line 69
    :goto_0
    iput-object p3, p0, Lo3;->η:Lc4;

    .line 70
    .line 71
    if-eqz p2, :cond_3

    .line 72
    .line 73
    sget-object p1, Lbd;->α:Ly3;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    instance-of p2, p1, Lz3;

    .line 77
    .line 78
    if-eqz p2, :cond_4

    .line 79
    .line 80
    sget-object p1, Lbd;->β:Lz3;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    instance-of p1, p1, La4;

    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    sget-object p1, Lbd;->γ:La4;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    sget-object p1, Lbd;->δ:Lb4;

    .line 91
    .line 92
    :goto_1
    iput-object p1, p0, Lo3;->θ:Lc4;

    .line 93
    .line 94
    iput-object p3, p0, Lo3;->ι:Lc4;

    .line 95
    .line 96
    iput-object p1, p0, Lo3;->κ:Lc4;

    .line 97
    .line 98
    return-void
.end method
