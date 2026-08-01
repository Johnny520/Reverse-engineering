.class public final Ld22;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lyr;
.implements Lop;


# instance fields
.field public final synthetic ε:Le22;

.field public final ζ:Lae;

.field public η:Lae;

.field public θ:Lwh1;

.field public final ι:Lhz;

.field public final synthetic κ:Le22;


# direct methods
.method public constructor <init>(Le22;Lae;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld22;->κ:Le22;

    .line 5
    .line 6
    iput-object p1, p0, Ld22;->ε:Le22;

    .line 7
    .line 8
    iput-object p2, p0, Ld22;->ζ:Lae;

    .line 9
    .line 10
    sget-object p1, Lwh1;->ζ:Lwh1;

    .line 11
    .line 12
    iput-object p1, p0, Ld22;->θ:Lwh1;

    .line 13
    .line 14
    sget-object p1, Lhz;->ε:Lhz;

    .line 15
    .line 16
    iput-object p1, p0, Ld22;->ι:Lhz;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final Θ(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->Θ(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Ξ(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->Ξ(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Ψ(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->Ψ(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-virtual {p0}, Le22;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final γ()Lup;
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ι:Lhz;

    .line 2
    .line 3
    return-object p0
.end method

.method public final δ(Lwh1;Lq8;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lae;

    .line 2
    .line 3
    invoke-static {p2}, Lxb;->Θ(Lop;)Lop;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lae;-><init>(ILop;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lae;->τ()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ld22;->θ:Lwh1;

    .line 15
    .line 16
    iput-object v0, p0, Ld22;->η:Lae;

    .line 17
    .line 18
    invoke-virtual {v0}, Lae;->σ()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final ζ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld22;->κ:Le22;

    .line 2
    .line 3
    iget-object v1, v0, Le22;->Α:Lk21;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Le22;->ω:Lk21;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lk21;->κ(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v1

    .line 12
    iget-object p0, p0, Ld22;->ζ:Lae;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lae;->ζ(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v1

    .line 20
    throw p0
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-virtual {p0}, Le22;->θ()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final λ(JLe80;Lpp;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, Lb22;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lb22;

    .line 7
    .line 8
    iget v1, v0, Lb22;->λ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lb22;->λ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lb22;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lb22;-><init>(Ld22;Lpp;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lb22;->ι:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lb22;->λ:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lb22;->θ:Lxz1;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p4}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p4}, Li81;->Β(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v3, 0x0

    .line 53
    .line 54
    cmp-long p4, p1, v3

    .line 55
    .line 56
    if-gtz p4, :cond_3

    .line 57
    .line 58
    iget-object p4, p0, Ld22;->η:Lae;

    .line 59
    .line 60
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-instance v1, Lxh1;

    .line 63
    .line 64
    invoke-direct {v1, p1, p2}, Lxh1;-><init>(J)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Leo1;

    .line 68
    .line 69
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p4, v3}, Lae;->ζ(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object p4, p0, Ld22;->κ:Le22;

    .line 76
    .line 77
    invoke-virtual {p4}, Lq01;->у()Lbq;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    new-instance v1, Lc22;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-direct {v1, p1, p2, p0, v3}, Lc22;-><init>(JLd22;Lop;)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x3

    .line 88
    invoke-static {p4, v3, v1, p1}, Lln0;->Ρ(Lbq;Lup;Le80;I)Lxz1;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :try_start_1
    iput-object p1, v0, Lb22;->θ:Lxz1;

    .line 93
    .line 94
    iput v2, v0, Lb22;->λ:I

    .line 95
    .line 96
    invoke-interface {p3, p0, v0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    sget-object p0, Lcq;->ε:Lcq;

    .line 101
    .line 102
    if-ne p4, p0, :cond_4

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_4
    move-object p0, p1

    .line 106
    :goto_1
    sget-object p1, Lwd;->ε:Lwd;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lfo0;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 109
    .line 110
    .line 111
    return-object p4

    .line 112
    :catchall_1
    move-exception p0

    .line 113
    move-object v5, p1

    .line 114
    move-object p1, p0

    .line 115
    move-object p0, v5

    .line 116
    :goto_2
    sget-object p2, Lwd;->ε:Lwd;

    .line 117
    .line 118
    invoke-virtual {p0, p2}, Lfo0;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method

.method public final σ(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->σ(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final τ(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->τ(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final υ(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-virtual {p0}, Le22;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final д(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->д(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final к(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->к(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final п(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->п(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final с(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld22;->ε:Le22;

    .line 2
    .line 3
    invoke-virtual {p0}, Le22;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method
