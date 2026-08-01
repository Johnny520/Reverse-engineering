.class public final Lox0;
.super Lch1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lkx0;
.implements Lc0;
.implements Ld11;


# instance fields
.field public Α:Z

.field public final Β:Lzp0;

.field public final Γ:Lk21;

.field public Δ:Z

.field public Ε:Z

.field public Ζ:J

.field public final Η:Lnx0;

.field public final Θ:Lnx0;

.field public Ι:F

.field public Κ:Z

.field public Λ:La80;

.field public Μ:J

.field public final Ν:Lnx0;

.field public Ξ:Z

.field public final κ:Lbq0;

.field public λ:Z

.field public μ:I

.field public ν:I

.field public ξ:Z

.field public ο:Z

.field public π:Lwp0;

.field public ρ:J

.field public σ:La80;

.field public τ:Z

.field public υ:Ljava/lang/Object;

.field public φ:Z

.field public χ:Z

.field public ψ:Z

.field public ω:Z


# direct methods
.method public constructor <init>(Lbq0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lch1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lox0;->κ:Lbq0;

    .line 5
    .line 6
    const p1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lox0;->μ:I

    .line 10
    .line 11
    iput p1, p0, Lox0;->ν:I

    .line 12
    .line 13
    sget-object p1, Lwp0;->η:Lwp0;

    .line 14
    .line 15
    iput-object p1, p0, Lox0;->π:Lwp0;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Lox0;->ρ:J

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lox0;->τ:Z

    .line 23
    .line 24
    new-instance v2, Lzp0;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p0, v3}, Lzp0;-><init>(Lc0;I)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lox0;->Β:Lzp0;

    .line 31
    .line 32
    new-instance v2, Lk21;

    .line 33
    .line 34
    const/16 v3, 0x10

    .line 35
    .line 36
    new-array v3, v3, [Lox0;

    .line 37
    .line 38
    invoke-direct {v2, v3}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lox0;->Γ:Lk21;

    .line 42
    .line 43
    iput-boolean p1, p0, Lox0;->Δ:Z

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    const/16 v2, 0xf

    .line 47
    .line 48
    invoke-static {p1, p1, v2}, Lzo;->β(III)J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    iput-wide v2, p0, Lox0;->Ζ:J

    .line 53
    .line 54
    new-instance p1, Lnx0;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-direct {p1, p0, v2}, Lnx0;-><init>(Lox0;I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lox0;->Η:Lnx0;

    .line 61
    .line 62
    new-instance p1, Lnx0;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-direct {p1, p0, v2}, Lnx0;-><init>(Lox0;I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lox0;->Θ:Lnx0;

    .line 69
    .line 70
    iput-wide v0, p0, Lox0;->Μ:J

    .line 71
    .line 72
    new-instance p1, Lnx0;

    .line 73
    .line 74
    const/4 v0, 0x2

    .line 75
    invoke-direct {p1, p0, v0}, Lnx0;-><init>(Lox0;I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lox0;->Ν:Lnx0;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final requestLayout()V
    .locals 1

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lyp0;->Τ(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final Α()V
    .locals 0

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbq0;->α()Lq31;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final Ζ()Lgm0;
    .locals 0

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    iget-object p0, p0, Lyp0;->Κ:Lk31;

    .line 6
    .line 7
    iget-object p0, p0, Lk31;->γ:Lgm0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Μ()Lc0;
    .locals 0

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final Υ()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lox0;->Ε:Z

    .line 3
    .line 4
    iget-object v0, p0, Lox0;->Β:Lzp0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lzp0;->θ()V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, Lox0;->ω:Z

    .line 10
    .line 11
    iget-object v2, p0, Lox0;->κ:Lbq0;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, v2, Lbq0;->α:Lyp0;

    .line 17
    .line 18
    invoke-virtual {v1}, Lyp0;->ψ()Lk21;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v4, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v1, v1, Lk21;->η:I

    .line 25
    .line 26
    move v5, v3

    .line 27
    :goto_0
    if-ge v5, v1, :cond_1

    .line 28
    .line 29
    aget-object v6, v4, v5

    .line 30
    .line 31
    check-cast v6, Lyp0;

    .line 32
    .line 33
    invoke-virtual {v6}, Lyp0;->ο()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    invoke-virtual {v6}, Lyp0;->π()Lwp0;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget-object v8, Lwp0;->ε:Lwp0;

    .line 44
    .line 45
    if-ne v7, v8, :cond_0

    .line 46
    .line 47
    invoke-static {v6}, Lyp0;->Ξ(Lyp0;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    iget-object v6, v2, Lbq0;->α:Lyp0;

    .line 54
    .line 55
    const/4 v7, 0x7

    .line 56
    invoke-static {v6, v3, v7}, Lyp0;->Υ(Lyp0;ZI)V

    .line 57
    .line 58
    .line 59
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-boolean v1, p0, Lox0;->Α:Z

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lox0;->Ζ()Lgm0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-boolean v1, v1, Ldw0;->ξ:Z

    .line 71
    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    iget-boolean v1, p0, Lox0;->ω:Z

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    :cond_2
    iput-boolean v3, p0, Lox0;->ω:Z

    .line 79
    .line 80
    iget-object v1, v2, Lbq0;->δ:Lup0;

    .line 81
    .line 82
    sget-object v4, Lup0;->η:Lup0;

    .line 83
    .line 84
    iput-object v4, v2, Lbq0;->δ:Lup0;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Lbq0;->η(Z)V

    .line 87
    .line 88
    .line 89
    iget-object v4, v2, Lbq0;->α:Lyp0;

    .line 90
    .line 91
    invoke-static {v4}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget-object v6, v5, Ly81;->ε:La1;

    .line 100
    .line 101
    iget-object v5, v5, Ly81;->α:Lkx1;

    .line 102
    .line 103
    iget-object v7, p0, Lox0;->Θ:Lnx0;

    .line 104
    .line 105
    invoke-virtual {v5, v4, v6, v7}, Lkx1;->β(Ljava/lang/Object;La80;Lp70;)V

    .line 106
    .line 107
    .line 108
    iput-object v1, v2, Lbq0;->δ:Lup0;

    .line 109
    .line 110
    iput-boolean v3, p0, Lox0;->Α:Z

    .line 111
    .line 112
    :cond_3
    iget-boolean v1, v0, Lzp0;->β:Z

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    invoke-virtual {v0}, Lzp0;->ε()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0}, Lzp0;->η()V

    .line 123
    .line 124
    .line 125
    :cond_4
    iput-boolean v3, p0, Lox0;->Ε:Z

    .line 126
    .line 127
    return-void
.end method

.method public final γ()Lzp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lox0;->Β:Lzp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ(J)Lch1;
    .locals 5

    .line 1
    iget-object v0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object v1, v0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    iget-object v2, v0, Lbq0;->α:Lyp0;

    .line 6
    .line 7
    iget-object v3, v1, Lyp0;->Η:Lwp0;

    .line 8
    .line 9
    sget-object v4, Lwp0;->η:Lwp0;

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lyp0;->γ()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v2}, Lyh;->Ψ(Lyp0;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lbq0;->ρ:Ljw0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object v4, v0, Ljw0;->ξ:Lwp0;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Ljw0;->ζ(J)Lch1;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Lyp0;->σ()Lyp0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    iget-object v0, v0, Lyp0;->Λ:Lbq0;

    .line 39
    .line 40
    iget-object v1, p0, Lox0;->π:Lwp0;

    .line 41
    .line 42
    if-eq v1, v4, :cond_3

    .line 43
    .line 44
    iget-boolean v1, v2, Lyp0;->Ι:Z

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-string v1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 50
    .line 51
    invoke-static {v1}, Lam0;->β(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    iget-object v1, v0, Lbq0;->δ:Lup0;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    const/4 v2, 0x2

    .line 63
    if-ne v1, v2, :cond_4

    .line 64
    .line 65
    sget-object v0, Lwp0;->ζ:Lwp0;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    const-string p0, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 69
    .line 70
    iget-object p1, v0, Lbq0;->δ:Lup0;

    .line 71
    .line 72
    invoke-static {p1, p0}, Lγ;->σ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :cond_5
    sget-object v0, Lwp0;->ε:Lwp0;

    .line 78
    .line 79
    :goto_1
    iput-object v0, p0, Lox0;->π:Lwp0;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    iput-object v4, p0, Lox0;->π:Lwp0;

    .line 83
    .line 84
    :goto_2
    invoke-virtual {p0, p1, p2}, Lox0;->ю(J)Z

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public final λ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lox0;->υ:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ξ(Lb0;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object v0, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 10
    .line 11
    iget p0, p0, Lk21;->η:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, p0, :cond_0

    .line 15
    .line 16
    aget-object v2, v0, v1

    .line 17
    .line 18
    check-cast v2, Lyp0;

    .line 19
    .line 20
    iget-object v2, v2, Lyp0;->Λ:Lbq0;

    .line 21
    .line 22
    iget-object v2, v2, Lbq0;->π:Lox0;

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final й()I
    .locals 0

    .line 1
    iget p0, p0, Lox0;->ν:I

    .line 2
    .line 3
    return p0
.end method

.method public final л()V
    .locals 2

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-static {p0, v0, v1}, Lyp0;->Υ(Lyp0;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final м()I
    .locals 0

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbq0;->α()Lq31;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lch1;->м()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final н()I
    .locals 0

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbq0;->α()Lq31;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lch1;->н()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final у(JFLa80;)V
    .locals 6

    .line 1
    iget-object p3, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object v0, p3, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :try_start_0
    iput-boolean v1, p0, Lox0;->χ:Z

    .line 7
    .line 8
    iget-wide v2, p0, Lox0;->ρ:J

    .line 9
    .line 10
    invoke-static {p1, p2, v2, v3}, Lum0;->α(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lox0;->σ:La80;

    .line 18
    .line 19
    if-ne p4, v2, :cond_0

    .line 20
    .line 21
    iget-boolean v2, p0, Lox0;->Ξ:Z

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    :goto_0
    iget-boolean v2, p3, Lbq0;->λ:Z

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    iget-boolean v2, p3, Lbq0;->κ:Z

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    iget-boolean v2, p0, Lox0;->Ξ:Z

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    :cond_1
    iput-boolean v1, p0, Lox0;->ω:Z

    .line 42
    .line 43
    iput-boolean v3, p0, Lox0;->Ξ:Z

    .line 44
    .line 45
    :cond_2
    iget-object v2, p3, Lbq0;->ρ:Ljw0;

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-object v4, v2, Ljw0;->κ:Lbq0;

    .line 50
    .line 51
    iget-object v2, v2, Ljw0;->υ:Lhw0;

    .line 52
    .line 53
    sget-object v5, Lhw0;->η:Lhw0;

    .line 54
    .line 55
    if-ne v2, v5, :cond_4

    .line 56
    .line 57
    iget-object v2, v4, Lbq0;->α:Lyp0;

    .line 58
    .line 59
    invoke-static {v2}, Lyh;->Ψ(Lyp0;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iput-boolean v1, v4, Lbq0;->γ:Z

    .line 67
    .line 68
    :cond_4
    :goto_1
    iget-object v2, p3, Lbq0;->ρ:Ljw0;

    .line 69
    .line 70
    if-eqz v2, :cond_8

    .line 71
    .line 72
    invoke-virtual {v2}, Ljw0;->ц()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-ne v2, v1, :cond_8

    .line 77
    .line 78
    invoke-virtual {p3}, Lbq0;->α()Lq31;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v1, v1, Lq31;->υ:Lq31;

    .line 83
    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    iget-object v1, v1, Ldw0;->ο:Lew0;

    .line 87
    .line 88
    if-nez v1, :cond_6

    .line 89
    .line 90
    :cond_5
    invoke-static {v0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getPlacementScope()Lbh1;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_6
    iget-object v2, p3, Lbq0;->ρ:Ljw0;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-eqz v4, :cond_7

    .line 108
    .line 109
    iget-object v4, v4, Lyp0;->Λ:Lbq0;

    .line 110
    .line 111
    iput v3, v4, Lbq0;->θ:I

    .line 112
    .line 113
    :cond_7
    const v3, 0x7fffffff

    .line 114
    .line 115
    .line 116
    iput v3, v2, Ljw0;->ν:I

    .line 117
    .line 118
    const/16 v3, 0x20

    .line 119
    .line 120
    shr-long v3, p1, v3

    .line 121
    .line 122
    long-to-int v3, v3

    .line 123
    const-wide v4, 0xffffffffL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    and-long/2addr v4, p1

    .line 129
    long-to-int v4, v4

    .line 130
    invoke-static {v1, v2, v3, v4}, Lbh1;->λ(Lbh1;Lch1;II)V

    .line 131
    .line 132
    .line 133
    :cond_8
    iget-object p3, p3, Lbq0;->ρ:Ljw0;

    .line 134
    .line 135
    if-eqz p3, :cond_9

    .line 136
    .line 137
    iget-boolean p3, p3, Ljw0;->ο:Z

    .line 138
    .line 139
    if-nez p3, :cond_9

    .line 140
    .line 141
    const-string p3, "Error: Placement happened before lookahead."

    .line 142
    .line 143
    invoke-static {p3}, Lam0;->β(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_9
    invoke-virtual {p0, p1, p2, p4}, Lox0;->э(JLa80;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :goto_2
    invoke-virtual {v0, p0}, Lyp0;->Ψ(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    const/4 p0, 0x0

    .line 154
    throw p0
.end method

.method public final ц()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object v1, v0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lyp0;->д()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lox0;->Δ:Z

    .line 9
    .line 10
    iget-object v2, p0, Lox0;->Γ:Lk21;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Lk21;->ζ()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object v0, v0, Lbq0;->α:Lyp0;

    .line 20
    .line 21
    invoke-virtual {v0}, Lyp0;->ψ()Lk21;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v1, Lk21;->η:I

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    move v5, v4

    .line 31
    :goto_0
    if-ge v5, v1, :cond_2

    .line 32
    .line 33
    aget-object v6, v3, v5

    .line 34
    .line 35
    check-cast v6, Lyp0;

    .line 36
    .line 37
    iget v7, v2, Lk21;->η:I

    .line 38
    .line 39
    if-gt v7, v5, :cond_1

    .line 40
    .line 41
    iget-object v6, v6, Lyp0;->Λ:Lbq0;

    .line 42
    .line 43
    iget-object v6, v6, Lbq0;->π:Lox0;

    .line 44
    .line 45
    invoke-virtual {v2, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v6, v6, Lyp0;->Λ:Lbq0;

    .line 50
    .line 51
    iget-object v6, v6, Lbq0;->π:Lox0;

    .line 52
    .line 53
    iget-object v7, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 54
    .line 55
    aget-object v8, v7, v5

    .line 56
    .line 57
    aput-object v6, v7, v5

    .line 58
    .line 59
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {v0}, Lyp0;->μ()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lh21;

    .line 67
    .line 68
    iget-object v0, v0, Lh21;->ε:Lk21;

    .line 69
    .line 70
    iget v0, v0, Lk21;->η:I

    .line 71
    .line 72
    iget v1, v2, Lk21;->η:I

    .line 73
    .line 74
    invoke-virtual {v2, v0, v1}, Lk21;->μ(II)V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, Lox0;->Δ:Z

    .line 78
    .line 79
    invoke-virtual {v2}, Lk21;->ζ()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public final ч()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lox0;->φ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lox0;->φ:Z

    .line 5
    .line 6
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 7
    .line 8
    iget-object v2, p0, Lbq0;->α:Lyp0;

    .line 9
    .line 10
    iget-object v3, v2, Lyp0;->Κ:Lk31;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v3, Lk31;->γ:Lgm0;

    .line 15
    .line 16
    invoke-virtual {v0}, Lq31;->ｅ()V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lol1;->ε(Lyp0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lyp0;->ο()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/4 v0, 0x6

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    invoke-static {v2, v1, v0}, Lyp0;->Υ(Lyp0;ZI)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p0, v2, Lyp0;->Λ:Lbq0;

    .line 44
    .line 45
    iget-boolean p0, p0, Lbq0;->ε:Z

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-static {v2, v1, v0}, Lyp0;->Σ(Lyp0;ZI)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    iget-object p0, v3, Lk31;->δ:Lq31;

    .line 53
    .line 54
    iget-object v0, v3, Lk31;->γ:Lgm0;

    .line 55
    .line 56
    iget-object v0, v0, Lq31;->τ:Lq31;

    .line 57
    .line 58
    :goto_1
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    iget-boolean v1, p0, Lq31;->Π:Z

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Lq31;->Я()V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object p0, p0, Lq31;->τ:Lq31;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {v2}, Lyp0;->ψ()Lk21;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iget-object v0, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 81
    .line 82
    iget p0, p0, Lk21;->η:I

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    :goto_2
    if-ge v1, p0, :cond_5

    .line 86
    .line 87
    aget-object v2, v0, v1

    .line 88
    .line 89
    check-cast v2, Lyp0;

    .line 90
    .line 91
    invoke-virtual {v2}, Lyp0;->τ()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const v4, 0x7fffffff

    .line 96
    .line 97
    .line 98
    if-eq v3, v4, :cond_4

    .line 99
    .line 100
    iget-object v3, v2, Lyp0;->Λ:Lbq0;

    .line 101
    .line 102
    iget-object v3, v3, Lbq0;->π:Lox0;

    .line 103
    .line 104
    invoke-virtual {v3}, Lox0;->ч()V

    .line 105
    .line 106
    .line 107
    invoke-static {v2}, Lyp0;->Φ(Lyp0;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    return-void
.end method

.method public final ш()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lox0;->φ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lox0;->φ:Z

    .line 7
    .line 8
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 9
    .line 10
    iget-object v1, p0, Lbq0;->α:Lyp0;

    .line 11
    .line 12
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 13
    .line 14
    invoke-static {v1}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p0}, Lol1;->ζ(Lyp0;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lyp0;->Κ:Lk31;

    .line 26
    .line 27
    iget-object v2, v1, Lk31;->δ:Lq31;

    .line 28
    .line 29
    iget-object v1, v1, Lk31;->γ:Lgm0;

    .line 30
    .line 31
    iget-object v1, v1, Lq31;->τ:Lq31;

    .line 32
    .line 33
    :goto_0
    invoke-static {v2, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v2}, Lq31;->ｇ()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Lq31;->ｌ()V

    .line 45
    .line 46
    .line 47
    iget-object v2, v2, Lq31;->τ:Lq31;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iget-object v1, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 55
    .line 56
    iget p0, p0, Lk21;->η:I

    .line 57
    .line 58
    :goto_1
    if-ge v0, p0, :cond_1

    .line 59
    .line 60
    aget-object v2, v1, v0

    .line 61
    .line 62
    check-cast v2, Lyp0;

    .line 63
    .line 64
    iget-object v2, v2, Lyp0;->Λ:Lbq0;

    .line 65
    .line 66
    iget-object v2, v2, Lbq0;->π:Lox0;

    .line 67
    .line 68
    invoke-virtual {v2}, Lox0;->ш()V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    return-void
.end method

.method public final щ()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lox0;->Κ:Z

    .line 3
    .line 4
    iget-object v1, p0, Lox0;->κ:Lbq0;

    .line 5
    .line 6
    iget-object v2, v1, Lbq0;->α:Lyp0;

    .line 7
    .line 8
    invoke-virtual {v2}, Lyp0;->σ()Lyp0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, Lox0;->Ζ()Lgm0;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget v3, v3, Lq31;->Ζ:F

    .line 17
    .line 18
    iget-object v1, v1, Lbq0;->α:Lyp0;

    .line 19
    .line 20
    iget-object v4, v1, Lyp0;->Κ:Lk31;

    .line 21
    .line 22
    iget-object v5, v4, Lk31;->δ:Lq31;

    .line 23
    .line 24
    iget-object v4, v4, Lk31;->γ:Lgm0;

    .line 25
    .line 26
    :goto_0
    if-eq v5, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v5, Lsp0;

    .line 32
    .line 33
    iget v6, v5, Lq31;->Ζ:F

    .line 34
    .line 35
    add-float/2addr v3, v6

    .line 36
    iget-object v5, v5, Lq31;->τ:Lq31;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v4, p0, Lox0;->Ι:F

    .line 40
    .line 41
    cmpg-float v4, v3, v4

    .line 42
    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iput v3, p0, Lox0;->Ι:F

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {v2}, Lyp0;->Ν()V

    .line 51
    .line 52
    .line 53
    :cond_2
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Lyp0;->Β()V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lox0;->Ζ()Lgm0;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-boolean v3, v3, Ldw0;->ξ:Z

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    if-nez v3, :cond_8

    .line 66
    .line 67
    iget-boolean v3, p0, Lox0;->φ:Z

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    iget-object v5, p0, Lox0;->Β:Lzp0;

    .line 72
    .line 73
    invoke-virtual {v5}, Lzp0;->δ()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    :cond_4
    invoke-virtual {p0}, Lox0;->ч()V

    .line 80
    .line 81
    .line 82
    :cond_5
    if-nez v3, :cond_7

    .line 83
    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    invoke-virtual {v2}, Lyp0;->Β()V

    .line 87
    .line 88
    .line 89
    :cond_6
    iget-boolean v1, p0, Lox0;->λ:Z

    .line 90
    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    if-eqz v2, :cond_8

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Lyp0;->Τ(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    iget-object v1, v1, Lyp0;->Κ:Lk31;

    .line 100
    .line 101
    iget-object v1, v1, Lk31;->γ:Lgm0;

    .line 102
    .line 103
    invoke-virtual {v1}, Lq31;->ｅ()V

    .line 104
    .line 105
    .line 106
    :cond_8
    :goto_2
    if-eqz v2, :cond_a

    .line 107
    .line 108
    iget-object v1, v2, Lyp0;->Λ:Lbq0;

    .line 109
    .line 110
    iget-boolean v2, p0, Lox0;->λ:Z

    .line 111
    .line 112
    if-nez v2, :cond_b

    .line 113
    .line 114
    iget-object v2, v1, Lbq0;->δ:Lup0;

    .line 115
    .line 116
    sget-object v3, Lup0;->η:Lup0;

    .line 117
    .line 118
    if-ne v2, v3, :cond_b

    .line 119
    .line 120
    iget v2, p0, Lox0;->ν:I

    .line 121
    .line 122
    const v3, 0x7fffffff

    .line 123
    .line 124
    .line 125
    if-ne v2, v3, :cond_9

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_9
    const-string v2, "Place was called on a node which was placed already"

    .line 129
    .line 130
    invoke-static {v2}, Lam0;->β(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    iget v2, v1, Lbq0;->ι:I

    .line 134
    .line 135
    iput v2, p0, Lox0;->ν:I

    .line 136
    .line 137
    add-int/2addr v2, v0

    .line 138
    iput v2, v1, Lbq0;->ι:I

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_a
    iput v4, p0, Lox0;->ν:I

    .line 142
    .line 143
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lox0;->Υ()V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final э(JLa80;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object v1, v0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    iget-object v2, v0, Lbq0;->α:Lyp0;

    .line 6
    .line 7
    iget-boolean v1, v1, Lyp0;->Τ:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "place is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v1}, Lam0;->α(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v1, Lup0;->η:Lup0;

    .line 17
    .line 18
    iput-object v1, v0, Lbq0;->δ:Lup0;

    .line 19
    .line 20
    iput-wide p1, p0, Lox0;->ρ:J

    .line 21
    .line 22
    iput-object p3, p0, Lox0;->σ:La80;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-boolean v1, p0, Lox0;->Κ:Z

    .line 26
    .line 27
    invoke-static {v2}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-boolean v4, p0, Lox0;->ω:Z

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    iget-boolean v4, p0, Lox0;->φ:Z

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-wide v2, v1, Lch1;->ι:J

    .line 44
    .line 45
    invoke-static {p1, p2, v2, v3}, Lum0;->γ(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {v1, p1, p2, v2, p3}, Lq31;->ｊ(JFLa80;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lox0;->щ()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object v4, p0, Lox0;->Β:Lzp0;

    .line 58
    .line 59
    iput-boolean v1, v4, Lzp0;->ε:Z

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lbq0;->ζ(Z)V

    .line 62
    .line 63
    .line 64
    iput-object p3, p0, Lox0;->Λ:La80;

    .line 65
    .line 66
    iput-wide p1, p0, Lox0;->Μ:J

    .line 67
    .line 68
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p2, p1, Ly81;->ζ:La1;

    .line 73
    .line 74
    iget-object p1, p1, Ly81;->α:Lkx1;

    .line 75
    .line 76
    iget-object p3, p0, Lox0;->Ν:Lnx0;

    .line 77
    .line 78
    invoke-virtual {p1, v2, p2, p3}, Lkx1;->β(Ljava/lang/Object;La80;Lp70;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object p1, Lup0;->ι:Lup0;

    .line 82
    .line 83
    iput-object p1, v0, Lbq0;->δ:Lup0;

    .line 84
    .line 85
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-boolean p1, p1, Ldw0;->ξ:Z

    .line 90
    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    iget-boolean p1, v0, Lbq0;->λ:Z

    .line 94
    .line 95
    if-nez p1, :cond_2

    .line 96
    .line 97
    iget-boolean p1, v0, Lbq0;->κ:Z

    .line 98
    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    :cond_2
    invoke-virtual {p0}, Lox0;->requestLayout()V

    .line 102
    .line 103
    .line 104
    :cond_3
    const/4 p1, 0x1

    .line 105
    iput-boolean p1, p0, Lox0;->ο:Z

    .line 106
    .line 107
    return-void
.end method

.method public final ю(J)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object v1, v0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    iget-object v2, v0, Lbq0;->α:Lyp0;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, v1, Lyp0;->Τ:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    const-string v3, "measure is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v3}, Lam0;->α(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-static {v2}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2}, Lyp0;->σ()Lyp0;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-boolean v5, v2, Lyp0;->Ι:Z

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-boolean v4, v4, Lyp0;->Ι:Z

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v4, v7

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_1
    move v4, v6

    .line 44
    :goto_2
    iput-boolean v4, v2, Lyp0;->Ι:Z

    .line 45
    .line 46
    invoke-virtual {v2}, Lyp0;->ο()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    iget-wide v4, p0, Lch1;->θ:J

    .line 53
    .line 54
    invoke-static {v4, v5, p1, p2}, Lyo;->β(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-virtual {v3, v2, v7}, Landroidx/compose/ui/platform/AndroidComposeView;->λ(Lyp0;Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lyp0;->Χ()V

    .line 65
    .line 66
    .line 67
    return v7

    .line 68
    :cond_4
    :goto_3
    iget-object v3, p0, Lox0;->Β:Lzp0;

    .line 69
    .line 70
    iput-boolean v7, v3, Lzp0;->δ:Z

    .line 71
    .line 72
    invoke-virtual {v2}, Lyp0;->ψ()Lk21;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iget-object v4, v3, Lk21;->ε:[Ljava/lang/Object;

    .line 77
    .line 78
    iget v3, v3, Lk21;->η:I

    .line 79
    .line 80
    move v5, v7

    .line 81
    :goto_4
    if-ge v5, v3, :cond_5

    .line 82
    .line 83
    aget-object v8, v4, v5

    .line 84
    .line 85
    check-cast v8, Lyp0;

    .line 86
    .line 87
    iget-object v8, v8, Lyp0;->Λ:Lbq0;

    .line 88
    .line 89
    iget-object v8, v8, Lbq0;->π:Lox0;

    .line 90
    .line 91
    iget-object v8, v8, Lox0;->Β:Lzp0;

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    iput-boolean v6, p0, Lox0;->ξ:Z

    .line 100
    .line 101
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-wide v3, v3, Lch1;->η:J

    .line 106
    .line 107
    invoke-virtual {p0, p1, p2}, Lch1;->х(J)V

    .line 108
    .line 109
    .line 110
    iget-object v5, v0, Lbq0;->δ:Lup0;

    .line 111
    .line 112
    sget-object v8, Lup0;->ι:Lup0;

    .line 113
    .line 114
    if-ne v5, v8, :cond_6

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    const-string v5, "layout state is not idle before measure starts"

    .line 118
    .line 119
    invoke-static {v5}, Lam0;->β(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_5
    iput-wide p1, p0, Lox0;->Ζ:J

    .line 123
    .line 124
    sget-object p1, Lup0;->ε:Lup0;

    .line 125
    .line 126
    iput-object p1, v0, Lbq0;->δ:Lup0;

    .line 127
    .line 128
    iput-boolean v7, p0, Lox0;->ψ:Z

    .line 129
    .line 130
    invoke-static {v2}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    iget-object v5, p0, Lox0;->Η:Lnx0;

    .line 139
    .line 140
    iget-object v9, p2, Ly81;->γ:La1;

    .line 141
    .line 142
    iget-object p2, p2, Ly81;->α:Lkx1;

    .line 143
    .line 144
    invoke-virtual {p2, v2, v9, v5}, Lkx1;->β(Ljava/lang/Object;La80;Lp70;)V

    .line 145
    .line 146
    .line 147
    iget-object p2, v0, Lbq0;->δ:Lup0;

    .line 148
    .line 149
    if-ne p2, p1, :cond_7

    .line 150
    .line 151
    iput-boolean v6, p0, Lox0;->ω:Z

    .line 152
    .line 153
    iput-boolean v6, p0, Lox0;->Α:Z

    .line 154
    .line 155
    iput-object v8, v0, Lbq0;->δ:Lup0;

    .line 156
    .line 157
    :cond_7
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-wide p1, p1, Lch1;->η:J

    .line 162
    .line 163
    invoke-static {p1, p2, v3, v4}, Lbn0;->α(JJ)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_9

    .line 168
    .line 169
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget p1, p1, Lch1;->ε:I

    .line 174
    .line 175
    iget p2, p0, Lch1;->ε:I

    .line 176
    .line 177
    if-ne p1, p2, :cond_9

    .line 178
    .line 179
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    iget p1, p1, Lch1;->ζ:I

    .line 184
    .line 185
    iget p2, p0, Lch1;->ζ:I

    .line 186
    .line 187
    if-eq p1, p2, :cond_8

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_8
    move v6, v7

    .line 191
    :cond_9
    :goto_6
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iget p1, p1, Lch1;->ε:I

    .line 196
    .line 197
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    iget p2, p2, Lch1;->ζ:I

    .line 202
    .line 203
    int-to-long v2, p1

    .line 204
    const/16 p1, 0x20

    .line 205
    .line 206
    shl-long/2addr v2, p1

    .line 207
    int-to-long p1, p2

    .line 208
    const-wide v4, 0xffffffffL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    and-long/2addr p1, v4

    .line 214
    or-long/2addr p1, v2

    .line 215
    invoke-virtual {p0, p1, p2}, Lch1;->ф(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    .line 217
    .line 218
    return v6

    .line 219
    :goto_7
    invoke-virtual {v1, p0}, Lyp0;->Ψ(Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    const/4 p0, 0x0

    .line 223
    throw p0
.end method

.method public final я()V
    .locals 3

    .line 1
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 2
    .line 3
    iget-object v0, p0, Lbq0;->α:Lyp0;

    .line 4
    .line 5
    iget-object v1, p0, Lbq0;->α:Lyp0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lyp0;->Θ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget p0, p0, Lbq0;->μ:I

    .line 14
    .line 15
    if-lez p0, :cond_2

    .line 16
    .line 17
    iget-object p0, v1, Lyp0;->Λ:Lbq0;

    .line 18
    .line 19
    iget-boolean v0, p0, Lbq0;->κ:Z

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-boolean v0, p0, Lbq0;->λ:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 29
    .line 30
    iget-boolean p0, p0, Lox0;->ω:Z

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lyp0;->Τ(Z)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v1}, Lyp0;->ψ()Lk21;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-object v0, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 42
    .line 43
    iget p0, p0, Lk21;->η:I

    .line 44
    .line 45
    :goto_0
    if-ge v2, p0, :cond_2

    .line 46
    .line 47
    aget-object v1, v0, v2

    .line 48
    .line 49
    check-cast v1, Lyp0;

    .line 50
    .line 51
    iget-object v1, v1, Lyp0;->Λ:Lbq0;

    .line 52
    .line 53
    iget-object v1, v1, Lbq0;->π:Lox0;

    .line 54
    .line 55
    invoke-virtual {v1}, Lox0;->я()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method
