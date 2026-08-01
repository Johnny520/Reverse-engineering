.class public abstract Lec;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lb21;

.field public static final β:Ldc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lec;->γ(Z)Lb21;

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Lec;->γ(Z)Lb21;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lec;->α:Lb21;

    .line 11
    .line 12
    sget-object v0, Ldc;->β:Ldc;

    .line 13
    .line 14
    sput-object v0, Lec;->β:Ldc;

    .line 15
    .line 16
    return-void
.end method

.method public static final α(Lr01;Lv80;I)V
    .locals 6

    .line 1
    const v0, -0xc96ce69

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lv80;->Χ(I)Lv80;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p2

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v2, v1, :cond_1

    .line 22
    .line 23
    move v1, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_1
    and-int/2addr v0, v3

    .line 27
    invoke-virtual {p1, v0, v1}, Lv80;->Ξ(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-wide v0, p1, Lv80;->Χ:J

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {p1, p0}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget-object v4, Lln;->β:Lkn;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-object v4, Lkn;->β:Lu40;

    .line 53
    .line 54
    invoke-virtual {p1}, Lv80;->Ψ()V

    .line 55
    .line 56
    .line 57
    iget-boolean v5, p1, Lv80;->Φ:Z

    .line 58
    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1, v4}, Lv80;->κ(Lp70;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {p1}, Lv80;->и()V

    .line 66
    .line 67
    .line 68
    :goto_2
    sget-object v4, Lkn;->ε:Lui;

    .line 69
    .line 70
    sget-object v5, Lec;->β:Ldc;

    .line 71
    .line 72
    invoke-static {v4, p1, v5}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v4, Lkn;->δ:Lui;

    .line 76
    .line 77
    invoke-static {v4, p1, v2}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object v2, Lkn;->η:La1;

    .line 81
    .line 82
    invoke-static {p1, v2}, Le81;->ξ(Lv80;La80;)V

    .line 83
    .line 84
    .line 85
    sget-object v2, Lkn;->γ:Lui;

    .line 86
    .line 87
    invoke-static {v2, p1, v1}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sget-object v1, Lkn;->ζ:Lui;

    .line 95
    .line 96
    invoke-static {v1, p1, v0}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v3}, Lv80;->ο(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {p1}, Lv80;->Ρ()V

    .line 104
    .line 105
    .line 106
    :goto_3
    invoke-virtual {p1}, Lv80;->π()Lbl1;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    new-instance v0, Lcc;

    .line 113
    .line 114
    invoke-direct {v0, p0, p2}, Lcc;-><init>(Lr01;I)V

    .line 115
    .line 116
    .line 117
    iput-object v0, p1, Lbl1;->δ:Le80;

    .line 118
    .line 119
    :cond_4
    return-void
.end method

.method public static final β(Lbh1;Lch1;Lkx0;Lnp0;IILaa;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Lkx0;->λ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of v0, p2, Lbc;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p2, Lbc;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-eqz p2, :cond_2

    .line 14
    .line 15
    iget-object p2, p2, Lbc;->τ:Laa;

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v0, p2

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    :goto_1
    move-object v0, p6

    .line 23
    :goto_2
    iget p2, p1, Lch1;->ε:I

    .line 24
    .line 25
    iget p6, p1, Lch1;->ζ:I

    .line 26
    .line 27
    int-to-long v1, p2

    .line 28
    const/16 p2, 0x20

    .line 29
    .line 30
    shl-long/2addr v1, p2

    .line 31
    int-to-long v3, p6

    .line 32
    const-wide v5, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v3, v5

    .line 38
    or-long/2addr v1, v3

    .line 39
    int-to-long v3, p4

    .line 40
    shl-long/2addr v3, p2

    .line 41
    int-to-long p4, p5

    .line 42
    and-long/2addr p4, v5

    .line 43
    or-long/2addr v3, p4

    .line 44
    move-object v5, p3

    .line 45
    invoke-virtual/range {v0 .. v5}, Laa;->α(JJLnp0;)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    invoke-static {p0, p1, p2, p3}, Lbh1;->μ(Lbh1;Lch1;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static final γ(Z)Lb21;
    .locals 3

    .line 1
    new-instance v0, Lb21;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lb21;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lx;->ζ:Laa;

    .line 9
    .line 10
    new-instance v2, Lhc;

    .line 11
    .line 12
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lx;->η:Laa;

    .line 19
    .line 20
    new-instance v2, Lhc;

    .line 21
    .line 22
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lx;->θ:Laa;

    .line 29
    .line 30
    new-instance v2, Lhc;

    .line 31
    .line 32
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lx;->ι:Laa;

    .line 39
    .line 40
    new-instance v2, Lhc;

    .line 41
    .line 42
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lx;->κ:Laa;

    .line 49
    .line 50
    new-instance v2, Lhc;

    .line 51
    .line 52
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lx;->λ:Laa;

    .line 59
    .line 60
    new-instance v2, Lhc;

    .line 61
    .line 62
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lx;->μ:Laa;

    .line 69
    .line 70
    new-instance v2, Lhc;

    .line 71
    .line 72
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v1, Lx;->ν:Laa;

    .line 79
    .line 80
    new-instance v2, Lhc;

    .line 81
    .line 82
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lx;->ξ:Laa;

    .line 89
    .line 90
    new-instance v2, Lhc;

    .line 91
    .line 92
    invoke-direct {v2, v1, p0}, Lhc;-><init>(Laa;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method

.method public static final δ(Laa;)Lpx0;
    .locals 2

    .line 1
    sget-object v0, Lec;->α:Lb21;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lpx0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lhc;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, Lhc;-><init>(Laa;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-object v0
.end method
