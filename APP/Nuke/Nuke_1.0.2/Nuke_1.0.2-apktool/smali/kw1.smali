.class public final Lkw1;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;


# instance fields
.field public v:Ljw1;


# virtual methods
.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 8

    .line 1
    iget-object v0, p0, Lkw1;->v:Ljw1;

    .line 2
    .line 3
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Ld61;->h:Ld61;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget v0, v0, Ljw1;->a:F

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, v0, Ljw1;->c:F

    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, Lkw1;->v:Ljw1;

    .line 17
    .line 18
    iget v3, v1, Ljw1;->b:F

    .line 19
    .line 20
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-ne v4, v2, :cond_1

    .line 25
    .line 26
    iget v1, v1, Ljw1;->c:F

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget v1, v1, Ljw1;->a:F

    .line 30
    .line 31
    :goto_1
    iget-object p0, p0, Lkw1;->v:Ljw1;

    .line 32
    .line 33
    iget p0, p0, Ljw1;->d:F

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static {v0, v2}, Lza0;->a(FF)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x1

    .line 42
    if-ltz v4, :cond_2

    .line 43
    .line 44
    move v4, v6

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move v4, v5

    .line 47
    :goto_2
    invoke-static {v3, v2}, Lza0;->a(FF)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-ltz v7, :cond_3

    .line 52
    .line 53
    move v7, v6

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    move v7, v5

    .line 56
    :goto_3
    and-int/2addr v4, v7

    .line 57
    invoke-static {v1, v2}, Lza0;->a(FF)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-ltz v7, :cond_4

    .line 62
    .line 63
    move v7, v6

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move v7, v5

    .line 66
    :goto_4
    and-int/2addr v4, v7

    .line 67
    invoke-static {p0, v2}, Lza0;->a(FF)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ltz v2, :cond_5

    .line 72
    .line 73
    move v5, v6

    .line 74
    :cond_5
    and-int v2, v4, v5

    .line 75
    .line 76
    if-nez v2, :cond_6

    .line 77
    .line 78
    const-string v2, "Padding must be non-negative"

    .line 79
    .line 80
    invoke-static {v2}, Liz0;->a(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_6
    invoke-interface {p1, v0}, Le70;->T(F)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-interface {p1, v1}, Le70;->T(F)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/2addr v1, v0

    .line 92
    invoke-interface {p1, v3}, Le70;->T(F)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-interface {p1, p0}, Le70;->T(F)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v2

    .line 101
    neg-int v3, v1

    .line 102
    neg-int v4, p0

    .line 103
    invoke-static {v3, v4, p3, p4}, Lgz;->i(IIJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    invoke-interface {p2, v3, v4}, Lif1;->e(J)Lsz1;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    iget v3, p2, Lsz1;->h:I

    .line 112
    .line 113
    add-int/2addr v3, v1

    .line 114
    invoke-static {p3, p4, v3}, Lgz;->g(JI)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iget v3, p2, Lsz1;->i:I

    .line 119
    .line 120
    add-int/2addr v3, p0

    .line 121
    invoke-static {p3, p4, v3}, Lgz;->f(JI)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    new-instance p3, Le01;

    .line 126
    .line 127
    invoke-direct {p3, v0, v2, v6, p2}, Le01;-><init>(IIILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-object p2, Lce0;->h:Lce0;

    .line 131
    .line 132
    invoke-interface {p1, v1, p0, p2, p3}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0
.end method
