.class public final Lvh/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf1/d0;


# instance fields
.field public g:J

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:[F


# virtual methods
.method public final H0(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final I()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Q0(Lf1/r0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Y(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lvh/c;->g:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Lvh/c;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public final c(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lvh/c;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public final e(Landroidx/lifecycle/x;Lu2/c;JLfg/l;)V
    .locals 7

    .line 1
    iget-object v0, p1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb5/c;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v1, p3, v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0}, Lb5/c;->v()J

    .line 22
    .line 23
    .line 24
    move-result-wide p3

    .line 25
    :goto_0
    iput-wide p3, p0, Lvh/c;->g:J

    .line 26
    .line 27
    invoke-interface {p2}, Lu2/c;->d()F

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    iput p3, p0, Lvh/c;->h:F

    .line 32
    .line 33
    invoke-interface {p2}, Lu2/c;->q0()F

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iput p2, p0, Lvh/c;->i:F

    .line 38
    .line 39
    invoke-interface {p5, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget p2, p0, Lvh/c;->l:F

    .line 43
    .line 44
    iget p3, p0, Lvh/c;->j:F

    .line 45
    .line 46
    iget p4, p0, Lvh/c;->k:F

    .line 47
    .line 48
    const/4 p5, 0x0

    .line 49
    cmpg-float v1, p2, p5

    .line 50
    .line 51
    const/high16 v2, 0x3f800000    # 1.0f

    .line 52
    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    cmpg-float p2, p3, p5

    .line 56
    .line 57
    if-nez p2, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    cmpg-float p2, p4, p5

    .line 61
    .line 62
    if-nez p2, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    div-float p2, v2, p3

    .line 66
    .line 67
    div-float/2addr v2, p4

    .line 68
    const-wide/16 p3, 0x0

    .line 69
    .line 70
    invoke-virtual {p1, p2, v2, p3, p4}, Landroidx/lifecycle/x;->S(FFJ)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    iget-object p1, p0, Lvh/c;->m:[F

    .line 75
    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    invoke-static {}, Lf1/i0;->a()[F

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Lvh/c;->m:[F

    .line 83
    .line 84
    :cond_4
    array-length v1, p1

    .line 85
    const/16 v3, 0x10

    .line 86
    .line 87
    if-ge v1, v3, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    float-to-double v3, p2

    .line 91
    const-wide v5, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    mul-double/2addr v3, v5

    .line 97
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    double-to-float p2, v5

    .line 102
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    double-to-float v1, v3

    .line 107
    mul-float v3, v1, p3

    .line 108
    .line 109
    mul-float v4, p2, p4

    .line 110
    .line 111
    neg-float p2, p2

    .line 112
    mul-float/2addr p2, p3

    .line 113
    mul-float/2addr v1, p4

    .line 114
    mul-float p3, v3, v1

    .line 115
    .line 116
    mul-float p4, v4, p2

    .line 117
    .line 118
    sub-float/2addr p3, p4

    .line 119
    cmpg-float p4, p3, p5

    .line 120
    .line 121
    if-nez p4, :cond_6

    .line 122
    .line 123
    :goto_1
    return-void

    .line 124
    :cond_6
    div-float/2addr v2, p3

    .line 125
    mul-float/2addr v1, v2

    .line 126
    const/4 p3, 0x0

    .line 127
    aput v1, p1, p3

    .line 128
    .line 129
    neg-float p3, v4

    .line 130
    mul-float/2addr p3, v2

    .line 131
    const/4 p4, 0x1

    .line 132
    aput p3, p1, p4

    .line 133
    .line 134
    neg-float p2, p2

    .line 135
    mul-float/2addr p2, v2

    .line 136
    const/4 p3, 0x4

    .line 137
    aput p2, p1, p3

    .line 138
    .line 139
    mul-float/2addr v3, v2

    .line 140
    const/4 p2, 0x5

    .line 141
    aput v3, p1, p2

    .line 142
    .line 143
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-interface {p2, p1}, Lf1/u;->h([F)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final f(F)V
    .locals 0

    .line 1
    iput p1, p0, Lvh/c;->l:F

    .line 2
    .line 3
    return-void
.end method

.method public final g(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final h(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(F)V
    .locals 0

    .line 1
    iput p1, p0, Lvh/c;->k:F

    .line 2
    .line 3
    return-void
.end method

.method public final k(Lf1/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final o()V
    .locals 0

    .line 1
    return-void
.end method

.method public final p(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final q(F)V
    .locals 0

    .line 1
    iput p1, p0, Lvh/c;->j:F

    .line 2
    .line 3
    return-void
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget v0, p0, Lvh/c;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public final r(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final s(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final t(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final u(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final v()F
    .locals 1

    .line 1
    iget v0, p0, Lvh/c;->k:F

    .line 2
    .line 3
    return v0
.end method
