.class public final Ls41;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Li0;

.field public β:Ln;

.field public final γ:Ljava/util/ArrayList;

.field public final δ:Ljava/util/ArrayList;

.field public final ε:Lql1;

.field public ζ:Z

.field public final η:Z

.field public final θ:Lx;

.field public ι:Z

.field public κ:Z

.field public final λ:Lx;

.field public final μ:Lx;

.field public final ν:Lx;

.field public final ξ:Ljavax/net/SocketFactory;

.field public final ο:Ljava/util/List;

.field public final π:Ljava/util/List;

.field public final ρ:Lr41;

.field public final σ:Lje;

.field public τ:I

.field public υ:I

.field public final φ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li0;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Li0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ls41;->α:Li0;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ls41;->γ:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ls41;->δ:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object v0, Lud2;->α:Ljava/util/TimeZone;

    .line 27
    .line 28
    new-instance v0, Lql1;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ls41;->ε:Lql1;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Ls41;->ζ:Z

    .line 37
    .line 38
    iput-boolean v0, p0, Ls41;->η:Z

    .line 39
    .line 40
    sget-object v1, Lx;->τ:Lx;

    .line 41
    .line 42
    iput-object v1, p0, Ls41;->θ:Lx;

    .line 43
    .line 44
    iput-boolean v0, p0, Ls41;->ι:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Ls41;->κ:Z

    .line 47
    .line 48
    sget-object v0, Lx;->Δ:Lx;

    .line 49
    .line 50
    iput-object v0, p0, Ls41;->λ:Lx;

    .line 51
    .line 52
    sget-object v0, Lx;->Θ:Lx;

    .line 53
    .line 54
    iput-object v0, p0, Ls41;->μ:Lx;

    .line 55
    .line 56
    iput-object v1, p0, Ls41;->ν:Lx;

    .line 57
    .line 58
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Ls41;->ξ:Ljavax/net/SocketFactory;

    .line 66
    .line 67
    sget-object v0, Lt41;->Ε:Ljava/util/List;

    .line 68
    .line 69
    iput-object v0, p0, Ls41;->ο:Ljava/util/List;

    .line 70
    .line 71
    sget-object v0, Lt41;->Δ:Ljava/util/List;

    .line 72
    .line 73
    iput-object v0, p0, Ls41;->π:Ljava/util/List;

    .line 74
    .line 75
    sget-object v0, Lr41;->α:Lr41;

    .line 76
    .line 77
    iput-object v0, p0, Ls41;->ρ:Lr41;

    .line 78
    .line 79
    sget-object v0, Lje;->γ:Lje;

    .line 80
    .line 81
    iput-object v0, p0, Ls41;->σ:Lje;

    .line 82
    .line 83
    const/16 v0, 0x2710

    .line 84
    .line 85
    iput v0, p0, Ls41;->τ:I

    .line 86
    .line 87
    iput v0, p0, Ls41;->υ:I

    .line 88
    .line 89
    iput v0, p0, Ls41;->φ:I

    .line 90
    .line 91
    return-void
.end method
