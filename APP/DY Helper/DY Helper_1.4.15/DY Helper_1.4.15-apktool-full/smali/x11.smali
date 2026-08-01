.class public final Lx11;
.super Ldo1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public η:Lf90;

.field public θ:Ly11;

.field public ι:[J

.field public κ:I

.field public λ:I

.field public synthetic μ:Ljava/lang/Object;

.field public final synthetic ν:Ly11;

.field public final synthetic ξ:Lf90;


# direct methods
.method public constructor <init>(Ly11;Lf90;Lop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx11;->ν:Ly11;

    .line 2
    .line 3
    iput-object p2, p0, Lx11;->ξ:Lf90;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Ldo1;-><init>(Lop;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lts1;

    .line 2
    .line 3
    check-cast p2, Lop;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lx11;->η(Lop;Ljava/lang/Object;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lx11;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lx11;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 2

    .line 1
    new-instance v0, Lx11;

    .line 2
    .line 3
    iget-object v1, p0, Lx11;->ν:Ly11;

    .line 4
    .line 5
    iget-object p0, p0, Lx11;->ξ:Lf90;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lx11;-><init>(Ly11;Lf90;Lop;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lx11;->μ:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lx11;->λ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lx11;->κ:I

    .line 9
    .line 10
    iget-object v2, p0, Lx11;->ι:[J

    .line 11
    .line 12
    iget-object v3, p0, Lx11;->θ:Ly11;

    .line 13
    .line 14
    iget-object v4, p0, Lx11;->η:Lf90;

    .line 15
    .line 16
    iget-object v5, p0, Lx11;->μ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v5, Lts1;

    .line 19
    .line 20
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lx11;->μ:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, p1

    .line 37
    check-cast v5, Lts1;

    .line 38
    .line 39
    iget-object v3, p0, Lx11;->ν:Ly11;

    .line 40
    .line 41
    iget-object p1, v3, Ly11;->ζ:Lw11;

    .line 42
    .line 43
    iget-object v2, p1, Lw11;->γ:[J

    .line 44
    .line 45
    iget v0, p1, Lw11;->ε:I

    .line 46
    .line 47
    iget-object v4, p0, Lx11;->ξ:Lf90;

    .line 48
    .line 49
    :goto_0
    const p1, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-eq v0, p1, :cond_2

    .line 53
    .line 54
    aget-wide v6, v2, v0

    .line 55
    .line 56
    const/16 p1, 0x1f

    .line 57
    .line 58
    shr-long/2addr v6, p1

    .line 59
    const-wide/32 v8, 0x7fffffff

    .line 60
    .line 61
    .line 62
    and-long/2addr v6, v8

    .line 63
    long-to-int p1, v6

    .line 64
    iput v0, v4, Lf90;->ζ:I

    .line 65
    .line 66
    iget-object v6, v3, Ly11;->ζ:Lw11;

    .line 67
    .line 68
    iget-object v6, v6, Lw11;->β:[Ljava/lang/Object;

    .line 69
    .line 70
    aget-object v0, v6, v0

    .line 71
    .line 72
    iput-object v5, p0, Lx11;->μ:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v4, p0, Lx11;->η:Lf90;

    .line 75
    .line 76
    iput-object v3, p0, Lx11;->θ:Ly11;

    .line 77
    .line 78
    iput-object v2, p0, Lx11;->ι:[J

    .line 79
    .line 80
    iput p1, p0, Lx11;->κ:I

    .line 81
    .line 82
    iput v1, p0, Lx11;->λ:I

    .line 83
    .line 84
    invoke-virtual {v5, p0, v0}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lcq;->ε:Lcq;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_2
    sget-object p0, Ls62;->α:Ls62;

    .line 91
    .line 92
    return-object p0
.end method
