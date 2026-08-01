.class public final Lmv;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lx52;
.implements Lkp0;


# instance fields
.field public τ:Lmv;

.field public υ:Lmv;

.field public φ:J


# virtual methods
.method public final λ()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lx;->Ι:Lx;

    .line 2
    .line 3
    return-object p0
.end method

.method public final μ(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lmv;->φ:J

    .line 2
    .line 3
    return-void
.end method

.method public final В()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lmv;->τ:Lmv;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lmv;->υ:Lmv;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lmv;->В()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    invoke-virtual {v0}, Lmv;->В()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final Г()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmv;->υ:Lmv;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lmv;->τ:Lmv;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lmv;->Г()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {v0}, Lmv;->Г()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final Д()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmv;->υ:Lmv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lmv;->Д()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lmv;->τ:Lmv;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lmv;->Д()V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lmv;->τ:Lmv;

    .line 17
    .line 18
    return-void
.end method

.method public final Е(Ln;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lmv;->τ:Lmv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lbd;->φ(Ln;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v0, v1, v2}, Lxb;->ι(Lmv;J)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, p0, Lq01;->ε:Lq01;

    .line 19
    .line 20
    iget-boolean v1, v1, Lq01;->σ:Z

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance v1, Lum1;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v2, Llv;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v2, v1, p0, p1, v3}, Llv;-><init>(Ljava/lang/Object;Lur;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v2}, Lg81;->ψ(Lx52;La80;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lx52;

    .line 43
    .line 44
    :goto_0
    check-cast v1, Lmv;

    .line 45
    .line 46
    :goto_1
    if-eqz v1, :cond_2

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1}, Lmv;->Г()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1}, Lmv;->Е(Ln;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lmv;->υ:Lmv;

    .line 57
    .line 58
    if-eqz p1, :cond_8

    .line 59
    .line 60
    invoke-virtual {p1}, Lmv;->Д()V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    if-nez v1, :cond_4

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iget-object v2, p0, Lmv;->υ:Lmv;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2}, Lmv;->Г()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1}, Lmv;->Е(Ln;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-virtual {v0}, Lmv;->Д()V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_6

    .line 87
    .line 88
    if-eqz v1, :cond_5

    .line 89
    .line 90
    invoke-virtual {v1}, Lmv;->Г()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p1}, Lmv;->Е(Ln;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    if-eqz v0, :cond_8

    .line 97
    .line 98
    invoke-virtual {v0}, Lmv;->Д()V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    if-eqz v1, :cond_7

    .line 103
    .line 104
    invoke-virtual {v1, p1}, Lmv;->Е(Ln;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_7
    iget-object v0, p0, Lmv;->υ:Lmv;

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lmv;->Е(Ln;)V

    .line 113
    .line 114
    .line 115
    :cond_8
    :goto_2
    iput-object v1, p0, Lmv;->τ:Lmv;

    .line 116
    .line 117
    return-void
.end method

.method public final Ж()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmv;->υ:Lmv;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lmv;->τ:Lmv;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lmv;->Ж()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {v0}, Lmv;->Ж()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ш()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lmv;->υ:Lmv;

    .line 3
    .line 4
    iput-object v0, p0, Lmv;->τ:Lmv;

    .line 5
    .line 6
    return-void
.end method
